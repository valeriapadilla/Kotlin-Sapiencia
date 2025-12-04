package Strings;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Reto: Crea un programa que lea una frase, 
        //la convierta a mayúsculas, 
        // elimine espacios extras y reemplace todas las 'A' por '@'

        String frase = "     La ambulancia va por la carretera.         ";
        System.out.println(frase);

        frase = frase.toUpperCase();
        frase = frase.trim();
        frase = frase.replace("A","@");

        System.out.println(frase);

        String nombre1 = "CArLos";
        String nombre2 = "carlos";

        System.out.println(nombre1.equals(nombre2));




    }

}
