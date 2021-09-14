/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsServicios;

import Modelo.csTipoEvaluacion;
import Modelo.tipoEvaluacion;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alumno
 */
@WebService(serviceName = "srvTipoEvaluacion")
public class srvTipoEvaluacion {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "insertar")
    public int insertarTipoEvaluacion(@WebParam(name = "nombre") String nombre) 
    {
        csTipoEvaluacion te = new csTipoEvaluacion();
        return te.insertar(nombre);
    }
    
    @WebMethod(operationName = "actualizar")
    public int actualizarTipoEvaluacion(@WebParam(name = "nombre") String nombre, @WebParam(name="idTipoEvaluacion") int idTipoEvaluacion){
        csTipoEvaluacion te = new csTipoEvaluacion();
        return te.actualizar(nombre, idTipoEvaluacion);
    }
    
    @WebMethod(operationName = "eliminar")
    public int eliminarTipoEvaluacion(@WebParam(name="idTipoEvaluacion") int idTipoEvaluacion){
        csTipoEvaluacion te = new csTipoEvaluacion();
        return te.eliminar(idTipoEvaluacion);
    }
    
    @WebMethod(operationName = "listar")
    public ArrayList<tipoEvaluacion> listarTipoEvaluacion(){
        csTipoEvaluacion te = new csTipoEvaluacion();
        return te.listarTipoEvaluacion();
    }
    
    @WebMethod(operationName = "listarPorID")
    public tipoEvaluacion listarPorIDTipoEvaluacion(@WebParam(name="idTipoEvaluacion") int idTipoEvaluacion){
        csTipoEvaluacion te = new csTipoEvaluacion();
        return te.listaTipoEvaluacionPorID(idTipoEvaluacion);
    }
}
