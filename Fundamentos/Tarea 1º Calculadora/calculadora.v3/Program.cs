namespace Calculadora
{
    public class Entrada
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Bienvenido a tu calculadora");
            Console.WriteLine("Por favor introduce tu primer numero");
            int numero;
            int contador = 0;
            int opcion = 0;

            do
            {
                Console.WriteLine("Elija una opción");
                Console.WriteLine("1. Sumar");
                Console.WriteLine("2. Restar");
                Console.WriteLine("3. Dividir");
                Console.WriteLine("4. Multiplicar");
                Console.WriteLine("5. Salir del sistema");

                switch (opcion){

                    case 1:
                    Console.WriteLine("Sumar");
                    break;

                    case 2:
                    Console.WriteLine("Restar");
                    break;

                    case 3:
                    Console.WriteLine("Dividir");
                    break;

                    case 4:
                    Console.WriteLine("Multiplicar");
                    break;

                    case 5:
                    Console.WriteLine("Saliendo, hasta pronto");
                    break;

                    default:
                    Console.WriteLine("Opcion no valida, vuelva a elegir");
                    break; 

                }
                
            }while (opcion!=5);

            Console.WriteLine("Saliendo. Hasta pronto");
        }
    }
}
