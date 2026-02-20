package academia;
import java.util.ArrayList;

public class Estudiante {

    //atributos
    public String nombre;
    public int edad;
    private ArrayList<Double> notas = new ArrayList<Double>();

    //constructor
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodos o funciones
    protected String estudiar(String materia){
        String accion = "Estudiando " + materia;
        return accion;
    }

    void obtenerNota(double nota){
        notas.add(nota);
    }

    public boolean verificarMateria(double[] notas){
        int cantidadNotas = notas.length;

        double resultado = calcularNotaFinal(notas,cantidadNotas);

        if(resultado >= 3.5){
            return true;
        }else{
            return false;
        }
    }

    private double calcularNotaFinal(double[] notas, int cantidad){
        double suma = 0;

        for(int nota=0; nota < cantidad; nota++){
            //suma += notas[nota];
            suma = suma + notas[nota];
        }

        return suma / cantidad;
    }



}
