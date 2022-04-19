/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.gauss.jordan;

/**
 *
 * @author HP
 */
public class V3 {
     public static void main(String[] args) {

        int filasA = 3, columnasA = 3;

        //double matrizA[][] = new int[filasA][columnasA];
        /// <-Funciona  4*5 Compatible Indeterminado
        //double[][] matrizA = {{1, 1, 1, 3, 5}, {1, 2, -2, 1, -4}, {1, -2, 3, 2, 4}, {1, 2, -3, 0, -8}};//<- Sí funciona  4*5 Compatible Indeterminado
        //double[][] matrizA = {{3,-2,-1,-1,-6},{-2,-1,2,1,17},{5,-2,-2,-1,-14},{1,1,2,5,12}};//<-Sí Funciona
        //double[][] matrizA = {{3,-4,-28,1,-1},{-3,-2,4,-13,-5},{-4,4,32,-4,0},{1,-2,-12,-1,-1}}; //<-Funciona
        //double[][] matrizA = {{-3,3,-18,-1,-18},{2,3,-8,5,10},{-3,-3,6,-1,0},{-4,1,-12,-3,-20}};//<-Funciona
        //double[][] matrizA = {{5,-3,1,-1,13},{-3,-4,-3,20,10},{1,-4,2,24,-3}};//<-Funciona
        //double[][] matrizA = {{5,20,15,-3,-5},{1,4,3,2,-14},{3,12,9,3,-27}};//<-Fumciona
        //double[][] matrizA = {{-3, -15, -6, -4, 3, 3, -8}, {1, 5, 2, 3, -6, 2, 21}, {-5, -25, -10, -2, -9, 4, -9}, {5, 25, 10, -4, 27, -2, 7}};//<-Funciona
        //double[][] matrizA = {{-1,-1,4,0},{5,-1,-1,2},{-4,-2,-3,-4}}; //<-Funciona
        //double[][] matrizA = {{-4, -6, 18}, {8, -5, 83}}; //<-Funciona
        //double[][] matrizA = {{4,-1,-25}, {-8,8,80}}; //<-Funciona
        double[][] matrizA = {{-1, 2, -2, -2, -2, -14}, {-2, 2, 1, 2, -2, -7}, {1, -1, -1, -2, 2, 4}, {-2, -1, 2, -1, 2, 8}, {1, -1, 2, 2, 1, 9}};// <-Funciona
        //double[][] matrizA = {{5, -10, -20}, {-2, 4, 8}};// <-Funciona
        //double[][] matrizA = {{-5, -1, -1}, {-2, -4, -1}, {-14, -10, -4}, {-6, 6, 0}};//<-Funciona
        //double[][] matrizA = {{2,1,3,-1,-4}, {-1,2,-1,3,13}, {4,0,5,2,0}};//<-Funciona
        //double[][] matrizA = {{5, 1, 2, 5, -3, 0}, {0, -2, 5, -1, 5, 0}, {1, 1, -2, 0, 4, 0}};//<-Funciona
        //double[][] matrizA = {{1, 2, 3}, {3, 6, 5}};// <-Funciona
        //double[][] matrizA = {{-2, 1, 3}, {-4, 2, -2}};//<-Funciona
        //double[][] matrizA = {{-2,1,3}, {-4,2,-2}}; // <-Funciona
        //double[][] matrizA = {{-3, 6, -6, -1, 7}, {-2, 4, -4, -1, 3}, {5, -10, 10, -4, -40}};// <-Funciona
        //double[][] matrizA = {{-3, 6, 15, 3, 0}, {-3, 6, 15, -5, 32}, {-3, 6, 15, -4, 28}};// <-Funciona
        //double[][] matrizA = {{4, 3, -5, -11}, {-1, 1, 1, 9}, {-6, 6, 2, 42}};// <-Funciona
        //double[][] matrizA = {{-2, -1, -3}, {-3, 3, 1}, {10, -4, 4}, {5, -20, -20}};//<-Funciona
        
        
        double matrizEsc[][] = new double[matrizA.length][matrizA[matrizA.length - 1].length];
        gaussJordan(matrizA);
    }

    //Este método imprime en consola la matriz dada
    public static void imprimirMatriz(double[][] matriz) {

        System.out.print("\n            ");
        for (int fila = 0; fila < (matriz.length); fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(Math.round(matriz[fila][columna] * 10000.0) / 10000.0 + "   ");
            }
            System.out.printf("\n %11s", "");
        }
    }

    //Este método, dadas dos filas de una matriz, las intercambia
    public static void pivotear(double[][] matriz, int filaOrigen, int filaInt) {
        double auxiliar;
        for (int i = 0; i < matriz[filaOrigen].length; i++) {
            auxiliar = matriz[filaOrigen][i];
            matriz[filaOrigen][i] = matriz[filaInt][i];
            matriz[filaInt][i] = auxiliar;
        }
    }

    //Este método tranforma el elemento de la coordenada dada en un 1, pivoteando o multiplicando por fracción.
    public static boolean encontrarUno(double[][] matriz, int fila, int columna) {

        boolean bandera = false;

        double elemento;
        //Encontrar un 1 y pivotear con el renglón que lo contenga
        if (matriz[fila][columna] != 1) {
            for (int i = fila; i < matriz.length; i++) {
                if (matriz[i][columna] == 1) {
                    pivotear(matriz, fila, i);
                    System.out.println("\nR" + (fila + 1) + " <-> R" + (i + 1));
                    imprimirMatriz(matriz);
                    break;
                }
            }
        }

        //Si no se encuentra en otro renglón, dividir el primer renglón para obtener un 1
        if (matriz[fila][columna] != 1) {
            elemento = matriz[fila][columna];
            if ((Math.round(elemento * 10000.0) / 10000.0) != 0) {
                for (int j = fila; j < matriz[matriz.length - 1].length; j++) {
                    matriz[fila][j] = (matriz[fila][j] / elemento);
                }
                System.out.println("\n1/" + (Math.round(elemento * 10000.0) / 10000.0) + " R" + (fila + 1) + " -> R" + (fila + 1));
                imprimirMatriz(matriz);
            }
        }

        if (matriz[fila][columna] == 1) {
            bandera = true;
        }

        return bandera;
    }

    //Este método, dado un elemento 1 en una matriz, transforma todos los elementos por debajo de él en ceros
    public static void convertirCerosPorDebajo(double[][] matriz, int fila, int columna) {
        double elemento;
        if (matriz[fila][columna] == 1) {
            for (int i = fila; i < matriz.length - 1; i++) {
                elemento = (matriz[i + 1][columna]) * -1;
                if ((Math.round(elemento * 10000.0) / 10000.0) != 0) {
                    for (int j = columna; j < matriz[matriz.length - 1].length; j++) {
                        matriz[i + 1][j] = (matriz[fila][j] * elemento) + matriz[i + 1][j];
                    }
                    System.out.println("\n" + (Math.round(elemento * 10000.0) / 10000.0) + " R" + (fila + 1) + " + R" + (i + 2) + " -> R" + (i + 2));
                    imprimirMatriz(matriz);
                }

            }
        }
    }

    //Este método, dado un elemento 1 en una matriz, transforma todos los elementos por arriba de él en ceros
    public static void convertirCerosPorArriba(double[][] matriz, int fila, int columna) {
        double elemento;
        if (matriz[fila][columna] == 1) {
            for (int i = fila - 1; i >= 0; i--) {
                elemento = (matriz[i][columna]) * -1;
                if ((Math.round(elemento * 10000.0) / 10000.0) != 0) {
                    for (int j = columna; j < matriz[matriz.length - 1].length; j++) {
                        matriz[i][j] = (matriz[fila][j] * elemento) + matriz[i][j];
                    }
                    System.out.println("\n" + (Math.round(elemento * 10000.0) / 10000.0) + " R" + (fila + 1) + " + R" + (i + 1) + " -> R" + (i + 1));
                    imprimirMatriz(matriz);
                }
            }
        }
    }

    //Este método evalúa si un rengón está totalmente formado por ceros
    public static boolean evaluarRenglon(double[][] matriz, int fila) {
        boolean bandera = true;
        if (matriz.length - 1 < matriz[matriz.length - 1].length - 1) {
            for (int i = 0; i < matriz.length; i++) {
                bandera = bandera && (Math.round(matriz[fila][i] * 10000) / 10000 == 0.0);
            }

        } else {
            for (int i = 0; i < matriz[matriz.length - 1].length; i++) {
                bandera = bandera && (Math.round(matriz[fila][i] * 10000) / 10000 == 0.0);
            }
        }

        return bandera;
    }

//Este método escalona matrices por el método de Gauss Jordan y arroja la matriz escalonada
    public static void gaussJordan(double[][] matriz) {
        imprimirMatriz(matriz);

        if (matriz.length - 1 < matriz[matriz.length - 1].length - 1) {

            for (int i = 0; i < matriz.length; i++) {
                int j = 0;
                if (!evaluarRenglon(matriz, j)) {
                    encontrarUno(matriz, i, j);
                    while (j < (matriz[matriz.length - 1].length) - 1 && !encontrarUno(matriz, i, j)) {
                        j++;
                    }
                    if (matriz[i][j] == 1) {
                        convertirCerosPorDebajo(matriz, i, j);
                        convertirCerosPorArriba(matriz, i, j);
                    }
                    j++;
                }
            }

        } else {
            for (int i = 0; i < matriz[matriz.length - 1].length; i++) {
                int j = 0;
                if (!evaluarRenglon(matriz, i)) {
                    encontrarUno(matriz, i, j);
                    while (j < (matriz[matriz.length - 1].length) - 1 && !encontrarUno(matriz, i, j)) {
                        j++;
                    }
                    if (matriz[i][j] == 1) {
                        convertirCerosPorDebajo(matriz, i, j);
                        convertirCerosPorArriba(matriz, i, j);
                    }
                    j++;
                }
            }
        }
    }
}
    

