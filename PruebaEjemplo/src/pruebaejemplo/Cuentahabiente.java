/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Yael
 */
public class Cuentahabiente {
    private int idCliente;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
    //Método retirarDinero 
    public void retirDinero (float monto){
        System.out.println("El cliente " + this.nombre + " retiro " + monto + "pesos"  );
        this.balance = this.balance - monto;
    }
    //Método evaluarNivelCliente
    public String evaluarNivelCliente(){
        return this.balance <= 50000f? this.nombre + " es cliente regular"  : this.nombre + " es cliente premium";
      
        
        
    }      
    
}
