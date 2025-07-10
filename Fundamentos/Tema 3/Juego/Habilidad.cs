public class Habilidad 
{
    private string? nombre;
    private int potenciador;
    private int vida;

    public Habilidad(){}

    public Habilidad(string nombre, int potenciador, int vida)
    {
        this.nombre = nombre;
        this.potenciador = potenciador;
        this.vida = vida;
    }

    public string? GetNombre()
    {
        return this.nombre;
    }

    public int GetVida()
    {
        return this.vida;
    }

    public int GetPotenciador()
    {
        return this.potenciador;
    }
    public void SetVida(int vida)
    {
        this.vida = vida;
    }
    public void SetNombre(string nombre)
    {
        this.nombre = nombre;
    }
}