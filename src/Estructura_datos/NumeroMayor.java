package Estructura_datos;

public class NumeroMayor {
    public static void main(String[] args) {
        //encuentre el numero mayor de una lista
        int[] numeros = {12,50,34,4,23};

        //suposicion
        int numMayor = numeros[0];

        for(int i = 1; i<numeros.length;i++){
            if(numeros[i]>numMayor){
                numMayor = numeros[i];
            }
        }

        System.out.println("el numero mayor es: " + numMayor);
    }
}
