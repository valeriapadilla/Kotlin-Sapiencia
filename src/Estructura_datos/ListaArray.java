package Estructura_datos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.lang.Integer;

public class ListaArray {
    public static void main(String[] args) {

        // no acepta datos primitivos (int, double, bool...)
        ArrayList<String> frutas = new ArrayList<>();

        //los ArrayList lista Dinamicas, no tiene una dimension exacta
        //como agregar elementos
        frutas.add("Manzana");
        frutas.add("Pera");

        //agregar multiples elementos
        frutas.addAll(Arrays.asList("uva","fresa","Melon","Melon","Melon","Melon"));

        //como obtener segun indice
        System.out.println(frutas.get(0));

        //Como reemplazar un elemento que ya tenemos
        frutas.set(2,"piña");

        System.out.println(frutas);

        //como eliminar elementos
        //primero posicion (indice)
        frutas.remove(0);

        //eliminar por nombre
        //frutas.removeAll(Arrays.asList("Melon","fresa"));
        System.out.println(frutas);

        //contiene un valor
        boolean loContiene = frutas.contains(1);

        System.out.println(frutas.contains("PiÑa".toLowerCase()));

        System.out.println(loContiene);

        //buscar el indice de un elemento
        System.out.println(frutas.indexOf("Azul"));
        //busqueda por indice
        System.out.println(frutas.get(0));

        //frutas[0]; == frutas.get(0)
        //esta vacio
        //System.out.println(frutas.isEmpty());

        //limpiar
        //frutas.clear(); //vacia por completo la lista
        //System.out.println(frutas.isEmpty());

        //como ordernar (el metodo sort no crea una nueva lista)
        Collections.sort(frutas);
        System.out.println(frutas);

        //como invertir una lista
        // Collections.reverse(frutas);
        // System.out.println(frutas);

        //la lista ordenada (de maner asc)
        Collections.sort(frutas);
        //si varios elmentos iguales, retorna un indece valido 
        //no necesarimente el primero o el ultimo
        System.out.println(Collections.binarySearch(frutas, "Melon"));

        //Clonar un arraylist
        ArrayList<String> lista = new ArrayList<>(frutas);

        Float numero = (float) 10.2;
        int numero1 = 1;

        //como convertir arrayList a Array
        ArrayList<Integer> numerosArrayList = new ArrayList<>();
        Integer[] numerosArray = numerosArrayList.toArray(new Integer[2]);

        ArrayList<String> letras = new ArrayList<>();

        letras.add("df");
        letras.add("CD");

        String[] letrasListas = letras.toArray(new String[2]);

        //convertir de Array a arraylist
        String nombre = "Maria";
        String[] nombres = {"Ana", "Luis", "Pedro"};
        ArrayList<String> listaNombres = new ArrayList<>(Arrays.asList(nombres));

        //wrappers - como convertir un dato primitivo a un dato tipo class (Objetos)
        
        int mayorEdad = 18;
        Integer mayorEdad1 = 18;

        ArrayList<Integer> jugadores = new ArrayList<>();

        ArrayList<Boolean> esJugador = new ArrayList<>();

        //convertir dato de tipo primitivo -> objeto(integer) 
        jugadores.add(1);
        jugadores.add(2);
        jugadores.add(3);

        //convertir dato de tipo objeto(integer) -> primitivo
        int primerJugador = jugadores.get(0);

        //libreria Integer convertir (forzado) de dato primitivo -> objeto(integer) 
        Integer obj = Integer.valueOf(1);
        //objeto(integer) -> primitivo
        int primitivo = obj.intValue();

        Integer primero = 1;
        Integer segundo = 1;


        //como comparar
        if (primero.equals(segundo)){
            
        }











    }
}
