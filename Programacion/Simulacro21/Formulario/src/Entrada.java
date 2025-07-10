import java.util.Scanner;

public class Entrada {

    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);

        String nombre = null;
        String apellido = null;
        String dni = null;
        String email = null;

        int opcion;
        do {
            System.out.println("menu");
            System.out.println("1. Rellenar nombre.");
            System.out.println("2. Rellenar apellido.");
            System.out.println("3. Rellenar dni.");
            System.out.println("4. Rellenar email.");
            System.out.println("5. Finalizar");
            System.out.println("Que opcion quieres.");
            opcion = teclado.nextInt();
            teclado.nextLine();

            try{

            switch (opcion){
                //Rellenar nombre
                case 1:
                    System.out.print("Indique su nombre");
                    nombre = teclado.nextLine();
                    if(!nombre.chars().allMatch(Character::isLetter)){
                       throw new TipoDatoIncorrectoException ("El nombre solo puede contener letras ");
                    }
                    break;

                case 2:
                    System.out.println("Indique su apellido");
                    apellido = teclado.nextLine();
                    if (!apellido.chars().allMatch(c -> Character.isLetter(c) || c == ' ')) {
                        throw new TipoDatoIncorrectoException("Los apellidos solo pueden contener letras.");
                    }
                    break;
                case 3:
                    System.out.println("Indique su dni");
                    dni = teclado.nextLine();

                    if (dni.length() != 9) {
                        throw new LongitudDNINoValidaException("El DNI debe tener 9 caracteres.");
                    }
                    if (!Character.isLetter(dni.charAt(8))) {
                        throw new UltimoDigitoNoLetraException("El último carácter del DNI debe ser una letra.");
                    }
                    for (int i = 0; i < 8; i++) {
                        if (!Character.isDigit(dni.charAt(i))) {
                            throw new NumeracionContieneLetrasException("Los primeros 8 caracteres del DNI deben ser números.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Indique su email");
                    email = teclado.nextLine();
                    if (!email.contains("@") || !email.contains(".")) {
                        throw new EmailIncorrectoException("El email debe contener '@' y '.'");
                    }
                    break;
                case 5:
                    if (nombre == null || apellido == null || dni == null || email == null) {
                        System.out.println("Faltan datos por rellenar. No se puede finalizar.");
                        opcion = 0; // Para seguir en el bucle
                    } else {
                        System.out.println("\n--- DATOS COMPLETOS ---");
                        System.out.println("Nombre: " + nombre);
                        System.out.println("Apellidos: " + apellido);
                        System.out.println("DNI: " + dni);
                        System.out.println("Email: " + email);
                        System.out.println("Formulario finalizado.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }while(opcion != 5 || nombre == null || apellido == null || dni == null || email == null);{
            
            teclado.nextLine();
        }
    }
}



















