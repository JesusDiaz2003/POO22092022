/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.gauss.jordan;


import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaPanel {

    public static void main(String[] args) {

        int filasA, columnasA;

        JTextField filas = new JTextField(5);
        JTextField columnas = new JTextField(5);
        JPanel panelDimensiones = new JPanel();
        JPanel panelMatriz = new JPanel();

        panelDimensiones.add(new JLabel("No. de filas:"));
        panelDimensiones.add(filas);
        panelDimensiones.add(Box.createHorizontalStrut(15)); // a spacer
        panelDimensiones.add(new JLabel("No. de columnas:"));
        panelDimensiones.add(columnas);

        JOptionPane.showConfirmDialog(null, panelDimensiones,
                "Por favor ingresa las dimensiones", JOptionPane.OK_CANCEL_OPTION);

        filasA = Integer.parseInt(filas.getText());
        columnasA = Integer.parseInt(columnas.getText());

        double matrizA[][] = new double[filasA][columnasA];

        JTextField fila[][] = new JTextField[filasA][columnasA];
        panelMatriz.setLayout(new GridLayout(filasA, columnasA));
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                panelMatriz.add(new JLabel("X [" + i + "][" + j + "] :"));
                fila[i][j] = new JTextField(5);
                panelMatriz.add(fila[i][j]);
                panelMatriz.add(Box.createHorizontalStrut(1));

            }
        }

        JOptionPane.showConfirmDialog(null, panelMatriz,
                "Por favor ingrese la matriz aumentada", JOptionPane.OK_CANCEL_OPTION);

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matrizA[i][j]
                        = Integer.parseInt(fila[i][j].getText());
            }
        }
        CalculadoraGaussJordan.imprimirMatriz(matrizA);
    }
}
