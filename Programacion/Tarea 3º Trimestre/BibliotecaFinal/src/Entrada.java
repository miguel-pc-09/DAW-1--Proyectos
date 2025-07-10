import controller.Biblioteca;
import controller.OperacionesFicheros;
import enums.TipoFantasia;
import model.*;
import exception.CatalogoLlenoException;
import exception.LibroNoEncontradoException;
import enums.Trama;
import enums.TipoHumor;
import java.io.IOException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        OperacionesFicheros operacionesFicheros = new OperacionesFicheros();
        operacionesFicheros.crearFichero();

        // Crear  biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca UE", "Miguel Angel Perucha");

        //Bienvenida
        System.out.println("Bienvenidos a la biblioteca UE\n ");

        // Construir catálogo
        System.out.print("Introduce la capacidad del catálogo: ");
        int capacidad = teclado.nextInt();
        teclado.nextLine();
        biblioteca.construirCatalogo(capacidad);

        // Menu construcion con while
        while (true) {
            System.out.println("\nMenú biblioteca:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Buscar libro por ISBN");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Guardar catálogo en fichero");
            System.out.println("6. Cargar catálogo desde fichero");
            System.out.println("7. Salir");
            System.out.print("¿Que opción deseas?: ");

            int opcion = teclado.nextInt();
            teclado.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        // Metodo para agregar libro
                        System.out.println("Tipos de libro: ");
                        System.out.println("1. Terror. ");
                        System.out.println("2. Fantasía. ");
                        System.out.println("3. Policiaca. ");
                        System.out.println("4. Comedia. ");
                        System.out.print("Elige tu tipo de libro: ");

                        // int tipo -> para luego con el if ir a uno u otro para rellenar los datos
                        int tipo = teclado.nextInt();
                        teclado.nextLine();

                        // Datos del libro a rellenar, globales para todos los tipos ya en el if elige
                        System.out.print("Título: ");
                        String titulo = teclado.nextLine();
                        System.out.print("Autor: ");
                        String autor = teclado.nextLine();
                        System.out.print("Número de páginas: ");
                        int paginas = teclado.nextInt();
                        System.out.print("ISBN: ");
                        int isbn = teclado.nextInt();
                        teclado.nextLine();

                        // Metodo según el tipo elegido y rellenar para guardar en su lista
                        Libro libro = null;
                        if (tipo == 1) {
                            System.out.print("Calificación (Edad recomendada): ");
                            String calificacion = teclado.nextLine();
                            libro = new Terror(titulo, autor, paginas, isbn, calificacion);
                        } else if (tipo == 2) {
                            System.out.print("Tipo de fantasía (epica, urbana, juvenil): ");
                            String tfInput = teclado.nextLine().toLowerCase();
                            TipoFantasia tf = TipoFantasia.valueOf(tfInput);
                            libro = new Fantasia(titulo, autor, paginas, isbn, tf);
                        } else if (tipo == 3) {
                            System.out.print("Trama (misterio/intriga): ");
                            String tramaInput = teclado.nextLine().toLowerCase();
                            Trama trama = Trama.valueOf(tramaInput);
                            libro = new Policiaca(titulo, autor, paginas, isbn, trama);
                        } else if (tipo == 4) {
                            System.out.print("Tipo de humor (ironico, sarcastico, romantico): ");
                            String humorInput = teclado.nextLine().toLowerCase();
                            TipoHumor humor = TipoHumor.valueOf(humorInput);
                            libro = new Comedia(titulo, autor, paginas, isbn, humor);
                        }

                        // Si libro es distinto de null añadimos
                        if (libro != null) {
                            biblioteca.agregarLibro(libro);
                            System.out.println("Libro agregado correctamente.");
                        }
                        break;
                    case 2:
                        System.out.print("¿Cual es el ISBN del libro que quieres borrar?: ");
                        int eliminarIsbn = teclado.nextInt();
                        biblioteca.eliminarLibro(eliminarIsbn);
                        // MEnsaje para confirmar que el libro fue borrado
                        System.out.println("Libro eliminado correctamente.");
                        break;
                    case 3:
                        System.out.print("Indica el ISBN del libro que quieres buscar: ");
                        int buscarIsbn = teclado.nextInt();
                        Libro encontrado = biblioteca.buscarLibro(buscarIsbn);
                        encontrado.mostrarDatosLibro();
                        break;
                    case 4:
                        // No hacer nada solo mostrar el listado de libros
                        biblioteca.mostrarLibros();
                        break;
                    case 5:
                        biblioteca.guardarCatalogo("src/resources/libros.obj");
                        operacionesFicheros.exportarLibrosTexto(biblioteca.obtenerTodosLosLibros(), "src/resources/libros.txt");
                        System.out.println("Catálogo guardado correctamente.");
                        break;
                    case 6:
                        biblioteca.cargarCatalogo("src/resources/libros.obj");
                        System.out.println("Catálogo cargado correctamente.");
                        biblioteca.mostrarLibros();
                        break;
                    case 7:
                        System.out.println("Saliendo de la biblioteca. ¡Hasta pronto!");
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (CatalogoLlenoException | LibroNoEncontradoException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Error de catálogo: " + e.getMessage());
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error de fichero: " + e.getMessage());
            }
        }
    }
}