package funciones;

public class Calculadora {
    public static void main(String[] args) {
        int edad1 = 21;
        int edad2 = 30;
        int edad3 = 40;
        int edad4 = 20;

        System.out.println(promedio(edad1,edad2,edad3,edad4));

    }

    public static int promedio(int numero1,int numero2,int numero3, int numero4 ){
        //calcular el promedio
        int promedio = (numero1+numero2+numero3+numero4) / 4;

        //retornar el resultado
        return promedio;
    }
}
