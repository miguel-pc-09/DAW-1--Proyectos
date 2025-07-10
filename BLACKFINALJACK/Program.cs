
using System;
// Ejecuta el programa.
class Program
{
    static void Main()
    {
        Console.OutputEncoding = System.Text.Encoding.UTF8;
        Blackjack juego = new Blackjack();
        juego.Iniciar();
    }
}
