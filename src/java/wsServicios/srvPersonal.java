/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsServicios;

import Modelo.csPersonal;
import Modelo.personal;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "srvPersonal")
public class srvPersonal {

    @WebMethod(operationName = "insertar")
    public int insertarPersonal(@WebParam(name = "idEmpresa") int idEmpresa, @WebParam(name = "idPuesto") int idPuesto, @WebParam(name = "nombre") String nombre, @WebParam(name = "telefono") String telefono, @WebParam(name = "direccion") String direccion, @WebParam(name = "email") String email, @WebParam(name = "sexo") String sexo, @WebParam(name = "fechaNacimiento") String fechaNacimiento) {

        csPersonal per = new csPersonal();
        return per.insertar(idEmpresa, idPuesto, nombre, telefono, direccion, email, sexo, fechaNacimiento);

    }

    @WebMethod(operationName = "actualizar")
    public int actualizarPersonal(@WebParam(name = "idEmpresa") int idEmpresa, @WebParam(name = "idPuesto") int idPuesto, @WebParam(name = "nombre") String nombre, @WebParam(name = "telefono") String telefono, @WebParam(name = "direccion") String direccion, @WebParam(name = "email") String email, @WebParam(name = "sexo") String sexo, @WebParam(name = "fechaNacimiento") String fechaNacimiento, @WebParam(name = "idPersonal") int idPersonal) {
        csPersonal per = new csPersonal();
        return per.actualizar(idEmpresa, idPuesto, nombre, telefono, direccion, email, sexo, fechaNacimiento, idPersonal);

    }

    @WebMethod(operationName = "eliminar")
    public int eliminarPersonal(@WebParam(name = "idPersonal") int idPersonal) {
        csPersonal per = new csPersonal();
        return per.eliminar(idPersonal);

    }

    @WebMethod(operationName = "listar")
    public ArrayList<personal> listarPersonal() {
        csPersonal per = new csPersonal();
        return per.listaPersonal();

    }

    @WebMethod(operationName = "listarPorID")
    public personal listarPersonalPorID(@WebParam(name = "idPersonal") int idPersonal) {
        csPersonal per = new csPersonal();
        return per.listaPersonalporId(idPersonal);
    }
}
