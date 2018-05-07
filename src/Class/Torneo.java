/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;
import java.util.ArrayList;
/**
 *
 * @author Randald Villegas
 */
public class Torneo {
    
    private String nombreTorneo;
    private ArrayList<Jugador> listaJugadores;
    
    private int participantes;
    private int dificultad; 
    private int cantidadPreguntasJugador;
    
    //Singleton
    public static Torneo instance = null;
    
    protected Torneo() {
        this.nombreTorneo = nombreTorneo;
        this.listaJugadores = listaJugadores;
        
        this.participantes = participantes;
        this.dificultad = dificultad;
        this.cantidadPreguntasJugador = cantidadPreguntasJugador;
    }
    public static Torneo getInstance(){
        if(instance == null)
            instance = new Torneo();
        return instance;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getCantidadPreguntasJugador() {
        return cantidadPreguntasJugador;
    }

    public void setCantidadPreguntasJugador(int cantidadPreguntasJugador) {
        this.cantidadPreguntasJugador = cantidadPreguntasJugador;
    }

    @Override
    public String toString() {
        return "Torneo{" + "nombreTorneo=" + nombreTorneo + ", listaJugadores=" + listaJugadores + ", participantes=" + participantes + ", dificultad=" + dificultad + ", cantidadPreguntasJugador=" + cantidadPreguntasJugador + '}';
    }
    
    
}
