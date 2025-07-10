// Clase base del resto de los elementos -> SUPERCLASE
using System.Reflection;

abstract public class Enemigo
{
    public Perfil perfil {get; set;}
    public string nombre {get; set;}
    public  int vida {get; set;}
    public int poder {get; set;}


    public Enemigo(){}

    public Enemigo(string nombre, int vida, int poder, Perfil perfil)
    {
        this.nombre = nombre;
        this.vida = vida;
        this.poder = poder;
        this.perfil = perfil;
    }
    public Enemigo(string nombre)
    {
        this.nombre = nombre;
        this.vida = 100;
        this.poder = 50;
    }
    public string GetNombre()
    {
        return this.nombre;
    }
    public void MostrarDatos()
    {
        Console.WriteLine("El nombre del enemigo: "+ nombre);
        Console.WriteLine("El nivel de vida del enemigo es: "+ vida);
        Console.WriteLine("El nivel de poder del enemigo  es: "+ poder);
        Console.WriteLine("El perfil del enemigo es "+ perfil.nombre);
        Console.WriteLine("El perfil del enemigo ha otorgado un multiplicador de daño de "+ perfil.nivelDanio);
        Console.WriteLine("El perfil del enemigo ha otorgado un multiplicador de defensa de "+ perfil.nivelDefensa);
    }
    public abstract void realizarAtaque();

   
}