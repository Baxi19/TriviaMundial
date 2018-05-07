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
public class PreguntaSeleccionMultiple extends Pregunta{
    private Respuesta respuesta1;
    private Respuesta respuesta2;
    private Respuesta respuesta3;
    private Respuesta respuesta4;
    private Respuesta respuesta5;
    private Respuesta respuesta6;
    private Respuesta respuesta7;
    private Respuesta respuesta8;

    public PreguntaSeleccionMultiple(Respuesta respuesta1, Respuesta respuesta2, Respuesta respuesta3, Respuesta respuesta4, Respuesta respuesta5, Respuesta respuesta6, Respuesta respuesta7, Respuesta respuesta8, String pregunta, String tipo, int nivelDificultad) {
        super(pregunta, tipo, nivelDificultad);
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.respuesta5 = respuesta5;
        this.respuesta6 = respuesta6;
        this.respuesta7 = respuesta7;
        this.respuesta8 = respuesta8;
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

    public Respuesta getRespuesta5() {
        return respuesta5;
    }

    public void setRespuesta5(Respuesta respuesta5) {
        this.respuesta5 = respuesta5;
    }

    public Respuesta getRespuesta6() {
        return respuesta6;
    }

    public void setRespuesta6(Respuesta respuesta6) {
        this.respuesta6 = respuesta6;
    }

    public Respuesta getRespuesta7() {
        return respuesta7;
    }

    public void setRespuesta7(Respuesta respuesta7) {
        this.respuesta7 = respuesta7;
    }

    public Respuesta getRespuesta8() {
        return respuesta8;
    }

    public void setRespuesta8(Respuesta respuesta8) {
        this.respuesta8 = respuesta8;
    }

    @Override
    public String obtenerRespuesta() {
        return null;
        
    }

    @Override
    public String toString() {
        return "PreguntaSeleccionMultiple{" + "respuesta1=" + respuesta1 + ", respuesta2=" + respuesta2 + ", respuesta3=" + respuesta3 + ", respuesta4=" + respuesta4 + ", respuesta5=" + respuesta5 + ", respuesta6=" + respuesta6 + ", respuesta7=" + respuesta7 + ", respuesta8=" + respuesta8 + '}';
    }

    
}
