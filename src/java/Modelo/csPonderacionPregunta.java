package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class csPonderacionPregunta {

    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public csPonderacionPregunta() {
        this.con = null;
        this.stm = null;
    }

    public int insertar(double punteo) {

        int respuesta = 0;
        // instancia de conexion
        csConexion c1 = new csConexion();

        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("insert into dbo.ponderacionPregunta(punteo) values (" + punteo + ")");

            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
            return 0;
        }

        return respuesta;
    }

    public int actualizar(double punteo, int idPonderacionPregunta) {
        int respuesta = 0;

        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update dbo.ponderacionPregunta set punteo= " + punteo + " where idPonderacionPregunta= " + idPonderacionPregunta + "");

            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
            return 0;
        }

        return respuesta;
    }

    public int eliminar(int idPonderacionPregunta) {
        int respuesta = 0;
        csConexion c1 = new csConexion();

        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from dbo.ponderacionPregunta where idPonderacionPregunta = " + idPonderacionPregunta + "");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return respuesta;
    }

    public ArrayList<ponderacionPregunta> listarPonderacion() {
        ponderacionPregunta p = null;
        ArrayList<ponderacionPregunta> lista = new ArrayList<ponderacionPregunta>();
        //lista=null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;
        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select *  from dbo.ponderacionPregunta");

            while (rs.next()) {
                p = new ponderacionPregunta(rs.getDouble("punteo"), rs.getInt(1));
                lista.add(p);
            }
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return lista;
    }
    
    public ponderacionPregunta listarPonderacionPreguntaPorID(int idPonderacionPregunta) {
        ponderacionPregunta p = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.ponderacionPregunta where idPonderacionPregunta=" + idPonderacionPregunta + "");

            while (rs.next()) {
                p = new ponderacionPregunta (rs.getDouble("punteo"), rs.getInt(1));

            }
            c1.desconectar();
            con.close();
            stm.close();

        } catch (Exception ex) {

        }

        return p;

    }


}
