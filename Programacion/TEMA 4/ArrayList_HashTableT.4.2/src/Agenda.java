import model.Personas;
import model.Usuario;

import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        // Añadir teclado para usarlo mas adelante
        Scanner teclado = new Scanner(System.in);
        // Creacion del objeto persona para usarlo mas adelante
        Personas personas = new Personas();
        // Menu
        int opcion = 0;
        do {
            // Menu
            System.out.println("---Menú Agenda---");
            System.out.println("1. Agregar persona.");
            System.out.println("2. Buscar persona.");
            System.out.println("3. Borrar persona.");
            System.out.println("4. Listar personas.");
            System.out.println("5. Salir.");
            System.out.print("Elige la opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

        switch (opcion){
            // Agregar personas
            case 1:
                // Pedir los datos.
                System.out.println("Nombre: ");
                String nombre = teclado.nextLine();
                System.out.println("Apellido: ");
                String apellido = teclado.nextLine();
                System.out.println("Telefono: ");
                int telefono = teclado.nextInt();
                teclado.nextLine(); // Limpiamos buffer
                System.out.println("Dni: ");
                String dni = teclado.nextLine();

                // crear objeto
                Usuario u = new Usuario(nombre, apellido, telefono, dni );
                // Agregamos
                if(personas.agregarPersona(u)){
                    System.out.println("Persona agregada correctamente.");
                }else{
                    System.out.println("Ya existe o error al agregar la persona.");
                }
                break;
            // Busca personas -> dni
            case 2:
                System.out.println("Dni de la persona a buscar: ");
                dni = teclado.nextLine();
                Usuario encontrado = personas.buscarDni(dni);
                if(encontrado != null){
                    System.out.println("Persona encontrada: "+encontrado);
                }else {
                    System.out.println("Persona no encontrada.");
                }

                break;
            // Borrar persona -> dni y la elimina
            case 3:
                System.out.println("Para borrar una persona necesito el dni: ");
                dni = teclado.nextLine();
                if(personas.eliminarPersona(dni)){
                    System.out.println("Persona eliminada. ");
                }else {
                    System.out.println("No se encontro o fallo el borrado de la persona. ");
                }

                break;
            // Listar personas -> todas las personas de la lista
            case 4:
                System.out.println("Lista de todas las personas: ");
                for (Usuario usuario : personas.listarUsuarios()) {
                    System.out.println(usuario);
                }
                // Exito o no
                break;
            case 5:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opcion no valida");
        }

        }while(opcion != 5);
        teclado.close();
    }
}






/*1.  Realizar una aplicación que gestione usuarios mediante arrays, donde los cuales constan de nombre (string), apellido (string), teléfono (int) y dni (string): La funcionalidad de la aplicación se guiará por un menú
con las siguientes opciones:
- Agregar persona: Pedirá los daos de nombre, apellido, teléfono y dni. Una vez pedidos agregará la persona en la lista.
- Buscar persona: Pedirá un dni y sacará por pantalla todos los datos de la persona
asociada con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
- Borrar persona: Pedirá un dni y la eliminará de la lista
- Listar personas: Listará todo los elementos existentes en la lista con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
- En todos los casos se deberá de dar confirmación al usuario tanto del éxito de la operación como de la ejecución incorrecta de la opción*/
