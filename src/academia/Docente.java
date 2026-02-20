package academia;

import java.util.ArrayList;

public class Docente {

    public int id; //atributo, linea de creacion de una variable
    public String nombre;
    public String asignatura;
    public String telefono;
    private String direccion;
    private double salario;
    public ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

    // public Docente(String nombre, String asignatura, String telefono){
    //     this.nombre = nombre;
    //     this.asignatura = asignatura;
    //     this.telefono = telefono;

    //     //this.id;
    // }

    public void agregarEstudiante(String nombre, int edad){
        Estudiante est1 = new Estudiante(nombre,edad);

        listaEstudiantes.add(est1);
    }

    public void evaluarEstudiante(int index, double nota){
        //publica la nota al estudiante - el profesor
        listaEstudiantes.get(index).obtenerNota(nota);
    }

}
