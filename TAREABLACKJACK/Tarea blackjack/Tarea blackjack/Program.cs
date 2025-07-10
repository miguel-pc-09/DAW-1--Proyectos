class Program
{

    static void Main(string[] args)
    {

        Console.WriteLine("Aplicacion de BlackJack!");


        Baraja barajaNueva = new Baraja();
        Jugador jugador1 = new Jugador("Jugador UNO",barajaNueva);
        Jugador crupier = new Jugador("CRUPIER", barajaNueva, true);

        Console.WriteLine("Repartimos las cartas.");
        for (int i = 0; i < 2; i++){
        jugador1.RecibirCarta(barajaNueva.RobarCarta());
        crupier.RecibirCarta(barajaNueva.RobarCarta());
        }
        Console.WriteLine(jugador1);
        Console.WriteLine(crupier);

//Turnos
        Console.WriteLine("\nTurno del Jugador UNO...");
while(true){
        Console.WriteLine("Quieres pedir otra carta??  S/N");
        string respuesta = Console.ReadLine() ?? ""; //no puede ser nullo, entonces le asigno ""
    if (respuesta.ToLower() == "s"){
        jugador1.RecibirCarta(barajaNueva.RobarCarta());
        Console.WriteLine(jugador1);
        if (jugador1.EstaEliminado()){
            Console.WriteLine("Superaste 21. !! P E R D I S T E ¡¡ ");
            return;
        }
    }else{
        break;
    }
}
// Turno del crupier (automático)
        Console.WriteLine("\nTurno del crupier...");
        while (crupier.PedirCarta()) {
            crupier.RecibirCarta(barajaNueva.RobarCarta());
            Console.WriteLine(crupier);
        }

//Determinar 
int puntosJugador = jugador1.CalcularPuntaje();
int puntosCrupier = crupier.CalcularPuntaje();

Console.WriteLine("\n -- Resultado Final --");
Console.WriteLine(jugador1);
Console.WriteLine(crupier);

if (crupier.EstaEliminado() || puntosJugador > puntosCrupier) {
            Console.WriteLine("¡Felicidades! Has ganado.");
        } else if (puntosJugador == puntosCrupier) {
            Console.WriteLine("Es un empate.");
        } else {
            Console.WriteLine("El crupier gana.");
        }

        Console.WriteLine($"Quedan {barajaNueva.CartasRestantes()} cartas en la baraja.");
    }
}
