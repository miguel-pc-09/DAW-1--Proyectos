using System.Linq.Expressions;

class Operaciones
{
    // Lista de las tareas 
    private List<Tarea> listaTareas;

    // Constructor para crear la lista vacia
    public Operaciones()
    {
        listaTareas = new List<Tarea>();

    }
    // Crear Tarea
    public void CrearTarea(string path)
    {
        Console.WriteLine("Nombre: ");
        string? nombre = Console.ReadLine();

        Console.WriteLine("Descripcion: ");
        string? descripcion = Console.ReadLine();

        Console.WriteLine("Tipo (personal, trabajo o ocio): ");
        string? entrada = Console.ReadLine();
        Tipo tipo;
        bool tValido = Enum.TryParse<Tipo>(entrada, ignoreCase: true, out tipo);
        if (!tValido)
        {
            Console.WriteLine("No valido, solo: personal, trabajo o ocio");
            return;
        }

        Console.WriteLine("Prioridad, recuerda indicar True o False: ");
        bool prioridad = bool.Parse(Console.ReadLine());

        Tarea tarea = new Tarea(nombre, descripcion, tipo, prioridad);
        listaTareas.Add(tarea);
        try
        {
            FileStream fileStream = new FileStream(path, FileMode.Append);
            StreamWriter streamWriter = new StreamWriter(fileStream);

            streamWriter.WriteLine(tarea.ExportarDato());

            streamWriter.Close();
            fileStream.Close();

            Console.WriteLine("Tarea creada correctamente. ");
        }
        catch (FileNotFoundException e)
        {
            Console.WriteLine("Archivo no encontrado al intentar escribir.");
            Console.WriteLine(e.Message);
        }
        catch (IOException e)
        {
            Console.WriteLine("Error entrada/salida escribir el archivo. ");
            Console.WriteLine(e.Message);
        }

    }

    // Obtener la informacion 
    public void ObtenerInformacion(String path)
    {
        Console.WriteLine("Obteniendo fichero: " + path);
        try
        {

            if (!File.Exists(path))// Si no existe
            {
                File.Create(path); // creas
                Console.WriteLine("El fichero se a creado. ");
            }
            else
            {
                Console.WriteLine("El fichero ya existe.");
                FileInfo fileInfo = new FileInfo(path);
                Console.WriteLine("Last Access Time: " + fileInfo.LastAccessTime);
                Console.WriteLine("Atributo: " + fileInfo.Attributes);
                Console.WriteLine("Tamaño: " + fileInfo.Length);
                Console.WriteLine("Nombre del fichero: " + fileInfo.Name);
                Console.WriteLine("Directorio: " + fileInfo.DirectoryName);
            }
        }
        catch (IOException e)
        {
            Console.WriteLine("Error de entrada/salida al obtener información.");
            Console.WriteLine(e.Message);
        }


    }

    // metodo para leer lo que contiene el fichero
    public void LeerFichero(String path)
    {
        FileStream? fileStream = null;
        StreamReader? streamReader = null;
        try
        {
            fileStream = new FileStream(path, FileMode.Open);
            streamReader = new StreamReader(fileStream);

            String? linea = null;
            while ((linea = streamReader.ReadLine()) != null)
            {
                Console.WriteLine(linea);
            }
        }
        catch (FileNotFoundException e)
        {
            Console.WriteLine("El fichero no existe");
            Console.WriteLine(e.Message);
        }
        catch (IOException e)
        {
            Console.WriteLine("Error de entrada/salida");
            Console.WriteLine(e.Message);
        }
        catch (Exception e)
        {
            Console.WriteLine("Error: " + e.Message);
        }
        finally
        {
            try
            {
                streamReader?.Close();
                fileStream?.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine("Error al cerrar el fichero: " + e.Message);
            }
        }
    }

    // metodo para exportar tarea
    public void ExportarTarea(string path)
    {
        if (!File.Exists(path))
        {
            File.Create(path).Close();
        }
        FileStream? fileStream = null;
        StreamWriter? streamWriter = null;

        try
        {
            fileStream = new FileStream(path, FileMode.Append);
            streamWriter = new StreamWriter(fileStream);

            foreach (var item in listaTareas)
            {
                streamWriter.WriteLine(item.ExportarDato());
            }
        }
        catch (FileNotFoundException e)
        {
            Console.WriteLine("La tarea no existe");
            Console.WriteLine(e.Message);
        }
        catch (IOException e)
        {
            Console.WriteLine("Error de entrada / salida");
            Console.WriteLine(e.Message);
        }
        finally
        {
            try
            {
                streamWriter?.Close();
                fileStream?.Close();
            }
            catch (IOException e)
            {
                Console.WriteLine("Error al cerrar el fichero: " + e.Message);
            }
        }


    }

    // Metodo para eliminar tarea
    public void EliminarTarea(String path)
    {
        // importamos las tareas 
        ImportarTarea(path);

        Console.WriteLine("Que tarea desea eliminar. Indique su ID: ");
        int identificador = int.Parse(Console.ReadLine());

        Tarea? tareaEliminar = null;

        foreach (var tarea in listaTareas)
        {
            if (tarea.identificador == identificador)
            {
                tareaEliminar = tarea;
                break;
            }
        }

        if (tareaEliminar != null)
        {
            listaTareas.Remove(tareaEliminar); // Si lista tarea es distinta de null, le decimos que de listatareas borre (tareaeliminar)

            try
            {
                FileStream fileStream = new FileStream(path, FileMode.Create);
                StreamWriter streamWriter = new StreamWriter(fileStream);

                foreach (Tarea item in listaTareas)
                {
                    streamWriter.WriteLine(item.ExportarDato());
                }

                streamWriter.Close();
                fileStream.Close();

                Console.WriteLine("Tarea eliminada correctamente.");
            }
            catch (IOException e)
            {
                Console.WriteLine("Error al eliminar la tarea y reescribir el fichero.");
                Console.WriteLine(e.Message);

            }
        }
        else
        {
            Console.WriteLine("No se encontro el ID de la tarea.");
        }

    }

    // Metodo para importar tarea
    public void ImportarTarea(string path)
    {
        if (!File.Exists(path))
        {
            Console.WriteLine("No se puede importar, el fichero no existe.");
            return;
        }

        listaTareas.Clear();// Borra contenido en memoria

        try
        {
            // leo todas las lineas del fichero y lo guardo en un array 
            string[] lineas = File.ReadAllLines(path);

            // foreach para recorrer cada linea del fichero     
            foreach (string linea in lineas)
            {   // Separacion de la linea en partes usando la coma 
                string[] parte = linea.Split(',');

                // Verifico que cada linea contenga el numero de partes que corresponde
                if (parte.Length == 5)
                {
                    // y aqui asigno cada parte 
                    int id = int.Parse(parte[0]);  // id en la primera posicion 
                    string nombre = parte[1];     // nombre en la segunda
                    string descripcion = parte[2]; // descripcion
                    Tipo tipo = Enum.Parse<Tipo>(parte[3]); // los tipos 
                    bool prioridad = bool.Parse(parte[4]); // el bool 

                    // creo una nueva tarea
                    Tarea tarea = new Tarea(id, nombre, descripcion, tipo, prioridad);
                    listaTareas.Add(tarea);
                }
            }
        }
        catch (IOException e)
        {
            Console.WriteLine("Error de entrada/salida al leer el fichero.");
            Console.WriteLine(e.Message);
        }
        catch (FormatException e)
        {
            Console.WriteLine("Error de formato en los datos del fichero.");
            Console.WriteLine(e.Message);
        }
    }
}





