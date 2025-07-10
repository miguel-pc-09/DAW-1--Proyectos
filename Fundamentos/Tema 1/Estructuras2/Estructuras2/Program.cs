class Program
{
    static void Main(string[] args)
    {
        // SELECCION -> IF - IF ELSE - IF ELSE IF ELSE -> RESPUESTA A LA PREGUNTA ES UN BOOL
        //              SWITCH - CASE 1 CASE 2 CASE 3 DEFAULT -> RESPUESTA VALOR
        // REPETICION -> FOR -> Acciones repetitivas un nº concreto de veces con un incremento 
        //               WHILE -> Acciones repetitivas de 0 a nº indeterminado de veces -> si cumple la condicion bool
        //            DO WHILE -> Acciones repetitivas de 1 a nº indeterminado de veces  -> 
       // MetodoIf();
       // MetodoSwitch();
       // MetodoFor();
       MetodoWhile();
    }

    static void MetodoWhile()
    {
       /* // Metodo While no asegura ejecucion
        int opcion = 2;
        while(opcion>0)
        {
            Console.WriteLine("Repeticion ");
            // Metemos opcion -- porque si no no pararia de repetirse
            opcion--;
        }*/
        // Metodo do-while -> asegura una ejecucion como minimo, tu ejecutas mientras esta condicion de salida se cumpla 
        int opcion = 0; // Lo definimos aqui porque dentro del do solo seria entre la llaves no llegaria al while
        do
        {
            Console.WriteLine("Menu fundamentos programacion");
            Console.WriteLine("1. Realizar busqueda");
            Console.WriteLine("2. Realizar lectura");
            Console.WriteLine("3. Realizar insercion");
            Console.WriteLine("4. Realizar eliminacion");
            Console.WriteLine("5. Salida");
            opcion = int.Parse(Console.ReadLine());

            switch (opcion)
            {
                case 1:
                Console.WriteLine("Buscando");
                break;

                case 2:
                Console.WriteLine("Leyendo");
                break;

                case 3:
                Console.WriteLine("Insertando");
                break;

                case 4:
                Console.WriteLine("Eliminado");
                break;

                case 5:
                Console.WriteLine("Saliendo");
                break;
                
                default:
                Console.WriteLine("Sin contemplar");
                break;
            }
            
        } while (opcion != 5);
    }

    static void MetodoFor()
    {
        // la i empieza en 0 a 9 // si donde i++ ponemos i+=2 sumara de dos en dos
        // Si quiero que sea de 9 a 0 -> (int i = 10; i >= 0; i--)
        //int lado = LeerDato();
        int lado = 5;
        // encargado de las filas 
        for (int i = 0; i < lado; i++)
        {
            //encargado de las filas 
            for (int j = 0; j < 5; j++)
            {
                if(i == 0 || i==4)
                {
                Console.Write(" * ");
                }else{
                    if(j == 0 || j==4){
                        Console.Write(" * ");
                    }else{
                        Console.Write("   ");
                    }
                }

            }
            Console.WriteLine();
            // Si llamo al metodo LeerDato(); lo ejecutara tantas veces com le digamos arriba 
        }
        // pedirle al usuario el lado de un cuadrado -> 5
        /*
        * * * * *
        *       *
        *       *
        *       *
        * * * * *
        */
    }
    static void MetodoIf()
    {
        // 3 preguntas 1º if 2º else if 3º else if y si no else sale
        /*int numero = 4;
        if(numero > 0)
        {
            Console.WriteLine("El numero es positivo ");
        }
        else if()
        {

        }
        else if()
        {

        }
        else 
        {

        }*/
        // if if if 3 preguntas si o si hace una tas otra
        int numero = 4;
        if(numero > 0)
        {
            Console.WriteLine("El numero es positivo ");
        }
         if(numero < 10)
        {
            Console.WriteLine("El numero tiene un digito");
        }
        if(numero > 0 && numero < 10)
        {
            Console.WriteLine("El numero esta entre 0 y 9");
        }
        else 
        {
            Console.WriteLine("No es un numero menor que 10");
        }
    }

    static void MetodoSwitch()
    {
       // int numero = 8;
       string caso = "ejecucion";
       switch (caso)
       {
        case "lectura":
             Console.WriteLine("Vas a leer");
             bool sistemaPreparado = true;
             if(sistemaPreparado)
             {
               LeerDato();
             }

             break;

        case "escritura":
             Console.WriteLine("vas a escribir");
             break;

        case "exportacion": 
             Console.WriteLine("vas a exportar ");
             break;

        default:
             Console.WriteLine("No se contempla");
        break;
       }
    }
    
    // como no va a ser void si no int tenemos que meterle un return 
    static int LeerDato()
    {
        Console.WriteLine("porfavor introduce un dato");
             int numero = Console.Read();
             return numero;
    }
}