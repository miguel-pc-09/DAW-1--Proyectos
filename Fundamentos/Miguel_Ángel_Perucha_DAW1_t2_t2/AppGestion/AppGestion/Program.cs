using System.ComponentModel.Design;
using System.Security.Cryptography.X509Certificates;
using Microsoft.Win32;

public class AppEntreno
{
    public static void Main(string [] args)
    {
       

       Console.WriteLine("Bienvenido a tu app de entrenamiento");
       
        Menu();
        
       
    }
            
         static void Menu()
        {
            string opcion ;
            Agenda agenda = new Agenda();
            
            do
            {
                Console.WriteLine("\nMenú ");
                Console.WriteLine("1- Registrar Usuario");
                Console.WriteLine("2- Iniciar Sesión");
                Console.WriteLine("3- Salir");
                Console.Write("¿Qué deseas hacer?: ");

                opcion = Console.ReadLine();
            
             switch (opcion)
             {
                case "1":
                    Console.WriteLine("Ingrese su correo: ");
                    string correo = Console.ReadLine();
                    Console.WriteLine("Ingrese su contraseña: ");
                    string contraseña = Console.ReadLine();
                    agenda.AgregarUsuario(correo, contraseña);
                    break;

                case "2":
                    Console.WriteLine("Ingrese su correo: ");
                    string correoLogin = Console.ReadLine();
                    agenda.IniciarSesion(correoLogin);
                    break;

                case "Salir":
                    Console.WriteLine("Saliendo de la aplicación ");
                    Console.WriteLine("Hasta luego ");
                    return;
                    
                default:
                    Console.WriteLine("Opción no válida.");
                    break;
             }
            }while(opcion != "Salir");
        }
       
}

        





            
       
       
    
       

      
        
            

