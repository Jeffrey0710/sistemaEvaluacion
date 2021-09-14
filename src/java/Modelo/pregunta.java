package Modelo;

/**
 *
 * @author alumno
 */
public class pregunta {

    private int idTipoPregunta;
    private int idPonderacionPregunta;
    private String pregunta;
    private int idPregunta;

    public pregunta(int idTipoPregunta, int idPonderacionPregunta, String pregunta, int idPregunta) {
        this.idTipoPregunta = idTipoPregunta;
        this.idPonderacionPregunta = idPonderacionPregunta;
        this.pregunta = pregunta;
        this.idPregunta = idPregunta;
    }

    public int getIdtipoPregunta() {
        return idTipoPregunta;
    }

    public void setIdtipoPregunta(int idTipoPregunta) {
        this.idTipoPregunta = idTipoPregunta;
    }

    public int getIdponderacionPregunta() {
        return idPonderacionPregunta;
    }

    public void setIdponderacionPregunta(int idPonderacionPregunta) {
        this.idPonderacionPregunta = idPonderacionPregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

}
