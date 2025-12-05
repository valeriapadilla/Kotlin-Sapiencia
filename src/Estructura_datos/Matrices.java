package Estructura_datos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        
        //como se crean matrices
        int[][] ajedrez = {
            {1,0,1},
            {0,1,0},
            {1,0,1}
        };

        System.out.println(ajedrez[1][1]);

        //como recorrer una matriz
        //longitud de las filas = variable.length
        //longitud de las columnas = variable[0].length
        for(int i = 0; i<ajedrez.length; i++){
            System.out.println();
            for(int j = 0; j<ajedrez[i].length; j++){
                System.out.print(ajedrez[i][j]);
            }
        }
        System.out.println();

        //obtener suma de todos los elementos de la matriz
        int suma = 0;
        for (int[] fila : ajedrez) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }
        //como imprimir la matriz en un println
        System.out.println(Arrays.deepToString(ajedrez));

        //imprimir diagonal principal
        if(ajedrez.length == ajedrez[0].length){ //significa que es una matriz con diagonal
            for(int i = 0; i<ajedrez.length; i++){
                System.out.println(ajedrez[i][i]);
            }
        }

        //transponer una matriz
        int[][] numerosMatriz = {
            {2,3,8},
            {4,6,8},
            {3,1,1}
        };
        int[][] trans = new int[3][3];

        for(int i = 0; i<numerosMatriz.length; i++){
            for(int j = 0; j<numerosMatriz[i].length; j++){
                trans[j][i] = numerosMatriz[i][j];
            }
        }
        System.out.println(Arrays.deepToString(trans));


        //encontrar un numero en la matriz
        int valor = 3;
        for(int i = 0; i<numerosMatriz.length; i++){
            for(int j = 0; j<numerosMatriz[i].length; j++){
                if(numerosMatriz[i][j]==valor){
                    System.out.println("Numero encontrado ");
                }
            }
        }

        //encontrar el valor maximo
        int max = 0;

        for(int i = 0; i<numerosMatriz.length; i++){
            for(int j = 0; j<numerosMatriz[i].length; j++){
                if(numerosMatriz[i][j]>max){
                    max = numerosMatriz[i][j];
                }
            }
        }

        System.out.println(max);

        //como poner llenar una matriz desde consola
        Scanner entrada = new Scanner(System.in);

        // primer preguntar dimension
        System.out.println("Escriba la dimension de la matriz (ej: 2 3) ");
        String dimensiones = entrada.nextLine();

        // 2 3
        String[] matrizStr = dimensiones.split(" "); // ["2","3"]
        int fila = Integer.parseInt(matrizStr[0]);;
        int columna = Integer.parseInt(matrizStr[1]);

        int[][] matrizConsola = new int[fila][columna];


        for(int i = 0; i<matrizConsola.length; i++){
            for(int j = 0; j<matrizConsola[i].length; j++){
                System.out.print("Ingrese el valor de la posicion " + i + " " + j + " ");
                matrizConsola[i][j] = entrada.nextInt();
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrizConsola));

        //sumar columnas
        

            
    





        

    }

}
