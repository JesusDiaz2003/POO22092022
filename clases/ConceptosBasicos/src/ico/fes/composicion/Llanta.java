/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion;

/**
 *
 * @author HP
 */
public class Llanta {
    private String marca;
    private int rodada;

    public Llanta() {
    }

    public Llanta(String marca, int rodada) {
        this.marca = marca;
        this.rodada = rodada;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Llanta{" + "marca=" + marca + ", rodada=" + rodada + '}';
    }
    
    
}
