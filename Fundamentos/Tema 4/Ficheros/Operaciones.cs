using System.Runtime.InteropServices.Marshalling;
using System.Security.Cryptography.X509Certificates;

class Operaciones
{
    // PASO 17 CREACION DEL METODO DE EXPORTAR(PASO 19 ABAJO), primero creamos una variable de tipo list. y la inicializamos aqui
    private List<Usuario> listaUsuarios;

    public Operaciones()
    {
        // 18º Creamos los usuarios aqui 
        listaUsuarios = new List<Usuario>();
        listaUsuarios.Add(new Usuario("miguel1","Perucha1","pmiguel@gmail.com1",123456789));
        listaUsuarios.Add(new Usuario("miguel2","Perucha2","pmiguel@gmail.com2",123456789));
        listaUsuarios.Add(new Usuario("miguel3","Perucha3","pmiguel@gmail.com3",123456789));
        listaUsuarios.Add(new Usuario("miguel4","Perucha4","pmiguel@gmail.com4",123456789));
        listaUsuarios.Add(new Usuario("miguel5","Perucha5","pmiguel@gmail.com5",123456789));
        listaUsuarios.Add(new Usuario("miguel6","Perucha6","pmiguel@gmail.com6",123456789));
        listaUsuarios.Add(new Usuario("miguel7","Perucha7","pmiguel@gmail.com7",123456789));
        listaUsuarios.Add(new Usuario("miguel8","Perucha8","pmiguel@gmail.com8",123456789));
    }

    // Metodo para obtener informacion de un fichero
    public void Obtenerinfirmacion(String path)
    {
        //1º Cogeremos la ruta del fichero con boton derecho copy path(copiar ruta del fichero)
        //2º
        Console.WriteLine("Leyendo el fichero "+ path);

        //3º Creacion del file para ver diferencia con el de Java
        //File.GetLastAccessTime(path); // File es una clase estatica, conjunto de metodos estatico y como tal podemos poner File.(elegir)

        // Lo sacaremos por consola con Console.WriteLine
     //    Console.WriteLine("Last Access Time: "+ File.GetLastAccessTime(path)); // Al ejecutar nos dira Last... y la fecha y hora en el momento de la ejecucion
        
        // 5º Atributos de la clase file
     //  Console.WriteLine("Atributos: "+ File.GetAttributes(path));// Devolvera un normal 

        // 6º Preguntar si existe
     // Console.WriteLine("Existe: "+ File.Exists(path)); // Devolvera un True o False 

        // Los metodos Los metodos Exits, GetLastAccessTime, GetAttributes, pertenece a la case. Un elemento que es estatico no necesita del objeto de tipo file
        // para ejecutar el metodo correspondiente.  

        // 7º Ahora decimos que queremos guardar o acceder a un objeto de tipo de file. Anteriormente accedi de forma directa, pero a veces lo queremos guardar en variables
        // , lo queremos persistir, o llevar a una variable de entorno, lo que se nos ocurra.
        /*FileInfo fileInfo = new FileInfo(path);
        Console.WriteLine("Last Access Time: "+ fileInfo.LastAccessTime); // Esto ya es un metodo normal y corriente. Tendremos lo mismo pero en vez de pertenecer a la clase,
        Console.WriteLine("Atributo: "+ fileInfo.Attributes); // pertenece al objeto.
        Console.WriteLine("Tamaño: "+ fileInfo.Length); 
        Console.WriteLine("Nombre del fichero: "+ fileInfo.Name); 
        Console.WriteLine("Directorio: "+ fileInfo.DirectoryName); 
        Console.WriteLine("Exist: "+ fileInfo.Exists);*/

        // Visto todo esto podemos hacer varias cosas 

        // 8º Sin la necesidad de crear ese fileinfo ahora desde el file.
        // Como devuelve un boolean podemos hacer -> IF por ejemplo
        if(!File.Exists(path)){ // Si no existe 
            File.Create(path); // me das el path
            Console.WriteLine("El fichero se ha creado");
        }
        else // En caso contrario podemos acceder al contenido de el mismo. Copiamos el anterior
        { 
            Console.WriteLine("El fichero ya existe");
            FileInfo fileInfo = new FileInfo(path);
            Console.WriteLine("Last Access Time: "+ fileInfo.LastAccessTime);
            Console.WriteLine("Atributo: "+ fileInfo.Attributes);
            Console.WriteLine("Tamaño: "+ fileInfo.Length);
            Console.WriteLine("Tamaño: "+ fileInfo.Length); 
            Console.WriteLine("Nombre del fichero: "+ fileInfo.Name); 
            Console.WriteLine("Directorio: "+ fileInfo.DirectoryName); 
            // Ahora en el paso 9º en program vamos a cambiar la ruta 
        }
        // Ahora si nos fijamos desde el file podemos hacer muchas cosas
        // podemos hacer la escritura directamente, podemos el anexado,copiarlo, obtener todos los byte que pertenecen al elemento correspondiente lo que queramos file.
        // Es recomendable hasta cierto pùnto solo hace lo que pide el metodo
        // Si queremos algo mas personalizado necesitaremos los FLUJOS DE DATOS DE ESCRITURA Y LECTURA
    }
        // 10º crearemos los metodos
       public void EscribirFichero(String path){
        // Queremos ahcer una escritura manual
           FileStream fileStream = new FileStream(path, FileMode.Append); // En modo Appen quiere decir lo mismo file.appendtext. Puesto modo escritura y APPEND si no lo ponemos lo pisa
           //fileStream.Write(123); // Se lo tenemos que decir en modo byte. Quitamos el fileStream y lo pasamos a StreamWriter
           StreamWriter streamWriter = new StreamWriter(fileStream);// Ahora para poder hacer la escritura
           streamWriter.WriteLine("hola");
           streamWriter.Write(123);
           // IMPORTANTE: Siempre cierro el flujo de la informacion streamWriter.Close();
           streamWriter.Close();
           // El cierre del flujo del filestream no es necesario, pero se puede poner
           fileStream.Close();
           // Ahora en el paso 11 iremos a program a ejecutar este metodo para escribir
       }

       // 12º Lecutra. Para la tarea, si no tiene permisos nos dara error. Nadie nos obliga en Java en cambio si.
       public void LeerFichero(String path)
       {
    //    FileStream fileStream = new FileStream(path, FileMode.Open); // En vez de abrir en modo append abriremos en modo OPEN: podemos tambien poner OpenOrCreate -> creara el archivo si no esta
        // Creamos flujo de datos con el StreamReader -> esto lo que hace es, tu me acabas de abrir el fichero lo pondre en modo lectura
    //    StreamReader streamReader = new StreamReader(fileStream);

        // 14º Con un Try Cath
        FileStream? fileStream = null; // Porque lo igualamos a nulo, para luego poder cerrarlo
        StreamReader? streamReader = null; // Lo mismo con Streamreader
        try
        {// 1º los inicializamos 
        fileStream = new FileStream(path, FileMode.Open);
        streamReader = new StreamReader(fileStream);
        // Copiamos lo de abajo
        String? linea = null;
    //    Console.WriteLine(linea);
        while ((linea = streamReader.ReadLine()) != null)
        {   //  para esto cambiaremos la linea del string diciendole si es nulo le diremos que mientras no sea nulo lo lea con streareader
            Console.WriteLine(linea);
        }

        }
        catch(FileNotFoundException e)
        {  // Capturamos el error 
        Console.WriteLine("El fichero no existe");
        Console.WriteLine(e.Message); // Para los warnig igual que el siguiente de abajo
        }
        catch(IOException e)
        {  // No tengo permisos no puedo leer. Capturamos 
        Console.WriteLine("Error de entrada/salida");
        Console.WriteLine(e.Message); // Ponemos esto para quitarnos el fallo o posible fallo 
        }
        catch(Exception e)
        {  // Caputura generica, cuidado porque con esta capturamos pero no sabemos el que. 
        Console.WriteLine("Error: "+e.Message);
        }
        finally
        { // Despues en el finali metemos los cierres y para que no den errores metemos ? para quitarnos el nullpointerexception
            try // Para quitarnos el IO de ambos
            {
                streamReader?.Close();
                fileStream?.Close();

            }catch (Exception e)
            {
                Console.WriteLine("Error al cerrar el fichero: "+ e.Message);
            }
         
        }




        // Ahora que tenemos el fichero en modo lectura lo que interesa es ir leyendo elemento a elemento 
    //  String? linea = streamReader.ReadLine(); // leer de linea en linea. Nos pondra nulo porque seguira leyendo para eso metemos ? para que lo sepa 
     //   String? linea = null;
    //    Console.WriteLine(linea);
        // Ahora en el paso 13 en program llamaremos al metodo para leer
        // 14º para no tener que escribir 4 o 5 veces el string linea. Ejecutaremos while
     //   while ((linea = streamReader.ReadLine()) != null)
     //   {   //  para esto cambiaremos la linea del string diciendole si es nulo le diremos que mientras no sea nulo lo lea con streareader
       //     Console.WriteLine(linea);
      //  }
        // Y cerramos flujos
      //  streamReader.Close();
      //  fileStream.Close();
        // PROBLEMAS que me puede dar esto. NADIE me a dicho de capturar errores. Para esto comentaremos los dos flujos de arriba FILE y Streamreader y pondremos otra cosa 14
        Console.WriteLine("fin del fichero");

       } 
           
    // 19º Metodo para exportar los datos, los meteremos de golpe añadiendo un path
    public void ExportarUsuarios(String path){

       if(!File.Exists(path))
       { 
           File.Create(path);
       }
       
       
       
        //1º Creamos el filestream en modo append y el streamwriter, pero podiamos por arriba de estos meter un if y file y steram igualamos a null.
        FileStream? fileStream = null;
        // new FileStream(path, FileMode.Append);
        StreamWriter? streamWriter = null;
        //new StreamWriter(fileStream);

        // Como sabemos que posiblemente de fallos hacemos el try catch
        try
        { 
            // Despues de poner los posibles errores crearemos la escritura, en modo append
            fileStream = new FileStream(path, FileMode.Append);
            streamWriter = new StreamWriter(fileStream);

            // Ahora queremos sacar cada uno de los usuarios con el foreach
            foreach (var item in listaUsuarios)
            {
                // Como ya tenemos el flujo de escritura y como item es de tipo usuario y tenemos un metodo de exportar lo podemos meter
                streamWriter.WriteLine(item.ExportarDato()); // Exportar() es un metodo de la clase usuario
            }
            
        }
        catch (FileNotFoundException e) // Error del fichero
        {
            Console.WriteLine("El fichero no existe");
            Console.WriteLine(e.Message);
        }
        catch (IOException e) // Error escritura
        {
            Console.WriteLine("Error de entrada/salida");
            Console.WriteLine(e.Message);
        } 
        finally                                                  // Paso 21 ahora en program en el main seguimos
        {
            try
            {
               streamWriter?.Close(); // Cerramos el flujo de datos
               fileStream?.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine("Error al cerrar el fichero: "+ e.Message); // Error en el cerrado
            }
        }
    }
    // 20º Metodo para importar los datos
        }
    

