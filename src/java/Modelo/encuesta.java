package Modelo;

/**
 *
 * @author alumno
 */
public class encuesta {

    private int idEmpresa, idPregunta;
    private String fechaInicio, fechaFinal;
    private int cantidad, idEncuesta;

    public encuesta(int idEmpresa, int idPregunta, String fechaInicio, String fechaFinal, int cantidad, int idEncuesta) {
        this.idEmpresa = idEmpresa;
        this.idPregunta = idPregunta;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cantidad = cantidad;
        this.idEncuesta = idEncuesta;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

}
