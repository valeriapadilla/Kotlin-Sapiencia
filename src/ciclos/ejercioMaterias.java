package ciclos;
import java.util.Scanner;

public class ejercioMaterias {
    public static void main(String[] args) {
        //aqui escribos el codigo
        
        //Un profesor quiere registrar las notas 
        //de varios estudiantes en varias materias, 
        //calcular el promedio de cada estudiante y mostrar sus resultados.

        // 1. Preguntarle al profesor la cantidad de estudiantes
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual es la cantidad de estudiantes de la clase?");
        int estudiantes = entrada.nextInt();

        // 2. Preguntarle al profesor la cantidad de materias
        System.out.println("Cual es la cantidad de materias que ven los estudiantes?");
        int materias = entrada.nextInt();


        // 3. ir por cada estudiantes 
        // 4. por cada materia preguntar que nota tiene
        // 5. Calcular el promedio
        // 6. Mostrar su promedio
        System.out.println("------------------------------- \n");
        for(int i = 1; i <= estudiantes; i++){
            double suma = 0;
            double promedio = 0;

            // for(int j = 1; j <= materias; j++){
            //     System.out.println("Coloque la nota de la materia " + j + " Para el estudiante " + i);
            //     double nota = entrada.nextDouble();
            //     suma += nota;
            //     // esto es igual a la linea de arriba suma = suma + nota;
            // }

            //En una sola entrada captura todas las notas de las materias
            System.out.println("Escriba las notas de cada materia para el estudiante " + i +
            "(Ingrese las notas separadas por espacio)");
            String notas = entrada.nextLine(); //"4 3 5"

            String[] numeros  = notas.split(" "); // ["4","3","5"]
            for(int j=0; j<numeros.length;j++){
                //como convertir un string a un double
                double num = Double.parseDouble(numeros[j]);
                suma += num; //suma = suma + num
            }
            promedio = suma / materias;
            System.out.println("El promedio del estudiante " + i + " es " + promedio);
        }

    }
}
