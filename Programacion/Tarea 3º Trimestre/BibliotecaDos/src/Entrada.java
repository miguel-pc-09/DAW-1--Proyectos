import controller.Biblioteca;
import model.Libro;
import utils.TamanioException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // Creacion objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Indica el titulo del libro");
        String titulo = teclado.nextLine();
        System.out.println("Indica el autor del libro");
        String autor = teclado.nextLine();
        System.out.println("Indica el numero de paginas del libro");
        int nPaginas = teclado.nextInt();
        System.out.println("Indica el ISBN del libro");
        int isbn = teclado.nextInt();

        try {
            biblioteca.agregarLibro(new Libro(titulo, autor, nPaginas, isbn));
            // captura y tratamiento de la exception
        } catch (NullPointerException e) {
            System.out.println("La lista no esta iniciada, proceda a iniciarla");
            // Como tratamos el error en Biblioteca tenemos que capturarlo aqui ya que esta en la firma
        } catch (TamanioException e) {
            System.out.println(e.getMessage());
            // quieres eliminar el libro que ya esta
        }

        //**CREAMOS PAQUETE DE UTILS y de dentro clase TAMANIOEXCEPTION

        // Decir a Biblioteca
        //biblioteca.agregarLibro(new Libro(titulo, autor, nPaginas, isbn));
        // Dara ERROR NullPointerException porque no hemos inicializado la lista de libros
        // En controler Biblioteca solucion con Try


        /*ArrayList<Libro> listaLibros = new ArrayList<>();
        try {
        System.out.println("Indica el titulo del libro");
        String titulo = teclado.nextLine();
        System.out.println("Indica el autor del libro");
        String autor = teclado.nextLine();
        System.out.println("Indica el numero de paginas del libro");
        int nPaginas = teclado.nextInt();
        System.out.println("Indica el ISBN del libro");
        int isbn = teclado.nextInt();

        Libro libro = new Libro(titulo, autor, nPaginas, isbn);
        listaLibros.add(libro);
        // lista de libros
        System.out.println("La lista de libros es: "+listaLibros.size());
        System.out.println("Voy a sacar un libro cualquiera de la lista");
        //Prueba de fallo al sacar un libro que no esta
        Libro libroBusqueda = listaLibros.get(0);//(int) (Math.random()*7)-> prueba dentro del get
        System.out.println("El libro encontrado es: "+libroBusqueda.getTitulo());
        int division =7/0;
            System.out.println("El resultado de la division es: "+division);

        // Excpecion de meter un string en un int por consola
        }catch (InputMismatchException e){        // Catch -> Se leen en cascada. Si ponemos Exception captura una general
            System.out.println("Fallo en la introducion de datos");
            // En el Sout si ponemos EXCEPTION (e.getMessage()) nos da el error de la excepcion
            // En el SOUT si ponemos EXCEPTION (e.getCause()) nos da el error de la excepcion  TENEMOS QUE PONER LOS DOS

            // Captura excepcion busqueda de libro
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error al sacar el usuario");
            //Captura de la division
        }catch (ArithmeticException e){
            System.out.println("Error de la division");
        }*/
    }
}
