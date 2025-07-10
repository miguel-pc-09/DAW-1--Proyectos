import java.util.*;

public class Entrada {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //MultiplicarArray1();
        //MayorArray1();
        //SumaArrays();
        //PosicionesArray1();
        //operacionesArray1();
        //arrayNoRepetidos1();
        //generadorPalabras1();
        //ahorcadoArray();
        //invisibleArray();
        menuArray();
    }
    /*1. Crear un array de 5 posiciones:
    - se le pedirá al usuario que introduzca cada unos de los elementos del array
    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
    - Saca por consola la suma de todos los números
    - Saca la media de todos los elementos*/
    public static void MultiplicarArray1(){
        int [] numeros = new int [5]; // array 5 posiciones

        // pedimos al usuario que introduzca los 5 elementos del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // multiplicamos cada elemento por 2 y lo guardamos de nuevo
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * 2; // o numeros[i] *= 2;
        }

        // Calculamos la suma de todos los elementos
        int suma =0;
        for (int numero : numeros) {
            suma += numero;
        }

        // Calculamos la media
        double media = (double)suma / numeros.length;
        // mostramos los resutlados por consola
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media de los números es: " + media);
    }

    /*2.  Crea una aplicación que realice lo siguiente:
    - pida por pantalla la longitud del array de enteros
    - crea el array de enteros con la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - saque por pantalla el elemento mayor y el elemento menor*/
    public static void MayorArray1(){
        // Pedir al usuario la longuitud
        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();
        //Guardamos la longitud
        int[] numeros = new int[longitud];
        //Pedir los valores del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        // Inicializamos el mayor y menor
        int mayor = numeros[0];
        int menor = numeros[0];
        // buscamos el mayor y menor
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        // mostramos resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }

    /*3.  Crear una aplicación que:
    - pida la longitud de dos arrays de enteros
    - crea los array de enteros con las longitudes introducidas
    - rellena ambos arrays con números aleatorios
    - crea un tercer array de la misma longitud que los dos anteriores
    - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)*/
    public static void SumaArrays(){
        Random random = new Random();
        // Pedir al usuario la longuitud 1 array
        System.out.println("Introduce la longitud del primer array: ");
        int longitud1 = teclado.nextInt();
        // Pedir al usuario la longuitud 2 array
        System.out.println("Introduce la longitud del segundo array: ");
        int longitud2 = teclado.nextInt();
        // Verificamos que los arrays sean de la misma longitud
        if(longitud1 != longitud2){
            System.out.println("Los arrays deben ser de la misma longitud");
            return;
        }
        // Crea los arrays
        int [] array1 = new int[longitud1];
        int [] array2 = new int[longitud2];
        int [] array3 = new int [longitud1];
        // Rellenamos los arrays con numeros aleatorios
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(101);
            array2[i] = random.nextInt(101);
        }
        // Rellenar array 3 con la suma de los dos anteriores
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        // Mostramos los resultados
        System.out.println("Array 1: ");
        for (int i : array1) {
            System.out.println(i + " ");
        }
        System.out.println("Array 2: ");
        for (int i : array2) {
            System.out.println(i + " ");
        }
        System.out.println("Array 3: ");
        for (int i : array3) {
            System.out.println(i + " ");
        }
    }

    /*4. Crea una aplicación que:
    - pida por teclado la longitud de un array
    - cree el array de enteros de la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1 y así sucesivamente. El elemento que está en la última posición pasa a la primera
    - realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y así sucesivamente*/
   /* public static void PosicionesArray1(){
        // pedir longitud
        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();
        // creacion array
        int[] array = new int[longitud];
        // pedir valores
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            array[i] = teclado.nextInt();
        }
        // mostrar array original
        System.out.println("Array original: ");
        mostrarArray(array);
        // Mover elementos a la derecha
        moverDerecha(array);
        // Mostrar array después de mover a la derecha
        System.out.println("\nArray después de mover a la derecha:");
        mostrarArray(array);
        // Mover elementos a la izquierda
        moverIzquierda(array);
        // Mostrar array después de mover a la izquierda
        System.out.println("\nArray después de mover a la izquierda:");
        mostrarArray(array);
    }
     Método para mostrar el array
    public static void mostrarArray(int[] array){
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    // Método para mover a la derecha
    public static void moverDerecha(int[] array) {
        int ultimo = array[array.length - 1]; // Guardamos el último elemento
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1]; // Desplazamos hacia la derecha
        }
        array[0] = ultimo; // El último pasa a la primera posición
    }
    // Método para mover a la izquierda
    public static void moverIzquierda(int[] array) {
        int primero = array[0]; // Guardamos el primer elemento
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1]; // Desplazamos hacia la izquierda
        }
        array[array.length - 1] = primero; // El primero pasa a la última posición
    }*/

    /*1. Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9, ambos inclusive (de forma automática). Se mostrarán los datos separados por una coma y un espacio. Una vez hecho esto se modificará el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
- Incrementar en 1 los valores pares y en -1 los impares.
- Duplicar los valores positivos menores que 5
- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
segundo al tercero, ..., y el último al primero).
- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
- Invertir el array
- Mostrar la posición del primer par y del último impar.*/
    public static void operacionesArray1(){
        Random random = new Random();
        int [] array = new int[10];
        // Rellenar array con numeros enter 0 y9
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.print("Array original: ");
        mostrarArray(array);
        // 1. Incrementar en 1 los valores pares y en -1 los impares
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] += 1;
            } else {
                array[i] -= 1;
            }
        }
        System.out.println("\nArray tras incrementar pares (+1) y decrementar impares (-1):");
        mostrarArray(array);
        // 2. Duplicar los valores positivos menores que 5
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < 5) {
                array[i] *= 2;
            }
        }
        System.out.println("\nArray tras duplicar los positivos menores que 5:");
        mostrarArray(array);
        // 3. Sumar un valor aleatorio entre -5 y 5 a cada elemento
        for (int i = 0; i < array.length; i++) {
            int sumaAleatoria = random.nextInt(11) - 5; // número entre -5 y 5
            array[i] += sumaAleatoria;
        }
        System.out.println("\nArray tras sumar valor aleatorio entre -5 y 5:");
        mostrarArray(array);
        // 4. Mover datos una posición a la derecha
        moverDerecha(array);
        System.out.println("\nArray tras mover una posición a la derecha:");
        mostrarArray(array);
        // 5. Intercambiar el primero con el segundo, el tercero con el cuarto, etc.
        intercambiarPares(array);
        System.out.println("\nArray tras intercambiar posiciones pares:");
        mostrarArray(array);
        // 6. Invertir el array
        invertirArray(array);
        System.out.println("\nArray invertido:");
        mostrarArray(array);
        // 7. Mostrar posición del primer par y del último impar
        mostrarPrimerParUltimoImpar(array);
    }
    // Método para mostrar el array separado por comas
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    // Método para mover a la derecha
    public static void moverDerecha(int[] array) {
        int ultimo = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimo;
    }
    // Método para intercambiar el primero con el segundo, el tercero con el cuarto, etc.
    public static void intercambiarPares(int[] array) {
        for (int i = 0; i < array.length - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }
    // Método para invertir el array
    public static void invertirArray(int[] array) {
        int izquierda = 0;
        int derecha = array.length - 1;
        while (izquierda < derecha) {
            int temp = array[izquierda];
            array[izquierda] = array[derecha];
            array[derecha] = temp;
            izquierda++;
            derecha--;
        }
    }
    // Método para mostrar posición del primer par y del último impar
    public static void mostrarPrimerParUltimoImpar(int[] array) {
        int posicionPrimerPar = -1;
        int posicionUltimoImpar = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && posicionPrimerPar == -1) {
                posicionPrimerPar = i;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0 && posicionUltimoImpar == -1) {
                posicionUltimoImpar = i;
            }
        }
        if (posicionPrimerPar != -1) {
            System.out.println("\nPosición del primer número par: " + posicionPrimerPar);
        } else {
            System.out.println("\nNo se encontró ningún número par.");
        }
        if (posicionUltimoImpar != -1) {
            System.out.println("Posición del último número impar: " + posicionUltimoImpar);
        } else {
            System.out.println("No se encontró ningún número impar.");
        }
    }

    /*1. Crea un programa que pida por consola la longitud de un array. Una vez realizado esto:
    1. Pide al usuario el número máximo que va a guardar
    2. En el caso de que este número sea inferior a la longitud, seguirá pidiendo este dato hasta que se cumpla
    3. Cuando se cumpla la condición, se rellenará el array pero, sin números repetidos*/
    public static void arrayNoRepetidos1(){
        Random random = new Random();
        // Pedir longitud del array
        System.out.println("Introduce la longitud del array: ");
        int longitud = teclado.nextInt();
        // 2. Pedir el numero maximo a guardar y validar >= longitud
        int maximo;
        do{
            System.out.println("Introduce el número máximo a guardar (debe ser mayor o igual a la longitud): ");
            maximo = teclado.nextInt();
            if(maximo < longitud){
                System.out.println("El número máximo debe ser mayor o igual a la longitud del array.");
            }
        }while(maximo < longitud);
        // creamos el array
        int [] array = new int[longitud];
        HashSet<Integer> usados = new HashSet<>(); // para evitar duplicados
        int i = 0;
        while(i< longitud){
            int numero = random.nextInt(maximo + 1); // número entre 0 y maximo
            if(!usados.contains(numero)){ // si no está en el HashSet
                usados.add(numero); // lo añadimos al HashSet
                array[i] = numero; // lo añadimos al array
                i++; // incrementamos el contador
            }
        }
        //mostrar array final
        System.out.println("Array sin números repetidos: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + " ");
            if(j< array.length - 1){
                System.out.print(", ");
            }
        }
    }

    /*2.  Crea un programa que cumpla los siguientes requisitos:
    - Crear un [] de chars con todas las letras del abecedario.
    - Crear un array de String con una longitud pedida por teclado
    - Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2. Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
    - Imprimir por pantalla las palabras generadas*/
    public static void generadorPalabras1(){
        // Crear array de char
        char[] abecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // pedir al usuario
        System.out.println("¿Cuantas palabras quieres guardar?: ");
        int cantidadPalabras = teclado.nextInt();
        // crear arra de string
        String[] palabras = new String [cantidadPalabras];
        // pedir la longitud de cada palabra
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("¿Cual es la longitud de la palabra ?"+(i + 1)+":");
            int longitudPalabra = teclado.nextInt();
            // Crear palabra aleatoria con la longitud deseada
            StringBuilder palabraGenerada = new StringBuilder();
            for (int j = 0; j < longitudPalabra; j++) {
                Random random = null;
                char letraAleatoria = abecedario[random.nextInt(abecedario.length)];
                palabraGenerada.append(letraAleatoria);
            }
            palabras[i] = palabraGenerada.toString();
        }
        // 5. Mostrar las palabras generadas
        System.out.println("\nLas palabras generadas son:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println((i + 1) + ". " + palabras[i]);
        }
    }

    /*1. Crear un array de String donde se guarden 20 palabras. El sistema deberá de seleccionar una de las palabras pertenecientes al array. Una vez seleccionada se jugará al juego del ahorcado donde la palabra a acertar será la seleccionada. Para ello las normas son las siguientes:
    - Nada mas arrancar se mostrarán por consola tantos _ como letras tenga la palabra a acertar
    - Se pedirá por pantalla la letra con la que se quiere probar
    - En el caso de acertar se mostrará la letra en la posición correspondiente
    - En el caso de falla se restará una vida
    - El programa continuará hasta que:
    - Acierte la palabra
    - Me quede sin vidas*/
    public static void ahorcadoArray(){
        // creacion del array con 20 palabras
        String [] palabras = {"ordenador", "programacion", "java", "teclado", "pantalla",
                "raton", "codigo", "algoritmo", "variable", "clase",
                "objeto", "metodo", "consola", "teoria", "bucle",
                "condicion", "arreglo", "funcion", "herencia", "polimorfismo"};
        Random random = new Random ();
        String palabraAhorcada = palabras[random.nextInt(palabras.length)].toLowerCase();
        // Inicializamos el array
        char[] palabraOculta = new char[palabraAhorcada.length()];
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }
        int vidas = 6; // vidas iniciales
        boolean palabraAcertada = false;
        // bucle principal
        while(vidas > 0 && !palabraAcertada) {
            // Mostrar la palabra oculta
            System.out.print("\nPalabra: ");
            for (char c : palabraOculta) {
                System.out.print(c + " ");
            }
            System.out.println("\nVidas restantes: " + vidas);
            // Pedir letra al usuario
            System.out.print("Introduce una letra: ");
            String entrada = teclado.nextLine().toLowerCase();
            if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                System.out.println("Introduce solo una letra válida.");
                continue;
            }
            char letra = entrada.charAt(0);
            boolean acierto = false;

            // Comprobar si la letra está en la palabra
            for (int i = 0; i < palabraAhorcada.length(); i++) {
                if (palabraAhorcada.charAt(i) == letra && palabraOculta[i] == '_') {
                    palabraOculta[i] = letra;
                    acierto = true;
                }
            }
            if (!acierto) {
                vidas--;
                System.out.println("¡Letra incorrecta!");
            }
            // Comprobar si ya no quedan guiones
            palabraAcertada = true;
            for (char c : palabraOculta) {
                if (c == '_') {
                    palabraAcertada = false;
                    break;
                }
            }
        }
        // Resultado final
        if (palabraAcertada) {
            System.out.println("\n¡Felicidades! Has acertado la palabra: " + palabraAhorcada);
        } else {
            System.out.println("\n¡Te has quedado sin vidas! La palabra era: " + palabraAhorcada);
        }
    }

    /*1. Desarrolla un programa que simule el sorteo de un amigo invisible. Para ello el programadebe:
- pedir el número de participantes (de ser impar saltará un fallo)
- pedir el nombre de cada uno de los participantes
- sacar por pantalla el orden de las parejas resultantes*/
    public static void invisibleArray(){
        // pedir el numero de participantes
        System.out.println("introduce el número de participantes: ");
        int numParticipantes = teclado.nextInt();
        if(numParticipantes % 2 != 0){
            System.out.println("El número de participantes debe ser par");
            return;
        }
        // crea array con nombres
        String[]participantes = new String[numParticipantes];
        for (int i = 0; i < numParticipantes; i++) {
            System.out.println("Introduce el nombre del participante " + (i + 1) + ": ");
            participantes[i] = teclado.next();
        }
        // mezclar el array
        List<String> lista = new ArrayList<>(Arrays.asList(participantes));
        Collections.shuffle(lista);// desordenar la lista
        //mostrar las parejas
        System.out.println("Las parejas de amigos invisibles son: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("- "+lista.get(i)+ " ->"+ lista.get(i + 1));
        }
        /*Si da error mejor probar esto
        * for (int i = 0; i < lista.size(); i++) {
           String emisor = lista.get(i);
           String receptor = lista.get((i + 1) % lista.size()); // circular: el último regala al primero
           System.out.println("- " + emisor + " -> " + receptor);
         }*/
    }

    /*1. Crear un programa que mediante un menú permita:
    - Crear un array de números enteros con n posiciones pedidas.
    - Rellenar el array creado con números aleatorios.
    - Rellenar el array creado con números pedidos por consola.
    - Ordenar el array de mayor a menor
    - Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud (si esta es inferior a la que la existe continuar pidiendo)
    - Mover todas las posiciones (pedir al usuario que seleccione la orientación)
    - Mostrar por pantalla el array según está*/
    public static void menuArray(){
        Integer[] array = null;
        int opcion;
        Random random = new Random();
        do{
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Crear array con N posiciones");
            System.out.println("2. Rellenar array con números aleatorios");
            System.out.println("3. Rellenar array manualmente");
            System.out.println("4. Ordenar array de mayor a menor");
            System.out.println("5. Clonar array con mayor longitud");
            System.out.println("6. Mover posiciones del array");
            System.out.println("7. Mostrar array");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce la longitud del array: ");
                    int n = teclado.nextInt();
                    array = new Integer[n];
                    System.out.println("✅ Array creado con " + n + " posiciones.");
                }
                case 2 -> {
                    if (array == null) {
                        System.out.println("❌ Primero debes crear el array.");
                        break;
                    }
                    for (int i = 0; i < array.length; i++) {
                        array[i] = random.nextInt(100);
                    }
                    System.out.println("✅ Array rellenado con números aleatorios.");
                }
                case 3 -> {
                    if (array == null) {
                        System.out.println("❌ Primero debes crear el array.");
                        break;
                    }
                    for (int i = 0; i < array.length; i++) {
                        System.out.print("Introduce el valor para la posición " + i + ": ");
                        array[i] = teclado.nextInt();
                    }
                    System.out.println("✅ Array rellenado manualmente.");
                }
                case 4 -> {
                    if (array == null) {
                        System.out.println("❌ Primero debes crear el array.");
                        break;
                    }
                    Arrays.sort(array, Collections.reverseOrder());
                    System.out.println("✅ Array ordenado de mayor a menor.");
                }
                case 5 -> {
                    if (array == null) {
                        System.out.println("❌ Primero debes crear el array.");
                        break;
                    }
                    int nuevaLongitud;
                    do {
                        System.out.print("Introduce la nueva longitud (debe ser mayor que " + array.length + "): ");
                        nuevaLongitud = teclado.nextInt();
                    } while (nuevaLongitud <= array.length);

                    Integer[] nuevoArray = new Integer[nuevaLongitud];
                    for (int i = 0; i < array.length; i++) {
                        nuevoArray[i] = array[i];
                    }
                    for (int i = array.length; i < nuevaLongitud; i++) {
                        nuevoArray[i] = 0;
                    }
                    array = nuevoArray;
                    System.out.println("✅ Array clonado con nueva longitud: " + nuevaLongitud);
                }
                case 6 -> {
                    if (array == null) {
                        System.out.println("❌ Primero debes crear el array.");
                        break;
                    }
                    System.out.print("¿Quieres mover a la derecha (D) o izquierda (I)? ");
                    String orientacion = teclado.next().toUpperCase();
                    if (orientacion.equals("D")) {
                        int ultimo = array[array.length - 1];
                        for (int i = array.length - 1; i > 0; i--) {
                            array[i] = array[i - 1];
                        }
                        array[0] = ultimo;
                        System.out.println("✅ Array movido a la derecha.");
                    } else if (orientacion.equals("I")) {
                        int primero = array[0];
                        for (int i = 0; i < array.length - 1; i++) {
                            array[i] = array[i + 1];
                        }
                        array[array.length - 1] = primero;
                        System.out.println("✅ Array movido a la izquierda.");
                    } else {
                        System.out.println("❌ Opción no válida. Usa D o I.");
                    }
                }
                case 7 -> {
                    if (array == null) {
                        System.out.println("❌ No hay array creado aún.");
                        break;
                    }
                    System.out.println("📦 Array actual: " + Arrays.toString(array));
                }
                case 8 -> System.out.println("👋 Saliendo del menú...");
                default -> {
                    if (opcion < 1 || opcion > 8) System.out.println("❌ Opción no válida.");
                }
            }
        } while (opcion != 8);

    }
}
