/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asus.com;

import ico.fes.conponentes.monitor;
import ico.fes.conponentes.mouse;
import ico.fes.conponentes.procesador;
import ico.fes.conponentes.teclado;

/**
 *
 * @author hp
 */
public class computadora {
    private String marca; 
    private String modelo;
    private monitor pantalla;
    private mouse raton;
    private teclado teclado;
    private procesador cpu;

    public computadora() {
        pantalla = new monitor();
        raton = new mouse();
        teclado = new teclado();
        cpu = new procesador();
    }

    public computadora(String marca, String modelo, monitor pantalla, mouse raton, teclado teclado, procesador cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.raton = raton;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    public procesador getCpu() {
        return cpu;
    }

    public void setCpu(procesador cpu) {
        this.cpu = cpu;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(monitor pantalla) {
        this.pantalla = pantalla;
    }

    public mouse getRaton() {
        return raton;
    }

    public void setRaton(mouse raton) {
        this.raton = raton;
    }

    public teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(teclado teclado) {
        this.teclado = teclado;
    }
         /*String estado = "Marca: " + this.marca + " \n";
  estado = estado +"Modelo: " + this.modelo + " \n ";
  estado = estado + "Raton: Marca " + this.raton.getMarca() + "Tipo: " + this.getRaton().getTipo()+" \n ";
   return estado;*/

    @Override
    public String toString() {
        return "computadora{" + "marca=" + marca + ", modelo=" + modelo + ", pantalla=" + pantalla + ", raton=" + raton + ", teclado=" + teclado + ", cpu=" + cpu + '}';
    }
   
   
    
    
    
   
  
}
