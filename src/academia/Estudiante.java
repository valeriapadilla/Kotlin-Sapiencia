package academia;

public class Estudiante {

    protected String estudiar(String materia){
        String accion = "Estudiando " + materia;
        return accion;
    }

    public boolean verificarMateria(double[] notas){
        int cantidadNotas = notas.length;

        //vamos a calcular el promedio para saber si gana o pierde
        double resultado = calcularNotaFinal(notas,cantidadNotas);

        //si es > a 3.5 gana si es menor pierde
        //if(si resultado es mayor o igual a 3.5){

        if(resultado >= 3.5){
            //si es verdadero entra aqui
            System.out.println("Felicidades \n Gano la materia");
            return true;
        }else{
            System.out.println("Repite materia, llorela");
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
