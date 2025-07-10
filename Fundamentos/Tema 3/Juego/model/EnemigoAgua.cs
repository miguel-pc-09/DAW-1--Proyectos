class EnemigoAgua : Enemigo, Mortal
{
    // no tenemos nada -> el vacio
    // En una herencia un elemtno hera todos los atributos y metodos de su padre excepto los privados y los constructores a no ser que estos sean escritos
    public int nivelAgua {get; set;}
    public string poderAgua {get; set;}

    // nombre, nivel, vida
    public EnemigoAgua (string nombre, int vida, int nivel,Perfil perfil, int nivelAgua, string poderAgua):base(nombre, vida, nivel,perfil)
    {
        this.nivelAgua = nivelAgua;
        this.poderAgua = poderAgua;
    }

    public EnemigoAgua (string nombre, int nivelAgua, string poderAgua):base(nombre)
    {
        this.nivelAgua = nivelAgua;
        this.poderAgua = poderAgua;
    }

    public void mostrarDatos()
    {
        Console.WriteLine("El nivelAgua de agua  del enemigo es: "+ nivelAgua);
        Console.WriteLine("El nivel de poder de agua del enemigo  es: "+ poderAgua);
        base.MostrarDatos();
    }

    public void rellenarAgua()
    {
        Console.WriteLine("Se procede a curarse todas las heridas.");
    }

    public override void realizarAtaque()
    {
        Console.WriteLine("El enemigo ataca con un tornado"+ poderAgua);
    }

    public void realizarAtaqueMortal1()
    {
        Console.WriteLine("Ataque mortal 1 de agua  en proceso");
    }

    public void realizarAtaqueMortal2()
    {
        Console.WriteLine("Ataque mortal 2 de agua  en proceso");
    }
}