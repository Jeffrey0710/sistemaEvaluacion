package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class csEmpresa {

    private Connection con; //open close de las bases de datos
    private Statement stm;//insert, update, delete, select
    private ResultSet rs;//contenedor de datos

    public csEmpresa() {
        this.con = null;
        this.stm = null;
    }

    //insercion de datos
    public int insertar(String nombre, String direccion, String telefono, String email, String propietario) {

        int respuesta = 0;
        //instancia de clase conexion 
        csConexion c1 = new csConexion();

        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("insert into dbo.empresa(nombre,direccion,telefono,email,propietario) values('" + nombre + "', '" + direccion + "', '" + telefono + "','" + email + "', '" + propietario + "')");

            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
            return 0;
        }

        return respuesta;
    }
    
    public int actualizar(String nombre, String direccion, String telefono, String email, String propietario, int idEmpresa) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update dbo.empresa set nombre = '" + nombre + "', direccion = '" + direccion + "', telefono = '" + telefono + "', email = '" + email + "', propietario = '" + propietario + "'  where idEmpresa = " + idEmpresa + " ");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
        }

        return respuesta;
    }

    public int eliminar(int idEmpresa) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from dbo.empresa  where  idEmpresa=" + idEmpresa + "");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
            return 0;
        }

        return respuesta;
    }

    public ArrayList<empresa> listarEmpresa() {
        empresa p = null;
        ArrayList<empresa> lista = new ArrayList<empresa>();

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.empresa");

            while (rs.next()) {
                p = new empresa(rs.getString("nombre"), rs.getString("direccion"), rs.getString("telefono"), rs.getString("email"), rs.getString("propietario"), rs.getInt(1));

                lista.add(p);

            }
            c1.desconectar();
            con.close();
            stm.close();

        } catch (Exception ex) {

        }

        return lista;

    }

    public empresa listarEmpresaPorID(int idEmpresa) {
        empresa p = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.empresa where idEmpresa=" + idEmpresa + "");

            while (rs.next()) {
                p = new empresa(rs.getString("nombre"), rs.getString("direccion"), rs.getString("telefono"), rs.getString("email"), rs.getString("propietario"), rs.getInt(1));

            }
            c1.desconectar();
            con.close();
            stm.close();

        } catch (Exception ex) {

        }

        return p;

    }
}
