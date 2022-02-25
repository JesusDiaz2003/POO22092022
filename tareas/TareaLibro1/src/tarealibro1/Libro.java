/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealibro1;

/**
 *
 * @author HP
 */
public class Libro {
     private String color;
     private int tamano;
     private int paginas;
     private int temas;
     private int tipo;

    public Libro() {
    }

    public Libro(String color, int tamano, int paginas, int temas, int tipo) {
        this.color = color;
        this.tamano = tamano;
        this.paginas = paginas;
        this.temas = temas;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getTemas() {
        return temas;
    }

    public void setTemas(int temas) {
        this.temas = temas;
    }
    public int temas (int temas) {
     return this.temas - temas;
        }
   public int tamano (int tamano) {
       return this.tamano- tamano;
    }
   public int paginas (int paginasrestantes){
       return this.paginas - paginasrestantes;
   }

    @Override
    public String toString() {
        return "Libro{" + "color=" + color + '}';
    }
   

}
