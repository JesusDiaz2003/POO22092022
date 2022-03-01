/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author HP
 */
public class Automovil {
    private String marca; //los atributos van en notacion lower camel case
    private String subMarca; //lower camel case todas en minusculas y aprtir de la segunda palabra la primerletra en mayuscula
    
    private int modelos;
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String subMarca, int modelos, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelos = modelos;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public int getModelos() {
        return modelos;
    }

    public void setModelos(int modelos) {
        this.modelos = modelos;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", subMarca=" + subMarca + ", modelos=" + modelos + ", color=" + color + '}';
    }

    
    
    
}
