package ciclos;

import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        
        String palabra = "Salida";
        Scanner entrada = new Scanner(System.in);

        //este no se ejecuta por que la palabra es = a Salir
        while(!palabra.equals("Salir")){
            System.out.println("Escribe una palabra para jugar: ");
            palabra = entrada.nextLine(); //no va a permitir un ciclo infinito

            System.out.println("Tu palabra es: " + palabra);
        }

        //este se ejecuta normal
        do{
            System.out.println("Escribe una palabra para jugar: ");
            palabra = entrada.nextLine(); //no va a permitir un ciclo infinito

            System.out.println("Tu palabra es: " + palabra);
        }while(!palabra.equals("Salir"));

        //un while que distinga de salir sin importar si es mayuscula o minuscula
        while(!palabra.equalsIgnoreCase("salir")){
            System.out.println("Escribe una palabra para jugar: ");
            palabra = entrada.nextLine(); //no va a permitir un ciclo infinito
            //palabra = palabra.toLowerCase();
            System.out.println("Tu palabra es: " + palabra);
        }
    }

}
