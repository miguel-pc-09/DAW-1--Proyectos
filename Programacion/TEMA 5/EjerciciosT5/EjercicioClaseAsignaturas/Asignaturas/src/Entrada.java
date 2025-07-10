/*Desarrollar una clase llamada Entrada que en su método main:

- Registrar asignatura. Cree e inicialice tres Asignaturas (a mano).
- Cree un Alumno con las tres Asignaturas (a mano).
- Cree un Profesor que le ponga calificaciones al Alumno y muestre por pantalla la media del Alumno (a mano).
- Comprueba mediante impresiones por pantalla las notas de cada alumno*/
public class Entrada {

    public static void main(String[] args) {
        // Creacion de asignaturas
        Asignatura asignatura = new Asignatura(101);
        Asignatura asignatura2 = new Asignatura(102);
        Asignatura asignatura3 = new Asignatura(103);

        // Crear alumno
        Alumno alumno1 = new Alumno(asignatura,asignatura2,asignatura3);

        // Crear profesor
        Profesor profesor = new Profesor();
        profesor.ponerNotas(alumno1);

        // Mostrar notas
        System.out.printf("Nota 1: %.2f\n",alumno1.getAsignatura().getCalificacion());
        System.out.printf("Nota 2: %.2f\n",alumno1.getAsignatura2().getCalificacion());
        System.out.printf("Nota 3: %.2f\n",alumno1.getAsignatura3().getCalificacion());

        // Calcular y mostrar media
        double media = profesor.calcularMedia(alumno1);
        System.out.printf("Media del alumno: %.2f\n", media);
    }
}
