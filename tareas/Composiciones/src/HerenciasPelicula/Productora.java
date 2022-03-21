/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciasPelicula;

/**
 *
 * @author HP
 */
public class Productora {
    String nombre;
    String pelicula;

    public Productora() {
    }

    public Productora(String nombre, String pelicula) {
        this.nombre = nombre;
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", pelicula=" + pelicula + '}';
    }
}
