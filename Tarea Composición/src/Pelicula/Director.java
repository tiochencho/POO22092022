/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author hp
 */
public class Director {
    private String Nombre;
    private int Edad;

    public Director() {
    }

    public Director(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "Nombre=" + Nombre + ", Edad=" + Edad + '}';
    }
    
    public void dirigir(){
        System.out.println("El director " + this.Nombre + "esta dirigiendo una nueva pelicula. ");
    }
}
