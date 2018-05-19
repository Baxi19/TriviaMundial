/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Randald Villegas
 */
public class Metodos {

    private int cantidadJugadores;
    private Pregunta pregunta;
    private int nivelSeleccionado;
    private int usuarioSelecionado;
    private int auxCodigo;
    private ImageIcon fotografia;
    protected Usuario usuarioLogueado;
    public ArrayList<Usuario> listaUsuarios;
    public ArrayList<Usuario> listaUsuariosAdmi;
    private ArrayList<Usuario> listaJugadores;
    private ArrayList<Usuario> listaJugadoresSeleccionados;
    public ArrayList<Categoria> listaCategorias;
    public ArrayList<PreguntaVerdaderoFalso> listaPreguntasVerdaderoFalso;
    public ArrayList<PreguntaSeleccionUnica> listaPreguntaSeleccionUnicas;
    public ArrayList<PreguntaSeleccionMultiple> listaPreguntaSeleccionMultiples;
    public ArrayList<Torneo> listaTorneos;

    //Singleton
    public static Metodos instance = null;

    //Constructor
    protected Metodos() {

        this.cantidadJugadores = 1;
        this.nivelSeleccionado = nivelSeleccionado;
        this.usuarioSelecionado = 0;
        this.auxCodigo = 0;
        this.fotografia = fotografia;
        this.usuarioLogueado = usuarioLogueado;
        this.listaUsuarios = new ArrayList<Usuario>();
        this.listaUsuariosAdmi = new ArrayList<Usuario>();
        this.listaJugadores = new ArrayList<Usuario>();
        this.listaJugadoresSeleccionados = new ArrayList<Usuario>();
        this.listaCategorias = new ArrayList<Categoria>();
        this.listaPreguntasVerdaderoFalso = new ArrayList<PreguntaVerdaderoFalso>();
        this.listaPreguntaSeleccionUnicas = new ArrayList<PreguntaSeleccionUnica>();
        this.listaPreguntaSeleccionMultiples = new ArrayList<PreguntaSeleccionMultiple>();
        this.listaTorneos = new ArrayList<Torneo>();

    }

    @Override
    public String toString() {
        return "Metodos{" + "cantidadJugadores=" + cantidadJugadores + ", nivelSeleccionado=" + nivelSeleccionado + ", usuarioSelecionado=" + usuarioSelecionado + ", auxCodigo=" + auxCodigo + ", fotografia=" + fotografia + ", usuarioLogueado=" + usuarioLogueado + ", listaUsuarios=" + listaUsuarios + ", listaUsuariosAdmi=" + listaUsuariosAdmi + ", listaJugadores=" + listaJugadores + ", listaJugadoresSeleccionados=" + listaJugadoresSeleccionados + ", listaCategorias=" + listaCategorias + ", listaPreguntasVerdaderoFalso=" + listaPreguntasVerdaderoFalso + ", listaPreguntaSeleccionUnicas=" + listaPreguntaSeleccionUnicas + ", listaPreguntaSeleccionMultiples=" + listaPreguntaSeleccionMultiples + ", listaTorneos=" + listaTorneos + '}';
    }

    
    
    public ArrayList<Torneo> getListaTorneos() {
        return listaTorneos;
    }

    public void setListaTorneos(ArrayList<Torneo> listaTorneos) {
        this.listaTorneos = listaTorneos;
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

    public ArrayList<Usuario> getListaJugadoresSeleccionados() {
        return listaJugadoresSeleccionados;
    }

    public void setListaJugadoresSeleccionados(ArrayList<Usuario> listaJugadoresSeleccionados) {
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

    public ArrayList<Usuario> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Usuario> listaJugadores) {
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
    public boolean buscarNombre(String nombre) {
        //metodo para buscar si existe un nombre en la lista de usuarios
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).nombreUsuario.equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarAdmi(String nombre, String contraseña) {
        // metodo que verifica el acceso de un usuario registrado como administrador
        for (int i = 0; i < listaUsuariosAdmi.size(); i++) {
            if (listaUsuariosAdmi.get(i).getNombreCompleto().equals(nombre) & listaUsuariosAdmi.get(i).contraseña.equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificar(String nombre, String contraseña) {
        // metodo que verifica el acceso de un usuario registrado
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).nombreUsuario.equals(nombre) & listaUsuarios.get(i).contraseña.equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    public int aumentarCategoria() {
        //metodo para llevar el codigo de cada categoria
        auxCodigo++;
        return auxCodigo;

    }

    public static Metodos getInstance() {
        //metodo para obtener instancia del  singleton
        if (instance == null) {
            instance = new Metodos();
        }
        return instance;
    }

    public void imprimirCategorias() {
        //metodo para imprimir categorias
        for (int i = 0; i < listaCategorias.size(); i++) {
            System.out.println("Category :" + listaCategorias.get(i).getTipo());
        }
    }

    
    
    public ImageIcon BuscarFotoUsuario(String nombre) {
        //metodo para imprimir Usuarios
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if(listaUsuarios.get(i).nombreUsuario.equals(nombre)){
               ImageIcon foto =  listaUsuarios.get(i).getFotografia();
               return foto;
            }
            
        }
        return null;
    }
    public Usuario ModificarUsuario(Usuario usuarioNuevo, String nombre) {
        //metodo para modificar Usuarios
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).nombreUsuario.equals(nombre)) {
                listaUsuarios.set(i, usuarioNuevo);

            }

        }
        return null;
    }
    
    public void imprimirUsuarios() {
        //metodo para imprimir Usuarios
        for (int i = 0; i < listaUsuarios.size(); i++) {
            System.out.println("Name :" + listaUsuarios.get(i).getNombreCompleto());
        }
    }

    public void imprimirPreguntaFalsaVerdad() {
        //metodo para imprimir Preguntas Verdaderas o falsas
        for (int i = 0; i < listaPreguntasVerdaderoFalso.size(); i++) {
            System.out.println("Type: True or false \n Question : " + listaPreguntasVerdaderoFalso.get(i).getPregunta());
        }
    }

    public void imprimirPreguntaSeleccionUnica() {
        //metodo para imprimir Preguntas Seleccion Unica
        for (int i = 0; i < listaPreguntaSeleccionUnicas.size(); i++) {
            System.out.println("Type: Unique Selection \n Question : " + listaPreguntaSeleccionUnicas.get(i).getPregunta());
        }
    }

    public void imprimirPreguntaSeleccionMultiple() {
        //metodo para imprimir Preguntas Seleccion Multiple
        for (int i = 0; i < listaPreguntaSeleccionMultiples.size(); i++) {
            System.out.println("Type: Multiple Selection \n Question: " + listaPreguntaSeleccionMultiples.get(i).getPregunta());
        }
    }

    public String EliminarCategoria(String Nombre) {
        //metodo para eliminar una categoria
        for (int i = 0; i < Metodos.getInstance().listaCategorias.size(); i++) {
            if (Metodos.getInstance().listaCategorias.get(i).getTipo().equals(Nombre)) {
                String aux = Metodos.getInstance().listaCategorias.get(i).getClass().getName();
                Metodos.getInstance().listaCategorias.remove(i);
                JOptionPane.showMessageDialog(null, "Category Eliminated");
                return aux;

            }
        }
        return "Not found";
    }

    public boolean VerificarCategoria(String nuevaCategoria) {
        //Metodo para verificar si ya existe una categoria
        for (int i = 0; i < Metodos.getInstance().listaCategorias.size(); i++) {
            if (Metodos.getInstance().listaCategorias.get(i).getTipo().equals(nuevaCategoria)) {
                return false;
            }
        }
        return true;

    }

    public boolean verificarSeleccionCategoria(String seleccionado) {
        //metodo para verificar que hay seleccionado en un Jlist
        for (int i = 0; i < Metodos.getInstance().listaCategorias.size(); i++) {
            if (Metodos.getInstance().listaCategorias.get(i).getTipo().equals(seleccionado)) {
                return true;
            }
        }
        return false;

    }

    public void desordenarLista() {
        //metodo para desordenar las listas de las preguntas
        Collections.shuffle(Metodos.getInstance().listaPreguntasVerdaderoFalso);
        Collections.shuffle(Metodos.getInstance().listaPreguntaSeleccionUnicas);
        Collections.shuffle(Metodos.getInstance().listaPreguntaSeleccionMultiples);

    }

    public void cerrar() {
        //Para salir del sistema
        try {
            int dialoButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Do you want to exit the system?", "EXIT", dialoButton);
            if (result == 0) {
                System.exit(0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void abrirFacebook(){
        //funcion para abrir facebook
        try {
            Desktop.getDesktop().browse(URI.create("https://github.com/JustinCast"));
        } catch (Exception e) {
        }
    }
    public int getCatidadMonedas(String nombre){
        //metodo que retorna la cantidad de monedas de un usuario
        int monedas = 0;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if(listaUsuarios.get(i).equals(nombre)){
                monedas = listaUsuarios.get(i).getMonedas();
                
            }
        }
        
        return monedas;
    
    }
    public Usuario buscarUsuario(String nombre) {
        //metodo para buscar si existe un nombre en la lista de usuarios
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).nombreUsuario.equals(nombre)) {
                Usuario usuario = listaUsuarios.get(i);
                return usuario;
            }
        }
        return null;
    }
    
    public boolean EliminarPregunta(String preguntaEliminar){
        //metodo para recorrer las preguntas y eliminarla
        
        for (int i = 0; i < Metodos.getInstance().listaPreguntaSeleccionMultiples.size(); i++) {
            PreguntaSeleccionMultiple aux = Metodos.getInstance().getListaPreguntaSeleccionMultiples().get(i);
            if (aux.getPregunta().equals(preguntaEliminar)
                    | aux.getRespuesta1().equals(preguntaEliminar)
                    | aux.getRespuesta2().equals(preguntaEliminar)
                    | aux.getRespuesta3().equals(preguntaEliminar) 
                    | aux.getRespuesta4().equals(preguntaEliminar)) {
                Metodos.getInstance().listaPreguntaSeleccionMultiples.remove(i);
                return true;
            }
        }
        for (int i = 0; i < Metodos.getInstance().listaPreguntaSeleccionUnicas.size(); i++) {
            PreguntaSeleccionUnica aux2 = Metodos.getInstance().getListaPreguntaSeleccionUnicas().get(i);
            if(aux2.getPregunta().equals(preguntaEliminar)
                    | aux2.getRespuesta1().equals(preguntaEliminar)
                    | aux2.getRespuesta2().equals(preguntaEliminar)
                    | aux2.getRespuesta3().equals(preguntaEliminar) 
                    | aux2.getRespuesta4().equals(preguntaEliminar)){
                Metodos.getInstance().listaPreguntaSeleccionUnicas.remove(i);
                return true;
            }
        }
        for (int i = 0; i < Metodos.getInstance().listaPreguntasVerdaderoFalso.size(); i++) {
            PreguntaVerdaderoFalso aux3 = Metodos.getInstance().getListaPreguntasVerdaderoFalso().get(i);
            if(aux3.getPregunta().equals(preguntaEliminar)
                    | aux3.getRespuestaVerdadera().equals(preguntaEliminar)
                    | aux3.getRespuestaFalsa().equals(preguntaEliminar)){
                Metodos.getInstance().listaPreguntasVerdaderoFalso.remove(i);
                return true;
            }
        }
        
        return false;
    
    }
    public boolean ModificarPregunta(String preguntaModificar){
        //metodo para recorrer las preguntas y modificarla
        
        for (int i = 0; i < Metodos.getInstance().listaPreguntaSeleccionMultiples.size(); i++) {
            PreguntaSeleccionMultiple aux = Metodos.getInstance().getListaPreguntaSeleccionMultiples().get(i);
            if (aux.getPregunta().equals(preguntaModificar)
                    | aux.getRespuesta1().equals(preguntaModificar)
                    | aux.getRespuesta2().equals(preguntaModificar)
                    | aux.getRespuesta3().equals(preguntaModificar) 
                    | aux.getRespuesta4().equals(preguntaModificar)) {
                Metodos.getInstance().listaPreguntaSeleccionMultiples.remove(i);
                 
                return true;
            }
        }
        for (int i = 0; i < Metodos.getInstance().listaPreguntaSeleccionUnicas.size(); i++) {
            PreguntaSeleccionUnica aux2 = Metodos.getInstance().getListaPreguntaSeleccionUnicas().get(i);
            if(aux2.getPregunta().equals(preguntaModificar)
                    | aux2.getRespuesta1().equals(preguntaModificar)
                    | aux2.getRespuesta2().equals(preguntaModificar)
                    | aux2.getRespuesta3().equals(preguntaModificar) 
                    | aux2.getRespuesta4().equals(preguntaModificar)){
                Metodos.getInstance().listaPreguntaSeleccionUnicas.remove(i);
                return true;
            }
        }
        for (int i = 0; i < Metodos.getInstance().listaPreguntasVerdaderoFalso.size(); i++) {
            PreguntaVerdaderoFalso aux3 = Metodos.getInstance().getListaPreguntasVerdaderoFalso().get(i);
            if(aux3.getPregunta().equals(preguntaModificar)
                    | aux3.getRespuestaVerdadera().equals(preguntaModificar)
                    | aux3.getRespuestaFalsa().equals(preguntaModificar)){
                Metodos.getInstance().listaPreguntasVerdaderoFalso.remove(i);
                return true;
            }
        }
        
        return false;
    
    }
    
}
