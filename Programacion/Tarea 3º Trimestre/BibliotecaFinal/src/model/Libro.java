package model;

import java.io.Serializable;

abstract public class Libro implements Serializable {

    private String titulo;
    private String autor;
    private int nPaginas;
    private int isbn;

    // Constructor vacio
    public Libro() {}

    // Constructor conTodo
    public Libro(String titulo, String autor, int nPaginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.isbn = isbn;
    }

    // Metodo mostrarDatos
    public void mostrarDatosLibro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + nPaginas);
        System.out.println("ISBN: " + isbn);
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + nPaginas + ", ISBN: " + isbn;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
