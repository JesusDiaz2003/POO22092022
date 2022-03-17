/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConceptosBasicos;

import ico.fes.Alumno;
import ico.fes.Automovil;
import ico.fes.Persona;
import ico.fes.silla;
import java.awt.Color;

/**
 *
 * @author HP
 */
public class ConceptosBasic {
    public static void main (String [] args ) {
        System.out.println("HolaMundo");
        silla s1 = new silla();
        System.out.println( s1 ); //Por defecto se invoca toString
        
        Automovil miBocho = new Automovil();
        miBocho.setMarca("Vw");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelos(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println("miBocho");
        
        Automovil miMustang = new Automovil("Ford", "Mustang", 2010, Color.YELLOW);
        System.out.println( miMustang );
        
    Automovil miAkura = new Automovil("Akura", "NSX", 2013, Color.GRAY);
        System.out.println( miAkura );
    
        Persona per1= new Persona();
        per1.setEdad(22);
        System.out.println(per1);
        Alumno al= new Alumno();
        al.setNombre("jesus");
        al.setNumeroCuenta("19304394");
        System.out.println(al);
    }
    
}
