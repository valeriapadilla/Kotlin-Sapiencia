package Estructura_datos;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,2},
            {4,5},
            {7, 8},
        };

// {1,4,7},
// {2,5,8},


        // //la longitud de mis filas
        // int filas = matriz.length; //3
        // int columnas = matriz[0].length; //2

        // System.out.println("Matriz[0]" +Arrays.toString(matriz[0]));
        // System.out.println("filas "+filas);
        // System.out.println("Columnas "+ columnas);

        // //columna<=columnas 3<=3

        // //sumar columnas
        // for(int col = 0; col<columnas; col++){ //recorriendo una matriz por columnas
        //     int suma = 0;
        //     // tengo que ir bajan de piso (filas)
        //     for(int fila = 0; fila<filas; fila++){
        //         //sumando
        //         suma += matriz[fila][col];
        //         //ya recorri todos los pisos (filas)
        //     }
        //     System.out.println("suma de la " + col + " es igual a " + suma);
        // }

        // //sumar por filas
        // for(int fil = 0; fil < filas ; fil++){ //recorriendo por filas para obtener su suma
        //     int suma = 0;
        //     for(int col=0; col< columnas; col++){ //recorrer todas las columas pero de mi fila actual
        //         suma += matriz[fil][col];
        //     }
        //     System.out.println(suma);
        // }

        //transponer la matriz actual (matriz)
        // sumar

        //1. obtener filas y columnas
        int filas = matriz.length;

        int columas = matriz[0].length;

        //2. creamos nueva matriz con filas y columnas inversas
        int[][] matrizT = new int[columas][filas];

        //3. llenar la nueva matriz con la inversion

        //recorrer matriz inicial
        for(int col = 0; col<columas; col++){
            for(int fil = 0; fil<filas; fil++){
                //obtengo el valor que voy a agregar
                int valorActual = matriz[fil][col];
                //lo inserto en la nueva matriz pero en inverso (transpuesto)
                matrizT[col][fil] = valorActual;
            }
        }

        System.out.println(Arrays.deepToString(matrizT));


        //sumar por filas
        for(int fil = 0; fil < matrizT.length ; fil++){ //recorriendo por filas para obtener su suma
            int suma = 0;
            for(int col=0; col< matrizT[0].length; col++){ //recorrer todas las columas pero de mi fila actual
                suma += matrizT[fil][col];
            }
            System.out.println("La suma de la fila " + fil + "Es igual a: " + suma);
        }

        for(int fil = 0; fil < matrizT.length ; fil++){ //recorriendo por filas para obtener su suma
            for(int col=0; col< matrizT[0].length; col++){ //recorrer todas las columas pero de mi fila actual
               System.out.print(matrizT[fil][col] + " ");
            }
            System.out.println();
        }
}
}
