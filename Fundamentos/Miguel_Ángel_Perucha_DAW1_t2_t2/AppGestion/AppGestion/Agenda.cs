using System.Security.Cryptography.X509Certificates;

public class Agenda
{
    private Dictionary<string , string> usuario = new System.Collections.Generic.Dictionary<string , string>();
    private Dictionary<string, Entreno> entrenos = new Dictionary<string, Entreno>();
     
    
     // Agregrar Usuarios
    public void AgregarUsuario(string correo, string contraseña)
    {
        
        if (usuario.ContainsKey(correo))
        {
            Console.WriteLine("El usuario ya existe");
        }
        else
        {
            usuario.Add(correo,contraseña);
            entrenos.Add(correo, new Entreno()); // Para crear el objeto de entreamiento por usuario
            Console.WriteLine("Usuario registrado con exito");
        }
    }

    // Metodo para Iniciar Sesion
    public void IniciarSesion(string correo)
    {
        if (!usuario.ContainsKey(correo))
        {
            Console.WriteLine("Usuario no encontrado");
            return;
        }
        Console.WriteLine($"Bienvenido, {correo}.");
     string opcion;
        do
        {
            Console.WriteLine("\nMenú de Entrenamientos:");
            Console.WriteLine("1- Añadir Entrenamiento");
            Console.WriteLine("2- Ver Entrenamientos");
            Console.WriteLine("3- Borrar Entrenamientos");
            Console.WriteLine("4- Volver al menú principal");
            Console.Write("Seleccione una opción: ");
            
            opcion = Console.ReadLine();

            switch (opcion)
            {
                case "1":
                    Console.Write("Ingrese la distancia recorrida (km): ");
                    double distancia = double.Parse(Console.ReadLine());
                    Console.Write("Ingrese el tiempo empleado (min): ");
                    double tiempo = double.Parse(Console.ReadLine());
                    entrenos[correo].AgregarEntreno(distancia, tiempo);
                    break;

                case "2":
                    entrenos[correo].ListarEntreno();
                    break;

                case "3":
                    entrenos[correo].BorrarDatos();
                    break;

                case "4":
                    Console.WriteLine("Volviendo al menú principal...");
                    break;

                default:
                    Console.WriteLine("Opción no válida.");
                    break;
            }

        } while (opcion != "4");
    }
}


           
    
    



      




    


