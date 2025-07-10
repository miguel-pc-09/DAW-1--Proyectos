import model.Coche;
import model.Gasolinera;
import model.Surtidor;

public class Entrada {
    public static void main(String[] args) {
        // Crear surtidores
        Surtidor surt1 = new Surtidor(500, "Diesel");
        Surtidor surt2 = new Surtidor(600, "Gasolina95");
        Surtidor surt3 = new Surtidor("Gasolina98"); // por defecto con 1000L

        // Crear gasolinera
        Gasolinera repsol = new Gasolinera("Repsol");
        repsol.agregarSurtidor(surt1);
        repsol.agregarSurtidor(surt2);
        repsol.agregarSurtidor(surt3);

        // Crear coche de tipo Gasolina95
        Coche coche = new Coche("Gasolina95");

        // Casos de prueba:
        System.out.println("\n--- Caso válido ---");
        coche.ponerGasolina(surt2, 50);
        coche.mostrarDeposito();

        System.out.println("\n--- Surtidor averiado ---");
        surt1.setFunciona(false);
        coche.ponerGasolina(surt1, 20);

        System.out.println("\n--- Gasolina incompatible ---");
        coche.ponerGasolina(surt3, 20);

        System.out.println("\n--- No hay suficiente gasolina ---");
        surt2.setCapacidadActual(10); // simulamos surtidor casi vacío
        coche.ponerGasolina(surt2, 20);
    }

}
