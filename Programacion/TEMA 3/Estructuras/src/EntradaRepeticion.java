import java.util.Scanner;

public class EntradaRepeticion {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // estructuraFor();

        // estructuraWHILE();

        // estructuraDOWHILE();

        // ejecucionMENU();
    }

    public static void estructuraFor(){
        //[i=0, i=4] // 0,1,2,3,4,5xxxxx
        // introduce 10numeros por teclado y sca el sumatorio de todos ellos
        // saca la media de los numeros introducidos son pares
        /*int numeroPares=0;
        int sumatorio = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <10; i++){
            System.out.println("Introduce numero");
            int numero = scanner.nextInt();
            sumatorio += numero;
            // Cuantos de los numeros introducidos son pares
            if (numero % 2 == 0){
                numeroPares++;
              }
          }

          System.out.println("La suma de todos los numeros es: " + sumatorio);
        System.out.println("El numero medio es: " + (double) sumatorio / 10);
        System.out.println("El numero de pares es: "+numeroPares);
         */

        // tabla de multiplicar del 8
        /*
        for (int i = 0; i < 11; i++){
            int resultado = i*8;
            System.out.printf("%d * %d = %d\n", 8,i,8*i);
        }*/


        // Todas las tablas de multiplicar
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.printf("%d * %d = %d\n",j,i,j*i);
            }
        }

        System.out.println("Introduce el numero con el que juegas");
        int numero = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
              int aleatorio = (int)(Math.random()*30);
            System.out.println(aleatorio); // Saca por consola los aleatorios que genera
              if(numero == aleatorio){
                  System.out.println("Numero adivinado");
              }

        }

    }

    private static void estructuraWHILE(){
        // repite mientras se cumpla la condiciones
        int nota = scanner.nextInt();

        while (nota<0 || nota>10){
        System.out.println("Dime una nota ");
            nota = scanner.nextInt();
        }
        System.out.println(nota);

      /*  // while -> mientras.....repite
        int nota = 4;
        while(nota>0){
            System.out.println("Ejecutando");
            System.out.println("La nota es "+nota);
            // para que no sea bucle infinito: que la condicion se modifique
            // para que la nota llegue a cero y deje el bucle nota--; (Decimos que cada vez que ejecute reste 1)
            nota--;
        }*/
    }

    private static void estructuraDOWHILE(){
        // primero ejecuta algo
        // pregunta si la condicion de repeticion se cumple
        int nota;
        do{
            System.out.println("Introduce una nota");
            nota= scanner.nextInt();
        }while(nota>0 || nota>10);
    }

    private static void ejecucionMENU(){
        // Ejecucion cajero automatico
        /*
        * 1- Ingresar
        * 2- sacar
        * 3- consultar
        * 4- salir
        * que quieres hacer
        * */
        int opcion =0;
        do{
            System.out.println("1. Ingresar.");
            System.out.println("2. Sacar.");
            System.out.println("3. Consultar.");
            System.out.println("4. Salir");
            System.out.println("¿Que quieres hacer?");
            // Recogemos la opcion con un scanner
            opcion = scanner.nextInt();
            // Ahora el switch
            switch (opcion){
                case 1:
                    System.out.println("Te dispones a ingresar dinero");
                    break;
                case 2:
                    System.out.println("Te dispones a sacar dineron.");
                    break;
                case 3:
                    System.out.println("Consultando saldo");
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion incorrecta, intentalo de nuevo");
            }

        }while(opcion !=4); // Si marca la opcion de salida
    }
}
