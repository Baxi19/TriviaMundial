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
import java.util.Comparator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Randald Villegas
 */

public class Metodos {
    //variables
    private int cantidadJugadores;
    private int nivelSeleccionado;
    private int usuarioSelecionado;
    private int auxCodigo;
    private ImageIcon fotografia;
    
    //Relaciones
    private Torneo torneo;
    private PreguntaSeleccionMultiple preguntaSM;
    private PreguntaSeleccionUnica preguntaSU;
    private PreguntaVerdaderoFalso preguntaVF;
    protected Usuario usuarioLogueado;
    
    //ArrayList<> 
    public ArrayList<Usuario> listaUsuarios;
    public ArrayList<Usuario> listaUsuariosAdmi;
    private ArrayList<Usuario> listaJugadoresTorneo;
    public ArrayList<Categoria> listaCategorias;
    public ArrayList<PreguntaVerdaderoFalso> listaPreguntasVerdaderoFalso;
    public ArrayList<PreguntaSeleccionUnica> listaPreguntaSeleccionUnicas;
    public ArrayList<PreguntaSeleccionMultiple> listaPreguntaSeleccionMultiples;
    public ArrayList<Torneo> listaTorneos;
    public ArrayList <Pregunta> listaPreguntasAuxTorneo;
    
    //Singleton
    public static Metodos instance = null;

    //Constructor
    protected Metodos() {
        this.torneo = torneo;
        this.cantidadJugadores = 1;
        this.preguntaSM = preguntaSM;
        this.preguntaSU = preguntaSU;
        this.preguntaVF = preguntaVF;
        this.nivelSeleccionado = nivelSeleccionado;
        this.usuarioSelecionado = 0;
        this.auxCodigo = 0;
        this.fotografia = fotografia;
        this.usuarioLogueado = usuarioLogueado;
        this.listaUsuarios = new ArrayList<Usuario>();
        this.listaUsuariosAdmi = new ArrayList<Usuario>();
        this.listaJugadoresTorneo = new ArrayList<Usuario>();
        this.listaCategorias = new ArrayList<Categoria>();
        this.listaPreguntasVerdaderoFalso = new ArrayList<PreguntaVerdaderoFalso>();
        this.listaPreguntaSeleccionUnicas = new ArrayList<PreguntaSeleccionUnica>();
        this.listaPreguntaSeleccionMultiples = new ArrayList<PreguntaSeleccionMultiple>();
        this.listaTorneos = new ArrayList<Torneo>();
        this.listaPreguntasAuxTorneo = new ArrayList<Pregunta>();
    }

    public ArrayList<Pregunta> getListaPreguntasAuxTorneo() {
        return listaPreguntasAuxTorneo;
    }

    public void setListaPreguntasAuxTorneo(ArrayList<Pregunta> listaPreguntasAuxTorneo) {
        this.listaPreguntasAuxTorneo = listaPreguntasAuxTorneo;
    }
    

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

  
    
    public PreguntaSeleccionMultiple getPreguntaSM() {
        return preguntaSM;
    }

    public void setPreguntaSM(PreguntaSeleccionMultiple preguntaSM) {
        this.preguntaSM = preguntaSM;
    }

    public PreguntaSeleccionUnica getPreguntaSU() {
        return preguntaSU;
    }

    public void setPreguntaSU(PreguntaSeleccionUnica preguntaSU) {
        this.preguntaSU = preguntaSU;
    }

    public PreguntaVerdaderoFalso getPreguntaVF() {
        return preguntaVF;
    }

    public void setPreguntaVF(PreguntaVerdaderoFalso preguntaVF) {
        this.preguntaVF = preguntaVF;
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

    public ArrayList<Usuario> getListaJugadoresTorneo() {
        return listaJugadoresTorneo;
    }

    public void setListaJugadoresTorneo(ArrayList<Usuario> listaJugadoresTorneo) {
        this.listaJugadoresTorneo = listaJugadoresTorneo;
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
        //metodo para desordenar la lista de las preguntas
        Collections.shuffle(Metodos.getInstance().listaPreguntasAuxTorneo);

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
    public void abrirWeb(){
        //funcion para abrir facebook
        try {
            Desktop.getDesktop().browse(URI.create("https://github.com/Baxi19"));
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
 
    public boolean EliminarPregunta(String preguntaEliminar) {
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
            if (aux2.getPregunta().equals(preguntaEliminar)
                    | aux2.getRespuesta1().equals(preguntaEliminar)
                    | aux2.getRespuesta2().equals(preguntaEliminar)
                    | aux2.getRespuesta3().equals(preguntaEliminar)
                    | aux2.getRespuesta4().equals(preguntaEliminar)) {
                Metodos.getInstance().listaPreguntaSeleccionUnicas.remove(i);
                return true;
            }
        }
        for (int i = 0; i < Metodos.getInstance().listaPreguntasVerdaderoFalso.size(); i++) {
            PreguntaVerdaderoFalso aux3 = Metodos.getInstance().getListaPreguntasVerdaderoFalso().get(i);
            if (aux3.getPregunta().equals(preguntaEliminar)
                    | aux3.getRespuestaVerdadera().equals(preguntaEliminar)
                    | aux3.getRespuestaFalsa().equals(preguntaEliminar)) {
                Metodos.getInstance().listaPreguntasVerdaderoFalso.remove(i);
                return true;
            }
        }

        return false;

    }

    public boolean ModificarPregunta(String preguntaModificar) {
        //metodo para recorrer las preguntas y modificarla

        for (int i = 0; i < Metodos.getInstance().listaPreguntaSeleccionMultiples.size(); i++) {
            PreguntaSeleccionMultiple aux = Metodos.getInstance().getListaPreguntaSeleccionMultiples().get(i);
            if (aux.getPregunta().equals(preguntaModificar)){
                
                PreguntaSeleccionMultiple pregunta = Metodos.getInstance().getListaPreguntaSeleccionMultiples().get(i);
                String nuevaPregunta = JOptionPane.showInputDialog("New Question");
                String level = JOptionPane.showInputDialog("Level");
                String respuestaCorrecta = JOptionPane.showInputDialog("Correct answer");
                String respuestaIncorrecta1 = JOptionPane.showInputDialog("Wrong answer 1");
                String respuestaIncorrecta2 = JOptionPane.showInputDialog("Wrong answer 2");
                String respuestaIncorrecta3 = JOptionPane.showInputDialog("Wrong answer 3");

                int nivel = Integer.parseInt(level);
                Respuesta rp1 = new Respuesta(respuestaCorrecta, true);
                Respuesta rp2 = new Respuesta(respuestaIncorrecta1, false);
                Respuesta rp3 = new Respuesta(respuestaIncorrecta2, false);
                Respuesta rp4 = new Respuesta(respuestaIncorrecta3, false);

                pregunta.setPregunta(nuevaPregunta);
                pregunta.setRespuesta1(rp1);
                pregunta.setRespuesta2(rp2);
                pregunta.setRespuesta3(rp3);
                pregunta.setRespuesta4(rp4);
                pregunta.setNivelDificultad(nivel);
                
                JOptionPane.showMessageDialog(null, "Question Multiple choice Edited!");

                return true;
            }
        }

        for (int i = 0; i < Metodos.getInstance().listaPreguntaSeleccionUnicas.size(); i++) {
            PreguntaSeleccionUnica aux2 = Metodos.getInstance().getListaPreguntaSeleccionUnicas().get(i);
            if (aux2.getPregunta().equals(preguntaModificar)) {

                PreguntaSeleccionUnica pregunta = Metodos.getInstance().listaPreguntaSeleccionUnicas.get(i);
                String nuevaPregunta = JOptionPane.showInputDialog("New Question");
                String level = JOptionPane.showInputDialog("Level");
                String respuestaCorrecta = JOptionPane.showInputDialog("Correct answer");
                String respuestaIncorrecta1 = JOptionPane.showInputDialog("Wrong answer 1");
                String respuestaIncorrecta2 = JOptionPane.showInputDialog("Wrong answer 2");
                String respuestaIncorrecta3 = JOptionPane.showInputDialog("Wrong answer 3");

                int nivel = Integer.parseInt(level);
                Respuesta rp5 = new Respuesta(respuestaCorrecta, true);
                Respuesta rp6 = new Respuesta(respuestaIncorrecta1, false);
                Respuesta rp7 = new Respuesta(respuestaIncorrecta2, false);
                Respuesta rp8 = new Respuesta(respuestaIncorrecta3, false);

                pregunta.setPregunta(nuevaPregunta);
                pregunta.setRespuesta1(rp5);
                pregunta.setRespuesta2(rp6);
                pregunta.setRespuesta3(rp7);
                pregunta.setRespuesta4(rp8);
                pregunta.setNivelDificultad(nivel);

                JOptionPane.showMessageDialog(null, "Question Single choice Edited!");

                return true;
            }
        }

        for (int i = 0; i < Metodos.getInstance().listaPreguntasVerdaderoFalso.size(); i++) {
            PreguntaVerdaderoFalso aux3 = Metodos.getInstance().getListaPreguntasVerdaderoFalso().get(i);
            if (aux3.getPregunta().equals(preguntaModificar)) {

                PreguntaVerdaderoFalso pregunta = Metodos.getInstance().listaPreguntasVerdaderoFalso.get(i);
                String nuevaPregunta = JOptionPane.showInputDialog("New Question");
                String level = JOptionPane.showInputDialog("Level");
                String respuestaCorrecta = JOptionPane.showInputDialog("Correct answer");
                String respuestaIncorrecta1 = JOptionPane.showInputDialog("Wrong answer 1");

                int nivel = Integer.parseInt(level);
                Respuesta rp9 = new Respuesta(respuestaCorrecta, true);
                Respuesta rp10 = new Respuesta(respuestaIncorrecta1, false);

                pregunta.setPregunta(nuevaPregunta);
                pregunta.setRespuestaVerdadera(rp9);
                pregunta.setRespuestaFalsa(rp10);
                pregunta.setNivelDificultad(nivel);

                JOptionPane.showMessageDialog(null, "Question True / False Edited!");
                return true;
            }
        }

        return false;

    }
    
    public void MachineLearningPrint(String mensaje){
        //XD
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void ordenarListaUsuarios() {
        //metodo para ordenar la lista de usuarios para un juego
        ArrayList<Usuario> lista = Metodos.getInstance().getListaJugadoresTorneo();
        Collections.sort(lista, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario obj1, Usuario obj2) {
                return obj1.nombreUsuario.compareTo(obj2.getNombreUsuario());

            }
        });

    }

}
