/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.Aritmetica;
import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.herencia.EstudianteDeportistaArtista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class JavaBasico2209parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Excepciones 
        
        ArrayList<String> nombres=new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        
        for(String nombre : nombres){ 
            System.out.println( nombre );
        }
        
        System.out.println("------------");
        Scanner teclado = new Scanner(System.in);
        //System.out.println(nombres.get(0));// solo hay un intervalo de 0 a 4 
       //int seleccion = teclado.nextInt();
        int seleccion=0;
        
       String elNombre="";
        try {
            elNombre = nombres.get(seleccion);
        } catch(InputMismatchException ie){
            System.out.println("Debes teclear valores numericos");
        }catch(IndexOutOfBoundsException ioe){
            System.out.println("Error, debe ser entere 0 y 4 ");
            elNombre = nombres.get(0);
        }
        catch (Exception e) {
            System.out.println( e );
            System.out.println("Generica.");
            elNombre = nombres.get(1);
        } finally {
            System.out.println(elNombre);
          elNombre=null;
          //Limpieza
        }  
          
       //System.out.println(nombres.get(seleccion));
        System.out.println("Continua el programa...");
        System.out.println("Fin del programa");
        
        Aritmetica cal = new Aritmetica (2, 4);
        System.out.println(cal.getA() + "+" + cal.getB()+ "=" +cal.sumar());
       System.out.println(cal.getA() + "/" + cal.getB()+ "=" +cal.dividir());
         
        try {
          System.out.println(cal.getA() + "/" + cal.getB()+ "=" + cal.sumar());
        } catch (Exception e) {
            System.out.println("Error de aritmetica");
        }
        
        System.out.println("Fin del programa");       
//
       Cuadrado cuad = new Cuadrado (5.0f);
       Circulo circ = new Circulo (4.5f);
       
        System.out.println("Area del cuadrado es: " + cuad.calcularArea());
        System.out.println("Area del circulo es: " + circ.calcularArea());
        
        System.out.println("---------------------------");
        
        EstudianteDeportistaArtista edu = new EstudianteDeportistaArtista();
        edu.setNombre("Diana");
        edu.setCarrera("ICO");
        edu.setDiciplinaDeportiva("Futbol");
        edu.setGeneroArtistico("Fotografia y dibujo");
        edu.comer();
        edu.ensayar();
        edu.entrena();
        System.out.println( edu );
        
        




    }
                
            
            
    
}
