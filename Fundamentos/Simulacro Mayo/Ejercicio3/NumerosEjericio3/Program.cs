class Program
{
    public static void Main(string[] args)
    {
        List<int> numeros = new List<int>();
        Random aleatorio = new Random();

        // Genera 20 numeros entre 1 y 100
        for (int i = 0; i < 20; i++)
        {
            int numero = aleatorio.Next(1, 101);
            numeros.Add(numero);
        }

        //mostrar todos los numeros 
        Console.WriteLine("numeros generados: ");
        foreach (int n in numeros)
        {
           Console.WriteLine(n + " "); 
        }
        Console.WriteLine();

        // Calcular datos
        int pares = 0;
        int impares = 0;
        int suma = 0;
        int mayor = numeros[0];
        int menor = numeros[0];

        foreach (int n in numeros)
        {
            if(n % 2 == 0)
            {
                pares++;
            }
            else
            {
                impares++;
            }
            if (n > mayor)
            {
                mayor = n;
            }
            if(n < menor)
            {
                menor = n;
            }

            suma += n;
        }
        // mostrar resultados
        Console.WriteLine("Cantidad de pares: "+ pares);
        Console.WriteLine("Cantidad de impares: " + impares);
        Console.WriteLine("Número más grande: " + mayor);
        Console.WriteLine("Número más pequeño: " + menor);
        Console.WriteLine("Suma total: " + suma);
    }
}