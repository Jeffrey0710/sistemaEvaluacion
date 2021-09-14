/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsServicios;

import Modelo.csPuesto;
import Modelo.puesto;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "srvPuesto")
public class srvPuesto {

    @WebMethod(operationName = "insertar")
    public int insertarPuesto(@WebParam(name = "nombre") String nombre, @WebParam(name = "sueldo") double sueldo, @WebParam(name = "caracteristicas") String caracteristicas,
            @WebParam(name = "requerimientos") String requerimientos, @WebParam(name = "horario") String horario) {
        csPuesto p = new csPuesto();
        return p.insertar(nombre, sueldo, caracteristicas, requerimientos, horario);

    }

    @WebMethod(operationName = "actualizar")
    public int actualizarPuesto(@WebParam(name = "nombre") String nombre, @WebParam(name = "sueldo") double sueldo, @WebParam(name = "caracteristicas") String caracteristicas,
            @WebParam(name = "requerimientos") String requerimientos, @WebParam(name = "horario") String horario, @WebParam(name = "idPuesto") int idPuesto) {
        csPuesto p = new csPuesto();
        return p.actualizar(nombre, sueldo, caracteristicas, requerimientos, horario, idPuesto);

    }

    @WebMethod(operationName = "eliminar")
    public int eliminarPuesto(@WebParam(name = "idPuesto") int idPuesto) {
        csPuesto p = new csPuesto();
        return p.eliminar(idPuesto);

    }

    @WebMethod(operationName = "listar")
    public ArrayList<puesto> listarPuesto() {
        csPuesto p = new csPuesto();
        return p.listarPuesto();

    }

    @WebMethod(operationName = "listarPorID")
    public puesto listarPorIDPuesto(@WebParam(name = "idPuesto") int idPuesto) {
        csPuesto p = new csPuesto();
        return p.listaPuestoPorID(idPuesto);
    }
}
