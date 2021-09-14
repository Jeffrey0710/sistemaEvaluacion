package wsServicios;

import Modelo.csPonderacionPregunta;
import Modelo.ponderacionPregunta;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "srvPonderacionPregunta")
public class srvPonderacionPregunta {

    @WebMethod(operationName = "insertar")
    public int insertarPonderacionPregunta(@WebParam(name = "punteo") double punteo) {
        csPonderacionPregunta p = new csPonderacionPregunta();
        return p.insertar(punteo);
    }

    @WebMethod(operationName = "actualizacion")
    public int actualizarPonderacionPregunta(@WebParam(name = "punteo") double punteo, @WebParam(name = "idPonderacionPregunta") int idPonderacionPregunta) {
        csPonderacionPregunta p = new csPonderacionPregunta();
        return p.actualizar(punteo, idPonderacionPregunta);
    }

    @WebMethod(operationName = "eliminar")
    public int eliminarPonderacionPregunta(@WebParam(name = "idPonderacionPregunta") int idPonderacionPregunta) {
        csPonderacionPregunta p = new csPonderacionPregunta();
        return p.eliminar(idPonderacionPregunta);
    }

    @WebMethod(operationName = "listar")
    public ArrayList<ponderacionPregunta> listarPonderacionPregunta() {
        csPonderacionPregunta p = new csPonderacionPregunta();
        return p.listarPonderacion();
    }
    
    @WebMethod(operationName = "listarPorID")
    public ponderacionPregunta listarPorIDPonderacionPregunta(@WebParam(name = "idPonderacionPregunta") int idPonderacionPregunta) {
        csPonderacionPregunta p = new csPonderacionPregunta();
        return p.listarPonderacionPreguntaPorID(idPonderacionPregunta);
    }
}
