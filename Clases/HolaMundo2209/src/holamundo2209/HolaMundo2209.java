/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo2209;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @YAEL RUBIO hp
 */
public class HolaMundo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hola mundo java !!!");
        Persona per1 = new Persona();
        per1.setNombre( "Yael RJ" );
        
        System.out.println("Nombre:" + per1.getNombre() );
        per1.comer("hamburgesa hawaiana");  
        
        Persona per2 = new Persona();
        per1.setNombre("Jordan");
        System.out.println("Nmobre per 2:" + per2.getnombre() );
        per2.comer("Pizza hawiana");
        
        Automovil miBocho = new Automovil();
        System.out.println("El automovil es un: Bocho");
        miBocho.setMarca("VW");
        System.out.println("Marca: " + miBocho.getMarca());
        miBocho.setMarca("Sedan");
        System.out.println("SubMarca " + miBocho.getSubMarca());
        miBocho.setSubMarca(1970);
        System.out.println("Model" + miBocho.getModelo());
        miBocho.setColor(Color.BLUE);
        System.out.println("Color: " + miBocho.getColor() );
        
        
        Autmovil miMustang = new Autmovil();
        System.out.println("El automovil es un: Mustang");
        miMustang.setMarca("Ford");
        System.out.println("Marca: " + miMustang.getMarca() );
        miMustang.setSubMarca("Mustan");
        System.out.println("SubMarca:" + miMustang.getSubMarca());
        miMustang.setModelo(2013);
        System.out.println("Modelo: " + miMustang.getModelo());
        miMustang.setColor(Color.YELLOW);
        System.out.println("Colo:" + miMustang.getColor());
        
        Automovil miAkura = new Automovil();
        System.out.println("El automovil es un: Akura");
        miAkura.setMarca("Akura");
        System.out.println("Marca: " + miAkura.getSubMarca());
        miAkura.setSubMarca("NSX");
        System.out.println("SubMarca: " + miAkura.getSubMarca());
        miAkura.setModelo(2010);
        System.out.println("Modelo: " + miAkura.getModelo());
        miAkura.setColor(Color.gray);
        System.out.println("Color: " + miAkura.getColor()); 
        
    }
   
}
