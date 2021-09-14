package Modelo;

/**
 *
 * @author alumno
 */
public class registroRespuesta {

    private int idPregunta;
    private int idPersonal;
    private int idEncuesta;
    private String respuestas;
    private double punteo;
    private int idRegistroRespuesta;

    public registroRespuesta(int idPregunta, int idPersonal, int idEncuesta, String respuestas, double punteo, int idRegistroRespuesta) {
        this.idPregunta = idPregunta;
        this.idPersonal = idPersonal;
        this.idEncuesta = idEncuesta;
        this.respuestas = respuestas;
        this.punteo = punteo;
        this.idRegistroRespuesta = idRegistroRespuesta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public String getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String respuestas) {
        this.respuestas = respuestas;
    }

    public double getPunteo() {
        return punteo;
    }

    public void setPunteo(double punteo) {
        this.punteo = punteo;
    }

    public int getIdRegistroRespuesta() {
        return idRegistroRespuesta;
    }

    public void setIdRegistroRespuesta(int idRegistroRespuesta) {
        this.idRegistroRespuesta = idRegistroRespuesta;
    }
}
