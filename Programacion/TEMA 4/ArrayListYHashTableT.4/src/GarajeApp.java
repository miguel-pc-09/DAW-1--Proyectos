import model.Coche;
import model.Garaje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GarajeApp {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
     Garaje garaje = new Garaje();
        int opcion;
        do{
            System.out.println("\n===== MENÚ DEL GARAJE =====");
            System.out.println("1. Añadir coche al garaje");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coche por matrícula");
            System.out.println("4. Mostrar coste total de reparaciones");
            System.out.println("5. Eliminar coche por matrícula");
            System.out.println("6. Vaciar garaje");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    garaje.añadirCoche();
                    break;
                case 2:
                    garaje.listarCoches();
                    break;
                case 3:
                    garaje.buscarCoche(teclado.nextLine());
                    break;
                case 4:
                    garaje.calcularCosteTotal();
                    break;
                case 5:
                    garaje.eliminarCoche();
                    break;
                case 6:
                    garaje.vaciarGaraje();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 7.");
            }
        }while(opcion!=7);


    }
    /*1. Desarrollar una aplicación para el control de un garaje. El funcionamiento de la aplicación será desde consola
     mediante un menú que permita acceder a las diferentes opciones. Para la aplicación tendremos que tener en cuenta las siguientes cosas:
- Un coche está formado por los siguientes atributos: marca (string) modelo (string), coste reparacion (int), matricula (string).

Las opciones de la aplicación serán las siguientes:

- Añadirá un coche al taller, pidiéndome todos los datos necesarios. No se pueden añadir dos coches con la misma matricula
- Listar coches
- Buscar coches: Se pedirá una matrícula y se mostrarán los datos del coche.
- Mostrar costes: Se mostrará el coste acumulado de todos los coches de la lista.
- Eliminar coche: Se pedirá una matrícula y se eliminará el coche de la lista
- Vaciar garaje: Eliminará todos los coches de la lista*/

}
