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
    private String categoria;
    private int nivelDificultad;

    public Pregunta(String pregunta, String tipo, int nivelDificultad) {
        this.pregunta = pregunta;
        this.categoria = tipo;
        this.nivelDificultad = nivelDificultad;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }
    
    public abstract String obtenerRespuesta();
    
}
