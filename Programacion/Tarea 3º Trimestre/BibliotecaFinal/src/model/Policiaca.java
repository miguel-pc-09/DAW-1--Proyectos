package model;

import enums.Trama;

import java.io.Serializable;

public class Policiaca extends Libro implements Serializable {

    private Trama trama; // Tipo de trama: misterio o intriga

    // Constructor vacio
    public Policiaca() {}

    // Constructor conTodo
    public Policiaca(String titulo, String autor, int nPaginas, int isbn, Trama trama) {
        super(titulo, autor, nPaginas, isbn);
        this.trama = trama;
    }

    // Metodo mostrar datos
    @Override
    public void mostrarDatosLibro() {
        super.mostrarDatosLibro();
        System.out.println("Trama: " + trama);
    }

    @Override
    public String toString() {
        return super.toString() + ", Trama: " + trama;
    }

    // Getters y Setters

    public Trama getTrama() {
        return trama;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }
}
