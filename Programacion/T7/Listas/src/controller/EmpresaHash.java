package controller;

import model.Trabajador;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;

public class EmpresaHash {

    private Hashtable<String, Trabajador> listaTrabajadores;


    public EmpresaHash() {
        this.listaTrabajadores = new Hashtable<>();
    }

    //Agregar Trabajador
    public void agregarTrabajador(Trabajador trabajador){
        // voy a buscar si el dni del trabajador que tu me intentar add ya lo tengo en la empresa
        if(listaTrabajadores.containsKey(trabajador.getDni())){
            //esta en true, por lo tanto este dni esta en la lista
            System.out.println("No puedo, dni ya registrado");
        }else{
            // esta en false, por lo tanto no esta en la lista el dni
            System.out.println("Contratando al trabajador");
            listaTrabajadores.put(trabajador.getDni(), trabajador);
        }
    }

    //Buscar Trabajador igual que obtener
    // Obtener trabajador
    public void obtenerTrabajador(String dni){
        Trabajador trabajador = listaTrabajadores.get(dni);
        // como puedo saber si el dni que me das es de un trabajador que está en la empresa
        if (trabajador != null){
            System.out.println("Trabajador encontrado, sus datos son");
            trabajador.mostrarDatos();
        }else{
            System.out.println("debe ser un error, dni incorrecto");
        }
    }

    // eliminar trabajador
    public void eliminarTrabajador(String dni){
        // una forma de hacerlo
       // listaTrabajadores.remove(dni);
        // como se si lo he eliminado bien
        //otra forma de hacerlo con if
        /*if(listaTrabajadores.remove(dni)!=null){
            System.out.println("Perfecto, borrado con exito");
        }else{
            System.out.println("No se a podido borrar, trabajador no encontrado");
        }*/
        // otro metodo
        Trabajador trabajador = listaTrabajadores.remove(dni);
        if(trabajador!=null){
            System.out.println("Perfecto, borrado con exito");
            System.out.println("sus datos son ");
            trabajador.mostrarDatos();
        }else{
            System.out.println("No se a podido borrar, trabajador no encontrado");
        }
    }



    //listar trabajador
    public void listarTrabajadores(){
        // 1º obtener todas las claves e iterarlas
        Enumeration<String> claves = listaTrabajadores.keys();
        // este enumeration tiene solo 3 metodos, hasMoreElement(devuelve si o no),iterator(para iterarlo con un foreach),
        // o nextElement(devuelve un string).
        //claves.hasMoreElements();
        //claves.nextElement();
        //                 v -> hasMore recorrera y dira si quedan mas elementos
        //  k  k  k  k  k  k -> next element pasara al siguiente elemento mientras sea true
        // ahora con el estamento while
        /*while(claves.hasMoreElements()){
            String key = claves.nextElement();
            Trabajador trabajador = listaTrabajadores.get(key);
            trabajador.mostrarDatos();
        }*/
        // 2º obtener todos los valores e iterarlas
        Collection<Trabajador> values = listaTrabajadores.values();
        for (Trabajador trabajador : values) {
            trabajador.mostrarDatos();
        }

    }

    public Hashtable<String, Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(Hashtable<String, Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }
}
