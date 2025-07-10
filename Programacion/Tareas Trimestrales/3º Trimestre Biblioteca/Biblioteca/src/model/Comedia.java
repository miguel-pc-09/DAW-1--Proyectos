package model;

public class Comedia extends Libro {

    private String tipoHumor; // Tipo de humor: irónico, sarcástico, romántico

    // Constructor vacio
    public Comedia() {}

    // Constructor conTodo
    public Comedia(String titulo, String autor, int nPaginas, int isbn, String tipoHumor) {
        super(titulo, autor, nPaginas, isbn);
        this.tipoHumor = tipoHumor;
    }

    // Metodo mostrar datos
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }



    // Getters y Setters
    public String getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(String tipoHumor) {
        this.tipoHumor = tipoHumor;
    }
}

