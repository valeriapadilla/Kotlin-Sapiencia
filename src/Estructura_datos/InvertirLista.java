package Estructura_datos;

import java.util.Arrays;

public class InvertirLista {
    public static void main(String[] args) {
        int[] numeros = {2, 8, 3, 6, 10}; //2 intercambios
        //la idea es invertir la lista
        //resultado espera {10, 6, 3, 8, 2}
        // {2,4,2, 8, 3, 6, 10,5} //4 intercambios

        for(int i = 0; i < numeros.length / 2; i++){
            int temp = numeros[i]; //8

            numeros[i] = numeros[numeros.length - 1 - i]; //10

            numeros[numeros.length - 1 - i] = temp; //2
        }

        System.out.println(Arrays.toString(numeros));

    }
}
