import java.util.ArrayList;

public class Repaso2025 {
    public static void main(String[] args) {
        //tipos mas comunes de datos
        int edad = 23;
        double peso = 60.2;

        String nombre = "juan"; 
        String cantidadFrutas = "2";

        boolean esRobot = true;
        boolean esAmarillo = false;

        //variable
        //listas - dinamicas. Pueden cambiar de tamaño
        ArrayList<String> frutas3 = new ArrayList<>();    
           
        //listas - estaticas. Listas con tamaños fijos
        String[] frutas = {"Pera","Manza","Mango"}; 

        String[] frutas2 = new String[3];

        //los condicionales
        // && se como AND
        // que hace el OR o O (||)
        // false || false = false
        // true || false = true
        // true || true = true

        //java si prioriza
        // 1. parentesis ()
        // 2. ! negacion 
        // 3. comparacion
        // 4. && AND
        // 5. || OR

        //maria puede salir si lavo los platos y organizo su cuarto

        boolean lavoPlatos = false;
        boolean organizoCuarto = true;

        //COMO a maria le dijeron "y" - que tiene que cumplir ambas acciones
        // y -- &&
        if(lavoPlatos && organizoCuarto){
            //solo se ejecuta si la condicion es verdadera
            System.out.println("Puede salir ");
        }
        else{
            //se ejecuta si la condicion no es verdadera , es falsa
            System.out.println("No puede salir");

        }

        //maria puede salir si lavo los platos o organizo su cuarto

        //COMO a maria le dijeron "o" - que tiene que cumplir cualquiera de las dos acciones
        // o -- ||

        if(lavoPlatos || organizoCuarto){
            //solo se ejecuta si la condicion es verdadera
            System.out.println("Puede salir ");
        }
        else{
            //se ejecuta si la condicion no es verdadera , es falsa
            System.out.println("No puede salir");
        }

        if(2>3){
            //esto es verdadero
        }

        double saldo = 2400.5;
        double valorSacar = 5000;

        if(valorSacar>saldo){
            System.out.println("No sea vivo, no tienes ese saldo disponible");
        }else{
            double saldoActualizado = saldo - valorSacar;
        }

        int suma = 2 * 2;
        // 2+2
        // 2/2
        // 2-2
        System.out.println(2+2);

        //ciclos 
        //si sabemos exactamente cuantas veces queremos repetir el codigo
        //for(tipo nombre = valor inicial,condicion a parar el ciclo,  )
        for(int i = 1; i < 10; i++){ 
            System.out.println(i); 
        }

        //si no sabemos la cantidad de veces que se quiere repetir el codigo
        boolean saldo2 = true;
        while(saldo2==true){
            //ejecuta esto
            saldo2 = false;
        }
    }

}
