/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        // int[] arreglo1 = new int[5];
        int[] arreglo1 = {1000, 1, 2, 2000, 300};
        String cadena = "";
        int suma = 0;
        // System.out.println(arreglo1.length);
        // arreglo1[2] = 1000;
        for (int i = 0; i < arreglo1.length; i++) {
            // La palabra length me va a indicar la cantidad de elementos de
            // un arreglo asociado
            suma = suma + arreglo1[i];
            cadena = String.format("%sSubíndice o Índice %d, con valor "
                    + "%d\n", cadena, i, arreglo1[i]);
        }
        cadena = String.format("%sLa suma de los elementos es %d\n",
                cadena, suma);
        cadena = cadena.toUpperCase();
        System.out.printf("%s", cadena);
    }

}
