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
public class Categoria {
    private String tipo;
    private int codigo;

    public Categoria(String tipo, int codigo) {
        this.tipo = tipo;
        this.codigo = codigo;
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
