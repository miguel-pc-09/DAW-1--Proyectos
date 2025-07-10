package model;

public class Fantasia extends Libro {
    private String tipoFantasia; // Tipo de fantasía: épica, urbana, etc.

    // Constructor vacio
    public Fantasia() {}

    // Constructor conTodo
    public Fantasia(String titulo, String autor, int nPaginas, int isbn, String tipoFantasia) {
        super(titulo, autor, nPaginas, isbn);
        this.tipoFantasia = tipoFantasia;
    }

    // Metodo mostrar datos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }



    // Getters y Setters
    public String getTipoFantasia() {
        return tipoFantasia;
    }

    public void setTipoFantasia(String tipoFantasia) {
        this.tipoFantasia = tipoFantasia;
    }
}
