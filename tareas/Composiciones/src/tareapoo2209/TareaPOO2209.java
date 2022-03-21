/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareapoo2209;

import Class.Libro;
import Class.Pelicula;
import HerenciasLibro.Autor;
import HerenciasLibro.Autor;
import HerenciasLibro.Editorial;
import HerenciasPelicula.Actor;
import HerenciasPelicula.Director;
import HerenciasPelicula.Productora;

/**
 *
 * @author HP
 */
public class TareaPOO2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro lib1 = new Libro();
        lib1.setAutor(new Autor("Geroge Lucas", 44));
        lib1.setEditorial(new Editorial("Bruguera", 168));
        System.out.println(lib1);
        
        Pelicula peli1 = new Pelicula();
        peli1.setActor(new Actor("Liam Neeson", 69));
        peli1.setDirector(new Director("George Lucas",77 ));
        peli1.setProductora(new Productora("Lucasflim", "Star Wars: episodio 1 - La amenaza fantasma" ));
        System.out.println(peli1);
        
    }
    
}
