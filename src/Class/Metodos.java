/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Randald Villegas
 */
public class Metodos {
    private int cantidadJugadores;
    private int auxCodigo;
    private ImageIcon fotografia;
    protected Usuario usuarioLogueado;
    public ArrayList<Usuario> listaUsuarios;
    private ArrayList<Jugador> listaJugadores;
    private ArrayList<Categoria> listaCategorias;
    private ArrayList<PreguntaVerdaderoFalso> listaPreguntasVerdaderoFalso;
    private ArrayList<PreguntaSeleccionUnica> listaPreguntaSeleccionUnicas;
    private ArrayList<PreguntaSeleccionMultiple> listaPreguntaSeleccionMultiples;
    
    
    //Singleton
    
    public static Metodos instance = null;
    
    //Constructor
    protected Metodos() {
        
        this.cantidadJugadores = cantidadJugadores;
        this.auxCodigo = 0;
        this.fotografia = fotografia;
        this.usuarioLogueado = usuarioLogueado;
        this.listaUsuarios = new ArrayList<Usuario>();
        this.listaJugadores = new ArrayList<Jugador>();
        this.listaCategorias = new ArrayList<Categoria>();
        this.listaPreguntasVerdaderoFalso = new ArrayList<PreguntaVerdaderoFalso>();
        this.listaPreguntaSeleccionUnicas = new ArrayList<PreguntaSeleccionUnica>();
        this.listaPreguntaSeleccionMultiples = new ArrayList<PreguntaSeleccionMultiple>();

    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public int getAuxCodigo() {
        return auxCodigo;
    }

    public void setAuxCodigo(int auxCodigo) {
        this.auxCodigo = auxCodigo;
    }

    public ImageIcon getFotografia() {
        return fotografia;
    }

    public void setFotografia(ImageIcon fotografia) {
        this.fotografia = fotografia;
    }

    public Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public ArrayList<PreguntaVerdaderoFalso> getListaPreguntasVerdaderoFalso() {
        return listaPreguntasVerdaderoFalso;
    }

    public void setListaPreguntasVerdaderoFalso(ArrayList<PreguntaVerdaderoFalso> listaPreguntasVerdaderoFalso) {
        this.listaPreguntasVerdaderoFalso = listaPreguntasVerdaderoFalso;
    }

    public ArrayList<PreguntaSeleccionUnica> getListaPreguntaSeleccionUnicas() {
        return listaPreguntaSeleccionUnicas;
    }

    public void setListaPreguntaSeleccionUnicas(ArrayList<PreguntaSeleccionUnica> listaPreguntaSeleccionUnicas) {
        this.listaPreguntaSeleccionUnicas = listaPreguntaSeleccionUnicas;
    }

    public ArrayList<PreguntaSeleccionMultiple> getListaPreguntaSeleccionMultiples() {
        return listaPreguntaSeleccionMultiples;
    }

    public void setListaPreguntaSeleccionMultiples(ArrayList<PreguntaSeleccionMultiple> listaPreguntaSeleccionMultiples) {
        this.listaPreguntaSeleccionMultiples = listaPreguntaSeleccionMultiples;
    }
    
    
    
    /*------------------------Metodos-de-otras-clases-------------------------*/
    

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
    //metodo para llevar el codigo de cada categoria
    public int aumentarCategoria(){
        auxCodigo++;
        return auxCodigo;
    
    }

    public static Metodos getInstance(){
        if(instance == null)
            instance = new Metodos();
        return instance;
    }

    
    
    
    

}
