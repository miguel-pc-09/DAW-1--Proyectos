/*Desarrollar una clase llamada Asignatura que:

- Tenga dos atributos private de tipo int (identificador) y de tipo double (calificación).
- Tenga un constructor con un parámetro de tipo int.
- Tenga un getter para cada uno de los atributos.
- Tenga un setter para la calificación.*/
public class Asignatura {
    // Atributos
    private int identificador;
    private double calificacion;

    // Constructor vacio
    public Asignatura() {
    }

    // Constructor con int
    public Asignatura(int identificador) {
        this.identificador = identificador;
    }
    // Metodo mostrar datos
    public void mostrarDatos(){
        System.out.println("identificador: " + identificador);
        System.out.println("calificacion: " + calificacion);
    }

    // Getter y Setter
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
