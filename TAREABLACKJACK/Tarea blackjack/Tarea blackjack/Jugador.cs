public class Jugador {

public string Nombre {get; private set; }
public List<string> Mano { get; private set; }//Ahora es lista de strings
public bool EsCrupier { get; private set; }
private Baraja baraja;


    public Jugador(string nombre, Baraja baraja, bool esCrupier = false){
        Nombre = nombre;
        EsCrupier = esCrupier;
        Mano = new List<string>();
        this.baraja = baraja;
    }
   public void RecibirCarta(string carta){
        Mano.Add(carta);
   }  
    
    public int CalcularPuntaje(){
        int total = 0;
        int cantidadAs = 0;

        foreach (var carta in Mano){
            if(carta.Contains("1")){ //si es as
                cantidadAs++;
                total += 1; // lo consideramos 1
            } else {
                total += baraja.ObtenerValor(carta);
            }
        }

       // Ajustar Ases (vale 1 u 11
        while (cantidadAs > 0 && total + 10 <= 21) {
            total += 10; // Convierte un As de 1 a 11
            cantidadAs--;
        }

        return total;
    }

public bool EstaEliminado(){
     return CalcularPuntaje() > 21;
}

public bool PedirCarta(){
     return EsCrupier && CalcularPuntaje() <= 17; //El crupier pide cartas hasta que sea 17
}

    public override string ToString() {
        return $"{Nombre} tiene: {string.Join(", ", Mano)} (Puntuación: {CalcularPuntaje()})";
    }
            
        }