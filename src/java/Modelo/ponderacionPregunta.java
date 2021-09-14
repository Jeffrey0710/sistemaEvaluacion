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
public class ponderacionPregunta {
    private double punteo;
    private int idPonderacionPregunta;

public ponderacionPregunta(double punteo, int idPonderacionPregunta)
{
	this.punteo=punteo;
        this.idPonderacionPregunta=idPonderacionPregunta;
}

    public double getPunteo() {
        return punteo;
    }

    public void setPunteo(double punteo) {
        this.punteo = punteo;
    }

    public int getIdPonderacionPregunta() {
        return idPonderacionPregunta;
    }

    public void setIdPonderacionPregunta(int idPonderacionPregunta) {
        this.idPonderacionPregunta = idPonderacionPregunta;
    }


}
