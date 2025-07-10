package model;

import java.io.Serializable;

public class Terror extends Libro implements Serializable {

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
    public void mostrarDatosLibro() {
        super.mostrarDatosLibro();
        System.out.println("calificacion = " + calificacion);
    }

    @Override
    public String toString() {
        return super.toString() + ", Calificación: " + calificacion;
    }

    // Getters y Setters
    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
