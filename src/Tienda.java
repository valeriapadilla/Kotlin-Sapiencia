import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        // crear productos
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<String>();
        // cantidad
        // valor
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("BIENVENIDO \n 1. agregar producto \n 4. salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = entrada.nextLine();
                    entrada.nextLine();
                    productos.add(nombre);
                    System.out.println("Producto agregado, total de productos: " + productos.size());

                case 4:
                    System.out.println("Saliendo del menu...");
                    break;
                default:
                    break;
            }

        }

    }

}
