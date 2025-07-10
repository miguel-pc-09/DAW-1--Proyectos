import controller.Biblioteca;
import model.Libro;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la biblioteca DAW UE");
        System.out.println("");

        Biblioteca biblioteca = new Biblioteca();
        // Añadir libros
        biblioteca.añadirLibro(new Libro("Harry potter", "J.K. Rowling", "Fantasia", 264, 5788));
        biblioteca.añadirLibro(new Libro("Juego de Tronos", "George R.R. Martin", "Fantasia", 800, 8466));
        biblioteca.añadirLibro(new Libro("Ola de calor", "Richard Castle", "Policiaca", 360, 9788));
        biblioteca.añadirLibro(new Libro("IT(ESO)", "Stephen King", "Terror", 1504, 4975));
        biblioteca.añadirLibro(new Libro("Aventuras y desventuras del Chico Centella", "Bill Bryson", "Comedia", 336, 8986));
        // Mostrar los libros

        // Comprobar que obtiene libro
        biblioteca.obtenerLibro(9788);
        // no obtiene libro
        biblioteca.obtenerLibro(978);

        // Prueba de eliminar libro
        biblioteca.obtenerLibro(8466);// Comprueba que esta el libro
        biblioteca.eliminarLibro(8466); // Elimina el libro y nos muestra el libro borrado
        biblioteca.obtenerLibro(8466); // comprueba que el libro no esta

        // Lista de todos los libros
        biblioteca.listarLibros(); // Debe mostrar solo 4 ya que elimine 1

    }
}
