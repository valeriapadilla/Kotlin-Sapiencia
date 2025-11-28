package Estructura_datos;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaArray {
    public static void main(String[] args) {

        // no acepta datos primitivos (int, double, bool...)
        ArrayList<String> frutas = new ArrayList<>();

        //los ArrayList lista Dinamicas, no tiene una dimension exacta
        //como agregar elementos
        frutas.add("Manzana");
        frutas.add("Pera");

        //agregar multiples elementos
        frutas.addAll(Arrays.asList("uva","fresa","Melon"));

        //como obtener segun indice
        System.out.println(frutas.get(0));

        //Como reemplazar un elemento que ya tenemos
        frutas.set(2,"Piña");

        System.out.println(frutas);

        //como eliminar elementos
        //primero posicion (indice)
        frutas.remove(0);

        //eliminar por nombre
        frutas.removeAll(Arrays.asList("Melon","fresa"));

        System.out.println(frutas);

        //



    }
}
