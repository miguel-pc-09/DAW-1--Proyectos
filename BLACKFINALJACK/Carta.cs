using System;
using System.Collections.Generic;
using System.Linq;

// Clase que representa una carta en el juego
class Carta
{
    public string Palo { get; set; } = string.Empty; // Tipo de palo (Corazones, Diamantes, etc.)
    public string Valor { get; set; } = string.Empty; // Valor de la carta (2, 3, J, Q, K, A)
    
    // Propiedad para calcular los puntos de la carta
    public int Puntos
    {
        get
        {
            if (int.TryParse(Valor, out int numero)) return numero;
            if (Valor == "A") return 11;
            return 10;
        }
    }
    public override string ToString() => $"{Valor} de {Palo}";
}