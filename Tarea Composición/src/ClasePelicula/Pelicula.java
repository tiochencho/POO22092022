/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasePelicula;
import Pelicula.Actor;
import Pelicula.Director;
import Pelicula.Productora;

/**
 *
 * @author hp
 */
public class Pelicula {
   private String nombre;
   private int año;
   private Actor actor;
   private Director director;
   private Productora productora;

    public Pelicula() {
        actor = new Actor();
        director = new Director();
        productora = new Productora();
        
    }

    public Pelicula(String nombre, int año, Actor actor, Director director, Productora productora) {
        this.nombre = nombre;
        this.año = año;
        this.actor = actor;
        this.director = director;
        this.productora = productora;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", a\u00f1o=" + año + ", actor=" + actor + ", director=" + director + ", productora=" + productora + '}';
    }
   
   
           
   
   
}
