/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.libro;

/**
 *
 * @author Yael Rubio
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tarea libro");
        Libro lib1 = new Libro ();
        lib1.setEdicion("Cuarta");
        System.out.println("Edicion: " +  lib1.getEdicion());
        lib1.setNombre("Java");
        System.out.println("Nombre: " + lib1.getNombre());
        lib1.setPaginas(840);
        System.out.println("Paguina: " + lib1.getPaginas());
        lib1.setAutor("Javier Ceballos");
        System.out.println("Autor: " + lib1.getAutor());
        lib1.setEditorial("Alfaomega");
        System.out.println("Editorial: " + lib1.getEditorial());
        lib1.guardarLibro();
        lib1.sacarLibro();
        
    }
    
}
