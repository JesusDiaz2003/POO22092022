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
    @SuppressWarnings("empty-statement")
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
       /* JOptionPane.showMessageDialog(null, "Hola Mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
         String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
        */
        //Codigo sin operador ternario
        int edad3 = 20;
        //validar si es mayor de edad
        String resultado = "";
        if(edad3<18){
            resultado ="Menor de edad";
        }
       
        else {
            resultado = "Mayor de edad ten tequila para la garganta";
            
        }
        System.out.println(resultado);
        
        int edad4 = 24;
        String res ="";
        res = edad4 <18? "Menor de edad" : "Mayor de edad, tequila";
        System.out.println(res);
        //version minima
        int edad5 =19;
        System.out.println( edad5 < 18? "Menor de edad 5":"Ya! el tequila ");
        //siguiente
        int val1 = 1;
        int val2 = 2;
        /*comparacion a nivel de bits
        val1 =0000...001;
        val2 =0000...0010;
        Pregunta 1 or 0??? cuanto es?
        */
        System.out.println(val1 & val2 );
        
        int val3 = 1; //0000...0001
        //int val4 <<= val3;
        //System.out.println( val3 <<=);
        int val4 = 0;
        val4 = val3 <<2;
        System.out.println(val4);
        System.out.println("-----ARREGLOS----");
        int [] edades ;
        //aun no se reserva memoria
        //el siguiente paso es reservarlo, de un tamaño ene specifico
        edades = new int [15];
        System.out.println(edades);
        //Ahora usamos como siempre
        edades[0] = 10;
        System.out.println("La primer edad es" + edades[0]);
        //declarar e inicializar en una sola linea
        int [] estaturas = new int [5];
        //ahora podemos asignar valores
        int [] pesos = {86,99, 56, 76, 77}; // en kilos
        System.out.println(pesos[0]); // 86
        System.out.println(pesos[1]); //99
        System.out.println(pesos[2]);//56
        System.out.println(pesos[3]); //76
        System.out.println(pesos[4]); //77
        System.out.println("-----CON FOR-----");
        for (int i = 0; i < pesos.length; i++){
        System.out.println(pesos[i]); 
        //mucho texto
        
            System.out.println("Arreglo de alumnos");
            Alumno[] Lista = new Alumno[5]; // 5 alumnos
            Lista[0] = new Alumno("99999", 2, 9.0f);
            Lista[1] = new Alumno("99999", 2, 7.0f);
            Lista[2] = new Alumno("99999", 2, 7.0f);
            Lista[3] = new Alumno("99999", 2, 8.0f);
            Lista[4] = new Alumno("99999", 2, 6.0f);
            
          for (int i = 0; i < Lista.length; i++) {
            Alumno alumno = Lista[i];
            System.out.println( alumno.evaluarDesempenio() );
        }
            System.out.println("con for each");
            for (Alumno alumno :  Lista){
                System.out.println(alumno.evaluarDesempenio());
            }
    }
        
          
    }
    
}
