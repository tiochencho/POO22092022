/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.libro;

/**
 *
 * @author hp
 */
public class Libro {
private String edicion; //Atributos 
private String nombre;
private int    paginas;
private String autor;
private String editorial;

    public Libro() { //Metodo constructor
    }

    //Metodo constructor sobrecargado
    public Libro(String edicion, String nombre, int paginas, String autor, String editorial) {
        this.edicion = edicion;
        this.nombre = nombre;
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    // Metodo de uso general
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void guardarLibro (){
        System.out.println("El libro " +  this.nombre + " está guardado");
    }
    
    public void sacarLibro (){
        System.out.println("Sacando el libro " + this.nombre);
    }
    


}
