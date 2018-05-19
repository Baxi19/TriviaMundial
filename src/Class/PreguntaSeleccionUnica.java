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
public class PreguntaSeleccionUnica extends Pregunta {
    private Respuesta respuesta1;
    private Respuesta respuesta2;
    private Respuesta respuesta3;
    private Respuesta respuesta4;

    public PreguntaSeleccionUnica(Respuesta respuesta1, Respuesta respuesta2, Respuesta respuesta3, Respuesta respuesta4, String pregunta, String tipo, int nivelDificultad) {
        super(pregunta, tipo, nivelDificultad);
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
    }

    public Respuesta getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(Respuesta respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public Respuesta getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(Respuesta respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public Respuesta getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(Respuesta respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public Respuesta getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(Respuesta respuesta4) {
        this.respuesta4 = respuesta4;
    }

    @Override
    public String obtenerRespuesta() {
        return null;
        
    }

    @Override
    public String toString() {
        return    "Respuesta 1 = " + respuesta1.getRespuesta() + "\n "
                + "Respuesta 2 = " + respuesta2.getRespuesta() + "\n "
                + "Respuesta 3 = " + respuesta3.getRespuesta() + "\n "
                + "Respuesta 4 = " + respuesta4.getRespuesta() + '}';
    }
    
    }
