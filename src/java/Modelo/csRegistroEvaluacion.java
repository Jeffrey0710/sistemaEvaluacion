package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class csRegistroEvaluacion {

    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public csRegistroEvaluacion() {
        this.con = null;
        this.stm = null;
    }

    public int insertar(int idTipoEvaluacion, int idEncuesta, int idRegistroRespuesta, double totalEvaluacion, String fecha) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();

            respuesta = stm.executeUpdate("insert into dbo.registroEvaluacion(idtipoEvaluacion, idEncuesta, idregistroRespuesta, totalEvaluacion, fecha) values(" + idTipoEvaluacion + ", " + idEncuesta + ", " + idRegistroRespuesta + ", " + totalEvaluacion + ",  '" + fecha + "' )");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
        }

        return respuesta;
    }

    public int actualizar(int idtipoEvaluacion, int idEncuesta, int idregistroRespuesta, double totalEvaluacion, String fecha, int idregistroEvaluacion) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update dbo.registroEvaluacion set idtipoEvaluacion=" + idtipoEvaluacion + ", idEncuesta=" + idEncuesta + ", idregistroRespuesta=" + idregistroRespuesta + ", totalEvaluacion=" + totalEvaluacion + ", fecha='" + fecha + "' where idregistroEvaluacion=" + idregistroEvaluacion + "");
            c1.desconectar();
            con.close();
            stm.close();

        } catch (Exception ex) {

        }
        return respuesta;
    }

    public int eliminar(int idRegistroEvaluacion) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from dbo.registroEvaluacion where idRegistroEvaluacion = " + idRegistroEvaluacion + " ");

            c1.desconectar();
            con.close();
            stm.close();

        } catch (Exception ex) {
        }
        return respuesta;
    }

    public ArrayList<registroEvaluacion> listarRegistroEvaluacion() {
        registroEvaluacion re = null;
        ArrayList<registroEvaluacion> lista = new ArrayList<registroEvaluacion>();

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;
        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.registroEvaluacion");

            while (rs.next()) {
                re = new registroEvaluacion(rs.getInt("idtipoEvaluacion"), rs.getInt("idEncuesta"), rs.getInt("idregistroRespuesta"), rs.getDouble("totalEvaluacion"), rs.getString("fecha"), rs.getInt(1));
                lista.add(re);
            }

            c1.desconectar();
            con.close();
            stm.close();

        } catch (Exception ex) {
        }
        return lista;
    }

    public registroEvaluacion listarRegistroEvaluacionPorID(int idRegistroEvaluacion) {
        registroEvaluacion re = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.registroEvaluacion where idRegistroEvaluacion =" + idRegistroEvaluacion + "");

            while (rs.next()) {
                re = new registroEvaluacion(rs.getInt("idtipoEvaluacion"), rs.getInt("idEncuesta"), rs.getInt("idregistroRespuesta"), rs.getDouble("totalEvaluacion"), rs.getString("fecha"), rs.getInt(1));
            }

            c1.desconectar();
            con.close();
            stm.close();

        } catch (Exception ex) {
        }
        return re;

    }
}
