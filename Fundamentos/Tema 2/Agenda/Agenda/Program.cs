public class MyClass
{
    public static void Main(string[] args)
    {
        // Con esto ya se a creado la agenda Y con los que ya estaban creados por defecto 
        Agenda agenda = new Agenda();
        //[{B},{M},{J}]

        agenda.AgregarPersona("001D", "Marcos");
        // Ahora dentro estaran [{B},{M},{J},{M}]

        // Si ejecutamos esto mismo dni pero distinto nombre
        agenda.AgregarPersona("001E", "Beatriz");
        // Saldra un error, porque la clave esta repetida

        agenda.ObtenerPersona("001A"); // Devolvera la persona con este dni

        // Pero si buscamos un dni que no esta...
        agenda.ObtenerPersona("001Z"); // como le pusimos que diese el valor no imprimira nada pero no dara error

        // mostrar el primero
        agenda.MostrarPrimerDato();

        // Si en el metodo pusieramos +value.Lenght -> error NullReferenceException 

        agenda.BorrarDatos("001F"); // con la primera opcion -> no dara error si no un false 

        //agenda.BorrarDatos("001A");// El primero deberia quedar borrado, Ahora cambiemos el void por bool 
        if(agenda.BorrarDatos("001A"))
        {
            Console.WriteLine("Borrado correctamente. ");
        }
        else
        {
            Console.WriteLine("Fallo en el borrado");
        }

        agenda.ListarTodos();
    }
}