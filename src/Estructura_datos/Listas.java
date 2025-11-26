package Estructura_datos;

import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
       //como crear una lista Array
       String[] superMercado;
       superMercado = new String[5]; 

       String[] super1 = new String[3];

       int[] notas = new int[3];

       int[] numeros = {2,3,4,6,1}; //se entiende que solo puede almacenar 5 elementos
    
       int[] numeros1 = new int[]{2,3,4,6,1};

       //que pasa cuando uno crea las listas vacia

       int[] edades = new int[3]; //[0,0,0]
       int edad; //0

       String[] nombres = new String[5];

       //System.out.println(Arrays.toString(nombres));

       //como acceder a elementos segun el indixe

       int[] jugadores = {12, 13, 25, 23}; // longitud = 4

       int primerJugador = jugadores[1];

       System.out.println(primerJugador);

       //como puedo cambiar los elementos
       jugadores[2] = 30;

       //la ultima posicion/indixe longitud - 1
        int longitud = jugadores.length;
       //yo quiero que el primer jugador sea igual al ultimo jugar + 10
       jugadores[0] = jugadores[longitud - 1] + 10;
       System.out.println(Arrays.toString(jugadores));

       //[33, 13, 30, 23]
       //recorramos la lista y agreguemos +1 a cada elemento
       for(int i = 0; i < longitud; i++){
            //jugadores[i] = jugadores[i] + 1;
            jugadores[i] += 1;
            System.out.println("Cambio a: " + jugadores[i]);
       }

       //este ciclo (for-each) es solo de lectura
       for(int jugador: jugadores){
            System.out.println("Este es el jugador " + jugador);
       }

       //recorrer una lista con un ciclo while
       int index = 0;
       while(index < jugadores.length){
        System.out.println("Este es el ciclo while para el jugador " + jugadores[index]);
        index += 1;
       }

       //Como ordenar una lista
       Arrays.sort(jugadores);
       //para imprimir una lista en consola 
       //siempre se usa el metodo Arrays.toString() -> lo convierte a string
       System.out.println(Arrays.toString(jugadores));

       //como llenar una lista con un mismo valor (cuando esta vacia)
       String[] colores = new String[3]; //valores null

       Arrays.fill(colores, "Amarillos");
       System.out.println(Arrays.toString(colores));

       //llenarla en un rango cuando la lista esta vacia
       String[] elementos = new String[3];
       Arrays.fill(elementos,1,3,"Azul");
       System.out.println("esta es mi lista elementos: " +  Arrays.toString(elementos));

       //como copiar listas?? esta manera no es correcta, representa la misma referencia (en memoria)
    //    String[] nuevaLista = elementos; //no es correcto
    //    nuevaLista[0] = "Morado";

    //    System.out.println(Arrays.toString(elementos));

       //la manera correcta copiar lista
       String[] listaCorrecta = Arrays.copyOf(elementos,elementos.length);
       listaCorrecta[0] = "Verde";

       System.out.println("lista elementos " + Arrays.toString(elementos));
       System.out.println("lista correcta " + Arrays.toString(listaCorrecta));

       //comparar listas

    //    listaCorrecta == elementos //false, no es correcto
    //    1 == 1 // true

       String[] lista2 = {"Verde", "Azul", "Azul"};
       
       if(Arrays.equals(lista2, listaCorrecta)){
        System.out.println("Son iguales");
       }
       else{
        System.out.println("No son iguales ");
       }

       












       
    }
}
