public class Habilidad
{
    public string? nombre {get; }
    public int ataque {get; }

    public Habilidad(string nombre, int ataque)
    {
        this.nombre = nombre;
        this.ataque = ataque;
    }

}