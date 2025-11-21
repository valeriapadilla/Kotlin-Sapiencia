package Operadores;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //escribir codigo aqui

        //En un restaurante se tienen 3 momentos: Entrada, Plato Fuerte y Bebida. 
        // A cada comensal se le pide que escoja para cada momento uno de 3 productos. 
        // Para la Entrada puede escoger: 1. Ceviche, 2. Crema, 3. Patacones
        // Para el plato fuerte: 1. Pollo, 2. Carne, 3. Pescado
        // Para la bebida: 1. Cerveza, 2. Jugo , 3. Gaseosa

        // Diseñe un algoritmo y escriba un programa  en Java,  que solicite al comensal
        // qué va a elegir para cada momento y al final muestre todo lo que éste escogió.
        // Si selecciona una opción diferente a 1, 2 o 3 en cada momento, 
        // Le muestre Opción Inválida.

        //mostar el menu
        System.out.println("Este es el menu de entradas \n" +
            "1. Ceviche \n2. Crema \n3. Patacones \n"
        );

        //elegir opcion de la entra

        Scanner entrada = new Scanner(System.in);

        System.out.println("Selecciona tu opcion de entrada (numero entre 1 y 3): ");

        int opcion = entrada.nextInt();
        
        //ciclo para obtener una opcion valida
        while (opcion < 1 || opcion > 3){
            System.out.println("Numero invalida, escriba otra opcion ");
            opcion = entrada.nextInt();
        }

        String platoEntrada = "";

        switch (opcion) {
            case 1:
                platoEntrada = "Ceviche";
                break;
            
            case 2:
                platoEntrada = "Crema";
                break;
            
            case 3:
                platoEntrada = "Patacones";
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }
        //falta repetir con plato fuerte y bebida
        System.out.println("usted escogio la opcion: " + platoEntrada);
        

    }
}
