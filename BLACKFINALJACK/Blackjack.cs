using System;
// Clase principal del juego Blackjack
class Blackjack
{
    private Baraja baraja;
    private Jugador jugador;
    private Jugador crupier;
    
    public Blackjack()
    {
        baraja = new Baraja();
    }
    
    // Método para iniciar el juego
    public void Iniciar()
    {
        Console.WriteLine("♠️ ♦️ Bienvenido al Blackjack! ♥️ ♣️");
        Console.WriteLine("==============================");
        Console.WriteLine("♠️ ♦️      BLACKJACK      ♥️ ♣️");
        Console.WriteLine("==============================");
        Console.Write("Ingrese su nombre: ");
        string nombreJugador = Console.ReadLine();
        jugador = new Jugador(nombreJugador);
        crupier = new Jugador("Crupier", true);
        
        while (true)
        {
            JugarRonda();
            Console.Write("¿Quieres jugar otra vez? (s/n): ");
            if (Console.ReadLine().ToLower() != "s") break;
        }
    }
    
    // Método para jugar una ronda
    private void JugarRonda()
    {
        baraja.Barajar();
        jugador.Mano.Clear();
        crupier.Mano.Clear();

        jugador.TomarCarta(baraja.SacarCarta());
        jugador.TomarCarta(baraja.SacarCarta());
        crupier.TomarCarta(baraja.SacarCarta());
        crupier.TomarCarta(baraja.SacarCarta());
        
        Console.WriteLine(jugador);
        Console.WriteLine($"Crupier: {crupier.Mano[0]}, [Carta Oculta]");
        
        TurnoJugador();
        TurnoCrupier();
        DeterminarGanador();
    }
    
    // Método para el turno del jugador
    private void TurnoJugador()
    {
        while (true)
        {
            Console.Write("¿Quieres pedir carta (p) o quedarte (q)? ");
            string input = Console.ReadLine().ToLower();
            if (input == "p")
            {
                jugador.TomarCarta(baraja.SacarCarta());
                Console.WriteLine(jugador);
                if (jugador.ValorMano() > 21)
                {
                    Console.WriteLine("Te pasaste de 21, pierdes.");
                    return;
                }
            }
            else if (input == "q")
                break;
        }
    }
    
    // Método para el turno del crupier
    private void TurnoCrupier()
    {
        Console.WriteLine(crupier);
        while (crupier.ValorMano() < 17)
        {
            crupier.TomarCarta(baraja.SacarCarta());
            Console.WriteLine(crupier);
        }
    }
    
    // Método para determinar el ganador de la partida
    private void DeterminarGanador()
    {
        int puntosJugador = jugador.ValorMano();
        int puntosCrupier = crupier.ValorMano();
        
        if (puntosJugador > 21)
            Console.WriteLine("Has perdido.");
        else if (puntosCrupier > 21 || puntosJugador > puntosCrupier)
            Console.WriteLine("¡Has ganado!");
        else if (puntosJugador == puntosCrupier)
            Console.WriteLine("Empate.");
        else
            Console.WriteLine("Has perdido.");
    }
}