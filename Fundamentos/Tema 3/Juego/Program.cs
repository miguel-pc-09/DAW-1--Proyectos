using System.Collections;

public class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Bienvenido al juego de la UE");


        /* List<Habilidad> lista = new List<Habilidad>();
        lista.Add(new Habilidad("Velocidad",2,100));
        lista.Add(new Habilidad("Fuerza",3,10));
        lista.Add(new Habilidad("Vision",1,50));
        lista.Add(new Habilidad("Sabiduria",4,200));
        Jugador jugadorBase = new Jugador("Miguel", 79, 87);
        Jugador jugadorPro = new Jugador("MiguelH",70 ,97, lista);
        Jugador jugadorPobre = new Jugador("MiguelP");

        Console.WriteLine("Jugador base ataca a pro");
        jugadorBase.Atacar(jugadorPro);
        Console.WriteLine("Habilidades del base");
        jugadorBase.ListarActividades();

        Console.WriteLine("Habilidades del Pro");
        jugadorPro.ListarActividades(); */


       /* jugadorPobre.AdquirirHabilidad(lista[1]);
        jugadorPobre.ListarActividades();
        Console.WriteLine();
        jugadorPro.ListarActividades();
        Console.WriteLine();
        jugadorBase.AdquirirHabilidad(new Habilidad("Velocidad", 4, 125));
        Console.WriteLine();
        jugadorBase.ListarActividades();
        Console.WriteLine();

        jugadorPro.PerderHabilidades();
        Console.WriteLine();
        jugadorPro.ListarActividades();
        Console.WriteLine();
        jugadorBase.AdquirirHabilidad(lista[1]);
        jugadorBase.ListarActividades();*/
        
    


        //jugador1.setPoder("Vision");
        //Console.WriteLine("El poder especial del jugar es "+jugador1.getPoder()?.Equals("cosa"));
        //Enemigo enemigo = new Enemigo("Enemigo1", 100, 150);

/* 
        // Enemigo , EnemigoAgua
        EnemigoAgua enemigoAgua = new EnemigoAgua("Enemigo1", 100,"Tornado");
        //enemigoAgua.mostrarDatos();
        // Enemigo, EnemigoFuego 
        EnemigoFuego enemigoFuego = new EnemigoFuego("Enemigo2", 100, 40, 10, "Quemadura");
        // Enemigo, EnemigoViento
        EnemigoViento enemigoViento = new EnemigoViento("Enemigo3",100,90,1000,2);


        // Como son Enemigos es decir iguales solo que cada uno de un tipo distinto pero ENEMIGOS podemos meterlos en una lista
        List<Enemigo> listaEnemigos = new List<Enemigo>(); 
        listaEnemigos.Add(enemigoAgua);
        listaEnemigos.Add(enemigoFuego);
        listaEnemigos.Add(enemigoViento);
        foreach (var item in listaEnemigos)
        {
            // si es enemigo fuego -> en java instanceOF
            if(item.GetType()== typeof(EnemigoFuego))
            {
                ((EnemigoFuego)item).realizarSanacion();
            }
            else if (item.GetType()== typeof(EnemigoAgua))
            {
                ((EnemigoAgua)item).rellenarAgua();
            }
            else if (item.GetType()== typeof(Mortal))
            {
                ((Mortal)item).realizarAtaqueMortal1();
            }
           
            

           item.mostrarDatos();
        } */

        Jugador jugador = new Jugador("Miguel", 100, 78, Tipo.constructor);
        //jugador.mostrarDatos();
        EnemigoAgua enemigoAgua = new EnemigoAgua("Enemigo1", 100, 40, Perfil.complejo, 10,"Tornado");
        EnemigoViento enemigoViento = new EnemigoViento("Enemigo2", 100, 40, Perfil.casual, 10, 2);
        EnemigoFuego enemigoFuego1 = new EnemigoFuego("Enemigo3",100, 40, Perfil.jefe, 10, "Quemadura");
        EnemigoFuego enemigoFuego2 = new EnemigoFuego("Enemigo3",100, 40, Perfil.casual, 10, "Quemadura");

        enemigoAgua.MostrarDatos();
        
        
    
    }
}