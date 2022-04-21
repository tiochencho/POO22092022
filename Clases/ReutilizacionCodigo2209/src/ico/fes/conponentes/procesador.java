/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.conponentes;

/**
 *
 * @author hp
 */
public class procesador {
    private String marca;
    private float frecunaciaEnGhz;

    public procesador() {
    }

    public procesador(String marca, float frecunaciaEnGhz) {
        this.marca = marca;
        this.frecunaciaEnGhz = frecunaciaEnGhz;
    }

    public float getFrecunaciaEnGhz() {
        return frecunaciaEnGhz;
    }

    public void setFrecunaciaEnGhz(float frecunaciaEnGhz) {
        this.frecunaciaEnGhz = frecunaciaEnGhz;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "procesador{" + "marca=" + marca + ", frecunaciaEnGhz=" + frecunaciaEnGhz + '}';
    }

    
    }
 
 
    
    
    

