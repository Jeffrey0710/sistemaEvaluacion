package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class csPuesto {
    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public csPuesto() {
        this.con = null;
        this.stm = null;
    }

    public int insertar(String nombre, double sueldo, String caracteristicas, String requerimientos, String horario) {
        int respuesta = 0;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("insert into dbo.puesto(nombre, sueldo, caracteristicas, requerimientos, horario) values('" + nombre + "',  '" + sueldo + "', '" + caracteristicas + "', '" + requerimientos + "', '" + horario + "')");

            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
        }
        return respuesta;
    }

    public int actualizar(String nombre, double sueldo, String caracteristicas, String requerimientos, String horario, int idPuesto) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update dbo.puesto set nombre = '" + nombre + "', sueldo = '" + sueldo + "', caracteristicas = '" + caracteristicas + "', requerimientos = '" + requerimientos + "', horario = '" + horario + "'  where idPuesto = " + idPuesto + " ");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
        }

        return respuesta;
    }

    public int eliminar(int idPuesto) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from dbo.puesto where idPuesto= " + idPuesto + "");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
        }

        return respuesta;

    }

    public ArrayList<puesto> listarPuesto(){
        puesto p = null;
        ArrayList<puesto> lista = new ArrayList<puesto>();
        
        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;
        
        try{
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.puesto");
            
            while(rs.next()){
                p = new puesto(rs.getString("nombre"),rs.getDouble("sueldo"),rs.getString("caracteristicas"), rs.getString("requerimientos"),rs.getString("horario"), rs.getInt(1));
                lista.add(p);
            }
            c1.desconectar();
            con.close();
            stm.close();
        }
        catch(Exception ex){
            
        }
        return lista;
    }

    public puesto listaPuestoPorID(int idPuesto) {
        puesto p = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.puesto where idPuesto =" + idPuesto + "");

            while (rs.next()) {
                p = new puesto(rs.getString("nombre"),rs.getDouble("sueldo"),rs.getString("caracteristicas"), rs.getString("requerimientos"),rs.getString("horario"), rs.getInt(1));
            }
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return p;
    }
}
