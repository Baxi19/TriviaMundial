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
public class PreguntaVerdaderoFalso extends Pregunta{
    private Respuesta respuestaVerdadera;
    private Respuesta respuestaFalsa;

    public PreguntaVerdaderoFalso(Respuesta respuestaVerdadera, Respuesta respuestaFalsa, String pregunta, String tipo, int nivelDificultad) {
        super(pregunta, tipo, nivelDificultad);
        this.respuestaVerdadera = respuestaVerdadera;
        this.respuestaFalsa = respuestaFalsa;
    }

    public Respuesta getRespuestaVerdadera() {
        return respuestaVerdadera;
    }

    public void setRespuestaVerdadera(Respuesta respuestaVerdadera) {
        this.respuestaVerdadera = respuestaVerdadera;
    }

    public Respuesta getRespuestaFalsa() {
        return respuestaFalsa;
    }

    public void setRespuestaFalsa(Respuesta respuestaFalsa) {
        this.respuestaFalsa = respuestaFalsa;
    }

    @Override
    public String obtenerRespuesta() {
        return null;
        
    }

    @Override
    public String toString() {
        return    "Respuesta 1 = " + respuestaVerdadera.getRespuesta() + "\n "
                + "Respuesta 2 = " + respuestaFalsa.getRespuesta() + '}';
    }
    
    


}
