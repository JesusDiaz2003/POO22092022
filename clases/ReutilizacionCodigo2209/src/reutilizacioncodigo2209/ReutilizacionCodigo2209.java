/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Perro;
import ico.fes.herencia.polimorfismo.Animal;

import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = new String("José José");
        System.out.println ( nombre );
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());
        
        /*JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);*/
        Computadora miCompu = new Computadora();
         miCompu.setMarca("Asus");
         miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println( miCompu );
        miCompu.getCpu().setMarca("AMD");
        System.out.println( miCompu );
        //Ejercicio establecer un Mouse de marca Logitech tipo optico\\
        miCompu.setRaton(new Mouse("Logitech", "optico"));
        System.out.println( miCompu );
        
        Computadora compu2;
        compu2 = new Computadora("Apple", "Macbook Pro",
                new Monitor("Toshiba", 14.3f),
                new Mouse("Actek", "Otico"), 
                new Teclado("Apple", 101),
                new Procesador("M1", 3.4f));
        System.out.println( compu2 );
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
        System.out.println(compu2);
                
        System.out.println("---------------");
        Alumno alu1= new Alumno();
        alu1.setNombre("Jose");
        System.out.println(alu1);
        Alumno alu2= new Alumno("319304394", "Ico", "Jose Perez", 19);
        System.out.println(alu2);
        alu1.setNumeroCuenta("319304499");
        alu1.setEdad(18);
        System.out.println(alu1);
        System.out.println("------composicion y herenciaen la misma clase------");
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRaton(new Mouse("HP", "Optico"));
        System.out.println(server);
        server.getRaton().setMarca("Logitech");
        System.out.println(server);
        
        System.out.println("Ejemplo poliformismo");
        Perro dog = new Perro("Bull dog", "5 estrellas", 4);
        dog.emitirSonido();
        Animal animal = (Animal)dog;
        System.out.println(animal.getClass());
        Animal a = new Perro("ds", "dad");
        System.out.println(a);
    }
    
}
