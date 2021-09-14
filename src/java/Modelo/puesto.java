package Modelo;

/**
 *
 * @author alumno
 */
public class puesto {
    private  String nombre;
private double sueldo;
private  String caracteristicas;
private  String requerimientos;
private  String  horario;
private int idPuesto;

    public puesto(String nombre, double sueldo, String caracteristicas, String requerimientos, String horario, int idPuesto) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.caracteristicas = caracteristicas;
        this.requerimientos = requerimientos;
        this.horario = horario;
        this.idPuesto = idPuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getRequerimientos() {
        return requerimientos;
    }

    public void setRequerimientos(String requerimientos) {
        this.requerimientos = requerimientos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }
}
