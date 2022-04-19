/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author HP
 */
public class Arbol {
    private float altura;
    private int edad;
    public static final int tronco = 1;

    public Arbol() {
    }

    public Arbol(float altura, int edad) {
        this.altura = altura;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Arbol{" + "altura=" + altura + ", edad=" + edad + '}';
    }
    public void crecer(float crecimiento){
        System.out.println("altura actual" + this.altura);
        this.altura+= crecimiento;
        System.out.println("altura posterior" + this.altura);
      
    }
    public static void generarOxigeno(){
        System.out.println("Generando Oxigeno....");
        
    }

    }
