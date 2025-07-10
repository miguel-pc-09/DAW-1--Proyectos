import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;

        do {
            System.out.println("Bienvenido a tu agenda");
            System.out.println("1. Agregar persona. ");
            System.out.println("2. Borrar persona (dni)");
            System.out.println("3. Editar persona (dni)");
            System.out.println("4. Buscar persona (dni)");
            System.out.println("5. Listar personas.");
            System.out.println("6. Salir.");
            System.out.println("Que opcion eliges");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                // Agregar persona
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Telefono: ");
                    int telefono = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Dni: ");
                    String dni = teclado.nextLine();
                    Persona nueva = new Persona(nombre,telefono,dni);
                    if (agenda.agregarPersonas(nueva)){
                        System.out.println("Persona agregada");
                    }else{
                        System.out.println("La persona ya existe ");
                    }
                    break;
                // Borrar persona
                case 2:
                    System.out.println("Dni de la persona a borrar: ");
                    String dniBorrar = teclado.nextLine();
                    if(agenda.borrarPersona(dniBorrar)){
                        System.out.println("Persona borrada");
                    }else{
                        System.out.println("No se encontro a la persona");
                    }
                    break;
                // Editar persona
                case 3:
                    System.out.println("Dni de la persona a borrar. ");
                    String dniEditar = teclado.nextLine();
                    Persona p = agenda.buscarPersona(dniEditar);
                    if(p != null){
                        System.out.print("Nuevo nombre: ");
                        String nuevoNombre = teclado.nextLine();
                        System.out.print("Nuevo telefono: ");
                        int nuevoTelefono = teclado.nextInt();
                        teclado.nextLine();
                        agenda.editarPersona(dniEditar,nuevoNombre,nuevoTelefono);
                        System.out.println("Datos actualizados");
                    }else{
                        System.out.println("Persona no encontrada");
                    }
                    break;
                // Buscar persona
                case 4:
                    System.out.println("Dni de la persona a buscar: ");
                    String dniBuscar = teclado.nextLine();
                    Persona buscada = agenda.buscarPersona(dniBuscar);
                    if(buscada != null){
                        buscada.mostrarDatos();
                    }else{
                        System.out.println("No se encontro a la persona");
                    }
                    break;
                // Listar personas
                case 5:
                    System.out.println("--Contactos de la agenda--");
                    if(agenda.listarPersonas().isEmpty()){
                        System.out.println("La agenda esta vacia.");
                    }else{

                    for (Persona persona : agenda.listarPersonas()) {
                        System.out.println(persona); // aqui usa el toString
                    }
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa.. ");
                    break;
                default:
                    System.out.println("opcion no valida.");
                    break;

            }

        }while (opcion != 6);
        System.out.println("opcion no valida");
        teclado.nextLine();
    }
}
