/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;


public class Aritmetica {
    private int a;
    private int b;

    public Aritmetica() {
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Aritmetica{" + "a=" + a + ", b=" + b + '}';
    }
    
    public int sumar() {
        return this.a + this.b;
    }
    
    //throws << Para calificar excepcion numerica >>
    public int dividir() throws ArithmeticException{
       return this.a/this.b;
    }
    
}
