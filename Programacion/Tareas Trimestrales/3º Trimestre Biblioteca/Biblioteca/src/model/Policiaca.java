package model;

public class Policiaca extends Libro {

    private String trama; // Tipo de trama: misterio o intriga

    // Constructor vacio
    public Policiaca() {}

    // Constructor conTodo
    public Policiaca(String titulo, String autor, int nPaginas, int isbn, String trama) {
        super(titulo, autor, nPaginas, isbn);
        this.trama = trama;
    }

    // Metodo mostrar datos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }



    // Getters y Setters
    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }
}
