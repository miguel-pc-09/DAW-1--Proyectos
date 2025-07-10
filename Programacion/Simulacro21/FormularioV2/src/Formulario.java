import java.util.Scanner;

public class Formulario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre = null;
        String apellido = null;
        String dni = null;
        String email = null;

        int opcion;

        do {
            System.out.println("---MENU FORMULARIO");
            System.out.println("1. Rellenar Nombre: ");
            System.out.println("2. Rellenar Apellido: ");
            System.out.println("3. Rellenar DNI: ");
            System.out.println("4. Rellenar Email: ");
            System.out.println("5. Finalizar.");
            System.out.println("Que opcion quieres");
            opcion = teclado.nextInt();
            teclado.nextLine();

            try{

            switch (opcion){
                case 1:
                    System.out.println("Introduce tu nombre: ");
                    nombre = teclado.nextLine();
                    Validador.validarTexto(nombre);
                    break;
                case 2:
                    System.out.println("Introduce tu apellido: ");
                    apellido = teclado.nextLine();
                    Validador.validarTexto(apellido);
                    break;
                case 3:
                    System.out.println("Introduce tu dni: ");
                    dni = teclado.nextLine();
                    Validador.validarDNI(dni);
                    break;
                case 4:
                    System.out.println("Introduce tu email: ");
                    email = teclado.nextLine();
                    Validador.validarEmail(email);
                    break;
                case 5:
                    if (nombre == null || apellido == null || dni == null || email == null) {
                        System.out.println("Faltan datos por rellenar.");
                        opcion = 0;
                    } else {
                        System.out.println("\n--- DATOS COMPLETOS ---");
                        System.out.println("Nombre: " + nombre);
                        System.out.println("Apellidos: " + apellido);
                        System.out.println("DNI: " + dni);
                        System.out.println("Email: " + email);
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            } catch (Exception e) {
                System.out.println("Error "+ e.getMessage());
            }
        }while(opcion != 5 || nombre == null || apellido == null || dni == null || email == null);
        teclado.close();

    }
}
