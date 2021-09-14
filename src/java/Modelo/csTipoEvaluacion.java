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
public class csTipoEvaluacion {
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public csTipoEvaluacion(){
        this.con = null;
        this.stm = null;
    }
    
    public int insertar(String nombre){
        int respuesta = 0;
        
        csConexion c1 = new csConexion();
        
        con = c1.conectar();
        try{
            stm = con.createStatement();
            respuesta = stm.executeUpdate("insert into dbo.tipoEvaluacion(nombreEvaluacion) "
                + "values ('" + nombre + "')");
            c1.desconectar();
            con.close();
            stm.close();
        }
        catch(Exception ex){
        
        }
        return respuesta;
    }
    
    public int actualizar(String nombre, int idTipoEvaluacion){
        int respuesta = 0;
        
        csConexion c1 = new csConexion();
        con = c1.conectar();
        
        try{
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update dbo.tipoEvaluacion set "
            + "nombreEvaluacion= '" + nombre + "'" 
            + "where idTipoEvaluacion=" + idTipoEvaluacion + "");
            c1.desconectar();
            con.close();
            stm.close();
        }
        catch(Exception ex){
        
        }
        return respuesta;
    }
    
    public int eliminar(int idTipoEvaluacion){
        int respuesta = 0;
        
        csConexion c1 = new csConexion();
        con = c1.conectar();
        
        try{
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from dbo.tipoEvaluacion where idTipoEvaluacion="+idTipoEvaluacion+" ");
            c1.desconectar();
            con.close();
            stm.close();
        }
        catch(Exception ex){
        
        }
        return respuesta;
    }
    
    public ArrayList<tipoEvaluacion> listarTipoEvaluacion(){
        tipoEvaluacion e = null;
        ArrayList<tipoEvaluacion> lista = new ArrayList<tipoEvaluacion>();
        //lista = null;
        
        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;
        
        try{
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.tipoEvaluacion");
            
            while(rs.next()){
                e = new tipoEvaluacion(rs.getString("nombreEvaluacion"), rs.getInt(1));
                
                lista.add(e);
            }
            c1.desconectar();
            con.close();
            stm.close();
        }
        catch(Exception ex){
        
        }
        return lista;
    }
    
    public tipoEvaluacion listaTipoEvaluacionPorID(int idTipoEvaluacion){
        tipoEvaluacion e = null;
        
        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;
        
        try{
            stm = con.createStatement();
            rs = stm.executeQuery("select * from dbo.tipoEvaluacion where idTipoEvaluacion = " + idTipoEvaluacion + "");
            
            while(rs.next()){
                e = new tipoEvaluacion(rs.getString("nombreEvaluacion"),
                    rs.getInt(1));
            }
            c1.desconectar();
            con.close();
            stm.close();
        }
        catch(Exception ex){
        
        }
        return e;
    }
}
