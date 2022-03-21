/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import HerenciasPelicula.Actor;
import HerenciasPelicula.Director;
import HerenciasPelicula.Productora;

/**
 *
 * @author HP
 */
public class Pelicula {
    private Director director;
    private Productora productora;
    private Actor actor;

    public Pelicula() {
    }

    public Pelicula(Director director, Productora productora, Actor actor) {
        this.director = director;
        this.productora = productora;
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "director=" + director + ", productora=" + productora + ", actor=" + actor + '}';
    }
}
