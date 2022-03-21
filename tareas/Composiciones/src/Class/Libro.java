/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import HerenciasLibro.Autor;
import HerenciasLibro.Editorial;



/**
 *
 * @author HP
 */
public class Libro {
     private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(Autor autor, Editorial editorial) {
        this.autor = autor;
        this.editorial = editorial;
    }
     public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", editorial=" + editorial + '}';
    }

   
}
