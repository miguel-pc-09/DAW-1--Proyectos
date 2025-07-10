import model.Coche;
import model.Moto;
import model.Vehiculo;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        // Lista de vehiculos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Añadimos coches y motos
        vehiculos.add(new Coche("Toyota", "Corola", 2020, 5 ));
        vehiculos.add(new Coche("Ford", "mondeo", 1996, 5 ));
        vehiculos.add(new Coche("Citroen", "nose", 1980, 3 ));
        vehiculos.add(new Moto("aprilia","nose2", 2010,75 ));
        vehiculos.add(new Moto("BMW","nose3", 2018,250 ));

        // Lista polimorfismo
        for (Vehiculo item : vehiculos) {
            System.out.println();
            item.mostrarInformacion();
        }


    }
}
