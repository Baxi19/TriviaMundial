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
public abstract class  Pregunta {
    private String pregunta;
    private String tipo;
    private int nivelDificultad;

    public Pregunta(String pregunta, String tipo, int nivelDificultad) {
        this.pregunta = pregunta;
        this.tipo = tipo;
        this.nivelDificultad = nivelDificultad;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }
    
    public abstract String obtenerRespuesta();
    
}
