package academia;

public class Escuela {
    public static void main(String[] args) {
        
        Estudiante tecnologo = new Estudiante();

        String resultado = tecnologo.estudiar("Ingles");

        System.out.println(resultado);

        double[] notasFinales = {2.3,3,5,1.2,2,1,2.5};

        boolean finalSemestre = tecnologo.verificarMateria(notasFinales);

        if(finalSemestre == true){
            System.out.println("Felicidades \n Gano la materia");
        }else{
            System.out.println("Repite materia, llorela");
        }


        Estudiante primaria = new Estudiante();

        primaria.nombre = "Maria";
        primaria.edad = 10;

        //nueva escuela

        Docente quimico  = new Docente();

        quimico.nombre = "julian";
        quimico.asignatura = "Quimica";
        quimico.id = "9395";
        quimico.telefono = "1111";

        quimico.agregarEstudiante("Natalia",18);
        quimico.agregarEstudiante("Carlos",20);
        quimico.agregarEstudiante("Felipe", 20);

       quimico.evaluarEstudiante(0, 3.5);

    }

}
