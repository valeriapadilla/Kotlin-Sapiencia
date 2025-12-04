package Estructura_datos;

import java.util.Map;
import java.util.HashMap;


public class Mapas {
    public static void main(String[] args) {
        //como crear diccionarios
        //<Tipo de la clave, tipo del valor>
        Map<String,Integer> telefonos = new HashMap<>();
        //insertar valor
        telefonos.put("Maria",3019870);
        telefonos.put("Pepito",3019871);
        telefonos.put("Juan",3019872);
        telefonos.put("Andres",3019873);

        //como obtener un valor especifico
        System.out.println(telefonos.get("Maria"));

        //recorrer un map por las llaves
        for(String nombre: telefonos.keySet()){
            System.out.println(telefonos.get(nombre));
        }

        //Verificar si existe una llave
        System.out.println(telefonos.containsKey("Manuel"));

        //verificar si contiene un valor
        System.out.println(telefonos.containsValue(3019871));

        //como obtener la longitud
        System.out.println(telefonos.size());

        //iterar por los valores
        for(Integer telefono: telefonos.values()){
            System.out.println(telefono);
        }

        //insertar si la clave no existe
        telefonos.putIfAbsent("Pepito", 311420);
        System.out.println("Telefono de pepito "+telefonos.get("Pepito"));

    }
}
