/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaencriptacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TareaEncriptacion {

   
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //obtener nuestro Input por parte del usuario
        System.out.println("Ingresa un Mensaje");
        String input = br.readLine().toLowerCase();
        
        //saber si quiere encriptar o des-encriptar
        System.out.println("(1) Encriptar (2)Des-encriptar");
        String cf = br.readLine().toLowerCase();
        
        //arreglo con nuentro vocabulario
        String v[] = {" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        //arreglos dinamicos para nuestros arreglos, para el mensaje encriptado y desencriptado
        ArrayList<String> inC = new ArrayList();
        ArrayList<String> out = new ArrayList();
        
        //ingresar cada uno de los caracteres en un arreglo
        for (int i = 0; i < input.length(); i++) {
            inC.add(input.substring(i, i + 1));
        }

        /* //comprobar el contenido 
        for (int i = 0; i < inC.size(); i++) {
            System.out.println(inC.get(i));
        }
         */
        
        
        if (cf.equals("1") || cf.equals("Encriptar")) { //revisar que quiere encriptar
            for (int i = 0; i < inC.size(); i++) { //ciclo que se repetira el tamano de nuestro input
                for (int j = 0; j < v.length; j++) { //ciclo que se repetira hasta encontrar un valor igual al caracter del input
                    if (inC.get(i).equals(v[j])) { //revisar cada uno de los valores
                        if ((j + 3) > v.length) { //revisar si aplicando el cifrado nos pasamos del tamano del arreglo (nos daria error)
                            switch (v.length - j) { //calcular la diferencia y despues asigar el valor correspondiente a las distintas diferencias
                                case 0:
                                    out.add(v[2]); 
                                    break;
                                case 1:
                                    out.add(v[1]);
                                    break;
                                case 2:
                                    out.add(v[0]);
                                    break;

                            }
                        } else { //si no se pasa simplemente agregar 3 al valor de j para sustituir con esa letra
                            out.add(v[j + 3]);
                        }
                    }
                }
            }

            System.out.println("El mensaje secreto es");

        } else if (cf.equals("2") || cf.equals("Des-encriptar")) { //se quiere des-encriptar el mensaje
            for (int i = 0; i < inC.size(); i++) { //ciclo que se repetira el tamano de nuestro input
                for (int j = 0; j < v.length; j++) { //ciclo que se repetira hasta encontrar un valor igual al caracter del input
                    if (inC.get(i).equals(v[j])) { //revisar cada uno de los valores
                        if (j < 3) { //si es uno de los primeros 3 valores significa que antes nos pasamos
                            switch (j) { //revisar el valor de j y hacer el proceso inverso "manualmente"
                                case 0:
                                    out.add(v[v.length - 3]);
                                    break;
                                case 1:
                                    out.add(v[v.length - 2]);
                                    break;
                                case 2:
                                    out.add(v[v.length - 1]);
                                    break;
                            }
                        } else { //si no es de los primeros 3 caracteres simplemente restar 3 para hacer el cesar
                            out.add(v[j - 3]);
                        }
                    }
                }
            }
            System.out.println("Tu mensaje cifrado es ");
        }

        for (int i = 0; i < out.size(); i++) {//imprimir cada uno de los valores del mensaje cifrado o desifrado
            System.out.print(out.get(i));
        }

    }

}