/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Randald Villegas
 */
public class Jugador {
    Usuario jugador;
    int monedas;

    public Jugador(Usuario jugador, int monedas) {
        this.jugador = jugador;
        this.monedas = monedas;
    }

    public Usuario getJugador() {
        return jugador;
    }

    public void setJugador(Usuario jugador) {
        this.jugador = jugador;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }
    
    
}
