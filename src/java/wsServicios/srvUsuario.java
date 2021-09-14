/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsServicios;

import Modelo.csUsuario;
import Modelo.usuario;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "srvUsuario")
public class srvUsuario {

    @WebMethod(operationName = "insertar")
    public int insertarUsuario(@WebParam(name = "nombre") String nombre, @WebParam(name = "password") String password, @WebParam(name = "lugarFavorito") String lugarFavorito, @WebParam(name = "emailAlternativo") String emailAlternativo, @WebParam(name = "pasatiempo") String pasatiempo, @WebParam(name = "idEmpresa") int idEmpresa) {
        csUsuario p = new csUsuario();
        return p.insertar(nombre, password, lugarFavorito, emailAlternativo, pasatiempo, idEmpresa);
    }
//----------------------------------------------------------------------------------------------------------------------------------

    @WebMethod(operationName = "actualizacion")
    public int actualizarUsuario(@WebParam(name = "nombre") String nombre, @WebParam(name = "password") String password, @WebParam(name = "lugarFavorito") String lugarFavorito, @WebParam(name = "emailAlternativo") String emailAlternativo, @WebParam(name = "pasatiempo") String pasatiempo, @WebParam(name = "idEmpresa") int idEmpresa, @WebParam(name = "idUsuario") int idUsuario) {
        csUsuario p = new csUsuario();
        return p.actualizar(nombre, password, lugarFavorito, emailAlternativo, pasatiempo, idEmpresa, idUsuario);
    }
//----------------------------------------------------------------------------------------------------------------------------------

    @WebMethod(operationName = "eliminar")
    public int eliminarUsuario(@WebParam(name = "idUsuario") int idUsuario) {
        csUsuario p = new csUsuario();
        return p.eliminar(idUsuario);
    }
//----------------------------------------------------------------------------------------------------------------------------------

    @WebMethod(operationName = "listar")
    public ArrayList<usuario> listarUsuario() {
        csUsuario p = new csUsuario();
        return p.listarUsuario();
    }
//----------------------------------------------------------------------------------------------------------------------------------

    @WebMethod(operationName = "listarPorID")
    public usuario listarUsuarioPorID(@WebParam(name = "idUsuario") int idUsuario) {
        csUsuario p = new csUsuario();
        return p.listarUsuarioPorID(idUsuario);
    }
}
