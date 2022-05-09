/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author hp
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista,Artista {
    private String carrera;
    private String numeroCuenta;
    private String diciplinaDeportiva;
    private String generoArtistico;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numeroCuenta, String diciplinaDeportiva, String generoArtistico) {
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.diciplinaDeportiva = diciplinaDeportiva;
        this.generoArtistico = generoArtistico;
    }

    public String getGeneroArtistico() {
        return generoArtistico;
    }

    public void setGeneroArtistico(String generoArtistico) {
        this.generoArtistico = generoArtistico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDiciplinaDeportiva() {
        return diciplinaDeportiva;
    }

    public void setDiciplinaDeportiva(String diciplinaDeportiva) {
        this.diciplinaDeportiva = diciplinaDeportiva;
    }

    @Override
    public String toString() {
        return "EstudianteDeportistaArtista{" + "carrera=" + carrera + ", numeroCuenta=" + numeroCuenta + ", diciplinaDeportiva=" + diciplinaDeportiva + ", generoArtistico=" + generoArtistico + '}';
    }

    @Override
    public void entrena() {
        System.out.println( this.nombre + "  esta entrenando " + this.diciplinaDeportiva );
    }

    @Override
    public void jugar() {
      System.out.println( this.nombre + "  esta jugando " + this.diciplinaDeportiva );
    }

    @Override
    public void ensayar() {
         System.out.println( this.nombre + "  esta ensayando " + this.generoArtistico );
    }

    @Override
    public void presentar() {
     System.out.println( this.nombre + "  esta presentando su obra " + this.generoArtistico);    
    }
    
}
