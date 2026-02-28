package academia;

import java.util.ArrayList;
import java.util.Random;

public class Docente extends Persona {
    //atributos
    private int id; //atributo, linea de creacion de una variable
    //private String nombre;
    public String asignatura;
    public String telefono;
    private String direccion;
    //private int edad;
    private double salario;
    public ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

    //un objeto para calcular el id
    Random aleatorio = new Random();

    //constructor
    public Docente(String nombre, String asignatura, String telefono, int edad){
        // this.nombre = nombre;
        super(nombre, edad);
        this.asignatura = asignatura;
        this.telefono = telefono;

        //queremos que el id sea un numero aleatorio (Random) entre 0 y 100
        this.id = aleatorio.nextInt(101);
    }

    //get - lectura (obtener informacion)
    //set - dar un nuevo valor (modificar informacion)

    //getter

    public int getId(){
        return this.id;
    }

    //setters
    private void setId(int id){
        this.id = id;
    }

    //metodos o funciones
    public void agregarEstudiante(String nombre, int edad){
        Estudiante est1 = new Estudiante(nombre,edad);
        listaEstudiantes.add(est1);
    }

    public void evaluarEstudiante(int index, double nota){
        //publica la nota al estudiante - el profesor
        listaEstudiantes.get(index).obtenerNota(nota);
    }

}
