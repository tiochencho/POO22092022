/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.conponentes;

/**
 *
 * @author hp
 */
public class mouse {
    private String marca;
    private String tipo;

    public mouse() {
    }

    public mouse(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "mouse{" + "marca=" + marca + ", tipo=" + tipo + '}';
    }

    
    
    

    

    
    

    
}
