/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsServicios;

import Modelo.csEmpresa;
import Modelo.empresa;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "srvEmpresa")
public class srvEmpresa {

    @WebMethod(operationName = "insertar")
    public int insertarEmpresa(@WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono, @WebParam(name = "email") String email, @WebParam(name = "propietario") String propietario) {

        csEmpresa p = new csEmpresa();
        return p.insertar(nombre, direccion, telefono, email, propietario);
    }

    @WebMethod(operationName = "actualizar")
    public int actualizarEmpresa(@WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono, @WebParam(name = "email") String email, @WebParam(name = "propietario") String propietario, @WebParam(name = "idEmpresa") int idEmpresa) {
        csEmpresa p = new csEmpresa();
        return p.actualizar(nombre, direccion, telefono, email, propietario, idEmpresa);
    }

    @WebMethod(operationName = "eliminar")
    public int eliminarEmpresa(@WebParam(name = "idEmpresa") int idEmpresa) {
        csEmpresa p = new csEmpresa();
        return p.eliminar(idEmpresa);
    }

    @WebMethod(operationName = "listar")
    public ArrayList<empresa> listarEmpresa() {
        csEmpresa p = new csEmpresa();
        return p.listarEmpresa();
    }

    @WebMethod(operationName = "listarPorID")
    public empresa listarEmpresaPorID(@WebParam(name = "idEmpresa") int idEmpresa) {
        csEmpresa p = new csEmpresa();
        return p.listarEmpresaPorID(idEmpresa);
    }
}
