import java.util.Arrays;

public class Entrada {
    public static void main(String[] args) {

        /*String[] palabras = new String[10]; // Definimos un array con un valor de 10 huecos
        // esto guarda 0 - 9 -> null, null, null, null, null, null, null, null, null, null

        String[] palabrasValores = new String[]{"palabra1", "palabra2", "palabra3"}; // Podemos verlo asi o sin el newString[]
        String[] palabrasValores1 = {"palabra1", "palabra2", "palabra3"}; // directo con los valores
        // 0 - 2 -> palabra1, palabra2, palabra3

        int[] aciertos = new int[10]; // Definimos un array con un valor de 10 huecos
        // 0 - 9 -> 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 primitivos

        boolean [] aciertosValores = new boolean[5];*/
        // false , false, false, false, false

        // Ejercicios. Rellenar un array de 10 posiciones con numeros aleatorios.
        // Math.random () * 21; 0- 20
        /*System.out.println("Generando los numeros");
        int [] numerosGenerados = new int [10];
        for (int i = 0; i < numerosGenerados.length; i++) { // si ponemos el lenght lo hace automaticamente
            numerosGenerados[i] = (int)(Math.random () * 21);
        }
        System.out.println("Imprimiento numeros");*/
        // sacar todos los numeros generados sacado por consola
        // for -> cuando la i (indice es muy relevante para el resultado) o tambien si quiero utilizar el for para
        // modificar el array
        /*for (int i = 0; i < numerosGenerados.length; i++) {
            System.out.print(numerosGenerados[i]);
        }*/
        // con el if sacaremos solo los numeros pares
        /*for (int i = 0; i < numerosGenerados.length; i++) {
            if (i % 2 == 0){
                System.out.printf("El numero en la posicion %d es %d\n", i, numerosGenerados[i]);
            }

        }*/
        // o con un for each
        // Si lo que quiero ees recorrer el array y obtener sus elementos
        // posiciones pares con un int intento
        /*int intento = 0;
        for (int item : numerosGenerados) {
            if (intento % 2 == 0){
                System.out.print(item+",");
            }
            intento ++;
        }*/

        // Como ordenarlos
        System.out.println("Generando los numeros");
        int [] numerosGenerados = new int [10];
        for (int i = 0; i < numerosGenerados.length; i++) { // si ponemos el lenght lo hace automaticamente
            numerosGenerados[i] = (int)(Math.random () * 21);
        }
        System.out.println("Imprimiento numeros");
        Arrays.sort(numerosGenerados);
        for (int item : numerosGenerados) {
                System.out.print(item+" ");
        }
        System.out.println("");

        // Mover de un array 1 2 3 4 5 6 7 8 9  a 2 3 4 5 6 7 8 9 1
        // Moviendo el array a la izquierda
       /* int axuliar = numerosGenerados[0]; // guardamos el primer elemento
        for (int i = 0; i < numerosGenerados.length - 1; i++) { // se pone un menos 1 para que pare justo cuando llegue al ultimo
            numerosGenerados[i] = numerosGenerados[i+1]; // suma una posicion mas y coge para el siguiente
        }
        // aqui diremos dende va el primero numero generado, al final
        numerosGenerados[numerosGenerados.length-1] = axuliar; */
        // Ahora rotando al contrario el ultimo pasa al primero
       /* int aux = numerosGenerados[numerosGenerados.length-1];
        for (int i = numerosGenerados.length - 1; i > 0 ; i--) { // >= 1 o >0 para que cuando llegue al ultimo de la izquierda no salte error
            numerosGenerados[i] = numerosGenerados[i - 1];

        }
        numerosGenerados[0] = aux; // el ultimo pasa a ser el primero*/
       /* // 0 1 2 3 4 5 6 7 8 9 Rotamos por pares
        // 1 0 3 2 5 4 7 6 9 8
        for (int i = 0; i < numerosGenerados.length; i+=2) {
            int aux = numerosGenerados[i]; // guardamos el primer elemento
            numerosGenerados[i] = numerosGenerados[i+1];
            numerosGenerados[i+1] = aux;
        }
        */

        // 0 1 2 3 4
        // 4 3 2 1 0 invertimos el array

        //[0 - 2)
        // 0 -> posicion 0 con el de la posicion lenght -1
        // 1 -> posicion 1 con el de la posicion lenght -2
        // 2- > posicion 2 con el de la posicion lenght -3
        for (int i = 0; i < numerosGenerados.length / 2; i++) {
            int aux = numerosGenerados[i];
            // El numero 1 y ultimo se cambian de posicion
            //numerosGenerados[i] = numerosGenerados[numerosGenerados.length - 1];
            //numerosGenerados[numerosGenerados.length - 1] = aux;
            // i = 1 -> Rota todo desde modo espejo
            numerosGenerados[i] = numerosGenerados[numerosGenerados.length - 1 -i];
            numerosGenerados[numerosGenerados.length - 1 -i] = aux;
            // i =
        }

        System.out.println("Rotando numeros");
        for (int item : numerosGenerados) {
                System.out.print(item+" ");
        }
        // lo malo que el de la primera posicion desaparece no vuelve al final. Lo guardamos int auxiliar linea 66











    }
}
