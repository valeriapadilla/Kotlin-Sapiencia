package academia;

import java.util.ArrayList;

public class Docente {

    public String id;
    public String nombre;
    public String asignatura;
    public String telefono;
    private String direccion;
    private double salario;

    public ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    
    public void agregarEstudiante(String nombre, int edad){
        Estudiante est1 = new Estudiante();
        est1.edad = edad;
        est1.nombre = nombre;

        listaEstudiantes.add(est1);
    }

    public void evaluarEstudiante(int index, double nota){
        //publica la nota al estudiante - el profesor
        listaEstudiantes.get(index).obtenerNota(nota);
    }






}
