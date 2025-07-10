// Elementos basicos
// NAMESPACE -> Tipo de estructura que permite englobar clases que a sus vez tiene metodos y clases, en java clases anidadas
   // CLASES
     // METODOS
     // VARIABLES

// No hace falta el main para poder sacar cosas por consola 
/*int edad = 3;
Console.WriteLine("Este es mi primer programa en C# "+edad);

string nombre = "Miguel";
int edad2 = 37;
Console.WriteLine("Hola mui nombre es {0} y tengo {1}",nombre,edad2);
Console.WriteLine("Mi nombre tiene {0} letras: ", nombre.Length);

// Variables simples - complejas

// variable de ambito - clase - bloque 

// para leer una lectura
Console.WriteLine("Escribe tu nombre: ");
string? nombre2 = Console.ReadLine();
Console.WriteLine("Escribe tu edad");
// casting -> Cuando son tipos que uno entra dentro de otro 
// parseo -> cuando son tipos incompatibles de primera en java integer.parseInt(xxx)
int edad3 = int.Parse(Console.ReadLine());
Console.WriteLine("Hola mui nombre es {0} y tengo {1}",nombre2,edad3);
Console.WriteLine("Mi nombre tiene {0} letras: ", nombre2?.Length);*/

// Namespace me sirve para que todas las clases que estan dentro peudan compartir datos enter ella, pero entre namespace no 
namespace tema1
{
    // creacion de primera clase 
    class Program
    {
        // Variables 
        // metodos
            // Constructores
        // que tiene un metodo -> los metodos con MAYUSCULAS 
        // public -> acceso publico
        // static -> acceso directo, el metodo pertenece a la clase, no al objeto
        // void -> tipo de retorno - sin retorno
        // argumentos -> lo que necesita el metodo para funcionar
        public static void Main(string[] args)
        {
            Console.WriteLine("Primera ejecucion en C# sobre una clase ");
            // Crear variables
            // Crear operadores
            // hacer operaciones

            // Quiero hacer una suma de dos operandos
            Console.WriteLine("Profavor introduce el primer operando ");
            int operando1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Profavor introduce el segundo operando ");
            int operando2 = int.Parse(Console.ReadLine());
            MetodoSuma(operando1,operando2);
            MetodoDividir(operando1, operando2);
            MetodoDividir(6, 2);
            MetodoMultiplicar(operando1, operando2);
            MetodoMultiplicar(8.3, 4.5);

            


        }
        static void MetodoSuma(int num1, int num2)
        {
            
            int suma = num1 + num2;
            Console.WriteLine("La suma entre {0} + {1} es {2}",num1,num2, suma);
        }
        static void MetodoDividir(int numero1, int numero2)
        {
            
            double division = (double)numero1 / numero2;
             Console.WriteLine("La division entre {0} / {1} es {2}",numero1,numero2, division);

        }
        static void MetodoMultiplicar(double n1, double n2)
        {
            double multiplicacion = n1 * n2;
             Console.WriteLine("La multiplicacion entre {0} * {1} es {2}",n1,n2, multiplicacion);
        }
    }
    // clase 2
    class Entrada 
    {

    }
    // Clase 3
}
/*namespace tema2
{
    // clase 1
    // clase 2
    // Clase 3
}*/