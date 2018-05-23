/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


/**
 *
 * @author toshib  
 */
public class CreaPreguntas implements Crea {
    
    PreguntaSeleccionMultiple sM = Metodos.getInstance().getPreguntaSM();
    PreguntaSeleccionUnica sU = Metodos.getInstance().getPreguntaSU();
    PreguntaVerdaderoFalso fV = Metodos.getInstance().getPreguntaVF();
    
    public void update() {
        this.sM = Metodos.getInstance().getPreguntaSM();
        this.sU = Metodos.getInstance().getPreguntaSU();
        this.fV = Metodos.getInstance().getPreguntaVF();

    }
    public PreguntaSeleccionMultiple creaPreguntaSeleccionMultiple() {
        return new PreguntaSeleccionMultiple(sM.getRespuesta1(), sM.getRespuesta2(), sM.getRespuesta3(), sM.getRespuesta4(), sM.getPregunta(), sM.getTipo(), sM.getNivelDificultad());
    }

    @Override
    public PreguntaSeleccionUnica creaPreguntaSeleccionUnica() {
        return new PreguntaSeleccionUnica(sU.getRespuesta1(), sU.getRespuesta2(), sU.getRespuesta3(), sU.getRespuesta4(), sU.getPregunta(), sU.getTipo(), sU.getNivelDificultad());
    }

    @Override
    public PreguntaVerdaderoFalso creaPreguntaFalsoVerdadero() {
        return new PreguntaVerdaderoFalso(fV.getRespuestaVerdadera(), fV.getRespuestaFalsa(), fV.getPregunta(), fV.getTipo(), fV.getNivelDificultad());
    }
    
}
