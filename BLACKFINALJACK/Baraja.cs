using System;
using System.Collections.Generic;
using System.Linq;
// Contiene la baraja y su funcionalidad.

// Clase que representa la baraja de cartas
class Baraja
{
    private List<Carta> cartas; // Lista de cartas en la baraja
    private static readonly string[] palos = { "Corazones", "Diamantes", "Tréboles", "Picas" };
    private static readonly string[] valores = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
    
    public Baraja()
    {
        cartas = new List<Carta>();
        foreach (var palo in palos)
            foreach (var valor in valores)
                cartas.Add(new Carta { Palo = palo, Valor = valor });
        Barajar();
    }
    
    // Método para barajar la baraja
    public void Barajar()
    {
        Random rng = new Random();
        cartas = cartas.OrderBy(c => rng.Next()).ToList();
    }
    
    // Método para sacar una carta de la baraja
    public Carta SacarCarta()
    {
        if (cartas.Count == 0) throw new InvalidOperationException("No quedan cartas en la baraja.");
        var carta = cartas[0];
        cartas.RemoveAt(0);
        return carta;
    }
}