public class Baraja
{
    // Atributos de Baraja
    private Dictionary<string, int> valores; // Para almacenar las cartas y sus valores
    private Random random; // Generar numeros aleatorios 

    // Constructor 
    public Baraja()
    {
        valores = new Dictionary<string, int>(); // Inicia el Dicionario 
        random = new Random(); // Genera un numero aleatorio
        GenerarBaraja(); // llama y llena la baraja 

    }
    // Metodo GenerarBaraja 
    public void GenerarBaraja()
    {
        string[] palos = { "Corazones", "Treboles", "Picas", "Diamantes" }; // Declaramos array de tipo string que contiene los palos
        string[] figuras = { "J", "Q", "K" }; // declaramos array de tipo string que contiene las figuras

        // Con este foreach recorremos palos y cada iteracion toma un palo 
        foreach (string palo in palos)
        {
            //Con for generamos las cartas del 1 al 10
            for (int i = 1; i <= 10; i++)
            {
                {
                    valores.Add($"{palo} {i}", (i == 1) ? 11 : i);  // añade com Add al diccionario y usamos formateo
                }// 🔹 As inicialmente vale 11

                // Con este otro pondremos las figuras y su valor
                foreach (string figura in figuras)
                {
                    string carta = $"{palo} {figura}";
                    if (!valores.ContainsKey(carta)){
                        valores.Add(carta,10);
                    }
                }
            }
        }
    }

    //Creacio del metodo RobarCarta 
    public string RobarCarta()
    {
        if (valores.Count == 0) // si no hay cartas en la baraja salta el mensaje, de lo contrario...
        {
            return "⚠️ No hay cartas ⚠️";
        }
        List<string> cartasDisponibles = new List<string>(valores.Keys);
        string cartaElegida = cartasDisponibles[random.Next(cartasDisponibles.Count)]; // Selecciona una carta aleatoria

        // Despues eliminamos la carta de la baraja y no vuelve a salir
        valores.Remove(cartaElegida);

        return cartaElegida;
    }

    // Metodo ObtenerValor
    public int ObtenerValor(string carta)
    {
        return valores.ContainsKey(carta) ? valores[carta] : 0; // Si la carta esta en la baraja devuelve su valor, si no 0
    }

    // MEtodo CartasRestantes : Para saber cuantas cartas quedan sin saber su valor, se puede quitar si quereis
    public int CartasRestantes()
    {
        return valores.Count; // mostrara un ejemplo : "Quedan 3 cartas en la baraja" esto colocar en el main
                              // Console.WriteLine($"Quedan {baraja.CartasRestantes()} cartas en la baraja");
    }
}
//Dejo emogis para poner en el main o en los mensajes para dejarlo mas chulo  🏦 ♠️ ♥️ ♣️ ♦️ 🂡 🂢 🂣 🂤 🂥 🂦 🂧 🂨 🂩 🂪 🂫 🂭 🂮 
//💰  🪙  algunas se ven verdes pero cuando se quitan salen 
