/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        System.out.println("Edad =" + edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        //convertir string a entero.
        String cadena= "99";
        int altura = Integer.parseInt(cadena);
        Color c1 = Color. BLUE;
        System.out.println("Altura ="+ altura);
        float y= Float.parseFloat(cadena);
        y=y + 0.5f;
        System.out.println("Altura =" + y);
        System.out.println("----------------");
       
        System.out.println("Troncos de un arbol = " + Arbol.tronco);
        Arbol.generarOxigeno();
        JOptionPane.showMessageDialog(null, "Hola Mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
    }
    
}
