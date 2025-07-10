package model;

abstract public class Libro {

    private String titulo;
    private String autor;
    private int nPaginas;
    private int isbn;

    // Constructor vacio
    public Libro(){}

    // Constructor completo
    public Libro(String titulo, String autor, int nPaginas, int isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
        this.isbn = isbn;
    }

    // Metodo mostrar datos
    public void mostrarDatos(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + nPaginas);
        System.out.println("ISBN: " + isbn);
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
