package academia;

public class Persona {
    //1. atributos
    private String nombre;
    private int edad;
    private int telefono;

    //2. constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //3. setters & getters
    // una persona puede editar su edad 
    // y puede ver la edad y el nombre 
    // (o sea que no puede editar su nombre)

    /* hola
    Esto 
    es unas lineas */

    //editar = setters
    public void setEdad(int nuevoEdad){
        if(nuevoEdad>0) this.edad = nuevoEdad;
    }

    //lectura = getters
    public int getEdad(){
        return this.edad;
    }

    //lectura = getters
    public String getNombre(){
        return this.nombre;
    }

    //edicion del nombre no permitida
    private void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

}
