/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asus.com;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author HP
 */
public class Computadora {
    private String marca;
    private String modelo;
    private Monitor pantalla;
    private Mouse raton;
    private Teclado teclado;
    private Procesador cpu;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, Monitor pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
        this.raton = raton;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    
    public String getMarca() {
        pantalla = new Monitor();
        raton = new Mouse();
        teclado = new Teclado();
        cpu = new Procesador();
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Procesador getCpu() {
        return cpu;
    }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
       /* String estado = "Marca: " + this.marca + "\n";
        estado = estado + "Modelo: " + this.modelo + "\n";
        estado = estado + "Raton: Marca"+ this.raton.getMarca()+ ", Tipo:"+this.getRaton().getTipo + "\n";
        return estado*/
        

       return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", pantalla=" + pantalla + ", raton=" + raton + ", teclado=" + teclado + ", cpu=" + cpu + '}';
    }
    
}
