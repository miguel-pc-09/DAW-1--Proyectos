using System;
using System.Collections.Generic;
using System.Linq;
// Clase que representa un jugador o el crupier
class Jugador
{
    public string Nombre { get; set; } // Nombre del jugador
    public List<Carta> Mano { get; private set; } // Cartas que tiene en la mano
    public bool EsCrupier { get; set; } // Indica si es el crupier
    
    public Jugador(string nombre, bool esCrupier = false)
    {
        Nombre = nombre;
        EsCrupier = esCrupier;
        Mano = new List<Carta>();
    }
    
    // Método para tomar una carta
    public void TomarCarta(Carta carta) => Mano.Add(carta);
    
    // Método para calcular el valor total de la mano del jugador
    public int ValorMano()
    {
        int total = Mano.Sum(c => c.Puntos);
        int ases = Mano.Count(c => c.Valor == "A");
        while (total > 21 && ases > 0)
        {
            total -= 10;
            ases--;
        }
        return total;
    }
    
    public override string ToString() => $"{Nombre}: {string.Join(", ", Mano)} (Valor: {ValorMano()})";
}