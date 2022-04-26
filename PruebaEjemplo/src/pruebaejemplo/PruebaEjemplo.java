/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Yael
 */
public class PruebaEjemplo {

    
    public static void main(String[] args) {
       //Listado de clientes 
        Cuentahabiente[] listado = new Cuentahabiente [5];
        listado [0] = new Cuentahabiente(12345678, "Yael", 600000.0f);
        listado [1] = new Cuentahabiente(2987654, "Gerardo", 80020.0f);
        listado [2] = new Cuentahabiente(13246578, "Yahir", 90000.0f);
        listado [3] = new Cuentahabiente(47578493, "Artur", 8800.0f);
        listado [4] = new Cuentahabiente(89684637, "José", 8700.0f);
        
        //Nivel de los clientes 
    for (Cuentahabiente cuentahabiente : listado) {
            System.out.println("El cliente " + cuentahabiente.evaluarNivelCliente());
    }
    //Prueba de retiro de dinero de un cliente 
    
        System.out.println("///// Retirar dinero////");
        
        listado[0].retirDinero(5000.0f);
        System.out.println("El saldo actual es de : " + listado[0].getBalance() + " pesos");
        
        
    
    
    
    }
    
    

}
