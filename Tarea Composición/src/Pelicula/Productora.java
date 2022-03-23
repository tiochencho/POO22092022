/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author hp
 */
public class Productora {
    private String nombreProductora;
    private String genero;

    public Productora() {
    }

    public Productora(String nombreProductora, String genero) {
        this.nombreProductora = nombreProductora;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombreProductora() {
        return nombreProductora;
    }

    public void setNombreProductora(String nombreProductora) {
        this.nombreProductora = nombreProductora;
    }

    @Override
    public String toString() {
        return "Productura{" + "nombreProductora=" + nombreProductora + ", genero=" + genero + '}';
    }
    
    public void produce(){
        System.out.println("La productota " + this.nombreProductora + "esta produciendo una nueva pelicula.");
    
}
    
}
