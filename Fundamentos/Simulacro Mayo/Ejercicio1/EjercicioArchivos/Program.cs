using System.Dynamic;

class Program {
    public static void Main(String[] args) 
    {
        List<Alumno> alumnos = new List<Alumno>();

        if(File.Exists(@"C:\Users\migue\Documents\GitHub\Fundamentos\Simulacro Mayo\Ejercicio1\EjercicioArchivos\alumnos.txt"))
        {
            string[] lineas = File.ReadAllLines(@"C:\Users\migue\Documents\GitHub\Fundamentos\Simulacro Mayo\Ejercicio1\EjercicioArchivos\alumnos.txt");
            foreach (string linea in lineas)
            {
                string[] partes = linea.Split(' ');
                string nombre = partes[0];
                double calificacion = Convert.ToDouble(partes[1]);

                Alumno a = new Alumno(nombre, calificacion);
                alumnos.Add(a);
            }
            Console.WriteLine("Total de alumnos: " + alumnos.Count);

            foreach (Alumno a in alumnos)
            {
                Console.WriteLine("Nombre: "+ a.Nombre+ ", Nota: " +a.Calificacion);
            }
        }
        else 
        {
            Console.WriteLine(" No se encontro el archivo alumnos.txt");
        }
    }
}