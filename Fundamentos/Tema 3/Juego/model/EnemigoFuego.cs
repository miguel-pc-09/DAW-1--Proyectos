class EnemigoFuego : Enemigo, Mortal
{
    // no tenemos nada -> el vacio
    // En una herencia un elemtno hera todos los atributos y metodos de su padre excepto los privados y los constructores a no ser que estos sean escritos
    private  int nivelFuego {get; set;}
    private string poderEspecial {get; set;}

    // nombre, nivel, vida
     // nombre, nivel, vida
    public EnemigoFuego()
    {

    }
    public EnemigoFuego(string nombre, int vida, int nivel,Perfil perfil, int nivelFuego, string poderEspecial) : base (nombre, vida, nivel, perfil)
    {
        this.nivelFuego = nivelFuego;
        this.poderEspecial = poderEspecial;
    }
    

    public new void mostrarDatos()
    {
        Console.WriteLine("Nivel fuego "+this.nivelFuego);
        Console.WriteLine("Poder especial "+this.poderEspecial);
        base.MostrarDatos();
    }

    public void realizarSanacion()
    {
        Console.WriteLine("El enemigo de fuego procede a curarase");
    }

    public override void realizarAtaque()
    {
        Console.WriteLine("Ataque realizado con fuego correctamente");
    }

    public void realizarAtaqueMortal1()
    {
        Console.WriteLine("Ataque mortal 1 de fuego  en proceso");
    }

    public void realizarAtaqueMortal2()
    {
        Console.WriteLine("Ataque mortal 1 de fuego  en proceso");
    }
}