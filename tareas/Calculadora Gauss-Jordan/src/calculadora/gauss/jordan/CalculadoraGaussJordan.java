/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.gauss.jordan;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



/**
 *
 * @author HP
 */
public class CalculadoraGaussJordan {


        public static void main(String[] args) {

        int filasA, columnasA, noVariables;

        JTextField noEcuaciones = new JTextField(5);
        JTextField noIncognitas = new JTextField(5);
        JPanel panelDimensiones = new JPanel();
        JPanel panelSistema = new JPanel();

        panelDimensiones.add(new JLabel("No. de ecuaciones:"));
        panelDimensiones.add(noEcuaciones);
        panelDimensiones.add(Box.createHorizontalStrut(15));
        panelDimensiones.add(new JLabel("No. de incógnitas:"));
        panelDimensiones.add(noIncognitas);

        int m =JOptionPane.showConfirmDialog(null, panelDimensiones,
                "Por favor ingrese las dimensiones del sistema", JOptionPane.OK_CANCEL_OPTION);

        if(m == JOptionPane.CANCEL_OPTION){
            System.exit(0);
        }
      
        filasA = Integer.parseInt(noEcuaciones.getText());
        columnasA = Integer.parseInt(noIncognitas.getText()) + 1;
        noVariables = Integer.parseInt(noIncognitas.getText());

        // DECLARA LA MATRIZ QUE UTILIZAREMOS Y GUARDA LA VARIABLES QUE UTILIZE EL USUARIO
        double matrizA[][] = new double[filasA][columnasA];
        String incognitas[] = new String[noVariables];

        JTextField matrizAumVal[][] = new JTextField[filasA][columnasA];
        JTextField variables[][] = new JTextField[filasA][columnasA - 1];

        panelSistema.setLayout(new GridLayout(filasA, (columnasA * 2) - 1));
// GUARDA Y CREA VARIABLES
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA - 1; j++) {
                matrizAumVal[i][j] = new JTextField(3);
                panelSistema.add(matrizAumVal[i][j]);
                variables[i][j] = new JTextField(3);
                panelSistema.add(variables[i][j]);

                if (j != (columnasA - 2)) {
                    panelSistema.add(new JLabel("      +"));
                } else {
                    panelSistema.add(new JLabel("      ="));
                }
            }
            matrizAumVal[i][columnasA - 1] = new JTextField(3);
            panelSistema.add(matrizAumVal[i][columnasA - 1]);
        }

        int n = JOptionPane.showConfirmDialog(null, panelSistema,
                "Por favor ingrese su sistema de ecuaciones", JOptionPane.OK_CANCEL_OPTION);
        
        if(n == JOptionPane.CANCEL_OPTION){
            System.exit(0);
        }

        // ALMACENA LOS DATOS EN  LOS ARREGLOS CREADOS ANTES QUE SE PONEN EN EL PANEL, YO AQUI ME ENTIENDO SOLITO XD
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matrizA[i][j]
                        = Integer.parseInt(matrizAumVal[i][j].getText());
            }
        }

        for (int j = 0; j < noVariables; j++) {
            incognitas[j]
                    = variables[0][j].getText();
        }

        double matrizEsc[][] = new double[matrizA.length][matrizA[matrizA.length - 1].length];
        matrizEsc = gaussJordan(matrizA);

        if (evaluarTieneSolucion(matrizEsc)) {
            sistemaResultante(matrizEsc, incognitas);
            despeje(matrizEsc, incognitas);
        } else {
            System.out.println("\n\tSistema incompatible: No tiene solución.");
        }

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

    //Este método, dadas dos filas de una matriz, intercambia los elementos de 2 filas de una misma matriz; acepta una matriz de tipo bidimensional doble; 
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

    
    //Este método evalúa si un rengón está totalmente formado por ceros, y devuelve un booleano
    public static boolean evaluarRenglon(double[][] matriz, int fila) {
        boolean bandera = true;
        for (int j = 0; j < matriz[0].length; j++) {
            bandera = bandera && (Math.round(matriz[fila][j] * 10000) / 10000 == 0.0);
        }
        return bandera;
    }

//Este método escalona matrices por el método de Gauss Jordan y arroja la matriz escalonada
    public static double[][] gaussJordan(double[][] matriz) {
        imprimirMatriz(matriz);
// longitud de las columnas comparando entre si
        if (matriz.length - 1 < matriz[matriz.length - 1].length - 1) {

            for (int i = 0; i < matriz.length; i++) {
                int j = 0;
                // evalua si una fila esta completamente escrita por 0 ¡= si evaluar renglon es falso, haz lo que esta adentro 
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
            //lo mismo pero con las columnas delimitado por su longitud
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
        return matriz;
    }
// MEDIANTE UNA MATRIZ AUMENTADA SACA La matriz ded coeficiente COEFICIENTES
    public static double[][] matrizCoeficientes(double[][] matriz) {
        double matrizCoef[][] = new double[matriz.length][matriz[matriz.length - 1].length - 1];

        for (int i = 0; i < matriz[0].length - 1; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizCoef[j][i] = matriz[j][i];
            }
        }
        return matrizCoef;
    }
// DADA UNA MATRIZ AU8MENTADA SACA LOS RESULTADOS Y REGRESA UNA NUEVA MATRIZ de resultados
    public static double[][] matrizResultados(double[][] matriz) {
        double matrizResul[][] = new double[matriz.length][1];

        for (int j = 0; j < matriz.length; j++) {
            matrizResul[j][0] = matriz[j][matriz[0].length - 1];
        }
        return matrizResul;
    }
// EVALUA QUE TIPO DE SISTEMA
    public static boolean evaluarTieneSolucion(double[][] matriz) {
        boolean bandera = true;
        double[][] matrizCoef = new double[matriz.length][matriz[matriz.length - 1].length - 1];
        double[][] matrizResul = new double[matriz.length][1];
        matrizCoef = matrizCoeficientes(matriz);
        matrizResul = matrizResultados(matriz);
// COMPARA EL RESULTADO DE LA MATRIZCOEF Y LA MATRIZ RESUL PARA EVALUAR SI TIENE SOLUCION
        for (int i = 0; i < matriz.length; i++) {
            if ((evaluarRenglon(matrizCoef, i)) && (!evaluarRenglon(matrizResul, i))) {
                bandera = false;
                break;
            }
        }
        return bandera;
    }
// INTERPRETA LA MATRIZ ESCALONDA Y LO REGRESA A SER UN SISTEMA DE ECUACIONES OTRA VEZ
    public static void sistemaResultante(double[][] matriz, String[] incognitas) {
        int numIncognitas = incognitas.length;
// DECLARAMOS ARREGLOS Y ASIGNAMOS UN VALOR
        double matrizCoef[][] = new double[matriz.length][matriz[matriz.length - 1].length - 1];
        double matrizResul[][] = new double[matriz.length][1];
        matrizCoef = matrizCoeficientes(matriz);
        matrizResul = matrizResultados(matriz);
        // SE SEPARA A LA MATRIZ ESCALONADA EN CUANTAS ECUACIONES TIENE
        ArrayList<String>[] ecuacion = new ArrayList[matrizCoef.length];
        // RECORRE TODAS LAS INCOGNITAS DE LA MATRIZ Y SI ENCUENTRA IUNA DIFERENTE DE 0 LA AGREGA A LA ECUACION
        for (int i = 0; i < matrizCoef.length; i++) {
            ecuacion[i] = new ArrayList<>();
            for (int j = 0; j < numIncognitas; j++) {
                if (Math.round(matriz[i][j] * 10000.0) / 10000.0 != 0) {
                    ecuacion[i].add(Math.round(matrizCoef[i][j] * 10000.0) / 10000.0 + incognitas[j]);
                }
            }
            ecuacion[i].add(Math.round(matrizResul[i][0] * 10000.0) / 10000.0 + " ");
        }
//IMPRIME LAS ECUACIONES GUARDADAS EN EL ANTERIOR FOR
        System.out.println("\nSistema de ecuaciones resultante");
        //CHECA QUE J SEA MENOR QUE LA LONJITUD DE LA ECUACION
        for (int j = 0; j < ecuacion.length; j++) {
            for (int i = 0; i < ecuacion[j].size() - 1; i++) {
               //EVALUA SI LA ECUACION ES MAYOR A 2 
                if (ecuacion[j].size() > 2) {
                    if (i != (ecuacion[j].size() - 2)) {
                        System.out.print(ecuacion[j].get(i) + " + ");
                    } 
               
                    else if ((i != 0)) {
                        System.out.print(ecuacion[j].get(i) + " = " + ecuacion[j].get(i + 1) + "\n");
                    }
                    //SI LA ECUACION TIENE MENOS DE 2 ELEMNTOS IMPRIME CUANDO LA MATRIZ ESTA BIEN ESCALONADA
                } else {
                    System.out.print(ecuacion[j].get(i) + " = " + ecuacion[j].get(i + 1) + "\n");
                }
            }
        }
    }
// DEPEJA LAS INCOGNITAS PARA PODER ENCONTRAR SU VALOR 
    public static void despeje(double[][] matriz, String[] incognitas) {

        int numIncognitas = incognitas.length;
        double matrizCoef[][] = new double[matriz.length][matriz[matriz.length - 1].length - 1];
        double matrizResul[][] = new double[matriz.length][1];
        matrizCoef = matrizCoeficientes(matriz);
        matrizResul = matrizResultados(matriz);
        
        ArrayList<String>[] ecuacion = new ArrayList[matrizCoef.length];
        ArrayList<String>[] variable = new ArrayList[matrizCoef.length];
        ArrayList<String>[] valor = new ArrayList[matrizCoef.length];
        ArrayList<String> variablesLibres = new ArrayList();

        for (int i = 0; i < matrizCoef.length; i++) {
            for (int j = 0; j < numIncognitas; j++) {
                if (matrizCoef[i][j] != 0) {
                    if (matrizCoef[i][j] == 1) {
                        for (int k = j + 1; k < numIncognitas; k++) {
                            matrizCoef[i][k] *= -1;
                        }
                    }
                }
            }
        }
// CREA UN NUEVO ARREGLO
        for (int i = 0; i < matrizCoef.length; i++) {
            ecuacion[i] = new ArrayList<>();
            for (int j = 0; j < numIncognitas; j++) 
            //MATH... REDONDEA Y AGREGA EL VALOR DE LA VARIABLE CON SU RESPECTIVA VARIABLE
            {
                ecuacion[i].add(Math.round(matrizCoef[i][j] * 10000.0) / 10000.0 + incognitas[j]);
            }
            //AGREGA EL RESULTADO DE LA ECUACION
            ecuacion[i].add(Math.round(matrizResul[i][0] * 10000.0) / 10000.0 + " ");
        }

        //METEMOS LA VARIABLE DESPEJADA EN UN ARREGLO Y ESE VALOR LO METEMOS EN OTRO ARREGLO
        System.out.println("\nSolución del sistema");
        for (int i = 0; i < ecuacion.length; i++) {
            variable[i] = new ArrayList<>();
            valor[i] = new ArrayList<>();
            for (int j = 0; j < ecuacion[i].size(); j++) {
                if (j < incognitas.length && ecuacion[i].get(j).contains("1.0" + incognitas[j]) && variable[i].isEmpty()) {
                    variable[i].add(ecuacion[i].get(j).substring(3));
                } else {
                    valor[i].add(ecuacion[i].get(j));
                }
            }

        }

        //Este for imprime las ecuaciones de manera que la variable este depejada
        for (int j = 0; j < valor.length; j++) {
            if ((!variable[j].isEmpty())) {
                System.out.print(variable[j].get(0) + " = ");
                for (int i = 0; i < valor[j].size(); i++) {
                    if (!valor[j].get(i).contains("0.0" + valor[j].get(i).substring(valor[j].get(i).length() - 1)) || (valor[j].get(i).equals("0.0 "))) {
                        if (i == numIncognitas - 1) {
                            System.out.print(valor[j].get(i) + "\n");
                        } else {
                            System.out.print(valor[j].get(i) + " + ");
                        }
                    }
                }
            }
        }

        //IMPRIME LA VARIABLE QUE NO ENCONTOR EN EL ANTERIOR ASIGNANDOLES SU VALOR SIENDO ESTE ELLAS MISMAS
        for (int h = 0; h < valor.length; h++) {
            if ((!variable[h].isEmpty())) {
                for (int i = 0; i < valor[h].size(); i++) {//igual
                    for (int j = 0; j < incognitas.length; j++) {
                        if (valor[h].get(i).contains(incognitas[j]) && (!valor[h].get(i).equals("0.0" + incognitas[j]))) {
                            if (!variablesLibres.contains(incognitas[j])) {
                                variablesLibres.add(incognitas[j]);
                                System.out.println(variablesLibres.get(variablesLibres.size() - 1) + " = " + variablesLibres.get(variablesLibres.size() - 1));
                            }
                        }
                    }
                }
            }
        }
    }
}