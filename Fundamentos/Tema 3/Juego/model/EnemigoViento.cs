class EnemigoViento : Enemigo
{
    // no tenemos nada -> el vacio
    // En una herencia un elemtno hera todos los atributos y metodos de su padre excepto los privados y los constructores a no ser que estos sean escritos
    private  int fuerzaViento {get; set;}
    private int cantidadViento {get; set;}

    // nombre, nivel, vida
     // nombre, nivel, vida
    public EnemigoViento()
    {

    }
    public EnemigoViento(string nombre, int vida, int nivel,Perfil perfil, int fuerzaViento, int cantidadViento) : base (nombre, vida, nivel,perfil)
    {
        this.cantidadViento = cantidadViento;
        this.fuerzaViento = fuerzaViento;
    }
    

    public new void MostrarDatos()
    {
        Console.WriteLine("Fuerza de viento " + this.fuerzaViento);
        Console.WriteLine("Cantidad de viento " + this.cantidadViento);
        base.MostrarDatos();
    }

   

    public override void realizarAtaque()
    {
        Console.WriteLine("Ataque realizado con Viento correctamente");
    }
}