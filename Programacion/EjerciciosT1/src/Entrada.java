import java.util.Scanner;

public class Entrada {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("");
        //leerNombreEdad();
        System.out.println("");
        dosOperaciones();
        System.out.println("");
        barTerraza();
        System.out.println("");
        segundosHora();
        System.out.println("");
        compraIVA();
        System.out.println("");
        radioCirculo();
        System.out.println("");
        //temperatura();
        System.out.println("");
        digitos();
        System.out.println("");
        comprobacion();
        System.out.println("");
        cadenas();
        System.out.println("");
        comprobarNumeros();
        System.out.println("");
        comprobarPersona();
        System.out.println("");
        modificarEntero();

    }






    public static void datos(){

        String nombre = "Miguel Angel Perucha castello";
        String calle = "Calle los rosales, 20";
        String codigo = "19209 Quer";
        String pais = "España";
        System.out.println("mis datos son: \n"+nombre );
        System.out.println(""+calle);
        System.out.println(""+codigo);
        System.out.println(""+pais);

    }
    /*public static void leerNombreEdad(){

        System.out.print("Escribe tu nombre porfavor: ");
        String nombre = scanner.nextLine();
        System.out.print("Escribe tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Te llamas "+nombre+"\nTienes "+edad);
    }*/
    public static void dosOperaciones(){
        int operando1 = 8;
        int operando2 = 4;
        int suma = operando1+operando2;
        int resta = operando1-operando2;
        int multiplicacion = operando1*operando2;
        int division = operando1/operando2;
        int resto = operando1%operando2;
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("El resto es: "+resto);


    }

    // Bar Bebidas
    public static void barTerraza(){
        // bebidas 1,25 bocadillos 2,05
        //como son constantes las escribimos en mayusculas
        final double COSTE_BEBIDA = 1.25;
        final double COSTE_BOCATA = 2.05;
        System.out.println("Buenas tardes ");
        System.out.println("¿Cuantas bebidas quereis: ");
        int cantidadBebidas = scanner.nextInt();
        System.out.println("¿Cuantos bocatas quereis: ");
        int cantidadBocata = scanner.nextInt();

        double costeTotalBebida = COSTE_BEBIDA*cantidadBebidas;
        System.out.println("El total de las bebidas es: "+costeTotalBebida);
        double costeTotalBocata = COSTE_BOCATA*cantidadBocata;
        System.out.println("El total de los bocadillos es: "+costeTotalBocata);
        double totalConsumicion = costeTotalBebida+costeTotalBocata;
        System.out.println("El total de las consumiciones es "+totalConsumicion);
        System.out.println("Gracias y hasta pronto");



    }

    public static void segundosHora(){
        // 1h->60 min 1min->60seg
        int segundos = 24973;
        int horas = segundos/3600;
        segundos = (segundos%3600);
        int minutos = segundos/60;
        segundos = segundos%60;

        System.out.printf("La conversion es de: %d horas %d minutos y %d segundos",horas,minutos,segundos);
        System.out.println("");

    }

    public static void compraIVA(){
        System.out.println("Introduce el valor de la compra (entre 0.00 y 500.00");
        double valorCompra = scanner.nextDouble();
        System.out.println("Introduce el valor entero del IVA (0y25%)");
        int iva = scanner.nextInt();

        double ivaReal = (double)iva/100;
        double compraSiva = valorCompra/(1+ivaReal);
        double costeIva = compraSiva*ivaReal;


        System.out.printf("Compra total:%.2f\nPorcentaje IVA: %d\nCompra sin IVA:%.2f\nIVA: %.2f",valorCompra,iva,compraSiva,costeIva);
        System.out.println("");
        System.out.println("");


    }

    public static void radioCirculo(){
        //valopres radio 0-100
        System.out.println("Introduce el valor del radio entre 0 - 100 ");
        int radio = scanner.nextInt();
        // longitud circunferencia 2piR y area 2Ralcuadrado --> pi = Math.PI
        double longitud = (double)2*(Math.PI)*radio;
        double area = Math.PI*((double)radio*(double)radio);
        System.out.println("La longitud del ciruclo es: "+longitud);
        System.out.println("El area del circulo es :"+area);

        System.out.println("");
        System.out.println("");
    }


    // mirarme bien el de la temperatura
   /* public static void temperatura(){
        System.out.println("intoduce los grados: ");
        double temp = scanner.nextDouble();
        double gradosF = 5*(temp-32)/9;
        System.out.println("farenheit: "+gradosF);
        double gradosK = temp-273.15;
        double farenheitK = 9(temp - 273.15)/5+32;
        double farenheitG = ((9*temp)/5)+32;
        double kelvinG = temp + 273.15;
        double kelvinF = 5(temp-32)/9+273.15;
    }*/

    public static void digitos (){


        System.out.println("introduce....");
        System.out.print("Decenas de mil: ");
        int decenaMil = scanner.nextInt();
        System.out.print("Unidades de mil: ");
        int unidadMil = scanner.nextInt();
        System.out.print("Centenas: ");
        int centenas = scanner.nextInt();
        System.out.print("Decenas : ");
        int decenas = scanner.nextInt();
        System.out.print("Unidades : ");
        int unidades = scanner.nextInt();
        System.out.printf("Numero introducido : "+decenaMil+unidadMil+centenas+decenas+unidades);
    }

    public static void comprobacion (){
        // mostrar si es par o impar
        // a-> es par
        //b -> es mayor que 50
        System.out.print("Escribe un entero entre 0 y 100: ");
        int entero = scanner.nextInt();
        boolean espar = entero%2==0;
        boolean mayor50 = entero>50;
        System.out.println("Par: "+espar);
        System.out.println("Mayor que 50: "+mayor50);
        System.out.println("");
    }

    // Mirar esta como poner para que escriban y se guarde
    public static void cadenas(){
        // son iguales
        // la primera menor que la segunda
        // son distintas
        String palabra1 = "Hola";
        String palabra2 = "Hola";
        System.out.println("Escribe una palabra: "+palabra1);
        //String palabra1 = scanner.nextLine();
        //String palabra2 = scanner.nextLine();
        System.out.println("Escribe otra palabra: "+palabra2);
        boolean iguales = palabra1.equals(palabra2);
        System.out.println("son iguales: "+iguales);
        boolean menor = palabra1.compareTo(palabra2)<0;
        System.out.println("La primera es menor que la segunda: "+menor);
        boolean distintas = !iguales && menor;
        System.out.println("Son distintas: "+distintas);


    }

    //Leer dos numeros entre 0y9, ambos incluidos.compruebese(verdadero o falso)
    public static void comprobarNumeros(){

        System.out.println("Por favor introduzca dos numeros entre 0 y9 ");
        System.out.print("primero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Numero 2: ");
        int numero2 = scanner.nextInt();
        // El primero es par y el segundo impar
        boolean numero1Par = numero1%2==0;
        boolean numero2Impar = numero2%2==1;
        boolean comprobar = numero1Par && numero2Impar;
        System.out.println("El primero es par y el segundo impar: "+comprobar);
        // El primero es superior al doble del segundo e inferior a 8
        boolean numero1Superior = numero1>numero2*2 && numero1<8;
        System.out.println("El primero es superior al doble del segundo e inferior a 8: "+numero1Superior);
        //Son iguales o la diferencia entre el primero y el segundo es menor que 2
        boolean numeroIgual = numero1==numero2 || Math.abs(numero1-numero2)<2;
        System.out.println("Son iguales o la diferencia entre el primero y segundo es menor que 2: "+numeroIgual);
    }

    // valores de una persona, valores (o y 100), nivel estudios (0 y 10), y sus ingresos (0 y 25000)
    // comprobar ( verdadero o falso) si persona tiene mas de 40 años, nivel estudios entre 5 y8, ambos inclusives y gana menos de 15000(condicion logica)
    public static void comprobarPersona(){
        System.out.print("Indique su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Indique su nivel de estudios: ");
        int nivel = scanner.nextInt();
        System.out.println("Ingresos: ");
        int ingresos = scanner.nextInt();
        boolean mayor40 = edad>40;
        boolean nivelEstudio = nivel>=5 && nivel<=8;
        boolean ingresosMenor = ingresos<15000;
        boolean comprobar = mayor40 && nivelEstudio && ingresosMenor;
        System.out.println("Mas de 40 años y estudios entre 5 y 8 y gana menos de 15000: "+comprobar);
    }

    // Se lee un entero que se modifica de la siguiente manera:
    //incrementar en 5 unidades (+=5)
    //Decrementar en 3 unidades (-=3)
    //Multiplicar por 10 (*=10)
    // dividir por 2 (/=2)
    //Mostrar dicho entero en cada uno de los apartados anteriores
    //(asignarEntero)
    public static void modificarEntero(){
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        numero+=5;
        System.out.println("Incrementar en 5 unidades: "+numero);
        numero-=3;
        System.out.println("Derementar en 3 unidades: "+numero);
        numero*=10;
        System.out.println("Multiplicar por 10: "+numero);
        numero/=2;
        System.out.println("Dvidir por 2: "+numero);


    }
}
