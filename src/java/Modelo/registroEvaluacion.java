package Modelo;

/**
 *
 * @author alumno
 */
public class registroEvaluacion {

    private String fecha;
    private int idTipoEvaluacion, idEncuesta, idRegistroRespuesta, idRegistroEvaluacion;
    private double totalEvaluacion;

    public registroEvaluacion(int idTipoEvaluacion, int idEncuesta, int idRegistroRespuesta, double totalEvaluacion, String fecha, int idRegistroEvaluacion) {
        this.idTipoEvaluacion = idTipoEvaluacion;
        this.idEncuesta = idEncuesta;
        this.idRegistroRespuesta = idRegistroRespuesta;
        this.totalEvaluacion = totalEvaluacion;
        this.fecha = fecha;
        this.idRegistroEvaluacion = idRegistroEvaluacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdTipoEvaluacion() {
        return idTipoEvaluacion;
    }

    public void setIdTipoEvaluacion(int idTipoEvaluacion) {
        this.idTipoEvaluacion = idTipoEvaluacion;
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public int getIdRegistroRespuesta() {
        return idRegistroRespuesta;
    }

    public void setIdRegistroRespuesta(int idRegistroRespuesta) {
        this.idRegistroRespuesta = idRegistroRespuesta;
    }

    public double getTotalEvaluacion() {
        return totalEvaluacion;
    }

    public void setTotalEvaluacion(double totalEvaluacion) {
        this.totalEvaluacion = totalEvaluacion;
    }

    public int getIdRegistroEvaluacion() {
        return idRegistroEvaluacion;
    }

    public void setIdRegistroEvaluacion(int idRegistroEvaluacion) {
        this.idRegistroEvaluacion = idRegistroEvaluacion;
    }

}
