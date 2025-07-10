package controller;

import model.Libro;
import utils.TamanioException;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> listaLibros;

    // Con esto ya no tendra error nullPointerException
    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) throws NullPointerException, TamanioException{
        //Provocar error de limite de libros
        if(listaLibros.size()>=0){ // Tienes mas de un usuario
            //error. como lo trataremos como error nosotros y no la maquina usamos THROW sin S
            // Despues del new tenemos dos opciones o crear uno propio o usar uno de java
            throw new TamanioException("Error demasiados libros");
        }else{
            listaLibros.add(libro);
        }
        // Solucion al nullPointerException. COMO SABEMOS QUE EL ERROR PUEDE ESTAR AQUI USAREMOS THROWS
        //                                   Y EN MAIN LO MANEJAREMOS
        //try {
        listaLibros.add(libro);
        /*}catch (NullPointerException e){
            System.out.println("La lista no esta iniciada, proceda a iniciarla");
            // Inicializamos la lista
            listaLibros = new ArrayList<>();
        }*/

    }

    public void getLibro(String titulo){
        for (Libro l : listaLibros) {
            // Si el usuario que estoy iterando su titulo (). es igual ignorando mayusculas y minusculas (Al titulo que buscas)
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("El libro encontrado es: "+l.getTitulo());
                break;
            }
        }
    }
}
