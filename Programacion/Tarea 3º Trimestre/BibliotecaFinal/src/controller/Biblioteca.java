package controller;

import model.Libro;
import exception.CatalogoLlenoException;
import exception.LibroNoEncontradoException;

import java.util.ArrayList;
import java.util.Hashtable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.ClassNotFoundException;


public class Biblioteca {
    private String nombre;
    private String director;
    private Catalogo catalogo;

    //Constructor vacio
    public Biblioteca() {}

    //Constructor conTodo
    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
        this.catalogo = null;
    }

    // Metodo para construir catalogo dependiendo de la capacidad
    public void construirCatalogo(int capacidad) {
        this.catalogo = new Catalogo(capacidad);
    }

    // metodo para agregar un libro con excepcion si queda espacio
    public void agregarLibro(Libro libro) throws CatalogoLlenoException {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        catalogo.agregarLibro(libro);
    }

    // Metodo eliminar libro con excepcion
    public void eliminarLibro(int isbn) throws LibroNoEncontradoException {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        catalogo.eliminarLibro(isbn);
    }

    // Busca libro por isbn con excpecion
    public Libro buscarLibro(int isbn) throws LibroNoEncontradoException {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        return catalogo.buscarLibro(isbn);
    }

    // Metodo para mostrar libro
    public void mostrarLibros() {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        catalogo.mostrarLibros();
    }

    // Metodo para mostrar Todos los libros del catalogo
    public int cuantosLibros() {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        return catalogo.getCantidad();
    }

    // Metodo para guardar los libros
    public void guardarCatalogo(String ruta) throws IOException {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        catalogo.guardarCatalogo(ruta);
    }

    // Metodo para cargar los libros
    public void cargarCatalogo(String ruta) throws IOException, ClassNotFoundException {
        construirCatalogo(5); // capacidad arbitraria para reconstrucción
        catalogo.cargarCatalogo(ruta);
    }
    // Metodo para obtener todos los libros
    public ArrayList<Libro> obtenerTodosLosLibros() {
        if (catalogo == null) throw new RuntimeException("No existe un catálogo");
        return new ArrayList<>(catalogo.getLibros());
    }


    // Clase anidada Catalogo
    public class Catalogo {
        private int capacidad;
        private ArrayList<Libro> libros;

        // Constructor vacio
        public Catalogo() {}

        // Constructor completo
        public Catalogo(int capacidad) {
            this.capacidad = capacidad;
            this.libros = new ArrayList<>();
        }

        // Metodo para agregar a la lista si no esta
        public void agregarLibro(Libro libro) throws CatalogoLlenoException {
            if (libros.size() >= capacidad) {
                throw new CatalogoLlenoException("No hay espacio en el catálogo");
            }
            for (Libro l : libros) {
                if (l.getIsbn() == libro.getIsbn()) {
                    System.out.println("El libro ya existe en el catálogo");
                    return;
                }
            }
            libros.add(libro);
        }

        // Metodo para eliminar un libro
        public void eliminarLibro(int isbn) throws LibroNoEncontradoException {
            boolean eliminado = libros.removeIf(libro -> libro.getIsbn() == isbn);
            if (!eliminado) {
                throw new LibroNoEncontradoException("Libro con ISBN " + isbn + " no encontrado");
            }
        }

        // Metodo para buscar un libro
        public Libro buscarLibro(int isbn) throws LibroNoEncontradoException {
            for (Libro libro : libros) {
                if (libro.getIsbn() == isbn) {
                    return libro;
                }
            }
            throw new LibroNoEncontradoException("Libro con ISBN " + isbn + " no encontrado");
        }

        // metodo para mostrar todos los libros
        public void mostrarLibros() {
            for (Libro libro : libros) {
                libro.mostrarDatosLibro();
                System.out.println("------");
            }
        }

        // Metodo para mostrar la cantidad de libros
        public int getCantidad() {
            return libros.size();
        }

        // Metodo para guardar el arraylist
        public void guardarCatalogo(String ruta) throws IOException {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
                oos.writeObject(libros);
            }
        }

        // Metodo para cargar el arraylist
        public void cargarCatalogo(String ruta) throws IOException, ClassNotFoundException {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
                ArrayList<Libro> lista = (ArrayList<Libro>) ois.readObject();
                for (Libro libro : lista) {
                    libros.add(libro);
                }
            }
        }

        // metodo para exportar los libros
        public ArrayList<Libro> getLibros() {
            return libros;
        }
    }
}

