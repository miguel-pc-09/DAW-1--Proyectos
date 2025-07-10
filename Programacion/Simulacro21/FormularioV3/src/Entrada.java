import java.util.Scanner;
import controller.Validador;
import model.DatosFormulario;

public class Entrada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DatosFormulario datos = new DatosFormulario();

        int opcion;
        do {
            System.out.println("--MENU FORMULARIO--");
            System.out.println("1. Rellenar nombre. ");
            System.out.println("2. Rellenar apellido. ");
            System.out.println("3. Rellenar DNI. ");
            System.out.println("4. Rellenar email. ");
            System.out.println("5. Finalizar. ");
            System.out.println(" Seleccione una opcion.");

            String input = teclado.nextLine();
            try {
                opcion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número del 1 al 5.");
                continue;
            }

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Nombre: ");
                        String nombre = teclado.nextLine();
                        Validador.validarTexto(nombre);
                        datos.setNombre(nombre);
                        break;
                    case 2:
                        System.out.print("Apellido: ");
                        String apellido = teclado.nextLine();
                        Validador.validarTexto(apellido);
                        datos.setApellido(apellido);
                        break;
                    case 3:
                        System.out.print("DNI: ");
                        String dni = teclado.nextLine();
                        Validador.validarDNI(dni);
                        datos.setDni(dni);
                        break;
                    case 4:
                        System.out.print("Email: ");
                        String email = teclado.nextLine();
                        Validador.validarEmail(email);
                        datos.setEmail(email);
                        break;
                    case 5:
                        if (datos.getNombre() == null || datos.getApellido() == null || datos.getDni() == null || datos.getEmail() == null) {
                            System.out.println("Faltan datos por rellenar. No se puede finalizar.");
                            opcion = 0;
                        } else {
                            datos.mostrarDatos();
                            System.out.println("Formulario finalizado correctamente.");
                        }
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }while (datos.getNombre() == null || datos.getApellido() == null || datos.getDni() == null || datos.getEmail() == null);
        teclado.close();
    }
}
