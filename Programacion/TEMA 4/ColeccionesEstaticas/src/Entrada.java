public class Entrada {

    public static void main(String[] args) {
        // queriamos tener una variable antes
        int numero = 5;
        String palabra ="asdj";
        // Pero si queremos que tenga mas datos creamos una array y tenemos 2 opciones
        // 1º opcion es crear conjunto de posiciones
        //int [] numeros = new int [10 ];// el 10 reserva las posiciones
        // 0 0 0 0 0 0 0 0 0 0 -> y son ceros porque son int
        // si fuera String null null null null null null null null null null
        // si fuera boolean Fallse False False False False False False False False False

        // 2ª opcion diciendole que son 10 huecos pero en cada hueco tiene un valor. abrimos llaves y decimos que tiene
        // en cada posicion.
        int [] numerosDatos = new int []{2,5,8,10,20,21};
                                     //  0 1 2 3  4   5  -> posiciones
        // 2 5 8 10 20 21 -> array donde en cada posicion un valor, primitivo o complejo
        //String [] palabras = new String []{"ASD","asfsf","AFSD"};

        // Mas de un dato la clase generica
        //Object[] palabrasGenericas = new Object[]{"ASD", "Asg",2,4, true,'a',0.9};

        // Obtener  cuantos elementos tiene
        int tamanio = numerosDatos.length; // 6
        System.out.println("La longitud del array es: " + tamanio);// consola -> la longitud del array es 6

        // obtener el valor de una posicion
        int valor = numerosDatos[0]; //
        System.out.println("El valor de la posicion 0 es: " + valor); // consola -> El valor de la posicion 0 es: 2

        // para sacar la longitud del array
        //int valorUltimo = numerosDatos[numerosDatos.length]; // -> mostrara la longitud del array
        //System.out.println("La longitud del array es: " + valorUltimo); // consola -> La longitud del array es: 5

        // Para obtener el ultimo valor del arra
        int valorUltimo2 = numerosDatos[numerosDatos.length - 1]; // -> mostrara el ultimo valor del array
        System.out.println("El valor de la ultima posicion  es: " + valorUltimo2); // consola -> El valor de la ultima posicion  es: 21

        // Preguntar si una posicion es incroncreto, si es igual == a algo
        if(numerosDatos[0]==1){// -> si pusieramos otro valor en vez del 0 ya diria que no y pasaria al else
            System.out.println("Posicion coincide");
        }else {
            System.out.println("No coincide");
        }
        // Asignar un valor en una posicion 2,5,8,10,20,21-> el 5 por el 20
        numerosDatos[1] = 20; // -> en la posicion 1 le asignamos el valor 20
        numerosDatos[0] = 40; // -> en la posicion 0 le asignamos el valor 40
        numerosDatos[2] = 90; // -> en la posicion 2 le asignamos el valor 90

        valor = numerosDatos[2];
        System.out.println("El valor de la posicion 2 es: " + numerosDatos[2]); // consola -> El valor de la posicion 2 es: 90
        //  System.out.println("El valor de la posicion 2 es: " + valor);

        // Algo que no podria hacer
        //numerosDatos[6]=80; // -> no se puede porque no existe la posicion 6, daria error bound

        // Como sacar todos los elementos del array
        for (int i = 0; i < numerosDatos.length; i++) {  // Si fuera menor o igual <= numerosDatos.lenght -1
            System.out.println(numerosDatos[i]);// -> ponemos i que es la variable que cambia
        }
        int valorAhora = numerosDatos[numerosDatos.length-1];
        System.out.println("El valor de la longitud del array es: " + valorAhora); // consola -> El valor de la longitud del array es: 21

        // Asignar de forma recurrente valores a un array
        int [] numeros = new int [10 ];
        // 0 0 0 0 0 0 0 0 0 0 quiero de forma aletoria que en cada posicion se ponga uno
        System.out.println("Rellenando el array");
        for (int i = 0; i < numeros.length; i++) {// DESPUES DEL METODO DIGO
            int aleatorio;
            do{
                aleatorio = (int)(Math.random()*21)+1;// +1 Empezara en vez de en 0 en 1
            }while(estaNumero(aleatorio, numeros));
            //int aleatorio = (int)(Math.random()*21);// -> Numero que quiero guardar
            numeros[i] = aleatorio; // -> antes de guardarlo
            // -> entre 0 y 20 pondra un valor aleatorio
            // 1 0 0 0 0 0 0 0 0 -> que guarde un valor aleatorio y no pueda repetir -> con contains
            // podria hacerlo aqui o con un metodo. el metodo es -> estaNumero
        }
        System.out.println("Mostrando el contenido del array");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }

        // Generar aleatorios en el bingo
           // una vez generados Comprobar si esta en el carton
        // Volver a generar, repetir hasta que la cuenta de aciertos del carton sea 10

        // ARRAY MULTIDIMENSIONAL -> INT [][] FILAS COLUMNAS
        int [][] carton = new int [3][5];
        /*
        * 0 0 0 0 0
        * 0 0 0 0 0
        * 0 0 0 0 0
        * */
        // carton [1][2] = 0; -> asigno un valor
        // carton [1][2] == -> es igual a .....
        // definir un carton con datos
        int [][] cartonDatos = {{1,2,3},{4,5,6},{7,8,9}};
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9  -> y un for dentro de otro for recorro filas y columnas
         * */

    }
    // Metodo para comprobar si un numero ya existe en el array
    public static boolean estaNumero(int numeroEvaluar, int[] array){
        //                                           Referemcia
        for (int i = 0; i < array.length; i++) {
            if(array[i]==numeroEvaluar){
                return true;
            }
        }
        return false; // o true
    }
}
