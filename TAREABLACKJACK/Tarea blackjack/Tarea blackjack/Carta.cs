public class Carta {
    
public string Palo { get; private set; }
public string Valor { get; private set; } //Esto no se si esta bien me lo recomendo el IDE para quitar el error.
public int Puntuacion { get; private set; }

    public Carta(string palo, string valor, int puntuacion)
    {
        Palo = palo;
        Valor = valor;
        Puntuacion = puntuacion;
    }

public override string ToString() //Para que se muestre "5 de Corazones"
    {
        return $"{Valor} de {Palo}";
    }
}