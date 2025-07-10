/*Desarrollar una clase llamada Alumno que:

- Tenga tres atributos private de tipo Asignatura.
- Tenga un constructor con tres parámetros de tipo Asignatura que inicialice los tres atributos.
- Tenga un constructor con tres parámetros de tipo int que inicialice los tres atributos.
- Tenga un getter para cada uno de los atributos.*/
public class Alumno {
    // Atributos
    private Asignatura asignatura;
    private Asignatura asignatura2;
    private Asignatura asignatura3;

    // Constructor vacio
    public Alumno() {}

    // Constructor 3 parametros
    public Alumno(Asignatura asignatura, Asignatura asignatura2, Asignatura asignatura3) {
        this.asignatura = asignatura;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    // Constructor 3 parametros int
    public Alumno(int id1, int id2, int id3){
        this.asignatura = new Asignatura(id1);
        this.asignatura2 = new Asignatura(id2);
        this.asignatura3 = new Asignatura(id3);
    }

    // Getter y Setter
    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(Asignatura asignatura3) {
        this.asignatura3 = asignatura3;
    }
}
