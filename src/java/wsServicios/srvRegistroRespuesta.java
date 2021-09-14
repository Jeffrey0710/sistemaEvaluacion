/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsServicios;

import Modelo.csRegistroRespuesta;
import Modelo.registroRespuesta;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "srvRegistroRespuesta")
public class srvRegistroRespuesta {

    @WebMethod(operationName = "insertar")
    public int insertarRegistroRespuesta(@WebParam(name = "idPregunta") int idPregunta, @WebParam(name = "idPersonal") int idPersonal, @WebParam(name = "idEncuesta") int idEncuesta, @WebParam(name = "respuestas") String respuestas, @WebParam(name = "punteo") double punteo) {
        csRegistroRespuesta r = new csRegistroRespuesta();
        return r.insertar(idPregunta, idPersonal, idEncuesta, respuestas, punteo);
    }

    @WebMethod(operationName = "actualizar")
    public int actualizarRegistroRespuesta(@WebParam(name = "idPregunta") int idPregunta, @WebParam(name = "idPersonal") int idPersonal, @WebParam(name = "idEncuesta") int idEncuesta, @WebParam(name = "respuestas") String respuestas, @WebParam(name = "punteo") double punteo, @WebParam(name = "idRegistroRespuesta") int idRegistroRespuesta) {
        csRegistroRespuesta r = new csRegistroRespuesta();
        return r.actualizar(idPregunta, idPersonal, idEncuesta, respuestas, punteo, idRegistroRespuesta);
    }

    @WebMethod(operationName = "eliminar")
    public int eliminarRegistroRespuesta(@WebParam(name = "idRegistroRespuesta") int idRegistroRespuesta) {
        csRegistroRespuesta r = new csRegistroRespuesta();
        return r.eliminar(idRegistroRespuesta);
    }

    @WebMethod(operationName = "listar")
    public ArrayList<registroRespuesta> listarRegistroRespuesta() {
        csRegistroRespuesta r = new csRegistroRespuesta();
        return r.listaRegistroRespuesta();
    }

    @WebMethod(operationName = "listarPorID")
    public registroRespuesta listarPorIDRegistroRespuesta(@WebParam(name = "idRegistroRespuesta") int idRegistroRespuesta) {
        csRegistroRespuesta r = new csRegistroRespuesta();
        return r.listaRegistroRespuestaPorID(idRegistroRespuesta);
    }
}
