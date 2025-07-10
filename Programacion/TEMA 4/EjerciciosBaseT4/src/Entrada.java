import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Entrada {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //ejercicioUno();
        //ejercicioDos();
        //ejercicioTres();
        //ejercicioCuatro();
        //ejercicioCinco();
        //ejercicioSeis();
        //ejercicioSiete();
        //ArrayListUno();
        //ArrayListDos();
        //ArrayListTres();
        //ArrayListCuatro();
        //ArrayListCinco();
        //ArrayListSeis();
        //ArrayListSiete();
        //ArrayListOcho();
        //ArrayListNueve();
        ArrayListDiez();

    }
    /*
    *   ARRAYS
    * */
    /* Ejercicio1: Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
     se mostrará el contenido de ese array junto al índice (0 – 9
    */
    public static void ejercicioUno(){
        System.out.println("Dame 10 numeros y despues te los mostrare");
        int[] numero  = new int[10];
        /*for (int i = 0; i < numero.length; i++) {
            System.out.print("Dame el numero "+(i+1)+": ");
            numero[i] = teclado.nextInt();
        }
        System.out.println("Los numeros que has introducido son: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.println("El numero en la posicion "+i+" es: "+numero[i]);
        }*/
        // Sin tanto mensaje
        System.out.println("Introduce 10 números seguidos:");

        for (int i = 0; i < numero.length; i++) {
            numero[i] = teclado.nextInt(); // sin mensaje individual
        }

        System.out.println("\nContenido del array:");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]+ " ");
        }

    }


    /* Ejercicio 2: Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array.
     Una vez metidos, se deberá mostrar:
    - Numero de puntos obtenidos
    - Media de puntos obtenidos
    */
    public static void ejercicioDos(){
        System.out.println("Generando 30 números aleatorios entre 0 y 10...");
        int[] numeros = new int[30];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*10);
        }
        System.out.println("Imprimiendo los numeros generados");
        Arrays.sort(numeros);
        for (int item : numeros) {
            System.out.print(item+" ");
        }
    }

    /*Ejercicio 3: Escribe un programa que lea 10 números por teclado, los guarde en un array y que luego los muestre:
    - en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    - en orden normal, es decir, el primero que se muestra es el primero que se ha introducido */
    public static void ejercicioTres(){
        System.out.println("Dame 10 numeros y despues te los mostrare");
        int[] numero  = new int[10];
        for (int i = 0; i < numero.length; i++) {
            
            numero[i] = teclado.nextInt();
        }
        System.out.println("Los numeros que has introducido son: ");
        for (int i = numero.length-1; i >= 0; i--) {
            System.out.println(numero[i]);
        }
    }

    /*Ejercicio 4: Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
    Carga el array numero con valores aleatorios entre 0 y 100.
    - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
    - En el array cubo se deben almacenar los cubos de los valores que hay en numero.
    Una ver realizado lo anterior muestra el contenido de los tres arrays dispuesto en tres columnas.*/
    public static void ejercicioCuatro(){
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int)(Math.random()*100);
            cuadrado[i] = numero[i]*numero[i];
            cubo[i] = numero[i]*numero[i]*numero[i];
        }
        System.out.printf("%-10s,%-10s,%-10s\n", "Numero", "Cuadrado", "Cubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%-10d%-10d%-10d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }

    /* Ejercicio 5:Realiza un programa que pida 8 números enteros, los guarde en un array y que luego muestre esos
     números junto con la palabra “par” o “impar” según proceda. */
    public static void ejercicioCinco(){
        System.out.println("Dame 8 numeros y te dire si son pares o impares");
        int[] numero  = new int[8];
        for (int i = 0; i < numero.length; i++) {
            numero[i] = teclado.nextInt();
        }
        System.out.println("Los numeros que has introducido son: ");
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i]+" es par");
            } else {
                System.out.println(numero[i]+" es impar");
            }
        }
    }

    /*Ejercicio 6:2. Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30.
    Una vez hecho esto realizará las siguientes operaciones:
    - modificar todos los 6 por 8
    - modificar todos los 7 por 15
    - modificar todos los 20 por 10
Al finalizar el programa deberá indicar cuántas modificaciones se han realizado. */
    public static void ejercicioSeis(){
        int [] numeros = new int[20];
        int numeroCambio = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*31);
        }
        mostrarArray(numeros);
        for (int i = 0; i < numeros.length; i++) {
            // 6 por 8
            if(numeros[i] == 6){
                numeros[i] = 8;
                numeroCambio++;
            }
        }
        mostrarArray(numeros);
        for (int i = 0; i < numeros.length; i++) {
            // 7 por 15
            if(numeros[i] == 7 ){
                numeros[i] = 15;
                numeroCambio++;
            }
        }
        mostrarArray(numeros);
        for (int i = 0; i < numeros.length; i++) {
            // 20 por 10
            if(numeros[i] == 20){
                numeros[i] = 10;
                numeroCambio++;
            }
        }
        mostrarArray(numeros);

        System.out.println("El numero de cambios realizados es: " + numeroCambio);
    }
        public static void mostrarArray(int[] array) {
            System.out.println("Estos son los numeros generados");
            for (int item : array) {
                System.out.print(item + " ");
            }
                    System.out.println("");
        }

    /*Ejercicio 7:Crea un programa que pida 10 palabras por consola y las guarde en un array de String. Una vez
    hecho esto saldrá un menú que me dará las siguientes opciones:
    - Ver todas las palabras: mostrarla todas las palabras del array
    - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
    - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
    - Ver media de letras: mostrará el número medio de letras entre todas las palabas
    - Ver palabra con más letras
    - Ver palabra con menos letras */
    public static void ejercicioSiete(){
        System.out.println("Introduce 10 palabras seguidas:");
        String[] palabra = new String[10];

       /* for (int i = 0; i < palabra.length; i++) {
            palabra[i] = teclado.nextLine();
        }*/
        int opcion = 0;
       /* do {
            System.out.println("Elige una opcion: ");
            System.out.println("1. Ver todas las palabras");
            System.out.println("2. Obtener una palabra al azar");
            System.out.println("3. Ver número de letras");
            System.out.println("4. Ver media de letras");
            System.out.println("5. Ver palabra con más letras");
            System.out.println("6. Ver palabra con menos letras");
            System.out.println("7. Salir");
            opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("estas son las palabras introducidas");
                for (int i = 0; i < palabra.length; i++) {
                    System.out.println(palabra[i]);
                }
                break;
            case 2:
                System.out.println("Palabra aleatoria: ");
                System.out.println(palabra[(int)(Math.random()*10)]);
                break;
            case 3:
                System.out.println("Numero de letras: ");
                int contador = 0;
                for (int i = 0; i < palabra.length; i++) {
                    contador += palabra[i].length();
                }
                System.out.println("El numero de letras es: "+contador);
                break;
            case 4:
                System.out.println("Media de letras: ");
                int media = 0;
                for (int i = 0; i < palabra.length; i++) {
                    media += palabra[i].length();
                }
                System.out.println("La media de letras es: "+media/palabra.length);
                break;
            case 5:
                System.out.println("Palabra con mas letras: ");
                String palabraMasLarga = "";
                for (int i = 0; i < palabra.length; i++) {
                    if (palabra[i].length() > palabraMasLarga.length()) {
                        palabraMasLarga = palabra[i];
                    }
                }
                System.out.println("La palabra mas larga es: "+palabraMasLarga);
                break;
            case 6:
                System.out.println("Palabra con menos letras: ");
                String palabraMasCorta = "";
                for (int i = 0; i < palabra.length; i++) {
                    if(palabra[i].length() < palabraMasCorta.length()){
                        palabraMasCorta = palabra[i];
                    }
                }
                System.out.println("La palabra mas corta es: "+palabraMasCorta);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        }while(opcion != 7);*/

        // Correcion por el profesor
    do {

        System.out.println("1. Rellena");
        System.out.println("2. Aleatoria");
        System.out.println("3. Letras");
        System.out.println("4. Media letras");
        System.out.println("5. Palabra grande");
        System.out.println("6. Palabra pequeña");
        System.out.println("7. Salir");
        System.out.println("Introduce opcion:");
        opcion = teclado.nextInt();
        int numeroLetras=0;
        switch (opcion) {
            case 1:
                for (int i = 0; i < palabra.length; i++) {
                    System.out.println("Introduce palabra");
                    palabra[i] = teclado.next();
                }
                break;
            case 2:
                int posicionAleatoria = (int) (Math.random() * 10);
                System.out.println("La palabra aleatoria es " + palabra[posicionAleatoria]);
                break;
            case 3:
                // salte un aviso si no hay palabras introducidas
                if (palabra[0]==null){
                    System.out.println("No hay palabras ");
                } else {
                    for ( String item: palabra ) {
                        numeroLetras += item.length();
                    }
                    System.out.println("El numero de letras es "+numeroLetras);
                }
                break;
            case 4:
                if(numeroLetras==0){
                    System.out.println("no se han metido palabras");
                } else {
                    System.out.println("La media es: "+(double)numeroLetras/palabra.length);
                }
                break;
            case 5:
                // palabra más grande
                String palabraGrande = palabra[0];

                for (String item: palabra) {
                    if (item.length()>palabraGrande.length()){
                        palabraGrande = item;
                    }
                }
                break;
            case 6:
                String palabraPequenia = palabra[0];

                for (String item: palabra) {
                    if (item.length()<palabraPequenia.length()){
                        palabraPequenia = item;
                    }
                }
                break;
        }


    } while (opcion != 7);




        /*for (String item : palabras) {
            System.out.println(item);
        }*/
        }




    /*
    * ARRAYLIST
    * */
    /*ArrayList1:1. Crea un ArrayList de String y realiza las siguientes acciones
- Guarda manualmente 10 palabras
- Imprime por pantalla todas las palabras del arraylist */
    public static void ArrayListUno(){
        ArrayList<String> palabras = new ArrayList<>();
         // Añadri palabras manualmente
        palabras.add("hola");
        palabras.add("coche");
        palabras.add("avión");
        palabras.add("perro");
        palabras.add("sol");
        palabras.add("luna");
        palabras.add("montaña");
        palabras.add("mar");
        palabras.add("ciudad");
        palabras.add("pájaro");

        // Imprimir palabras
        System.out.println("Las palabras son: ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    /*ArrayList2 : Crea un ArrayList de numeros enteros que guarde valores aleatorios (entre 0 y 100).
    Una vez introducidos todos calcula la suma, la media, el máximo y el mínimo de esos números.*/
    public static void ArrayListDos(){
        ArrayList<Integer> numeros = new ArrayList<>();
        Random aleatorio = new Random();
        //int aleatorio2 =(int)Math.random()*100;

        // Rellenar con el arrayList
        for (int i = 0; i < 10; i++) {
            numeros.add(aleatorio.nextInt(101)); // Genera un número aleatorio entre 0 y 100
        }
        // Mostra los numeros
        System.out.println("Numeros generados: ");
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }

        // Calcular la suma, media, maximo y minimo
        int suma = 0;
        int maximo = numeros.get(0);
        int minimo = numeros.get(0);

        for (Integer numero : numeros) {
            suma += numero;
            if(numero > maximo){
                maximo = numero;
            }
            if(numero < minimo){
                minimo = numero;
            }
        }
        double media = (double) suma / numeros.size();

        // Mostrar resutaldos
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }

    /*ArrayList3:Crea un programa que cree un ArrayList con los nombres de todos los compañeros de clase.
    Una vez creado, sacará el nombre de uno de los compañeros (aleatorio) */
    public static void ArrayListTres(){
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Laura");
        nombres.add("Carlos");

        Random aleatorio = new Random();
        String compañeroAleatorio = nombres.get(aleatorio.nextInt(nombres.size()));

        System.out.println("Compañero aleatorio: " + compañeroAleatorio);
    }

    /*ArrayList4:Crea dos ArrayList de números y guarda de forma aleatorio 20 números sin decimales en cada uno de
     ellos. Una vez hecho esto comprueba cuantos números de los dos arraylist son iguales (mismo número en la misma
     posición). Tras hacer la comprobación indica cuantos números han sido iguales */
    public static void ArrayListCuatro(){
        ArrayList<Integer> numeros1 = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        Random aleatorio = new Random();

        // Llenar los ArrayList con números aleatorios
        for (int i = 0; i < 20; i++) {
            numeros1.add(aleatorio.nextInt(101));
            numeros2.add(aleatorio.nextInt(101));
        }
        //Mostrar los numeros generados
        System.out.println("ArrayList 1: " + numeros1);
        System.out.println("ArrayList 2: " + numeros2);

        //Comp`robar cuandos son iguales
        int contadorIguales = 0;
        for (Integer i : numeros1) {
            if(numeros2.contains(i)){
                contadorIguales++;
            }
        }
        System.out.println("Numeros iguales: " + contadorIguales);
    }

    /*ArrayList5: Crea un programa que cree un ArrayList de palabras, introduce en él 10 palabras cualquiera.
     Muestra el número de letras de todas las palabras, la palabra con más letras y la palabra con menos letra*/
    public static void ArrayListCinco(){
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("coche");
        palabras.add("avión");
        palabras.add("perro");
        palabras.add("sol");
        palabras.add("luna");
        palabras.add("montaña");
        palabras.add("mar");
        palabras.add("ciudad");
        palabras.add("pájaro");

        // Mostrar el numero de letras de todas las palabras
        for (String palabra : palabras) {
            System.out.println(palabra + " -> " + palabra.length() + " letras");
        }

        // palabra con mas letra
        String palabraMasLarga = palabras.get(0);
        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }

        }
        String palabraMasCorta = palabras.get(0);
        for (String palabra : palabras) {
            if(palabra.length() < palabraMasCorta.length()){
                palabraMasCorta = palabra;
            }
        }
        System.out.println("Palabra con mas letras: " + palabraMasLarga);
        System.out.println("palabraMasCorta = " + palabraMasCorta);
    }

    /*ArrayList6: Crea un programa que permita meter una lista de coches, donde cada coche consta de marca (String),
    modelo (String) y caballos (int). Mete tres coches manualmente*/
   /* public static void ArrayListSeis(){
        String marca;
        String modelo;
        int caballos;

        ArrayList<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Coche("Ford", "Focus", 100));
        listaCoches.add(new Coche("Audi", "A4", 150));
        listaCoches.add(new Coche("BMW", "X5", 200));

        for (Coche coche : listaCoches) {
            System.out.println("Marca: " + coche.marca + "\tModelo: " + coche.modelo + "\tCV: " + coche.caballos);
        }
    }*/
    public static class Coche {
        String marca;
        String modelo;
        int caballos;
        int matricula;

        public Coche(String marca, String modelo, int caballos, int matricula) {
            this.marca = marca;
            this.modelo = modelo;
            this.caballos = caballos;
            this.matricula = matricula;
        }
    }




    /*ArrayList7: Modifica el ejercicio anterior para que una vez metodos los coches se listen todos con el siguiente
    formato: "Modelo: Ford	Marca: Focus	CV: 100" EN EL ANTERIOR YA HICE ESTE TAMBIEN */
    /*public static void ArrayListSiete(){
        String marca;
        String modelo;
        int caballos;

        ArrayList<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Coche("Ford", "Focus", 100));
        listaCoches.add(new Coche("Audi", "A4", 150));
        listaCoches.add(new Coche("BMW", "X5", 200));

        for (Coche coche : listaCoches) {
            System.out.println("Marca: " + coche.marca + "\tModelo: " + coche.modelo + "\tCV: " + coche.caballos);
        }
    }*/

    /*ArrayList8: Modifica el ejercicio anterior para que pida por teclado una marca y muestre por consola todos
    los coches que sean de la marca introducida */
    public static void ArrayListOcho(){
        String marca;
        String modelo;
        int caballos;

        ArrayList<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Coche("Ford", "Focus", 100, 1234));
        listaCoches.add(new Coche("Audi", "A4", 150, 2345));
        listaCoches.add(new Coche("BMW", "X5", 200,6577));
        listaCoches.add(new Coche("Ford", "Fiesta", 95,123456));
        listaCoches.add(new Coche("Audi", "Q7", 286, 87654));

        System.out.println("Introduce la matricula que quieres buscar: ");
        String matriculaBuscada = teclado.nextLine();
        boolean encontrado = false;

        for (Coche coche : listaCoches) {
            if (coche.marca.equalsIgnoreCase(matriculaBuscada)) {
                System.out.println("Marca: " + coche.marca + "\tModelo: " + coche.modelo + "\tCV: "
                        + coche.caballos+ "\tmatricula: "+ coche.matricula);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No se han encontrado coches de la marca " + matriculaBuscada);
        }
    }

    /*ArrayList9:Modifica el ejercicio anterior para que pida por teclado una matricula y muestre el coche con
    todos los datos. */
    public static void ArrayListNueve(){
        String marca;
        String modelo;
        int caballos;
        int matricula;

        ArrayList<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Coche("Ford", "Focus", 100, 1234));
        listaCoches.add(new Coche("Audi", "A4", 150, 2345));
        listaCoches.add(new Coche("BMW", "X5", 200,6577));
        listaCoches.add(new Coche("Ford", "Fiesta", 95,123456));
        listaCoches.add(new Coche("Audi", "Q7", 286, 87654));

        System.out.println("Introduce la marca que quieres buscar: ");
        String marcaBuscada = teclado.nextLine();
        boolean encontrado = false;

        for (Coche coche : listaCoches) {
            if (coche.marca.equalsIgnoreCase(marcaBuscada)) {
                System.out.println("Marca: " + coche.marca + "\tModelo: " + coche.modelo + "\tCV: "
                        + coche.caballos+ "\tmatricula: "+ coche.matricula);
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No se han encontrado coches de la marca " + marcaBuscada);
        }
    }

    /*ArrayList10:Crea un programa que permita realizar las funcionalidades de los ejercicions 5, 6 y 7 mediante un menú */
    public static void ArrayListDiez() {

        ArrayList<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Coche("Ford", "Focus", 100, 1234));
        listaCoches.add(new Coche("Audi", "A4", 150, 2345));
        listaCoches.add(new Coche("BMW", "X5", 200, 6577));
        listaCoches.add(new Coche("Ford", "Fiesta", 95, 123456));
        listaCoches.add(new Coche("Audi", "Q7", 286, 87654));

        System.out.println("Bienvenido");

        int opcion;
        do {
            System.out.println("------MENU-----");
            System.out.println("1. Lista de todos los vehiculos. ");
            System.out.println("2. Lista modelo de coches.");
            System.out.println("3. Marca de coche.");
            System.out.println("4. Salir.");
            System.out.println("Elige una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" Lista de todos los coches. ");
                    for (Coche coche : listaCoches) {
                        System.out.println("Marca: " + coche.marca + "\tModelo: " + coche.modelo + "\tCV: "
                                + coche.caballos + "\tmatricula: " + coche.matricula);
                    }
                    break;
                case 2:
                    System.out.println("Lista de modelos de coches: ");
                    for (Coche coche : listaCoches) {
                        System.out.println("Modelo: " + coche.modelo);
                    }
                    break;
                case 3:
                    System.out.println("Introduce la marca que quieres buscar: ");
                    String marcaBuscar = teclado.next();
                    boolean encontrado = false;
                    for (Coche coche : listaCoches) {
                        if(coche.marca.equalsIgnoreCase(marcaBuscar)){
                            System.out.println("Marca: " + coche.marca);
                            encontrado = true;
                        }
                    }
                    if(!encontrado){
                        System.out.println("No se han encontrado coches de la marca " + marcaBuscar);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 4);

    }
    public static void mostrarCoches(){
        ArrayList<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Coche("Ford", "Focus", 100, 1234));
        listaCoches.add(new Coche("Audi", "A4", 150, 2345));
        listaCoches.add(new Coche("BMW", "X5", 200, 6577));
        listaCoches.add(new Coche("Ford", "Fiesta", 95, 123456));
        listaCoches.add(new Coche("Audi", "Q7", 286, 87654));
        System.out.println(listaCoches);


    }
}
