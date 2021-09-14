package Modelo;

/**
 *
 * @author alumno
 */
public class personal {

    private String nombre, telefono, direccion, email, sexo, fechaNacimiento;
    private int idEmpresa, idPuesto, idPersonal;

    public personal(int idEmpresa, int idPuesto, String nombre, String telefono, String direccion, String email, String sexo, String fechaNacimiento, int idPersonal) {
        this.idEmpresa = idEmpresa;
        this.idPuesto = idPuesto;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.idPersonal = idPersonal;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPuesto) {
        this.idPersonal = idPersonal;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresas) {
        this.idEmpresa = idEmpresa;
    }

}
