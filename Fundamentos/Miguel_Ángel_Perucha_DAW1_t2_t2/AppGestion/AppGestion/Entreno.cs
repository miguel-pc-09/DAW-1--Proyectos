using System.Dynamic;

public class Entreno
{

   private double distanciaTotal = 0;
   private double tiempoTotal = 0;
   private List<(double distancia , double tiempo)> entrenamientos = new List<(double, double)>();
   

   
   //Agregar entrenamiento
   public void AgregarEntreno(double distancia, double tiempo)
   {
         entrenamientos.Add((distancia, tiempo));
         distanciaTotal += distancia;
         tiempoTotal += tiempo;
         Console.WriteLine("Entrenamiento registrado con éxito");
   }
   //Listar entrenamientos
   public void ListarEntreno()
   {
         if (entrenamientos.Count == 0)
         {
              Console.WriteLine("No hay entrenamientos registrados");
              return;
         }

              Console.WriteLine("\nHistorial de entrenamientos: ");
         for (int i = 0; i < entrenamientos.Count; i++)
         {
              Console.WriteLine($"{i + 1}. Distancia: {entrenamientos[i].distancia} km | Tiempo: {entrenamientos[i].tiempo} min");
         }

              Console.WriteLine($"Total Acumulado -> Distancia: {distanciaTotal} km | Tiempo: {tiempoTotal} min");

         
         
   }
   //Borrar datos
   public void BorrarDatos()
   {
        entrenamientos.Clear();
        distanciaTotal = 0;
        tiempoTotal = 0;
        Console.WriteLine("Todos los entrenamientos han sido eliminados.");
   }
   public void SetDistancia(double distancia)
   {
       this.distanciaTotal = distancia;
   }
   public void SetTiempo(double tiempo)
   {
       this.tiempoTotal = tiempo;
   }
    public double GetDistancia()
    {
         return distanciaTotal;
    }
    public double GetTiempo()
    {
         return tiempoTotal;
    }
   
}