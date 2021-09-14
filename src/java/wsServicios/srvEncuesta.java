/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsServicios;

import Modelo.csEncuesta;
import Modelo.encuesta;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "srvEncuesta")
public class srvEncuesta {

    @WebMethod(operationName = "insertar")
    public int insertarEncuesta(@WebParam(name = "idEmpresa") int idEmpresa, @WebParam(name = "idPregunta") int idPregunta, @WebParam(name = "fechaInicio") String fechaInicio, @WebParam(name = "fechaFinal") String fechaFinal, @WebParam(name = "cantidad") int cantidad) {

        csEncuesta e = new csEncuesta();
        return e.insertar(idEmpresa, idPregunta, fechaInicio, fechaFinal, cantidad);

    }

    @WebMethod(operationName = "actualizar")
    public int actualizarEncuesta(@WebParam(name = "idEmpresa") int idEmpresa, @WebParam(name = "idPregunta") int idPregunta, @WebParam(name = "fechaInicio") String fechaInicio, @WebParam(name = "fechaFinal") String fechaFinal, @WebParam(name = "cantidad") int cantidad, @WebParam(name = "idEncuesta") int idEncuesta) {
        csEncuesta e = new csEncuesta();
        return e.actualizar(idEmpresa, idPregunta, fechaInicio, fechaFinal, cantidad, idEncuesta);

    }

    @WebMethod(operationName = "eliminar")
    public int eliminarEncuesta(@WebParam(name = "idEncuesta") int idEncuesta) {
        csEncuesta e = new csEncuesta();
        return e.eliminar(idEncuesta);

    }

    @WebMethod(operationName = "listar")
    public ArrayList<encuesta> listarEncuesta() {
        csEncuesta e = new csEncuesta();
        return e.listarEncuesta();

    }

    @WebMethod(operationName = "listarPorID")
    public encuesta listarPorIDEncuesta(@WebParam(name = "idEncuesta") int idEncuesta) {
        csEncuesta e = new csEncuesta();
        return e.listarEncuestaPorId(idEncuesta);
    }
}
