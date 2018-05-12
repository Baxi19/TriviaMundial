/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Randald Villegas
 */
public class Metodos {
    private int cantidadJugadores;
    private int nivelSeleccionado;
    private int usuarioSelecionado;
    private int auxCodigo;
    private ImageIcon fotografia;
    protected Usuario usuarioLogueado;
    public ArrayList<Usuario> listaUsuarios;
    public ArrayList<Usuario> listaUsuariosAdmi;
    private ArrayList<Jugador> listaJugadores;
    private ArrayList<Jugador> listaJugadoresSeleccionados;
    public ArrayList<Categoria> listaCategorias;
    public ArrayList<PreguntaVerdaderoFalso> listaPreguntasVerdaderoFalso;
    public ArrayList<PreguntaSeleccionUnica> listaPreguntaSeleccionUnicas;
    public ArrayList<PreguntaSeleccionMultiple> listaPreguntaSeleccionMultiples;
    
    
    //Singleton
    
    public static Metodos instance = null;
    
    //Constructor
    protected Metodos() {
        
        this.cantidadJugadores = cantidadJugadores;
        this.nivelSeleccionado = nivelSeleccionado;
        this.usuarioSelecionado = 0;
        this.auxCodigo = 0;
        this.fotografia = fotografia;
        this.usuarioLogueado = usuarioLogueado;
        this.listaUsuarios = new ArrayList<Usuario>();
        this.listaUsuariosAdmi = new ArrayList<Usuario>();
        this.listaJugadores = new ArrayList<Jugador>();
        this.listaJugadoresSeleccionados = new ArrayList<Jugador>();
        this.listaCategorias = new ArrayList<Categoria>();
        this.listaPreguntasVerdaderoFalso = new ArrayList<PreguntaVerdaderoFalso>();
        this.listaPreguntaSeleccionUnicas = new ArrayList<PreguntaSeleccionUnica>();
        this.listaPreguntaSeleccionMultiples = new ArrayList<PreguntaSeleccionMultiple>();

    }

    @Override
    public String toString() {
        return "Metodos{" + "cantidadJugadores=" + cantidadJugadores + ", nivelSeleccionado=" + nivelSeleccionado + ", usuarioSelecionado=" + usuarioSelecionado + ", auxCodigo=" + auxCodigo + ", fotografia=" + fotografia + ", usuarioLogueado=" + usuarioLogueado + ", listaUsuarios=" + listaUsuarios + ", listaUsuariosAdmi=" + listaUsuariosAdmi + ", listaJugadores=" + listaJugadores + ", listaJugadoresSeleccionados=" + listaJugadoresSeleccionados + ", listaCategorias=" + listaCategorias + ", listaPreguntasVerdaderoFalso=" + listaPreguntasVerdaderoFalso + ", listaPreguntaSeleccionUnicas=" + listaPreguntaSeleccionUnicas + ", listaPreguntaSeleccionMultiples=" + listaPreguntaSeleccionMultiples + '}';
    }
    

    public ArrayList<Usuario> getListaUsuariosAdmi() {
        return listaUsuariosAdmi;
    }

    public void setListaUsuariosAdmi(ArrayList<Usuario> listaUsuariosAdmi) {
        this.listaUsuariosAdmi = listaUsuariosAdmi;
    }

    public int getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(int usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
    }
    
    public int getNivelSeleccionado() {
        return nivelSeleccionado;
    }

    public void setNivelSeleccionado(int nivelSeleccionado) {
        this.nivelSeleccionado = nivelSeleccionado;
    }

    public ArrayList<Jugador> getListaJugadoresSeleccionados() {
        return listaJugadoresSeleccionados;
    }

    public void setListaJugadoresSeleccionados(ArrayList<Jugador> listaJugadoresSeleccionados) {
        this.listaJugadoresSeleccionados = listaJugadoresSeleccionados;
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
    // metodo que verifica el acceso de un usuario registrado como administrador
    public boolean verificarAdmi(String nombre, String contraseña){
        for (int i = 0; i < listaUsuariosAdmi.size() ; i++) {
            if (listaUsuariosAdmi.get(i).getNombreCompleto().equals(nombre) & listaUsuariosAdmi.get(i).contraseña.equals(contraseña)){
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
    //metodo del singleton
    public static Metodos getInstance(){
        if(instance == null)
            instance = new Metodos();
        return instance;
    }
    //metodo para imprimir categorias
    public void imprimirCategorias(){
        for (int i = 0; i < listaCategorias.size(); i++) {
            System.out.println("Categoria :" + listaCategorias.get(i).getTipo());
        }
    }
    //metodo para imprimir Jugadores
    public void imprimirJugadores(){
        for (int i = 0; i < listaJugadores.size(); i++) {
            System.out.println("Jugador :" + listaJugadores.get(i).getJugador().nombreUsuario);
        }
    }
    //metodo para imprimir Usuarios
    public void imprimirUsuarios(){
        for (int i = 0; i < listaUsuarios.size(); i++) {
            System.out.println("Nombre :" + listaUsuarios.get(i).getNombreCompleto());
        }
    }
    //metodo para imprimir Preguntas Verdaderas o falsas
    public void imprimirPreguntaFalsaVerdad(){
        for (int i = 0; i < listaPreguntasVerdaderoFalso.size(); i++) {
            System.out.println("Tipo: Verdad o falsa \n Pregunta :" + listaPreguntasVerdaderoFalso.get(i).getPregunta());
        }
    }
    //metodo para imprimir Preguntas Seleccion Unica
    public void imprimirPreguntaSeleccionUnica(){
        for (int i = 0; i < listaPreguntaSeleccionUnicas.size(); i++) {
            System.out.println("Tipo: Seleccion Unica  \n Pregunta :" + listaPreguntaSeleccionUnicas.get(i).getPregunta());
        }
    }
    //metodo para imprimir Preguntas Seleccion Multiple
    public void imprimirPreguntaSeleccionMultiple(){
        for (int i = 0; i < listaPreguntaSeleccionMultiples.size(); i++) {
            System.out.println("Tipo: Seleccion Multiples  \n Pregunta :" + listaPreguntaSeleccionMultiples.get(i).getPregunta());
        }
    }
    
    
    //metodo para eliminar una categoria
    public String EliminarCategoria(String Nombre) {
        for (int i = 0; i < Metodos.getInstance().listaCategorias.size(); i++) {
            if (Metodos.getInstance().listaCategorias.get(i).equals(Nombre)) {
                Metodos.getInstance().listaCategorias.remove(i);
                String aux = Metodos.getInstance().listaCategorias.get(i).getClass().getName();
                JOptionPane.showMessageDialog(null, "Categoria Eliminada");
                return  aux;

            }
        }
        return "No encontrado";
    }

    
    

}
