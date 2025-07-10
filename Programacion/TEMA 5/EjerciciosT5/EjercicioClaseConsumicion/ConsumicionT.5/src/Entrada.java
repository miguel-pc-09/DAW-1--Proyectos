import model.Articulo;

import java.util.HashMap;

public class Entrada {
    public static void main(String[] args) {
        // Colección de cuentas
        HashMap<Integer, Cuenta> cuentas = new HashMap<>();

        // Registrar cuenta con ID 1
        Cuenta cuenta1 = new Cuenta(1);
        cuentas.put(1, cuenta1);

        // Agregar artículos a la cuenta 1
        if (cuentas.containsKey(1)) {
            cuenta1.agregarArticulo(new Articulo("Café", 1.50));
            cuenta1.agregarArticulo(new Articulo("Croissant", 2.00));
        }

        // Mostrar información de la cuenta
        Cuenta c = cuentas.get(1);
        System.out.println("Cuenta " + c.getIdentificador());
        System.out.println("Número de artículos: " + c.obtenerNumeroArticulos());
        System.out.println("Coste total: " + c.obtenerCosteTotal() + " €");

        // Cambiar estado de la cuenta a cerrada
        c.setEstado(false);
        System.out.println("Estado de la cuenta: " + (c.isEstado() ? "Abierta" : "Cerrada"));
    }
}
