package wsServicios;

import Modelo.csTipoPregunta;
import Modelo.tipoPregunta;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "srvTipoPregunta")
public class srvTipoPregunta {

    @WebMethod(operationName = "insertar")
    public int insertarTipoPregunta(@WebParam(name = "tipoPregunta") String tipoPregunta) {
        csTipoPregunta p = new csTipoPregunta();
        return p.insertar(tipoPregunta);

    }

    @WebMethod(operationName = "actualizar")
    public int actualizarTipoPregunta(@WebParam(name = "tipoPregunta") String tipoPregunta, @WebParam(name = "idTipoPregunta") int idTipoPregunta) {
        csTipoPregunta p = new csTipoPregunta();
        return p.actualizar(tipoPregunta, idTipoPregunta);

    }

    @WebMethod(operationName = "eliminar")
    public int eliminarTipoPregunta(@WebParam(name = "idTipoPregunta") int idTipoPregunta) {
        csTipoPregunta p = new csTipoPregunta();
        return p.eliminar(idTipoPregunta);

    }

    @WebMethod(operationName = "listar")
    public ArrayList<tipoPregunta> listarTipoPregunta() {
        csTipoPregunta p = new csTipoPregunta();
        return p.listarTipoPregunta();

    }
    
    @WebMethod(operationName = "listarPorID")
    public tipoPregunta listarPorIDTipoPregunta(@WebParam(name = "idTipoPregunta") int idTipoPregunta) {
        csTipoPregunta p = new csTipoPregunta();
        return p.listarTipoPreguntaPorID(idTipoPregunta);
    }

}
