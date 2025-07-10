// Ejercicios tema 1

using System.ComponentModel;
using System.Numerics;
using System.Security.Cryptography.X509Certificates;

class Entrada 
{
    public static void Main (string[]args)
    {
        
        // Ejercicio 1 declarar constantes locales. nombre, direccion calle codigo postal pai
        //ejercicioUno();

        //Ejercicio 2Programa que lee el nombre completo y la edad de una persona, y muestra los datos leídos.
        //ejercicioDos();

        //Ejercicio 3 Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
        //ejercicioTres();

        //Ejercicio 4 Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€. El camarero les pregunta cuántas bebidas y bocadillos quieren. Calcula el coste de la consumición, mostrando primero el coste de las bebidas y de los bocadillos. (Bar)
        //ejercicioCuatro();

        //Ejercicio 5 Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)
        //ejercicioCinco();

        //Ejercicio 6 Permítase introducir el valor con IVA de una compra con dos decimales (la compra no puede ser superior a 500€ ni inferior a 0€)
        //  y el valor del IVA de dicha compra (valor entero entre 0 y 25%)
        // .¿Cuánto costó la compra sin IVA?¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)
        //ejercicioSeis(); ** Darle una vuelta

        //Ejercicio 7 Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100. Obténgase la 
        // longitud de la circunferencia (2πr) y el área del circulo (πr2) .(Circunferencia) NOTA El valor de PI se obtiene con Math.PI
        //ejercicioSiete();

        //Ejercicio 8 Hágase una aplicación que permita realizar conversiones de temperaturas entre grados 
        // centígrados, farenheit y kelvin (los resultados se muestran redondeados a dos decimales). (Temperaturas)
        //ejercicioOcho();

        //Ejercicio 9 Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados
        //  (valores entre 0 y 20). Además se podrá introducir el precio de cada bebida 
        // (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00 €).
        //  También se podrá introducir el número de alumnos que realizaron la compra (valor entre 0 y 10). 
        // Se mostrará el total de la compra (con el subtotal de las bebidas y de los bocadillos) y la cantidad que debe
        //  pagar cada alumno redondeada a 2 decimales. (CosteBar)
        //ejercicioNueve();

        //Ejercicio 10 Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil, centenas, decenas y unidades), 
        // y se obtiene el número correspondiente. (Numero)
        ejercicioDiez();
       
        }
        // Ejercicio 1 declarar constantes locales. nombre, direccion calle codigo postal pai
        /* static  void ejercicioUno()
        {

         Console.WriteLine("Nacho Garcia");
         Console.WriteLine("c/buenos aires 2");
         Console.WriteLine("28567 Madrid");
         Console.WriteLine ("Espana");
    
        } */

        //Ejercicio 2Programa que lee el nombre completo y la edad de una persona, y muestra los datos leídos.
       /*  static void ejercicioDos()
        {
            Console.WriteLine("Escribe tu nombre comppleto: ");
            string nombre =  (Console.ReadLine());
            Console.WriteLine("Escribe tu edad :");
            int edad = int.Parse(Console.ReadLine());
            Console.WriteLine("Te llamas "+nombre);
            Console.WriteLine("Tu edad es: "+edad);
            Console.WriteLine("Pulsa enter para continuar...");
        } */

        // Ejercicio 3 Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
  /*       static void ejercicioTres()
        {
            Console.WriteLine("Introduzca el primer operando: ");
            int oper1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Introduce el 2 operando");
            int oper2 = int.Parse(Console.ReadLine());
            int suma = oper1 + oper2;
            Console.WriteLine("La suma de los 2 numeros es: "+suma);

        } */

        //Ejercicio 4 Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€. El camarero les pregunta cuántas bebidas y bocadillos quieren. Calcula el coste de la consumición, mostrando primero el coste de las bebidas y de los bocadillos. (Bar)
        /* static void ejercicioCuatro()
        {
            double bebida = 0;
            double bocadillo = 0;
           Console.WriteLine("Numero de bebidas: ");
           int bebidas = int.Parse(Console.ReadLine());
           Console.WriteLine("Numero de bocadillos: ");
           int bocadillos = int.Parse(Console.ReadLine());
           Console.WriteLine("Coste de las bebidas: 1.75");
           bebida = bebidas * 1.75;
           Console.WriteLine("Coste de los bocadillos: 2.25");
           bocadillo = bocadillos * 2.25;
           double consumicion = bebida + bocadillo;
           Console.WriteLine("Coste de la consumicion: "+consumicion);
        } */
        
        // ejercicio 5 
        /*static void ejercicioCinco()
        {
            int segundos = 24973;
            int horas = segundos/3600;
            segundos = (segundos%3600);
            int minutos = segundos/60;
            segundos = segundos%60;

            Console.WriteLine("La conversion es de : {0} horas {1} minutos y {2} segundos ",horas,minutos,segundos);
        }*/

        // Ejercicio 6
        /*static void ejercicioSeis()
        {
            
            Console.WriteLine("Buenas introduce el precio de la compra: ");
            double compra = double.Parse(Console.ReadLine());
            Console.WriteLine("Introduce el valor entero del IVA: ");
            double iva = double.Parse(Console.ReadLine());

            
                double ivaReal = (double)iva/100;
                double compraSinIva = compra/(1+ivaReal);
                double costeIva = compraSinIva*ivaReal;
                Console.WriteLine("Tu compra es a sido de: "+ compra);
                Console.WriteLine("El  iva de tu compra a sido de: "+iva);
                Console.WriteLine("Total del iva es : "+ivaReal);
                Console.WriteLine("El total de la compra es de: "+costeIva);
        
        }*/

        //Ejercicio 7
        /*static void ejercicioSiete()
        {
            Console.WriteLine("Escribe un radio entero: ");
            int radioEntero = int.Parse(Console.ReadLine());

            double longitud = (double)2*(Math.PI)*radioEntero;
            double area = Math.PI*((double)radioEntero*(double)radioEntero);
            Console.WriteLine("La longitud del circulo es : "+longitud);
            Console.WriteLine("El area del ciruclo es : "+area);
        }*/

        //Ejercicio 8 Repasar
        /*static void ejercicioOcho()
        {
            Console.WriteLine("Introduce los grados: ");
            double temp = double.Parse(Console.ReadLine());
            double gradosF = 5*(temp - 32)/9;
            Console.WriteLine("farenheit: "+gradosF);
            double gradosK = temp - 273.15;
            double farenheitK = 9(temp - 273.15)/5+32;
            double farengeitG = ((9*temp)/5)+32;

        }*/

        //Ejercicio 9 
        // static void ejercicioNueve()
        // {
        //     Console.WriteLine("introduce....");
        // Console.WriteLine("Decenas de mil: ");
        // int decenaMil = int.Parse(Console.ReadLine());
        // Console.WriteLine("Unidades de mil: ");
        // int unidadMil = int.Parse(Console.ReadLine());
        // Console.WriteLine("Centenas: ");
        // int centenas = int.Parse(Console.ReadLine());
        // Console.WriteLine("Decenas : ");
        // int decenas = int.Parse(Console.ReadLine());
        // Console.WriteLine("Unidades : ");
        // int unidades = int.Parse(Console.ReadLine());
        // Console.WriteLine("Numero introducido : "+decenaMil+unidadMil+centenas+decenas+unidades);
        // }

        //Ejercicio 10 
        



}
