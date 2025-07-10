import java.util.Random;

/*Desarrollar una clase llamada Profesor que:

- Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada. Pondrá una calificación aleatoria a cada una de las asignaturas del alumno.

- Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y devuelve
un double.*/
public class Profesor {

    // Metodo poner notas
    public void ponerNotas(Alumno alumno){
        Random r = new Random();
        alumno.getAsignatura().setCalificacion(r.nextDouble()*10);
        alumno.getAsignatura2().setCalificacion(r.nextDouble()*10);
        alumno.getAsignatura3().setCalificacion(r.nextDouble()*10);
    }
    // Metodo Calcular media
    public double calcularMedia(Alumno alumno){
        double suma = alumno.getAsignatura().getCalificacion() +
                alumno.getAsignatura2().getCalificacion() +
                alumno.getAsignatura3().getCalificacion();
        return suma / 3;
    }
}
