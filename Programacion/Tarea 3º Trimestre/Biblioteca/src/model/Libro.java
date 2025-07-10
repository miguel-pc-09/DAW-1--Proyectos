package model;

  public class Libro {

    // Atributos
    private String nombre;
    private String autor;
    private String genero;
    private int numeroPaginas;
    private int ISBN;

    //Constructor vacio
    public Libro() {
    }

    //Constructor con todo
    public Libro(String nombre, String autor, String genero, int numeroPaginas, int ISBN) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.ISBN = ISBN;
    }

    // Busca informacion de un libro del catalogo
    public void mostrarLibro(){
            System.out.println("ISBN = " + ISBN);
            System.out.println("Título = " + nombre);
        System.out.println("Autor = " + autor);
        System.out.println("Genero = " + genero);
        System.out.println("Nº de Paginas = " + numeroPaginas);

    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
