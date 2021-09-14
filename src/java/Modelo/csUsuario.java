/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class csUsuario {

    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public csUsuario() {
        this.con = null;
        this.stm = null;
    }

    public int insertar(String nombre, String password, String lugarFavorito, String emailAlternativo, String pasatiempo, int idEmpresa) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("insert into dbo.usuario(nombre,password,lugarFavorito,emailAlternativo,pasatiempo,idEmpresa) values ('" + nombre + "', '" + password + "', '" + lugarFavorito + "', '" + emailAlternativo + "', '" + pasatiempo + "'," + idEmpresa + ")");

            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }

        return respuesta;
    }

//---------------------------------------------------------------------------------------------------------------------------------------
    public int actualizar(String nombre, String password, String lugarFavorito, String emailAlternativo, String pasatiempo, int idEmpresa, int idUsuario) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update dbo.usuario set nombre= '" + nombre + "', password= '" + password + "', lugarFavorito= '" + lugarFavorito + "', emailAlternativo= '" + emailAlternativo + "', pasatiempo= '" + pasatiempo + "', idEmpresa= " + idEmpresa + " where idUsuario= " + idUsuario + " ");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }

        return respuesta;
    }

//---------------------------------------------------------------------------------------------------------------------------------------
    public int eliminar(int idUsuario) {
        int respuesta = 0;
        csConexion c1 = new csConexion();

        con = c1.conectar();
        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from dbo.usuario where idUsuario= " + idUsuario + " ");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return respuesta;
    }

//---------------------------------------------------------------------------------------------------------------------------------------
    public ArrayList<usuario> listarUsuario() {
        usuario p = null;
        ArrayList<usuario> lista = new ArrayList<usuario>();

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;
        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select *  from dbo.usuario");

            while (rs.next()) {
                p = new usuario(rs.getString("nombre"), rs.getString("password"),
                        rs.getString("lugarFavorito"), rs.getString("emailAlternativo"),
                        rs.getString("pasatiempo"), rs.getInt("idEmpresa"),
                        rs.getInt(1));

                lista.add(p);
            }
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {

        }
        return lista;
    }
//-------------------------------------------------------------------

    public usuario listarUsuarioPorID(int idUsuario) {
        usuario p = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.usuario where idUsuario=" + idUsuario + "");

            while (rs.next()) {
                p = new usuario(rs.getString("nombre"), rs.getString("password"),
                        rs.getString("lugarFavorito"), rs.getString("emailAlternativo"),
                        rs.getString("pasatiempo"), rs.getInt("idEmpresa"),
                        rs.getInt(1));

            }
            c1.desconectar();
            con.close();
            stm.close();

        } catch (Exception ex) {

        }

        return p;

    }

}
