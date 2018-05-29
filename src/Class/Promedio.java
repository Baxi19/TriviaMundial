/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author ADMIN
 */
public class Promedio {
    private String categoria;
    private int correctas;
    private int incorrectas;

    public Promedio() {
        this.categoria = "";
        this.correctas = 0;
        this.incorrectas = 0;
    }

    public Promedio(String categoria) {
        this.categoria = categoria;
        this.correctas = 0;
        this.incorrectas = 0;
    }

    public int getCorrectas() {
        return correctas;
    }

    public void setCorrectas(int correctas) {
        this.correctas = correctas;
    }

    public int getIncorrectas() {
        return incorrectas;
    }

    public void setIncorrectas(int incorrectas) {
        this.incorrectas = incorrectas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }




}
