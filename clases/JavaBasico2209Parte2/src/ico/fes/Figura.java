
package ico.fes;

/**
 *
 * @author AKAMJR
 */
public interface Figura {
    
    public static final float PI = 3.1416F;
    public static final int CUADRADO = 1;
    public static final int CIRCULO = 2;
    public static final int TRIANGULO = 3;
    public static final int RECTANGULO = 4;

    public abstract float calcularArea();
    
}