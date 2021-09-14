package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class csPersonal {

    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public csPersonal() {
        this.con = null;
        this.stm = null;
    }

    public int insertar(int idEmpresa, int idPuesto, String nombre, String telefono, String direccion, String email, String sexo, String fechaNacimiento) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("insert into dbo.personal(idEmpresa, idPuesto, nombre, telefono, direccion, email, sexo,fechaNacimiento) values(" + idEmpresa + "," + idPuesto + ",'" + nombre + "',  '" + telefono + "', '" + direccion + "', '" + email + "', '" + sexo + "', '" + fechaNacimiento + "')");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return respuesta;
    }

    public int actualizar(int idEmpresa, int idPuesto, String nombre, String telefono, String direccion, String email, String sexo, String fechaNacimiento, int idPersonal) {

        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update dbo.personal set idEmpresa = " + idEmpresa + " ,idPuesto = " + idPuesto + ", nombre = '" + nombre + "', telefono = '" + telefono + "', direccion = '" + direccion + "', email = '" + email + "', sexo = '" + sexo + "', fechaNacimiento = '" + fechaNacimiento + "' where idPersonal = " + idPersonal + " ");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
        }

        return respuesta;
    }

    public int eliminar(int idPersonal) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from dbo.personal where idPersonal= " + idPersonal + "");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
        }

        return respuesta;

    }

    public ArrayList<personal> listaPersonal() {
        personal per = null;
        ArrayList<personal> lista = new ArrayList<personal>();

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.personal");

            while (rs.next()) {
                per = new personal(rs.getInt("idEmpresa"), rs.getInt("idPuesto"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("direccion"), rs.getString("email"), rs.getString("sexo"), rs.getString("fechaNacimiento"), rs.getInt(1));
                lista.add(per);
            }
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return lista;
    }

    public personal listaPersonalporId(int idPersonal) {
        personal per = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.personal where idPersonal =" + idPersonal + "");

            while (rs.next()) {
                per = new personal(rs.getInt("idEmpresa"), rs.getInt("idPuesto"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("direccion"), rs.getString("email"), rs.getString("sexo"), rs.getString("fechaNacimiento"), rs.getInt(1));

            }
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return per;
    }
}
