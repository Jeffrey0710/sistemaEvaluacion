/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsServicios;

import Modelo.csRegistroEvaluacion;
import Modelo.registroEvaluacion;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "srvRegistroEvaluacion")
public class srvRegistroEvaluacion {

    @WebMethod(operationName = "insertar")
    public int insertarRegistroEvaluacion(@WebParam(name = "idTipoEvaluacion") int idTipoEvaluacion, @WebParam(name = "idEncuesta") int idEncuesta, @WebParam(name = "idRegistroRespuesta") int idRegistroRespuesta, @WebParam(name = "totalEvaluacion") double totalEvaluacion, @WebParam(name = "fecha") String fecha) {
        csRegistroEvaluacion re = new csRegistroEvaluacion();
        return re.insertar(idTipoEvaluacion, idEncuesta, idRegistroRespuesta, totalEvaluacion, fecha);
    }

    @WebMethod(operationName = "actualizar")
    public int actualizarRegistroEvaluacion(@WebParam(name = "idTipoEvaluacion") int idTipoEvaluacion, @WebParam(name = "idEncuesta") int idEncuesta, @WebParam(name = "idRegistroRespuesta") int idRegistroRespuesta, @WebParam(name = "totalEvaluacion") double totalEvaluacion, @WebParam(name = "fecha") String fecha, @WebParam(name = "idRegistroEvaluacion") int idRegistroEvaluacion) {
        csRegistroEvaluacion re = new csRegistroEvaluacion();
        return re.actualizar(idTipoEvaluacion, idEncuesta, idRegistroRespuesta, totalEvaluacion, fecha, idRegistroEvaluacion);
    }//actualizar

    @WebMethod(operationName = "eliminar")
    public int eliminarRegistroEvaluacion(@WebParam(name = "idRegistroEvaluacion") int idRegistroEvaluacion) {
        csRegistroEvaluacion re = new csRegistroEvaluacion();
        return re.eliminar(idRegistroEvaluacion);
    }//eliminar

    @WebMethod(operationName = "listar")
    public ArrayList<registroEvaluacion> listar() {
        csRegistroEvaluacion re = new csRegistroEvaluacion();
        return re.listarRegistroEvaluacion();
    }//listar

    @WebMethod(operationName = "listarPorID")
    public registroEvaluacion listarPorIDRegistroEvaluacion(@WebParam(name = "idRegistroEvaluacion") int idRegistroEvaluacion) {
        csRegistroEvaluacion re = new csRegistroEvaluacion();
        return re.listarRegistroEvaluacionPorID(idRegistroEvaluacion);

    }
}
