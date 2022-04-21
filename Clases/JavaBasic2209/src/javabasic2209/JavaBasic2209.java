/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasic2209;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.TabSet;

/**
 *
 * @author hp
 */
public class JavaBasic2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        System.out.println("Edad = " + edad);
        Integer edad2 = new Integer(22);
        System.out.println( edad2 );
       double x = edad2.doubleValue();
        System.out.println( x );
        System.out.println(edad2.shortValue());
        System.out.println(",-,-,-,-,-,");
       //convertir Strings a entero 
       String cadena= "99";
       int altura = Integer.parseInt(cadena); //Método miembro  o metodo clase 
       Color c1 = Color.BLUE; //Atributo miembro o atributo 
       altura += 1;
        System.out.println("Altura " + altura);
       
        
        float y= Float.parseFloat(cadena);
        y=y + 0.5f;
        System.out.println("Altura = " + y );
        
        Arbol tree1 = new Arbol(2.4f, 15);
        System.out.println(tree1);
        
        System.out.println("Troncos de un arbol = " + Arbol.tronco );
        System.out.println("Troncos de un arbol = " + tree1.tronco );
        
        /*JOptionPane.showMessageDialog(null, "T quiero<3", "Holisss", JOptionPane.INFORMATION_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu corazón <3", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
        */
        int edad3 = 14;
        //validar si es mayor de edad 
        String resultado = "";
        if(edad3 < 18){
            resultado = "Menor de edad";
        }else{
            resultado = "Mayor de edad, ten un tequila para la garganta";
         
            // algoritmo con operador ternario
            // <cond>? <True> : <False>;   
        }
        System.out.println(resultado );
        
        int edad4 = 24;
        String res="";
        res = edad4 < 18? "Menor de edad" : "Mayor de edad, tequila";
        System.out.println(res);
        
        //cuando haya una lgoica se puede usar el ternario
        //es muy elegante y ahorra líneas de código
        //por ultimo vamos por la version minima
        int edad5 = 15;
        System.out.println(edad5 < 18? "Menor de edad 5":"¡Ya! el tequila");
        
        
        int val1 = 1; 
        int val2 = 2;
        // haremos una comparación or a nivel de bits es decir
        /*
        val1 = 000...0001;
        val2 = 000...0010;
        las dos lienas de arriba representan los niveles de bits 
        Pregunta 1 or 0? Cúanto es?
        es 1
        1 or 0 = 1 y 1 or 1= 1 
       0 and 1= 0 
        Entonces veremos como funciona el or a niveles de bits
        */
        System.out.println(val1 | val2 );
        /*
       Que esta pasando?, esto:
        val1 = 000...0001
        or
        val2 = 000...0010;
        ------------------
               000...0011 =>3
        */
        int val3 = 1; // 000...0001
        //int val4 << val3; un seg... ya se me olvido...
        // eso comprueba que no soy ninja
        //System.out.println(val3 <<=);
        int val4 = 0; 
        val4 = val3 << 2;
        // numero de desplazamiento a la izq.
        System.out.println(val4);// tiene que dar 2 
        
        System.out.println("----ARREGLOS----");
        int [] edades ; //primero se declara que sera un arreglo 
        /*
        en este punto aun no se reserva en la memoria
        el segundo paso es reservarlo de un tamaño especifico
        */
         edades = new int [5];
         System.out.println(edades);
         // ahora usamos como simepre lo han hecho
         edades [0] = 10;
         System.out.println("La primer edad es: " + edades [0]);
         
         //declarar e inicializar es un una sola línea 
         int [] estaturas = new int[5];
         // ahora .. al igual que en c y c++ se le puede a
         //asignar valores
         
         int[] pesos = {86,99,56,76,77}; //en kilos
         //este ultimo veremos el contenido
         System.out.println(pesos [0] );//86
         System.out.println(pesos [1] );//99
         System.out.println(pesos [2] );//56
         System.out.println(pesos [3] );//76
         System.out.println(pesos [4] );//77
         //se imprime lo mismo pero con menos lenas de codigo
         System.out.println("---- CON FOR ----");
         for (int i = 0; i < pesos.length; i++) {
             System.out.println(pesos [i]);
                    
             }
         //inverso
              System.out.println("---inverso---");
             for (int i=pesos.length-1;i>=0; i--){
                 System.out.println(pesos[i]);
             
         }
         /* 
    En desarrollos de la vida real, programar con arreglos es muy comun, porque por ejemplo
    va a recuperar datos desde una base de datos... por ejemplo
    una tabla de alumnos.
    Al ser varios alumnos en la BD... de lado de Java debes tener una 
    forma de almacenarlos. Ahí entran lso arreglos
    */    
         
        System.out.println("Arreglo de alumnos");
        Alumno[] lista = new Alumno[5]; // 5 alumonos
        lista[0] = new Alumno("9999", 2, 9.0f);
        lista[1] = new Alumno("7777", 2, 7.0f);
        lista[2] = new Alumno("5555", 2, 7.0f);
        lista[3] = new Alumno("8888", 2, 8.0f);
        lista[4] = new Alumno("6666", 2, 6.0f);
        
        for (int i = 0; i < lista.length; i++){
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio());
            
        }
       /*
           For each es un FOR espeacial, introducido
        en la versión 2 de java, esa versión fue la que 
        sufrio cambios grandes en Java
        El FOR EACH fue introducido para simplificar
        los FOR con arreglos
        fore + TAB 
          */
       
         System.out.println("---Con for each---");
         for (Alumno alumno : lista) {
             System.out.println(alumno.evaluarDesempenio());
             
        }
                 
               


       
}     
    
          
}
