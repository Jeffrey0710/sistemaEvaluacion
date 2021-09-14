package Modelo;

/**
 *
 * @author alumno
 */
public class tipoPregunta {

    private String tipoPregunta;
    private int idTipoPregunta;

    public tipoPregunta(String tipoPregunta, int idTipoPregunta) {
        this.tipoPregunta = tipoPregunta;
        this.idTipoPregunta = idTipoPregunta;
    }

    public String getTipoPregunta() {
        return tipoPregunta;
    }

    public void setTipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }

    public int getIdTipoPregunta() {
        return idTipoPregunta;
    }

    public void setIdTipoPregunta(int idTipoPregunta) {
        this.idTipoPregunta = idTipoPregunta;
    }
}
