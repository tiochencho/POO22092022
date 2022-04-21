/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.conponentes;

/**
 *
 * @author hp
 */
public class teclado {
    private String marca;
    private int numeroTeclas;

    public teclado() {
    }

    public teclado(String marca, int numeroTeclas) {
        this.marca = marca;
        this.numeroTeclas = numeroTeclas;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "teclado{" + "marca=" + marca + ", numeroTeclas=" + numeroTeclas + '}';
    }

    
    
}
