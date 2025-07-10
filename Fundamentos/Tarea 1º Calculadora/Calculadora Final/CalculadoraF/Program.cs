using System.Runtime.CompilerServices;

namespace Calculadora{
    public class Program{
        public static void Main(string[] args){

            Console.WriteLine("Bienvenido a tu calculadora");

            

            // bucle infinito hasta que el usuario elija
            while (true){


             // Menu calculadora
            Console.WriteLine("\nEstas en el menú");
            Console.WriteLine("1. Sumar");
            Console.WriteLine("2. Restar");
            Console.WriteLine("3. Dividir");
            Console.WriteLine("4. Multiplicar");
            Console.WriteLine("5. Salir");
            Console.WriteLine("Que quieres hacer, elige una opción");

            // leer y validar
            int opcion = int.Parse(Console.ReadLine());

            if (opcion == 5){
                Console.WriteLine("Saliendo, hasta pronto");
                break;
            }
            
            

            if (opcion>= 1 && opcion <= 4){

                // Solicitar los numeros con if y una condicion
            Console.WriteLine("Por favor introduce tu primer número");
            int operando1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Por favor introduce tu segundo número");
            int operando2 = int.Parse(Console.ReadLine());
                
            // Realizacion operaciones 
            switch (opcion)
            {
                
                case 1:
                MetodoSuma(operando1, operando2);
                break;

                case 2:
                MetodoResta(operando1, operando2);
                break;

                case 3:// para que no puedan poner 0 en operando 2 
                if(operando2 !=0){
                    MetodoDivision(operando1, operando2);
                }else{
                    Console.WriteLine("No se puede dividir entre cero");
                }
                break;
                
                case 4:
                MetodoMultiplicacion(operando1, operando2);
                break;
            }
            }
            else{
                Console.WriteLine("Opción no valida, vuelve a intentarlo");
            }
            
            }

        }

            

            // Creacion de metodos de operaciones
        public static void MetodoSuma(int nume1, int nume2){
            int suma = nume1 + nume2;
            Console.WriteLine("La suma entre {0} + {1} es {2}", nume1, nume2, suma); 
            
        }
        public static void MetodoResta(int num1, int num2){
            int resta = num1 - num2;
            Console.WriteLine("La resta entre {0} - {1} es {2}", num1, num2, resta);

        }
        public static void MetodoDivision(int numero1, int numero2){
            double division = (double)numero1 / numero2;
            Console.WriteLine("La division entre {0} / {1} es {2}", numero1, numero2, division);

        }
        public static void MetodoMultiplicacion(int n1, int n2){
            double multiplicacion = n1 * n2;
            Console.WriteLine("La multiplicacion entre {0} * {1} es {2}", n1, n2, multiplicacion);

        }
        
         
    }
}
