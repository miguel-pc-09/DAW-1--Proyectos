package model;

import java.util.Collection;
import java.util.Hashtable;

public class Personas {
    private Hashtable<String, Usuario> agenda;

    // Metodo que inicializa
    public Personas (){
        agenda = new Hashtable<>();
    }
    // Metodo para agregar a una persona
    public boolean agregarPersona (Usuario u){
        // Si en agenda contiene la key (que me das)
        if(agenda.containsKey(u.getDni())){
            System.out.println("El usuario ya existe");
            // Retonar un false porque esta
            return false;
        }
        // si no. en agenda.agrega(dni , del usuario)
        agenda.put(u.getDni(), u);
        System.out.println("Usuario agregado a la agenda");
        return true;
    }

    // metodo para buscar un usuario por dni
    public Usuario buscarDni(String dni){
        System.out.println("Usuario encontrado.");
        return agenda.get(dni);
    }

    // Metodo eliminar usuario
    public boolean eliminarPersona (String dni){
        if(agenda.containsKey(dni)){
            agenda.remove(dni);
            System.out.println("Persona eliminada.");
            return true;
        }
        System.out.println("Persona no fue eliminada");
        return false;
    }

    // MEtodo para listar todo
    public Collection<Usuario> listarUsuarios(){
        return agenda.values();
    }
}
