import controller.Metodo;

public class Entrada {

    public static void main(String[] args) {
        // Vista de la app
        // Primitivos : int , double, char, boolean
        // Complejos : String, ArrayList, HashMap, etc.

        // con metodos pasa igual que los comoplejos deja hacer cosas
        // 1º pòrque es complejam y 2º todas las clases en java dependen de una superclase -> Object -> funcionalidad base
        // Metodo -> funcionalidad base + lo que yo escriba
        Metodo metodos = new Metodo();

        // metodos.toString(); aunque las quite siguen saliendo

        // String palabra = " hola ";
        // como es compljea puedo usar ahora palabra.(metodos)
        //palabra.equalsIgnoreCase( "hola"); por ejemplo

        // Pero con un primitivo
        int numero = 10;
        //switch (numero) {} solo deja atajos de teclado

        // metodo();

        // LLAMAMOS AL PRIMER METODO CREADO EN EL CONTROLER
        // metodoSaludar(; asi lo haciamos anteriormente cuando los metodos estaban aqui abajo
        metodos.metodoSaludar();

        // Ejemplo del metodo saludar con el STATIC
        // Metodo.metodoSaludar4();

        // Ejemplo 52 metodo division
        metodos.realizarDivision(); // asi no se vera tenemos que meterlo dentro de un SOUT
        System.out.println("Ejemplo de division ");
        System.out.println(metodos.realizarDivision()); // ahora si se ve

        System.out.println("Ejemplo de division 2 ");
        System.out.println(metodos.realizarDivision2()); // ahora si se ve retorna lo de dentro ya que dijimos que es true en el if

        Double resultado = metodos.realizarDivision(); // Devuelve un 2
        resultado = metodos.realizarDivision(6); // 4 / 6 devuelve un 0
        resultado = metodos.realizarDivision(6, 4); // como pasamos 2 parametros el sabe donde apuntar 6 / 4 -> 1.0
        resultado = metodos.realizarDivision(2.3, 4);// Pasa a coger el double y int

        System.out.println("ejemplo resultado de las sobrecargas: ");
        System.out.println(resultado);
        System.out.println("");

        // Sale algor raro como : controller.Metodo@6acbcfc0 -> direcion de memoria donde esta el Metodo metodos = new Metodo(); en nuestro ordenador
        System.out.println("Ejemplo con sobreescritura de toString :");
        System.out.println(metodos);
        System.out.println();
        // Porque en una si imprime el mensaje y en la otra -> por el metodo toString de String
        // En cambio si usamos un String como por ejemplo
        System.out.println("Prueba de String -------");
        String palabra = new String ("hola"); // o String palabra = "hola";
        System.out.println(palabra); // mostrara el hola

        metodos.calcularMedia(new int[]{1, 5, 7, 9, 12, 87, 13});
        metodos.calcularMedia(new int[]{1, 5, 7});
        System.out.println();

        // Cajero
        metodos.sacarDinero(2345, 300); // nos sacara un aviso de pin incorrecto
        System.out.println();
        metodos.sacarDinero(1234,300); // pin correcto pero saldo insuficiente
        System.out.println();
        metodos.sacarDinero(1234,100); // pin correcto y saldo suficiente
    }

    // Anteriormente creabamos los metodos con static y lo llamabamos dentro de la clase main
    //public static void metodo(){}


}
