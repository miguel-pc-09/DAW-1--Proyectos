package controller;

import model.Libro;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;

public class Biblioteca {

    // Lista de los libros
    private Hashtable<Integer, Libro> listaLibros;



    // Constructor
    public Biblioteca(){
        this.listaLibros = new Hashtable<>();
    }

    // Añadir libros
    public void añadirLibro(Libro libro){
        // Buscar si existe un libro
        if(listaLibros.containsKey(libro.getISBN())){
            System.out.println("El libro ya esta en la biblioteca");
        }else{
            System.out.println("No esta el libro");
            System.out.println("Añadiendo el libro al catalogo");
            System.out.println("");
            listaLibros.put(libro.getISBN(), libro);
        }
    }

    // Obtener libro
    public void obtenerLibro(int ISBN){
        Libro libro = listaLibros.get(ISBN);
        if(libro != null){
            System.out.println("Libro encontrado");
            libro.mostrarLibro();
            System.out.println("");
        }else{
            System.out.println("Libro no encontrado, revisa el ISBN");
            System.out.println("");
        }
    }

    // Eliminar Libro
    public void eliminarLibro(int ISBN){
        Libro libro = listaLibros.remove(ISBN);
        if(libro != null){
            System.out.println("Libro eliminado de la biblioteca con exito");
            System.out.println("Los datos del libro borrado son:");
            libro.mostrarLibro();
            System.out.println("");
        }else{
            System.out.println("No se pudo borrar el libro, revise el ISBN");
        }
    }

    // Listar libros
    public void listarLibros(){
        Enumeration<Integer> claves = listaLibros.keys();
        Collection<Libro> values = listaLibros.values();
        for (Libro libro : values) {
            libro.mostrarLibro();
            System.out.println("");
        }
    }


    // Get and Set
    public Hashtable<Integer, Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(Hashtable<Integer, Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

}
