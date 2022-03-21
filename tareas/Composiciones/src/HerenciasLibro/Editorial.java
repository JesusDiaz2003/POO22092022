/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciasLibro;

/**
 *
 * @author HP
 */
public class Editorial {
    private String nombreLibro;
    private int numeroPaginas;

    public Editorial() {
    }

    public Editorial(String nombreLibro, int numeroPaginas) {
        this.nombreLibro = nombreLibro;
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreLibro=" + nombreLibro + ", numeroPaginas=" + numeroPaginas + '}';
    }
    
}
