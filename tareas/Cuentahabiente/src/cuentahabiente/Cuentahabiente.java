/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author HP
 */
public class Cuentahabiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Arreglos de clientes");
        Clientes[] Miembro = new Clientes[5]; // 5 clientes
        Miembro[0] = new Clientes(649489651, "Martha Gonzalez", 35000.00f);
        Miembro[1] = new Clientes(319304394, "Alfonso Duran", 8000.00f);
        Miembro[2] = new Clientes(154601463, "Roberto madrigal", 63000.00f);
        Miembro[3] = new Clientes(556521107, "Cristiano Ronaldo",800000.00f);
        Miembro[4] = new Clientes(735658701, "Christian Garcia", 17000.00f);
        System.out.println(Miembro[0]);
        Miembro[0].retirarDinero(3300.50f);
        System.out.println(Miembro[1]);
        Miembro[0].retirarDinero(4800.00f);
        System.out.println(Miembro[2]);
        Miembro[0].retirarDinero(6500.00f);
        System.out.println(Miembro[3]);
        Miembro[0].retirarDinero(6000.00f);
        System.out.println(Miembro[4]);
        Miembro[0].retirarDinero(1500.00f);
        System.out.println("For each");
        for (Clientes clientes : Miembro){
            System.out.println(clientes.evaluarNivelCliente());
            
        }
    }
    
}
