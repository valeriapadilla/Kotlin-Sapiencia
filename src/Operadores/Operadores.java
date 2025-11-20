package Operadores;
import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) throws Exception {

        //operadores de comparacion
        int edad = 18;
        final int mayorEdad = 18;
        String ciudad = "MEDELLIN";
        String ciudad2 = "Medellin";

        System.out.println(edad>mayorEdad); //true
        System.out.println(edad<mayorEdad); //false

        System.out.println(edad==mayorEdad); //false

        System.out.println(edad != mayorEdad); //true

        //tipos boolean
        System.out.println(true != false); // true
        System.out.println(true == false); // false

        System.out.println(edad>mayorEdad); //falso
        System.out.println(edad>=mayorEdad); //true

        //no hagan esto para comparar string
        System.out.println(ciudad==ciudad2); //false

        //si hagan esto para comparar string
        System.err.println(ciudad.equals(ciudad2));

        //operadores logicos
        boolean organizar = true;
        boolean lavar = true;
        boolean sacarPerros = false;

        // que hace el AND o Y (&&)
        // false && false = false
        // true && false = false
        // true && true = true

        if(organizar && lavar){
            System.out.println("Puedes salir");
        }
        else{
            System.err.println("No puedes salir");
        }

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

        if(!organizar || lavar && sacarPerros){
            System.out.println("Puedes salir");
        }
        else{
            System.err.println("No puedes salir");
        }

        if(organizar || (lavar && sacarPerros)){
            System.out.println("Puedes salir");
        }
        else{
            System.err.println("No puedes salir");
        }  
    }
}
