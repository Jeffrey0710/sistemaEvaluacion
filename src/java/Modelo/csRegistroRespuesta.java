package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class csRegistroRespuesta {

    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public csRegistroRespuesta() {
        this.con = null;
        this.stm = null;
    }

    public int insertar(int idPregunta, int idPersonal, int idEncuesta, String respuestas, double punteo) {
        int respuesta = 0;

        csConexion c1 = new csConexion();

        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("insert into dbo.registroRespuesta(idPregunta, idPersonal, idEncuesta, respuestas, punteo) "
                    + "values (" + idPregunta + ", " + idPersonal + ", " + idEncuesta + ", '" + respuestas + "', " + punteo + ")");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return respuesta;
    }

    public int actualizar(int idPregunta, int idPersonal, int idEncuesta, String respuestas, double punteo, int idRegistroRespuesta) {
        int respuesta = 0;

        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update dbo.registroRespuesta set idPregunta= " + idPregunta + ", "
                    + "idPersonal= " + idPersonal + ", "
                    + "idEncuesta= " + idEncuesta + ", "
                    + "respuestas= '" + respuestas + "', "
                    + "punteo= " + punteo + " "
                    + "where idRegistroRespuesta=" + idRegistroRespuesta + "");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return respuesta;
    }

    public int eliminar(int idRegistroRespuesta) {
        int respuesta = 0;

        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from dbo.registroRespuesta where idRegistroRespuesta=" + idRegistroRespuesta + " ");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return respuesta;
    }

    public ArrayList<registroRespuesta> listaRegistroRespuesta() {
        registroRespuesta r = null;
        ArrayList<registroRespuesta> lista = new ArrayList<registroRespuesta>();

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.registroRespuesta");

            while (rs.next()) {
                r = new registroRespuesta(rs.getInt("idPregunta"), rs.getInt("idPersonal"), rs.getInt("idEncuesta"), rs.getString("respuestas"), rs.getDouble("punteo"), rs.getInt(1));
                lista.add(r);
            }
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return lista;
    }

    public registroRespuesta listaRegistroRespuestaPorID(int idRegistroRespuesta) {
        registroRespuesta r = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.registroRespuesta where idRegistroRespuesta = " + idRegistroRespuesta + "");

            while (rs.next()) {
                r = new registroRespuesta(rs.getInt("idPregunta"), rs.getInt("idPersonal"), rs.getInt("idEncuesta"), rs.getString("respuestas"), rs.getDouble("punteo"), rs.getInt(1));
            }
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return r;
    }
}
