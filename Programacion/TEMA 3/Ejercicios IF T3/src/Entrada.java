
    import java.util.Scanner;

    public class Entrada {


        static Scanner teclado = new Scanner(System.in);
        // El MAIN al ser static todas las variables y metodos tendran que ser static

        public static void main(String[] args) {
            //ejercicio1();

            //ejercicioDos();

            // ejercicioTres();

            //ejercicioCuatro();

            //ejercicioCinco();

            //ejercicioSeis();

            //ejercicioSiete();

            //ejercicioOcho();

            //ejercicioNueve();

            //ejercicioDiez();

            //ejercicioOnce();

            //ejercicioDoce();

            //ejercicioTrece();

            ejercicioCatorce();

        }


        //Ejercicios IF

        //Hagase un programa que lea dos enteros y compruebe si el primero es o no mayor que el segundo.En la
        //salida se mostrara "El primero es mayor que el segundo" o "El segundo no es mayor que el segundo"
        public static void ejercicio1() {
            System.out.print("Introduce el primer numero: ");
            int num1 = teclado.nextInt();
            System.out.print("Introduce el segundo numero:");
            int num2 = teclado.nextInt();
            if (num1 > num2) {
                System.out.println("El primer numero es mayor que el segundo");
            } else {
                System.out.println("El primer numero no es mayor que el segundo");
            }
        }

        /*
         * Hagase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos.
         * En la salida se mostrara "Ninguno es suma de los otros dos" o "8=2+6"(en este ultimo caso se introdujeron los numeros
         * 2,8 y 6)SumaTres.Java*/
        public static void ejercicioDos() {
            System.out.print("Introduce el primer numero: ");
            int num1 = teclado.nextInt();
            System.out.print("Introduce el segundo numero: ");
            int num2 = teclado.nextInt();
            System.out.print("Introduce el tercer numero: ");
            int num3 = teclado.nextInt();
            /*
             * Tambien
             * if((num1==num2+num3 || (num2 == num1+num3) || (num3 == num1+num2))*/
            if (num1 + num2 == num3) {
                System.out.println("" + num3 + "=" + num1 + "+" + num2);
            } else if (num2 + num3 == num1) {
                System.out.println("" + num1 + "=" + num2 + "+" + num3);
            } else if (num3 + num1 == num2) {
                System.out.println("" + num2 + "=" + num3 + "+" + num1);
            } else {
                System.out.println("Ninguno es la suma de los otros dos");
            }
        }

        /*
         * Lease un numero entero. Se comprobara si dicho numero es o no multiplo de 20, y
         * tambien se comprobara si esta o no entre -100 y 100.En la salida se mostrara uno de los siguientes
         * mensajes. a->"Es multiplo de 20 y esta entre -100 y 100". b->"Es multiplo de 20 y no esta entre -100 y100"
         * c->"No es multiplo de 20 y esta entre -100 y 100". d->"No es multiplo de 20 y no esta entre -100 y 100".
         * Un numero es multiplo de otro cuando su resto es igual a 0*/
        public static void ejercicioTres() {
            System.out.print("Introduce un numero: ");
            int num = teclado.nextInt();
            /*
             * if(numero%20==0){
             *    if(numero>=-100 && numero<=100){
             *       sout("El numero es multiplo y esta en rango");
             *    }else{
             *       sout("El numero es multiplo y no esta en rango");
             * }
             * }else{
             *    if(nummero>=-100 && numero<=100){
             *        sout("Elnumero no es multiplo y esta en rango");
             *    }else{
             *        sout("El numero no es multiplo y no esta en rango");
             * */
            if (num % 20 == 0 && num >= (-100) && num <= 100) {
                System.out.println("Es multiplo de 20 y esta entre -100 y 100");
            } else if (num % 20 == 0 && num < (-100) && num > 100) {
                System.out.println("Es multiplo de 20 y no esta entre -100 y 100");
            } else if (num % 20 != 0 && num >= (-100) && num <= 100) {
                System.out.println("No es multiplo de 20 y esta entre -100 y 100");
            } else if (num % 20 != 0 && num < (-100) && num > 100) {
                System.out.println("No es multiplo de 20 y no esta entre -100 y 100");
            }

        }

        /*
         * Hagase un programa que compruebe si un año pedido por teclado es bisiesto.En la salida se
         * mostrara o "Es bisiesto" o "No es bisiesto". El algoritmo para obtener si un año es bisiesto
         * es el siguiente: Un año es bisiesto si es multiplo de 4*/
        public static void ejercicioCuatro() {
            System.out.print("Indica un año para saber si es bisiesto: ");
            int anio = teclado.nextInt();
            if (anio % 4 == 0) {
                System.out.println("El año es bisiesto");
            } else {
                System.out.println("El año no es bisiesto");
            }
        }

        /*
         * Determina si un numero natural de 4 digitos (entre1000 y 9999)es capicua.Se comprobara
         * previamente que el numero introducido tiene 4 digitos.En la salida se mostrara uno de
         * los sisguientes mensajes. a->"El numero no tiene 4 digitos". b->"Es capicupa".
         * c->"No es capicupa".-Un numero es capicua cuando se lee igual de izquierda a derecha que de
         * derecha a izquierda*/
        public static void ejercicioCinco() {
            System.out.println("Introduce un numero de 4 digitos: ");
            int num = teclado.nextInt();
            int millares1 = num / 1000;
            int resto = num % 1000;
            int centenas1 = resto / 100;
            resto = resto % 100;
            int decenas1 = resto / 10;
            int unidades1 = resto % 10;
            System.out.println(millares1);
            System.out.println(centenas1);
            System.out.println(decenas1);
            System.out.println(unidades1);
            String numeroPalabra = String.valueOf(num);

            if (num >= 1000 && num <= 9999) {
                if (numeroPalabra.charAt(0) == numeroPalabra.charAt(3)
                        && numeroPalabra.charAt(1) == numeroPalabra.charAt(2)) {
                    System.out.println("Es capicua");
                } else {
                    System.out.println("No es capicua");
                }
            } else {
                System.out.println("El numero no tiene 4 digitos");
            }
        }

        /*
         * Introducir tres enteros entre -100 y 100.De cumplir los tres numeros la condicion del rango,
         * se obtendra la suma de sus inversos(1/numero).En el caso de no estar alguno de los numeros
         *  en el rango se mostrara el mensaje "alguno de los numeros no esta entre -100 y 100".No
         * se sumara el inverso de aquellos valores que sean 0.Por ejemplo, se introducen los enteros 20, -4, 100
         * y se muestra el valor 1/20 + 1/-4 + 1/100 = -0.19000*/
        public static void ejercicioSeis() {
            System.out.println("Introduce tres numeros entre -100 y 100: ");
            double num1 = teclado.nextInt();
            double num2 = teclado.nextInt();
            double num3 = teclado.nextInt();
            if ((num1 >= -100 && num1 <= 100) && (num2 >= -100 && num2 <= 100) && (num3 >= -100 && num3 <= 100)) {
                System.out.println("Obteniendo la suma de sus inversos ");
                double inv1 = 1 / num1;
                double inv2 = 1 / num2;
                double inv3 = 1 / num3;
                double suma = inv1 + inv2 + inv3;
                System.out.println("La suma es: " + suma);
            } else {
                System.out.println("Alguno de los numeros no esta en el rango");
            }
        }

        /*
         * Un numero de 3 cifras es un numero de Armstrong si la suma de sus digitos elevado a 3 coincide
         * con dicho numero. Por ejemplo,153 = 1+125+27. Dado un numero de 3 cifras determina si es o no un numero Armstrong.
         * Se comprobara previamente que el numero introducido tiene 3 digitos. En la salida se mostrara uno de los siguientes
         * mensajes: a-> "El numero no tiene 3 digitos" b-> "Es un numero Armstrong" c->"No es un numero Armstrong" */
        public static void ejercicioSiete() {
            int numeros = teclado.nextInt();
            int num1 = numeros / 100;
            int num2 = (numeros % 100) / 10;
            int num3 = numeros % 10;
            int suma = num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3;
            if (numeros >= 100 && numeros <= 999) {
                if (suma == numeros) {
                    System.out.println("Es un numero Armstrong");
                } else {
                    System.out.println("No es un numero Armstrong");
                }

            }
            System.out.println("El numero no tiene 3 digitos");

        }

        /*
         * Leer tres enteros y mostrarlos ordenados*/
        public static void ejercicioOcho() {
            System.out.println("Introduce tres numeros");
            System.out.print("Primer numero: ");
            int num1 = teclado.nextInt();
            System.out.println("Segundo numero: ");
            int num2 = teclado.nextInt();
            System.out.println("Tercer numero: ");
            int num3 = teclado.nextInt();
            // Ordenar los números
            int menor, medio, mayor;

            if (num1 <= num2 && num1 <= num3) {
                menor = num1;
                if (num2 <= num3) {
                    medio = num2;
                    mayor = num3;
                } else {
                    medio = num3;
                    mayor = num2;
                }
            } else if (num2 <= num1 && num2 <= num3) {
                menor = num2;
                if (num1 <= num3) {
                    medio = num1;
                    mayor = num3;
                } else {
                    medio = num3;
                    mayor = num1;
                }
            } else {
                menor = num3;
                if (num1 <= num2) {
                    medio = num1;
                    mayor = num2;
                } else {
                    medio = num2;
                    mayor = num1;
                }
            }

            System.out.println("Números ordenados: " + menor + " " + medio + " " + mayor);
        }


        // Se leen tres enteros y se comprobara si son o no consecutivos. Se mostrara en la salida "Son consecutivos" o "No son consecutivos"
        public static void ejercicioNueve() {
            System.out.println("Introduce tres numeros enteros");
            System.out.println("primer numero: ");
            int num1 = teclado.nextInt();
            System.out.println("Segundo numero: ");
            int num2 = teclado.nextInt();
            System.out.println("Tercer numero: ");
            int num3 = teclado.nextInt();
            if (num1 + 1 == num2 && num2 + 1 == num3) {
                System.out.println("Son consecutivos: " + num1 + " " + num2 + " " + num3);

            } else {
                System.out.println("No son consecutivos");
            }
        }

        // Se lee un número entero. Dicho número se incrementará en una unidad si es par,
        // y se decrementará en una unidad si es impar. Se muestra por consola el nuevo valor del número.
        public static void ejercicioDiez() {
            System.out.println("Introduce un numero entero");
            int numero = teclado.nextInt();
            if (numero % 2 == 0) {
                numero++;
                System.out.println("El numero es par y se incrementara en una unidad: " + numero);
            } else {
                numero--;
                System.out.println("El numero es impar y se decrementara en una unidad: " + numero);
            }
        }

        //Se leen tres enteros y un valor booleano para ordenarlos ascendentemente o descendentemente. Se mostrarán los valores leídos ordenados.
        public static void ejercicioOnce() {
            System.out.println("Introduce 3 numeros enteros: ");
            int num1 = teclado.nextInt();
            int num2 = teclado.nextInt();
            int num3 = teclado.nextInt();
            System.out.println("Ordenar valor booleano: ");
            boolean orden = teclado.nextBoolean();
            if (orden) {
                if (num1 <= num2 && num1 <= num3) {
                    System.out.println("Ordenar ascendentemente: " + num1 + " " + num2 + " " + num3);
                } else if (num2 <= num1 && num2 <= num3) {
                    System.out.println("Ordenar ascendentemente: " + num2 + " " + num1 + " " + num3);
                } else {
                    System.out.println("Ordenar ascendentemente: " + num3 + " " + num1 + " " + num2);
                }
            } else {
            }
        }

        // Leer un número entero, se realizarán las siguientes acciones:
        // incrementará en 2 unidades si es par
        // en 3 unidades si es múltiplo de 3
        // en 5 unidades si es múltiplo de 5
        // en el caso de no cumplirse ninguna de las anteiores, se incrementará en una unidad.
        public static void ejercicioDoce() {
            System.out.println(" Introduce un numero entero: ");
            int num = teclado.nextInt();
            if (num % 2 == 0) {
                num += 2;
                System.out.println("El numero es par y se incrementara en 2 unidades: " + num);
            } else if (num % 3 == 0) {
                num += 3;
                System.out.println("El numero es multiplo de 3 y se incrementara en 3 unidades: " + num);
            } else if (num % 5 == 0) {
                num += 5;
                System.out.println("El numero es multiplo de 5 y se incrementara en 5 unidades: " + num);
            } else {
                num++;
                System.out.println("El numero no reune ninguna condicion, se incrementara en una unidad: " + num);
            }
        }

        //Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.
        public static void ejercicioTrece() {
            System.out.println("Introduceun día: ");
            int dia = teclado.nextInt();
            System.out.println("Introduce un mes: ");
            int mes = teclado.nextInt();
            System.out.println("Introduce un año: ");
            int anio = teclado.nextInt();
            if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || anio <= 0) {
                System.out.println("La fecha no es correcta");
            } else {
                if (mes == 2) {
                    if (anio % 4 == 0) {
                        if (dia <= 29) {
                            System.out.println("La fecha es correcta");
                        } else {
                        }
                    }
                }
            }
        }

        //Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses tienen 30 días excepto febrero que tiene 28.
        public static void ejercicioCatorce() {
            // Pedir la fecha al usuario
            System.out.print("Introduce el día: ");
            int dia = teclado.nextInt();
            System.out.print("Introduce el mes: ");
            int mes = teclado.nextInt();
            System.out.print("Introduce el año: ");
            int año = teclado.nextInt();

            // Validar la fecha
            if (mes < 1 || mes > 12 || dia < 1 || (mes == 2 && dia > 28) || (mes != 2 && dia > 30)) {
                System.out.println("Fecha incorrecta. Inténtalo de nuevo.");
            } else {
                // Calcular el día siguiente
                dia++;
                if ((mes == 2 && dia > 28) || (mes != 2 && dia > 30)) { // Si se pasa del último día del mes
                    dia = 1;
                    mes++;
                    if (mes > 12) { // Si se pasa de diciembre, cambiar de año
                        mes = 1;
                        año++;
                    }
                }

                // Mostrar la fecha del día siguiente
                System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + año);
            }


        }
    }
