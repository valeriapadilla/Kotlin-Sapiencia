package Operadores;

import java.util.Scanner;

public class Repaso {
    public static void main(String[] args) {

        //variables
        int edad = 23;

        //el tipo float debe ser casteado 
        float peso = (float) 60.51;
        float peso1 = 30.3f;

        //dato no primitivo
        String nombre = "Valeria";

        //constantes
        final String NOMBRE = "Valeria";

        //entrada y salida
        //quiero que el usuario me de un numero entero
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero de tipo int");
        int numero = entrada.nextInt();
        
        System.out.print("Tu numero es: " + numero);

        //Existen diferentes tipos para obtener la entrada del usuario
        //si el usuario ingresa un numero
        System.out.println("Ingrese su numero telefonico: ");
        int telefono = entrada.nextInt(); //usa nextInt

        //si el usuario ingresa un string / cadena de texto
        System.out.println("Ingrese su direccion: ");
        String direccion = entrada.nextLine(); //usa nextLine

        //si el usuario ingresa un numero decimal
        System.out.println("Ingrese su peso: ");
        double pesoCorporal = entrada.nextDouble(); //usa nextDouble
        
    }
    
}
