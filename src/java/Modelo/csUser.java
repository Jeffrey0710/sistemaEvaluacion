package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Jeffrey
 */
public class csUser {

    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public csUser() {
        this.con = null;
        this.stm = null;
    }

    public user autenticar(String usuario, String password) {
        user u = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;
        
        try{
            stm = con.createStatement();
            rs = stm.executeQuery("select u.idUsuario, e.idEmpresa, e.nombre, u.usuario from usuario u inner join empresa e on u.idEmpresa = e.idEmpresa where u.usuario = '" + usuario + "' and u.password = '" + password + "' ");
            
            while(rs.next()){
                u = new user(rs.getInt(1), rs.getInt(1), rs.getString("usuario"), rs.getString("nombre"));
            }
            c1.desconectar();
            con.close();
            stm.close();
        }
        catch(Exception ex){
            
        }
        return u;
    }
    
}
