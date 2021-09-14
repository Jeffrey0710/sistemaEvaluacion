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
public class usuario {

    private String nombre, password, lugarFavorito, emailAlternativo, pasatiempo;
    private int idEmpresa, idUsuario;

    public usuario(String nombre, String password, String lugarFavorito, String emailAlternativo, String pasatiempo, int idEmpresa, int idUsuario) {
        this.nombre = nombre;
        this.password = password;
        this.lugarFavorito = lugarFavorito;
        this.emailAlternativo = emailAlternativo;
        this.pasatiempo = pasatiempo;
        this.idEmpresa = idEmpresa;
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLugarFavorito() {
        return lugarFavorito;
    }

    public void setLugarFavorito(String lugarFavorito) {
        this.lugarFavorito = lugarFavorito;
    }

    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    public void setEmailAlternativo(String emailAlternativo) {
        this.emailAlternativo = emailAlternativo;
    }

    public String getPasatiempo() {
        return pasatiempo;
    }

    public void setPasatiempo(String pasatiempo) {
        this.pasatiempo = pasatiempo;
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

}
