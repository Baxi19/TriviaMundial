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
    private int participantes;
    private int dificultad;
    private int cantidadPreguntasJugador;
    private ArrayList<Usuario> listaJugadores;

    public Torneo(String nombreTorneo, int participantes, int dificultad, int cantidadPreguntasJugador, ArrayList<Usuario> listaJugadores) {
        this.nombreTorneo = nombreTorneo;
        this.participantes = participantes;
        this.dificultad = dificultad;
        this.cantidadPreguntasJugador = cantidadPreguntasJugador;
        this.listaJugadores = new ArrayList<Usuario>();
    }

    public ArrayList<Usuario> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Usuario> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
    
    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
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
        return "Torneo{" + "nombreTorneo=" + nombreTorneo + ", participantes=" + participantes + ", dificultad=" + dificultad + ", cantidadPreguntasJugador=" + cantidadPreguntasJugador + '}';
    }
 
}
