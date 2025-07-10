package model;

import enums.TipoHumor;

import java.io.Serializable;

public class Comedia extends Libro implements Serializable {

    private TipoHumor tipoHumor;

    // Constructor vacio
    public Comedia() {}

    // Constructor conTodo
    public Comedia(String titulo, String autor, int nPaginas, int isbn, TipoHumor tipoHumor) {
        super(titulo, autor, nPaginas, isbn);
        this.tipoHumor = tipoHumor;
    }

    // Metodo mostrar datos
    @Override
    public void mostrarDatosLibro() {
        super.mostrarDatosLibro();
        System.out.println("Tipo de humor: " + tipoHumor);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de humor: " + tipoHumor;
    }

    // Getters y Setters

    public TipoHumor getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(TipoHumor tipoHumor) {
        this.tipoHumor = tipoHumor;
    }
}
