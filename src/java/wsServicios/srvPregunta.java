/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsServicios;

import Modelo.csPregunta;
import Modelo.pregunta;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "srvPregunta")
public class srvPregunta {

    @WebMethod(operationName = "insertar")
    public int insertarPregunta(@WebParam(name = "idTipoPregunta") int idTipoPregunta, @WebParam(name = "idPonderacionPregunta") int idPonderacionPregunta, @WebParam(name = "pregunta") String pregunta) {
        csPregunta p = new csPregunta();
        return p.insertar(idTipoPregunta, idPonderacionPregunta, pregunta);
    }

    @WebMethod(operationName = "actualizacion")
    public int actualizarPregunta(@WebParam(name = "idTipoPregunta") int idTipoPregunta, @WebParam(name = "idPonderacionPregunta") int idPonderacionPregunta, @WebParam(name = "pregunta") String pregunta, @WebParam(name = "idPregunta") int idPregunta) {
        csPregunta p = new csPregunta();
        return p.actualizar(idTipoPregunta, idPonderacionPregunta, pregunta, idPregunta);
    }

    @WebMethod(operationName = "eliminar")
    public int eliminarPregunta(@WebParam(name = "idPregunta") int idPregunta) {
        csPregunta p = new csPregunta();
        return p.elilminar(idPregunta);
    }

    @WebMethod(operationName = "listar")
    public ArrayList<pregunta> listarPregunta() {
        csPregunta p = new csPregunta();
        return p.listarPreguntas();
    }

    @WebMethod(operationName = "listarPorID")
    public pregunta listarPorIDPregunta(@WebParam(name = "idPregunta") int idPregunta) {
        csPregunta p = new csPregunta();
        return p.listarPreguntasPorID(idPregunta);
    }
}
