package controller;

import model.Trabajador;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Empresa {
    private String nombre;
    private ArrayList<Trabajador> listaTrabajadores;
    private ArrayList<Trabajador> listaDespedidos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaTrabajadores = new ArrayList();
        this.listaDespedidos = new ArrayList<>();
    }

    // Metodo para añadir o contratar trabajadores con él (add)
    public void contratarTrabajador(Trabajador trabajador){
        if(estaTrabajador(trabajador.getDni())!=null){
        // no se puede contratar un trabajador si ya tengo uno con el mismo dni
            System.out.println("Lo siento el trabajador esta en la empresa");
        }else {
        //un trabajador se puede contratar si no tngo el dni en la lsita
        listaTrabajadores.add(trabajador);
            System.out.println("Contratado con exito");

        }

    }
    // metodo privado para el funcinonamiento de la clase
    private Trabajador estaTrabajador(String dni){

        for (Trabajador item : listaTrabajadores) {
            if(item.getDni().equalsIgnoreCase(dni)){
                return item;
            }
        }

        return null;
    }

    //Metodo para buscar trabajadores por el dni por ejemplo
    public void obtenerTrabajador(String dni){
        Trabajador trabajadorBusqueda = estaTrabajador(dni);
        if(trabajadorBusqueda!=null){
            trabajadorBusqueda.mostrarDatos();
        }else{
            System.out.println("Trabajador no encontrado. ");
        }
    }

    //Metodo para sacar 1 solo trabajador
    public void obtenerTrabajador(){
        // tambien podria ser get(0)-> para sacar la primera posicion
        //listaTrabajadores.getFirst().mostrarDatos(); -> saca la primera posicion
        // get(listaTrabajadores.size()-1) -> parecido a lenght-1 pero en lista es .size()-1 -size = cantidad elementos
        listaTrabajadores.getLast().mostrarDatos();
    }

    // Metodo para sacar la informacion de todos
    public void mostrarTrabajadores(){
        // si hay trabajadores, utilizar un isEmpty que es lo mismo .size=0
        if(!listaTrabajadores.isEmpty()){
           for ( Trabajador item : listaTrabajadores){
                     item.mostrarDatos();
           }
        }else {
            System.out.println("No hay trabajadores, todos despedidos");
        }

        // si no hay trabajadores -> avisa
    }

    // Metodo despedir un trabajador o borrarlo
    public void despedirTrabajador(){
        // tenemos varias obciones. remove(objetc)-> objeto que quieres quitar
        //                                (int index) -> la posicion
        //        y luego tenemos otros como all(todos), First primero, Last ultimo, y el if dependiendo de una condicion
        listaTrabajadores.remove(1);
    }
    // sobreecarcar metodo pero dando por ejemplo el dni
    public void despedirTrabajador(String dni){
        // recorro la lista
        // if
        // escribir iter para el for each
        for (Trabajador t : listaTrabajadores) {
            if (t.getDni().equalsIgnoreCase(dni)) {
                listaTrabajadores.remove(t);
                break; // Rompe la repeticion para que solo borre el que pedimos y no siga.
                // primero lo quita de una lista y añade en otra
                //listaDespedidos.add(t);
            }
        }
    }

    // metodo para borrar por nombre y con el removeif borrara todos los elementos que cumplan la condición en este caso nombre
    public void despedirTrabajadorNombre(String nombre){
        listaTrabajadores.removeIf(new Predicate<Trabajador>() {
            @Override
            public boolean test(Trabajador trabajador) {
                return trabajador.getNombre().equalsIgnoreCase(nombre);
            }
        });
    }


    //Metodo para despedir a todos los trabajadores
    public void despedirTodos(){
        // 1º forma de despedir a todos, esto lo que hace es volver a darle otro valor al arraylist
        //listaTrabajadores = new ArrayList<>();
        //2º con removel.all
        //listaTrabajadores.removeAll()
        //3º con if metiendo tru irá diciendo estas si borrado, asi sucesivamente
        /*listaTrabajadores.removeIf(new Predicate<Trabajador>() {
            @Override
            public boolean test(Trabajador trabajador) {
                return true;
            }
        });*/
        //4º y mejor metodo con CLEAR
        listaTrabajadores.clear();
        System.out.println("Todos los trabajadores fueron despedidos");
    }



}
