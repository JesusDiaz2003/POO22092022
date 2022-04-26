/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.awt.Color;
import java.util.ArrayList;
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
            Lista[1] = new Alumno("44444", 2, 7.0f);
            Lista[2] = new Alumno("12345", 2, 7.0f);
            Lista[3] = new Alumno("15460", 2, 8.0f);
            Lista[4] = new Alumno("06451", 2, 6.0f);
       
            System.out.println("con for each");
            for (Alumno alumno :  Lista){
                System.out.println(alumno.evaluarDesempenio());
            }
            ArrayList<Alumno> grupo2209 = new ArrayList<Alumno>();
            grupo2209.add(new Alumno("319304394", 2, 9.0f));
            grupo2209.add(new Alumno("319304395", 2, 8.0f));
            grupo2209.add(new Alumno("319304396", 2, 7.0f));
            grupo2209.add(new Alumno("319304397", 2, 6.0f));
            grupo2209.add(new Alumno("319304398", 2, 5.0f));
            
            for(Alumno alumno : grupo2209){
                System.out.println( alumno);
            }
            System.out.println("Add con indice");
            grupo2209.add(2, new Alumno("319304",3,9.9f));
            for (Alumno alumno: grupo2209){
                System.out.println(alumno);
            }
            Alumno tmp = grupo2209.get(3);
            System.out.println("Alumno en index =1" + tmp);
            System.out.println("Eliminar el index");
            Alumno tmp2 =grupo2209.remove(3);
            System.out.println("El elemento sacado="+ tmp2);
            for (Alumno alumno: grupo2209){
            System.out.println(alumno);
        }
            System.out.println("remplazar el i-esimo elemento");
            Alumno tmp3 = grupo2209.set(0, new Alumno("4444", 4, 8.7f));
            System.out.println("el sacado es ="+ tmp3);
            for (Alumno alumno: grupo2209){
            System.out.println(alumno);
        }
            //Excepciones
            try {
                System.out.println("Excepciones");
            System.out.println(grupo2209.get(2));
            } catch (Exception e) {
                System.out.println("Error... revisa los indices");
            }
            System.out.println("Error del programa");
           
    }
        
          
    }
    
}
