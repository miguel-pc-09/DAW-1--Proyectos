import model.Centralita;
import model.LlamadaLocal;
import model.LlamadaNacional;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Centralita centralita = new Centralita();
        int opcion;

        do {
            System.out.println("\n--- MENÚ CENTRALITA ---");
            System.out.println("1. Agregar llamada local");
            System.out.println("2. Agregar llamada nacional");
            System.out.println("3. Mostrar llamadas locales");
            System.out.println("4. Mostrar llamadas nacionales");
            System.out.println("5. Mostrar coste acumulado");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Número origen: ");
                    long origenL = sc.nextLong();
                    System.out.print("Número destino: ");
                    long destinoL = sc.nextLong();
                    System.out.print("Duración (segundos): ");
                    double duracionL = sc.nextDouble();
                    centralita.agregarLocal(new LlamadaLocal(origenL, destinoL, duracionL));
                    break;

                case 2:
                    System.out.print("Número origen: ");
                    long origenN = sc.nextLong();
                    System.out.print("Número destino: ");
                    long destinoN = sc.nextLong();
                    System.out.print("Duración (segundos): ");
                    double duracionN = sc.nextDouble();
                    System.out.print("Zona destino (A, B, C, otro): ");
                    char zona = sc.next().toUpperCase().charAt(0);
                    centralita.agregarNacional(new LlamadaNacional(origenN, destinoN, duracionN, zona));
                    break;

                case 3:
                    centralita.listarLocales();
                    break;

                case 4:
                    centralita.listarNacionales();
                    break;

                case 5:
                    centralita.mostrarCostes();
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 0);
    }
}
