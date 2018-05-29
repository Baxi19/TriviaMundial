/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Class.Usuario;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author ADMIN
 */
public class Jugador extends Usuario {
    private int monedas;
    private int puntos; 
    private boolean comodin;
    private ArrayList<Promedio> porcentajeAciertos ;

    public Jugador() {
        super("", "", "", "", "", "", new ImageIcon());
        this.monedas = 0;
        this.puntos = 0;
        this.comodin = true;
        this.porcentajeAciertos = new ArrayList<>();
    }

    
    public Jugador(String nombreCompleto, String nombreUsuario, String correo, String contraseña, String pais, String sexo, ImageIcon fotografia) {
        super(nombreCompleto, nombreUsuario, correo, contraseña, pais, sexo, fotografia);
        this.monedas=10;
        this.puntos=0;
        this.comodin=false;
        this.porcentajeAciertos = new  ArrayList<Promedio>();
    }

    public ArrayList<Promedio> getPorcentajeAciertos() {
        return porcentajeAciertos;
    }

    public Promedio existe(Promedio t){
        for(int i = 0; i<porcentajeAciertos.size();i++){
            if(porcentajeAciertos.get(i).getCategoria().equals(t.getCategoria())){//encuentre la tupla si ya existe
                return porcentajeAciertos.get(i);
            }
        }
        return null;
    }
    public void addPorcentajeAciertos(Promedio t,boolean correcta) {
     
        Promedio nueva = existe(t);
        if(nueva!=null){//si ya existe el promedio solo se le aumentara al existente
            if(correcta){//edita ya existentes promedios en la lista
                nueva.setCorrectas(nueva.getCorrectas()+1);
            }
            else{
                nueva.setIncorrectas(nueva.getIncorrectas()+1);
            }
        }
        else{            
            if(correcta){
                t.setCorrectas(t.getCorrectas()+1);//modifica el mandado y los agrega a la lista
                porcentajeAciertos.add(t);
            }
            else{
                t.setIncorrectas(t.getIncorrectas()+1);
                porcentajeAciertos.add(t);
            }
            
        
        }
    }
    
    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean isComodin() {
        return comodin;
    }

    public void setComodin(boolean comodin) {
        this.comodin = comodin;
    }


}
