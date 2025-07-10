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
       // ejercicioOcho();
        //ejercicioNueve();
        ejercicioDiez();









    }
        // Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7 y muestre el día de la semana correspondiente utilizando una sentencia switch.
        public static void ejercicioUno(){
            System.out.println(" Ingrese un numero del 1 al 7: ");
            int dia = teclado.nextInt();
            switch(dia){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("El numero introducido no es valido");
            }
        }

        // Crea un programa que permita al usuario ingresar un carácter y luego determine si es una vocal o una consonante utilizando una sentencia switch.
    public static void ejercicioDos(){
        System.out.println("Ingrese un caracter: ");
        char caracter = teclado.next().charAt(0);
        switch(caracter){
            case 'a','e','i','o','u':
                System.out.println("El caracter ingresado es una vocal");
                break;
            default:
                System.out.println("El caracter ingresado es una consonante");
        }
    }

    // Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch, determine si es par o impar.
    public static void ejercicioTres(){
        System.out.println("Ingrese un numero: ");
        int num = teclado.nextInt();
        switch(num%2){
            case 0:
                System.out.println("El numero ingresado es par");
                break;
            default:
                System.out.println("El numero ingresado es impar");
        }
    }

    // Realiza un programa que solicite al usuario ingresar un mes (como un número del 1 al 12) y
    // muestre la cantidad de días que tiene ese mes, considerando años no bisiestos.
    public static void ejercicioCuatro(){
        System.out.println("Ingrese un numero del 1 al 12: ");
        int mes = teclado.nextInt();
        switch (mes){
            case 1:
                System.out.println("Enero tiene 31 dias");
                break;
            case 2:
                System.out.println("Febreo tiene 28 dias");
                break;
            case 3:
                System.out.println("Marzo tiene 31 dias");
                break;
            case 4:
                System.out.println("Abril tiene 30 dias");
                break;
            case 5:
                System.out.println("Mayo tiene 31 dias");
                break;
            case 6:
                System.out.println("Junio tiene 30 dias");
                break;
            case 7:
                System.out.println("Julio tiene 31 dias");
                break;
            case 8:
                System.out.println("Agosto tiene 31 dias");
                break;
            case 9:
                System.out.println("Septimbre tiene 30 dias");
                break;
            case 10:
                System.out.println("Octubre tiene 31 dias");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 dias");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 dias");
                break;
        }


    }

    // Escribe un programa que pida al usuario ingresar un número del 1 al 12 y muestre el nombre del mes correspondiente utilizando una sentencia switch.
    public static void ejercicioCinco(){
        System.out.println("Ingrese un numero del 1 al 12 y te dire que mes corresponde: ");
        int mes = teclado.nextInt();
        switch (mes){
            case 1:
                System.out.println("Enero friolero  ");
                break;
            case 2:
                System.out.println("Febreo ventolero");
                break;
            case 3:
                System.out.println("Marzo airado");
                break;
            case 4:
                System.out.println("Abril variado");
                break;
            case 5:
                System.out.println("Mayo hermoso");
                break;
            case 6:
                System.out.println("Junio fogoso");
                break;
            case 7:
                System.out.println("Julio claro");
                break;
            case 8:
                System.out.println("Agosto raro");
                break;
            case 9:
                System.out.println("Septimbre extravagante");
                break;
            case 10:
                System.out.println("Octubre abundante");
                break;
            case 11:
                System.out.println("Noviembre llovedero");
                break;
            case 12:
                System.out.println("Diciembre nevadero");
                break;
        }
    }

    // Crea un programa que permita al usuario ingresar un número del 1 al 4 y muestre un mensaje diferente para cada número utilizando una sentencia
    // switch (por ejemplo, "Opción 1 seleccionada", "Opción 2 seleccionada", etc.).
    public static void ejercicioSeis(){
        System.out.println("Elija una opcion: ");
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Opcion 4");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("opcion 1 seleccionada");
                break;
            case 2:
                System.out.println("opcion 2 seleccionada");
                break;
            case 3:
                System.out.println("opcion 3 seleccionada");
                break;
            case 4:
                System.out.println("opcion 4 seleccionada");
                break;
            default:
                System.out.println("opcion no valida");
        }
    }

    // suma entre dos numeros
/*public static void resta(){
        System.out.println("Ingrese el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }*/
    // Desarrolla un programa que solicite al usuario ingresar una nota del 1 al 5 y muestre un mensaje de calificación
    // utilizando una sentencia switch (por ejemplo, "Suspenso", "Aprobado", "Notable", "Sobresaliente", etc.).
    public static void ejercicioSiete(){
        System.out.println("Introduce una nota del 1 al 5: ");
        int nota = teclado.nextInt();
        switch (nota){
            case 1:
                System.out.println("Suspenso");
                break;
            case 2:
                System.out.println("Aprobado");
                break;
            case 3:
                System.out.println("Notable");
                break;
            case 4:
                System.out.println("Sobresaliente");
                break;
            case 5:
                System.out.println("Matricula");
                break;
            default:
                System.out.println("Nota no valida");
        }
    }

    // Realiza un programa que pida al usuario ingresar un carácter que represente una operación matemática (+, -, *, /)
    // y dos números. Luego, utiliza una sentencia switch para realizar la operación correspondiente y mostrar el resultado.
    public static void ejercicioOcho(){
        System.out.println("Ingrese un operador (+, -, *, /): ");
        char operador = teclado.next().charAt(0);
        System.out.println("Ingrese el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();
        switch (operador){
            case '+':
                int suma = num1 + num2;
                System.out.println("La suma es: "+suma);
                break;
            case '-':
                int resta = num1 - num2;
                System.out.println("La resta es: "+resta);
                break;
            case '*':
                int multiplicacion = num1 * num2;
                System.out.println("La multiplicacion es: "+multiplicacion);
                break;
            case '/':
                double division = (double) num1 / num2;
                System.out.println("La division es: "+division);
                break;
            default:
                System.out.println("Operador no valido");
        }
    }

    // Escribe un programa que solicite al usuario ingresar un número del 1 al 12 y muestre la estación del año
    // correspondiente (por ejemplo, "Primavera", "Verano", "Otoño", "Invierno") utilizando una sentencia switch.
    public static void ejercicioNueve(){
        System.out.println("Ingrese un numero del 1 al 12: ");
        int mes = teclado.nextInt();
        switch (mes){
            case 3,4,5:
                System.out.println("primavera");
                break;
            case 6,7,8:
                System.out.println("Verano");
                break;
            case 9,10,11:
                System.out.println("Otoño");
                break;
            case 12,1,2:
                System.out.println("Invierno");
                break;
            default:
                System.out.println("Mes del año no valido");
        }
    }

    // Crea un programa que permita al usuario ingresar un código de producto (como una cadena de caracteres) y,
    // utilizando una sentencia switch, muestre el nombre del producto y su precio correspondiente
    public static void ejercicioDiez(){
        System.out.println("¿Qué producto quieres comprar?");
        System.out.println("Codigo: 1234, Cocacola");
        System.out.println("Codigo: 2345, Fanta");
        System.out.println("Codigo: 3456, Agua mineral");
        System.out.print("Introduce el codigo: ");
        int producto = teclado.nextInt();
        switch (producto){
            case 1234:
                System.out.println("Cocacola. Precio: 1.50");
                break;
            case 2345:
                System.out.println("Fanta. Precio 1,20");
                break;
            case 3456:
                System.out.println("Agua mineral. Precio: 0,50");
                break;
            default:
                System.out.println("Codigo no valido.");
        }
    }
}

