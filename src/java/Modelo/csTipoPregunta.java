package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class csTipoPregunta {

    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public csTipoPregunta() {
        this.con = null;
        this.stm = null;
    }

    public int insertar(String tipoPregunta) {
        int respuesta = 0;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("insert into dbo.tipoPregunta(tipoPregunta) "
                    + "values ('" + tipoPregunta + "')");

            
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return respuesta;
    }

    public int actualizar(String tipoPregunta, int idTipoPregunta) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update dbo.tipoPregunta set tipoPregunta = '" + tipoPregunta + "' where idTipoPregunta = " + idTipoPregunta +"  ");
            
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }

        return respuesta;
    }

    public int eliminar(int idTipoPregunta) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from dbo.tipoPregunta where idTipoPregunta= " + idTipoPregunta + "");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }

        return respuesta;
    }

    public ArrayList<tipoPregunta> listarTipoPregunta() {
        tipoPregunta p = null;
        ArrayList<tipoPregunta> lista = new ArrayList<tipoPregunta>();

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.tipoPregunta");

            while (rs.next()) {
                p = new tipoPregunta(rs.getString("tipoPregunta"), rs.getInt(1));
                lista.add(p);
            }
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return lista;
    }

    public tipoPregunta listarTipoPreguntaPorID(int idTipoPregunta) {
        tipoPregunta p = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.tipoPregunta where idTipoPregunta =" + idTipoPregunta + "");

            while (rs.next()) {
                p = new tipoPregunta(rs.getString("tipoPregunta"), rs.getInt(1));
            }
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return p;
    }

}
