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
        // iniciamos una variable tipo cadena para ir acumulando los valores
        String cadena = "";
        // iniciamos una variabe tipo entero inicializada en cero
        // para ir realizando la suma
        int suma = 0;
        // System.out.println(arreglo1.length);
        // arreglo1[2] = 1000;
        for (int i = 0; i < arreglo1.length; i++) {
            // La palabra length me va a indicar la cantidad de elementos de
            // un arreglo asociado
            // Vamos acumulando los diferentes valores en la variable suma
            suma = suma + arreglo1[i];
            // Cada vez que itera el ciclo se va añadiendo un nuevo valor a la
            // cadena creando una cadena cada vez mas larga
            cadena = String.format("%sSubíndice o Índice %d, con valor "
                    + "%d\n", cadena, i, arreglo1[i]);
        }
        // ingresamos una cadena con un String.format para asi acumular con el
        // valor de la suma
        cadena = String.format("%sLa suma de los elementos es %d\n",
                cadena, suma);
        // Hacemos que lo que exista en la cadena quede en mayuscula
        cadena = cadena.toUpperCase();
        // Imprimimos el valor de la cadena
        System.out.printf("%s", cadena);
    }

}
