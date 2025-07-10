public abstract class Pokemon
{
    //Pokemon Tendran: Vida, Nombre, Tipo, Ataques, Curacion
    // Atributos
    private string? nombre {get; set;}
    private string tipo{get; set;}
    private int vida {get; set;}// misma vida para todos
    private int pociones = 2;
    private List<Habilidad> Habilidades {get; } = new List<Habilidad> ();
    
    

    //Constructores
    //vacio
    public Pokemon(){}

    public Pokemon(string nombre, string tipo)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = 300;
    }
        

    // Mostrar datos del pokemon
    public void mostrarDatos()
    {
        Console.WriteLine("Bien escogiste a: "+nombre);
        Console.WriteLine("Su vida es: "+vida);
        Console.WriteLine("Y es de tipo: "+tipo);
        Console.WriteLine("Sus habilidades son: ");
        foreach (var habilidad in Habilidades)
        {
            Console.WriteLine(" "+ habilidad.nombre+ "Ataque: "+habilidad.ataque);
        }
        Console.WriteLine("Pociones disponibles: "+pociones+ "\n");
    }

    // Habilidades
    public void AgregarHabilidad(Habilidad habilidad)
    {
        Habilidades.Add(habilidad);
    }

    // Metodo para quitar vida por el daño
    public void quitarVida(int danio)
    {
        this.vida -= danio;
        if(this.vida <= 0){
            Console.WriteLine("Pokemon derrotado");
        } 
    }


}