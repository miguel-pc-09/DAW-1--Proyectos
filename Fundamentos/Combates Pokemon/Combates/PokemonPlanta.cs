class PokemonPlanta : Pokemon
{
     public PokemonPlanta(string nombre) : base(nombre, "Fuego")
    {
        AgregarHabilidad(new Habilidad("Arañazo ", 15));
        AgregarHabilidad(new Habilidad("Hoja Afilada ",25));
        AgregarHabilidad(new Habilidad("Rayo solar ",50));
    }
}