/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alumno
 */
public class tipoEvaluacion {
    private String nombre;
    private int idTipoEvaluacion;
    
    public tipoEvaluacion(String nombre, int idTipoEvaluacion){
        this.nombre = nombre;
        this.idTipoEvaluacion=idTipoEvaluacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTipoEvaluacion() {
        return idTipoEvaluacion;
    }

    public void setIdTipoEvaluacion(int idTipoEvaluacion) {
        this.idTipoEvaluacion = idTipoEvaluacion;
    }
}
