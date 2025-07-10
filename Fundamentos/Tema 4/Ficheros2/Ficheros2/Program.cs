class Program 
{
    static void Main(string[] args)
    {
        Console.WriteLine("Trabajo con ficheros");
        Operaciones operaciones = new Operaciones();
        //operaciones.ObtenerInformacion(@"\Users\migue\Documents\GitHub\Fundamentos\Tema 4\Ficheros2\Ficheros2\informacion.txt");
        // Si cambiamos la ruta y no existe gracias al if lo creara 
        //operaciones.ObtenerInformacion(@"\Users\migue\Documents\GitHub\Fundamentos\Tema 4\Ficheros2\Ficheros2\Escritura.txt");
        //operaciones.EscribirFichero(@"\Users\migue\Documents\GitHub\Fundamentos\Tema 4\Ficheros2\Ficheros2\Escritura.txt");
        operaciones.ExportarUsuarios(@"\Users\migue\Documents\GitHub\Fundamentos\Tema 4\Ficheros2\Ficheros2\Usuarios.txt");
    }
}

