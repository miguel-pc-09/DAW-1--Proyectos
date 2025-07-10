package model;

public class Terror extends Libro {

    private String calificacion; // Edad recomendada u opinión

    // Constructor vacio
    public Terror() {}

    // Constructor conTodo
    public Terror(String titulo, String autor, int nPaginas, int isbn, String calificacion) {
        super(titulo, autor, nPaginas, isbn);
        this.calificacion = calificacion;
    }

    // Metodo mostrar datos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }



    // Getters y Setters
    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
