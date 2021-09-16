package Modelo;

/**
 *
 * @author Jeffrey
 */
public class user {
    private int idEmpresa, idUsuario;
    private String usuario, nombre;

    public user(int idEmpresa, int idUsuario, String usuario, String nombre) {
        this.idEmpresa = idEmpresa;
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.nombre = nombre;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
