class PokemonAgua : Pokemon
{
     public PokemonAgua(string nombre) : base(nombre, "Fuego")
    {
        AgregarHabilidad(new Habilidad("Arañazo ", 15));
        AgregarHabilidad(new Habilidad("Pistola Agua ",25));
        AgregarHabilidad(new Habilidad("Surf ",50));
    }
    
    
}