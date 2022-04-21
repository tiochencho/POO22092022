/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

import asus.com.computadora;
import ico.fes.conponentes.monitor;
import ico.fes.conponentes.mouse;
import ico.fes.conponentes.procesador;

/**
 *
 * @author hp
 */
public class Servidor extends computadora {
    private int numeroFuestesPoder;
    private int numeroTarjetasRed;
    private int tipoRaid;

    public Servidor() {
    }

    public Servidor(int numeroFuestesPoder, int numeroTarjetasRed, int tipoRaid) {
        this.numeroFuestesPoder = numeroFuestesPoder;
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public Servidor(int numeroFuestesPoder, int numeroTarjetasRed, int tipoRaid, String marca, String modelo, monitor pantalla, mouse raton, ico.fes.conponentes.teclado teclado, procesador cpu) {
        super(marca, modelo, pantalla, raton, teclado, cpu);
        this.numeroFuestesPoder = numeroFuestesPoder;
        this.numeroTarjetasRed = numeroTarjetasRed;
        this.tipoRaid = tipoRaid;
    }

    public int getTipoRaid() {
        return tipoRaid;
    }

    public void setTipoRaid(int tipoRaid) {
        this.tipoRaid = tipoRaid;
    }

    public int getNumeroFuestesPoder() {
        return numeroFuestesPoder;
    }

    public void setNumeroFuestesPoder(int numeroFuestesPoder) {
        this.numeroFuestesPoder = numeroFuestesPoder;
    }

    public int getNumeroTarjetasRed() {
        return numeroTarjetasRed;
    }

    public void setNumeroTarjetasRed(int numeroTarjetasRed) {
        this.numeroTarjetasRed = numeroTarjetasRed;
    }

    @Override
    public String toString() {
        return super.toString() + "Servidor{" + "numeroFuestesPoder=" + numeroFuestesPoder + ", numeroTarjetasRed=" + numeroTarjetasRed + ", tipoRaid=" + tipoRaid + '}';
    }
    
}
