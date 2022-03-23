/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseLibro;
import Libro.Autor;
import Libro.Editorial;

/**
 *
 * @author hp
 */
public class Libro {
    private String titulo;
    private int añoPublicacion;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
      autor = new Autor ();
    editorial = new Editorial ();  
    }

    public Libro(String titulo, int añoPublicacion, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", a\u00f1oPublicacion=" + añoPublicacion + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    
        
}
