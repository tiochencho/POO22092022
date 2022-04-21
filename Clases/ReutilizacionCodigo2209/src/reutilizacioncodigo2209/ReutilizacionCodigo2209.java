/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.computadora;
import ico.fer.herencia.polimorfosis.Animal;
import ico.fer.herencia.polimorfosis.Perro;
import ico.fes.conponentes.monitor;
import ico.fes.conponentes.mouse;
import ico.fes.conponentes.procesador;
import ico.fes.conponentes.teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import javax.management.monitor.Monitor;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String("Yael Yael");
        System.out.println( nombre );
        System.out.println( nombre.charAt(3));
        System.out.println( nombre.toUpperCase());
        
        
        /*JFrame ventana = new JFrame("M pimer ventana java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        */
        computadora miCompu= new computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new procesador("Intel", 2.6f));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("MD");
        System.out.println(miCompu);
        //ejercicio establecer un mouse de marca logitech del tipo optico
        miCompu.setRaton(new mouse("Logitech" , "optico"));
        System.out.println(miCompu);
        
      computadora compu2 = new computadora("Apple", "MackBook",
      new monitor("Toshiba", 14.3f),
      new mouse("Ateck", "Optico"),
      new teclado("Apple", 101),
      new procesador("M1", 3.4f));
     
      System.out.println(compu2);
      //mouse apple y tipo touch
      compu2.setRaton(new mouse ("Apple", "Touch"));
      System.out.println(compu2);
        
        System.out.println("--------------------");
        Alumno alu1 = new Alumno();
        alu1.setNombre("Jose");
        System.out.println( alu1 );
        
        Alumno alu2 = new Alumno("3123435", "ico", "Jose Perez", 19);
        System.out.println( alu2 );
        
       
        alu1.setNumeroCuenta("31927372");
        System.out.println( alu1 );
        
        
        System.out.println("----Composición y herencia------");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetasRed(2);
        System.out.println( server );
        server.setMarca("HP");
        System.out.println(server);
         
       server.setRaton(new mouse("LG" , "optico"));
        System.out.println( server );
        server.getRaton().setMarca("Logitech");
         System.out.println( server );
         
        
        System.out.println("----Ejemplo polimorfismo----");
        Perro dog = new Perro("Bull dog", "5 estrellas", 4);
       // Animal a = new Perro ("ds", "dad");
       //((Animal)a).emitirSonido();
       Animal animal1 =new Animal (4);
       dog.emitirSonido();
       animal1.emitirSonido();
       
       
        
        
        
    }
    
}
