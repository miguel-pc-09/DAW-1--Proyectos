import java.util.List;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Banco bbva = new Banco("BBVA", "A12345678");
        Banco santander = new Banco("Santander", "B87654321");
        Banco bancoSeleccionado = null;

        // Menú para seleccionar banco
        System.out.println("Introduce el banco con el que quieres operar:");
        System.out.println("1. BBVA");
        System.out.println("2. Santander");
        System.out.print("Selecciona una opción: ");
        int opcionBanco = teclado.nextInt();
        teclado.nextLine();

        if (opcionBanco == 1) {
            bancoSeleccionado = bbva;
        } else if (opcionBanco == 2) {
            bancoSeleccionado = santander;
        } else {
            System.out.println("Opción no válida. Saliendo del programa.");
            return;
        }

        int opcion;
        do {
            System.out.println("\n--Seleccionado " + bancoSeleccionado.getNombre() + "--");
            System.out.println("1. Crear una cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Sacar dinero");
            System.out.println("4. Ver cuentas de un cliente");
            System.out.println("5. Ver todas las cuentas");
            System.out.println("6. Salir");
            System.out.print("Qué quieres hacer: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            String dni, pin;
            double cantidad;

            switch (opcion) {
                case 1:
                    System.out.println("Introduce DNI de titular:");
                    dni = teclado.nextLine();
                    System.out.println("Introduce PIN asociado:");
                    pin = teclado.nextLine();
                    System.out.println("Introduce saldo inicial:");
                    cantidad = teclado.nextDouble();
                    teclado.nextLine();
                    if (bancoSeleccionado.crearCuenta(dni, pin, cantidad)) {
                        System.out.println("--- Cuenta creada correctamente ---");
                    } else {
                        System.out.println("No se pudo crear la cuenta (saldo negativo).");
                    }
                    break;

                case 2:
                    System.out.println("Introduce DNI de titular:");
                    dni = teclado.nextLine();
                    System.out.println("Introduce PIN asociado:");
                    pin = teclado.nextLine();
                    System.out.println("Introduce saldo a ingresar:");
                    cantidad = teclado.nextDouble();
                    teclado.nextLine();
                    if (bancoSeleccionado.ingresar(dni, pin, cantidad)) {
                        System.out.println("--- Dinero ingresado correctamente ---");
                    } else {
                        System.out.println("No se pudo ingresar dinero (verifica datos y cantidad).\n");
                    }
                    break;

                case 3:
                    System.out.println("Introduce DNI de titular:");
                    dni = teclado.nextLine();
                    System.out.println("Introduce PIN asociado:");
                    pin = teclado.nextLine();
                    System.out.println("Introduce saldo a sacar:");
                    cantidad = teclado.nextDouble();
                    teclado.nextLine();
                    if (bancoSeleccionado.sacar(dni, pin, cantidad)) {
                        System.out.println("--- Dinero sacado correctamente ---");
                    } else {
                        System.out.println("No se pudo sacar dinero (verifica datos o saldo insuficiente).\n");
                    }
                    break;

                case 4:
                    System.out.println("Introduce DNI de titular:");
                    dni = teclado.nextLine();
                    List<Cuenta> cuentasCliente = bancoSeleccionado.buscarCuentasPorDni(dni);
                    if (cuentasCliente.isEmpty()) {
                        System.out.println("No hay cuentas asociadas a ese DNI.");
                    } else {
                        System.out.println("Las cuentas asociadas al cliente con DNI " + dni + " son:");
                        for (Cuenta cuenta : cuentasCliente) {
                            System.out.println(cuenta.resumen());
                        }
                        System.out.println("--- Listadas cuentas cliente correctamente ---");
                    }
                    break;

                case 5:
                    List<Cuenta> todas = bancoSeleccionado.getCuentas();
                    if (todas.isEmpty()) {
                        System.out.println("El banco no tiene cuentas registradas.");
                    } else {
                        System.out.println("Las cuentas que tiene el banco son:");
                        for (Cuenta cuenta : todas) {
                            System.out.println(cuenta.resumen());
                        }
                        System.out.println("--- Listadas cuentas correctamente ---");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        teclado.close();
    }
    }

