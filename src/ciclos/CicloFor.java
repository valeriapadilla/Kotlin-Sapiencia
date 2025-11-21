package ciclos;

public class CicloFor {
    public static void main(String[] args) {
        //inicializacion, condicion, actualizacion
        for(int i = 1; i < 10; i++){ 
            System.out.println(i); // esta linea se ejecuta 9 veces
        }

        for(int i = 1; i <= 20; i++){ 
            if(i%2 == 0){ 
                System.out.println(i); // esta linea se ejecuta solo si i es un numero par
            }
        }
        //ciclo anidada
         for(int i = 1; i <= 20; i++){ 
            for(int j = 1; j <= 20; j++){ 
                //logica aqui
            }
        }
    }
}
