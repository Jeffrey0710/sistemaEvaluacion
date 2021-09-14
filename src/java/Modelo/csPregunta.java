package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class csPregunta {

    private Connection con; //open close de las bases de datos
    private Statement stm;//insert, update, delete, select
    private ResultSet rs;//contenedor de datos

    public csPregunta() {
        this.con = null;
        this.stm = null;
    }

    //insercion de datos
    public int insertar(int idTipoPregunta, int idPonderacionPregunta, String pregunta) {
        int respuesta = 0;

        //instancia de clase conexion 
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {

            stm = con.createStatement();
            respuesta = stm.executeUpdate("insert into dbo.pregunta(idTipoPregunta,idPonderacionPregunta,pregunta) values(" + idTipoPregunta + ", " + idPonderacionPregunta + ", '" + pregunta + "')");

            c1.desconectar();
            con.close();
            stm.close();

        } catch (Exception ex) {

        }

        return respuesta;
    }

    public int actualizar(int idTipoPregunta, int idPonderacionPregunta, String pregunta, int idPregunta) {
        int respuesta = 0;

        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update dbo.pregunta set idTipoPregunta=" + idTipoPregunta + ",idPonderacionPregunta=" + idPonderacionPregunta + ", pregunta ='" + pregunta + "' where idPregunta=" + idPregunta + "");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }

        return respuesta;
    }

    public int elilminar(int idPregunta) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from dbo.pregunta  where  idPregunta=" + idPregunta + "");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }

        return respuesta;
    }

    public ArrayList<pregunta> listarPreguntas() {
        pregunta p = null;
        ArrayList<pregunta> lista = new ArrayList<pregunta>();

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.pregunta");

            while (rs.next()) {
                p = new pregunta(rs.getInt("idTipoPregunta"), rs.getInt("idPonderacionPregunta"), rs.getString("pregunta"), rs.getInt(1));

                lista.add(p);

            }
            c1.desconectar();
            con.close();
            stm.close();

        } catch (Exception ex) {

        }

        return lista;

    }

    public pregunta listarPreguntasPorID(int idPregunta) {
        pregunta p = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.pregunta where idPregunta=" + idPregunta + "");

            while (rs.next()) {
                p = new pregunta(rs.getInt("idTipoPregunta"), rs.getInt("idPonderacionPregunta"), rs.getString("pregunta"), rs.getInt(1));

            }
            c1.desconectar();
            con.close();
            stm.close();

        } catch (Exception ex) {

        }

        return p;

    }
}
