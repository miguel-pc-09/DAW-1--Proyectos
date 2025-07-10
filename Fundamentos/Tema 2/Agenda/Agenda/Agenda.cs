using System.Reflection.Metadata;

public class Agenda 
{
    // Variables
    private Dictionary<string, string > personas = new Dictionary<string, string>()
    {
        {"001A", "Borja"},
        {"001B", "Miguel"},
        {"001C", "Juan"},
        
    };
    // "00000000001", "Miguel"

    // C agregar datos
    public void AgregarPersona(string dni, string nombre)
    {
        // Para antes de agregar le diremos que mire primero
        if(personas.ContainsKey(dni)) // ContaisKey // Devolvera un bool, lo metemos con if
        {
            Console.WriteLine("Error al agregar, el dni esta en la lista. ");
        }
        else 
        {
            personas.Add(dni, nombre);
            Console.WriteLine("Persona añadida correctamente. ");
        }  
        // Al poner la firma con String dni y string nombre no hace falta el otro
        //personas.Add(dni, nombre);
        //personas.Add("001D", "Pepe");
    }
    // R obtener datos
    public void ObtenerPersona(string dni)
    {
        // Segunda opcion añadiendo despues de dni, "Sin resultados"
        string value = personas.GetValueOrDefault(dni,"Sin resultados"); // Este metodo devolvera un string asi que podremos igualarlo a string 
        
        Console.WriteLine("El nombre del usuario: "+value);

        //1º opcion 
        /*if(value != null)
        {
        Console.WriteLine("El nombre del usuario: "+value.Length);
        }
        else 
        {
            Console.WriteLine("Persona no encontrada");
        }*/

    }
    // R listar datos
    // Como podemos listar todos los datos de un array o un list for(0...lengght/count)
    public void ListarTodos()
    {
        foreach (KeyValuePair<string,string> item in personas)
        {
            Console.WriteLine(item.Value); // Aqui solo sacaria el valor del dni
            // Console.WriteLine(item.key + " " + item.Value); -> sacara el dni y nombre 
        }
    }

    // mostrando solo un dato 
    public void MostrarPrimerDato()
    {
        Console.WriteLine("El elemento en la primera posicion es: "+personas["001A"].ToString());
    }
    // U actualizar datos
    // D borrar datos. Para borrar tenemos dos opciones 1º dandole en la firma string dni, 
    public bool BorrarDatos(string dni) // Al tener bool y sobre todo el retorno podemos tratar la respuesta en otra clase como la entrada con un if
    {
        // Antes de borrar existe clave?
        return personas.Remove(dni);
    }

    
}