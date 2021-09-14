package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class csEncuesta {

    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public csEncuesta() {
        this.con = null;
        this.stm = null;
    }

    public int insertar(int idEmpresa, int idPregunta, String fechaInicio, String fechaFinal, int cantidad) {
        int respuesta = 0;

        // instancia de la clase conexion//
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("insert into dbo.encuesta(idEmpresa, idPregunta, fechaInicio, fechaFinal, cantidad) values(" + idEmpresa + "," + idPregunta + ",  '" + fechaInicio + "', '" + fechaFinal + "', " + cantidad + ")");

            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
        }
        return respuesta;
    }

    public int actualizar(int idEmpresa, int idPregunta, String fechaInicio, String fechaFinal, int cantidad, int idEncuesta) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update dbo.encuesta set idEmpresa = " + idEmpresa + ", "
                    + "idPregunta = " + idPregunta + ", "
                    + "fechaInicio = '" + fechaInicio + "', "
                    + "fechaFinal = '" + fechaFinal + "', "
                    + "cantidad = " + cantidad + " "
                    + " where idEncuesta = " + idEncuesta + " ");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
        }

        return respuesta;
    }

    public int eliminar(int idEncuesta) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from dbo.encuesta where idEncuesta= " + idEncuesta + "");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
        }

        return respuesta;

    }

    public ArrayList<encuesta> listarEncuesta() {
        encuesta per = null;
        ArrayList<encuesta> lista = new ArrayList<encuesta>();

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.encuesta");

            while (rs.next()) {
                per = new encuesta(rs.getInt("idEmpresa"), rs.getInt("idPregunta"), rs.getString("fechaInicio"), rs.getString("fechaFinal"), rs.getInt("cantidad"), rs.getInt(1));

                lista.add(per);
            }
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return lista;
    }

    public encuesta listarEncuestaPorId(int idEncuesta) {
        encuesta per = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.encuesta where idEncuesta =" + idEncuesta + "");

            while (rs.next()) {
                per = new encuesta(rs.getInt("idEmpresa"), rs.getInt("idPregunta"), rs.getString("fechaInicio"), rs.getString("fechaFinal"), rs.getInt("cantidad"), rs.getInt(1));

            }
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return per;
    }

}
