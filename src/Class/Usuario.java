/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Randald Villegas
 */
public class Usuario {
    //atributos
    private String nombreCompleto;
    protected String nombreUsuario;
    private String correo;
    protected String contraseña;
    private String pais;
    private String sexo;
    private ImageIcon fotografia;
    
    private int monedas;
    private int puntos;
    private boolean comodin;
    private int puntosTotales;
    //constructor

    public Usuario(String nombreCompleto, String nombreUsuario, String correo, String contraseña, String pais, String sexo, ImageIcon fotografia) {
        this.nombreCompleto = nombreCompleto;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.pais = pais;
        this.sexo = sexo;
        this.fotografia = fotografia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ImageIcon getFotografia() {
        return fotografia;
    }

    public void setFotografia(ImageIcon fotografia) {
        this.fotografia = fotografia;
    }
    
    

    
}
