class Operaciones 
{
    private List<Usuario> listataUsuarios ;
    public Operaciones ()
    {
        listataUsuarios = new List<Usuario>();
        listataUsuarios.Add(new Usuario("Miguel1","Perucha1", "mperucha@gmail.com1", 123434556));
        listataUsuarios.Add(new Usuario("Miguel2","Perucha2", "mperucha@gmail.com2", 123434556));
        listataUsuarios.Add(new Usuario("Miguel3","Perucha3", "mperucha@gmail.com3", 123434556));
        listataUsuarios.Add(new Usuario("Miguel4","Perucha4", "mperucha@gmail.com4", 123434556));
        listataUsuarios.Add(new Usuario("Miguel5","Perucha5", "mperucha@gmail.com5", 123434556));
        listataUsuarios.Add(new Usuario("Miguel6","Perucha6", "mperucha@gmail.com6", 123434556));
        listataUsuarios.Add(new Usuario("Miguel7","Perucha7", "mperucha@gmail.com7", 123434556));
    }
    
    public void ObtenerInformacion(string path)
    {
        Console.WriteLine("Leyendo el fichero "+ path);
        /* Console.WriteLine("Last Access Time: "+ File.GetLastAccessTime(path));
        Console.WriteLine("Atributos: "+ File.GetAttributes(path));
        Console.WriteLine("Existe: "+ File.Exists(path)); */
        /* FileInfo fileInfo = new FileInfo(path);
        Console.WriteLine("Last Access Time: "+ fileInfo.LastAccessTime);// Ahora pertenece al objeto
        Console.WriteLine("Atributo: "+ fileInfo.Attributes);
        Console.WriteLine("Tamaño: "+ fileInfo.Length);
        Console.WriteLine("Nombre: "+ fileInfo.Name);
        Console.WriteLine("Directorio: "+ fileInfo.Directory);
        Console.WriteLine("Exist: "+ fileInfo.Exists); */

        // File.Exists(path); -> Como devuelve un booleano pues podemos hacer un if 
        if(!File.Exists(path))// -> Si no existe quiero que hagas algo 
        {
            File.Create(path);
            Console.WriteLine("El fichero no existe, se ha creado.");
        }
        else
        {
            Console.WriteLine("El fichero existe.");
            FileInfo fileInfo = new FileInfo(path);
            Console.WriteLine("Last Access Time: "+ fileInfo.LastAccessTime);// Ahora pertenece al objeto
            Console.WriteLine("Atributo: "+ fileInfo.Attributes);
            Console.WriteLine("Tamaño: "+ fileInfo.Length);
            Console.WriteLine("Nombre: "+ fileInfo.Name);
            Console.WriteLine("Directorio: "+ fileInfo.Directory);
        }
    }

    public void EscribirFichero(string path)
    {
        FileStream fileStream = new FileStream (path, FileMode.Append);// Fichero puesto en modo escritura, en modo Append -> si no lo hacemos pisa el fichero una y otra vez
        StreamWriter streamWriter = new StreamWriter(fileStream);// Flujo de escritura
        streamWriter.WriteLine("Hola");
        streamWriter.Write(123);
        // Siempre cierro el flujo de la informacion 
        streamWriter.Close();
        fileStream.Close();
    }

    public void LeerFichero(string path)
    {
        //FileStream fileStream = new FileStream(path, FileMode.Open);// Metemos el modo Open para solo lectura
        //StreamReader streamReader = new StreamReader(fileStream);

        FileStream? fileStream = null;
        StreamReader? streamReader = null;

        try
        {
            fileStream = new FileStream(path, FileMode.Open);// Metemos el modo Open para solo lectura
            streamReader = new StreamReader(fileStream);
            String? linea = null; // streamReader.ReadLine();// igualaremos a null de primeras 
            //Console.WriteLine(linea);
            // Como no sabemos cuantas lineas puede contener le llamamos con un while -> mientras la linea sea distinto de null
            while((linea =streamReader.ReadLine()) != null) // Lee la linea y si es distinto de nulo 
            {
                Console.WriteLine(linea);
            }
        }
        catch (FileNotFoundException e) // Que no exista el fichero 
        {
            Console.WriteLine("El fichero no existe ");
            Console.WriteLine(e.Message);
        }
        catch(IOException e) // Puede o no tener permisos de lectura
        {
            Console.WriteLine("Error en la entrada/salida.");
            Console.WriteLine(e.Message);
        }
        catch(Exception e)
        {
            Console.WriteLine("Error: "+ e.Message);
        }
        finally
        {
            try
            {
                streamReader?.Close(); // Ponemos ? para quitar el nullPointer
                fileStream?.Close();

            }catch (Exception e)
            {
                Console.WriteLine("Error al cerrar el fichero: "+e.Message);
            }
        }


        

        Console.WriteLine("Fin del fichero. ");
    }

        
    public void ExportarUsuarios(String path)
    {
        if(!File.Exists(path))
        {
            File.Create(path);
        }

        FileStream? fileStream = null;
        
        StreamWriter? streamWriter = null;
        
        try
        {
            fileStream = new FileStream(path, FileMode.Append);
            streamWriter = new StreamWriter(fileStream);
            foreach (var item in listataUsuarios)
            {
                streamWriter.WriteLine(item.ExportarDato());
            }
        }
        catch (FileNotFoundException e)
        {
            Console.WriteLine("El fichero no existe");
            Console.WriteLine(e.Message);
        
        }
        catch(IOException e) 
        {
            Console.WriteLine("Error de entrada/salida");
            Console.WriteLine(e.Message);
        }
        finally 
        {
            try
            {
                streamWriter?.Close();
                fileStream?.Close();
            }
            catch(Exception e)
            {
                Console.WriteLine("Error al cerrar el fichero: "+e.Message);
            }
        }
    }

}