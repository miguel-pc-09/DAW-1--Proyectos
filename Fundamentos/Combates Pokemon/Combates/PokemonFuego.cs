class PokemonFuego : Pokemon
{
    public PokemonFuego(string nombre) : base(nombre, "Fuego")
    {
        
        AgregarHabilidad(new Habilidad("Arañazo ", 15));
        AgregarHabilidad(new Habilidad("Ascuas ",25));
        AgregarHabilidad(new Habilidad("Lanzallamas ",50));
    }
}