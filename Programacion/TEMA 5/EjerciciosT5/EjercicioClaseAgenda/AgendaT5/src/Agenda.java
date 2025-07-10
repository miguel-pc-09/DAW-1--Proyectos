import java.util.Collection;
import java.util.Hashtable;

public class Agenda {

   private Hashtable<String, Persona> contactos;

    public Agenda() {
        contactos = new Hashtable<>();
    }

    // Agregar personas
    public boolean agregarPersonas(Persona p){
        // si agenda tiene la persona no agrega
        if(contactos.containsKey(p.getDni())){
            System.out.println("La persona ya existe");
               return false;
        }
        // si no la agregas
        contactos.put(p.getDni(), p);
        System.out.println("Persona agregada correctamente");
        return true;
    }

    // Borrar persona
    public boolean borrarPersona(String dni){
        // Si existe una persona con ese dni borra
        if(contactos.containsKey(dni)){
            contactos.remove(dni);
            System.out.println("Persona eliminada");
            return true;
        }
        System.out.println("La persona no fue eliminada.");
        return false;
    }

    // Metodo para buscar una persona por dni
    public Persona buscarPersona(String dni){
        return contactos.get(dni);
    }

    // Metodo para editar una persona
    public boolean editarPersona (String dni, String nuevoNombre, int nuevoTelefono){
        // Se busca si la persona existe
        Persona p = contactos.get(dni);
        if(p != null){

            p.setNombre(nuevoNombre);
            p.setTelefono(nuevoTelefono);
            return true;
        }
        return false;
    }

    // Metodo listar agenda
    public Collection<Persona> listarPersonas(){
        return contactos.values();
    }

}
