/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
//

import java.util.ArrayList;

/**
 *
 * @author Randald Villegas
 */
public class Categoria {
    private String tipo;
    private int codigo;
    private ArrayList<Pregunta> categoria;

    public Categoria(String tipo, int codigo) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.categoria = new ArrayList<Pregunta>();
    }

    public ArrayList<Pregunta> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<Pregunta> categoria) {
        this.categoria = categoria;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Categoria{" + "tipo=" + tipo + ", codigo=" + codigo + '}';
    }
    
    
}
