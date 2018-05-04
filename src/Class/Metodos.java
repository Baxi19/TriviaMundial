/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author toshib
 */
public class Metodos {
    private ImageIcon fotografia;
    protected Usuario usuarioLogueado;
    public ArrayList<Usuario> listaUsuarios;
    
    //Singleton
    public static Metodos instance = null;
    
    //Constructor
    protected Metodos() {
        this.listaUsuarios = new ArrayList<Usuario>();
        this.usuarioLogueado = new Usuario("", "", "", "", "", "", fotografia);
        
    }
    //set & get de listas
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    @Override
    public String toString() {
        return "Metodos{" + "usuarioActual=" + usuarioLogueado + ", listaUsuarios=" + listaUsuarios + '}';
    }
  
    /*------------------------Metodos-de-otras-clases-------------------------*/

    
    public static Metodos getInstance(){
        if(instance == null)
            instance = new Metodos();
        return instance;
    }
    //metodo para buscar si existe un nombre en la lista de usuarios
    public boolean buscarNombre(String nombre){
        for (int i = 0; i < listaUsuarios.size() ; i++) {
            if (listaUsuarios.get(i).nombreUsuario.equals(nombre)){
                return true;
            }
        }
        return false;
    }
    // metodo que verifica el acceso de un usuario registrado
    public boolean verificar(String nombre, String contraseña){
        for (int i = 0; i < listaUsuarios.size() ; i++) {
            if (listaUsuarios.get(i).nombreUsuario.equals(nombre) & listaUsuarios.get(i).contraseña.equals(contraseña)){
                return true;
            }
        }
        return false;
    }
    
    
    

}
