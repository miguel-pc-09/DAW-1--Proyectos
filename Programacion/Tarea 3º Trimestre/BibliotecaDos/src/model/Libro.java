package model;

public class Libro {
    private String titulo;
    private String autor;
    private int nPaginas;
    private int isbn;

    // vacio

    public Libro() {
    }

    public Libro(String titulo, String autor, int nPaginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.isbn = isbn;
    }


    // Get and Set
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
