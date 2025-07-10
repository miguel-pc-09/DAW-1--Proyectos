package model;

public class Coche {
    private String tipoGasolina;
    private int litrosDeposito;

    // Constructor
    public Coche(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
        this.litrosDeposito = 0;
    }

    // Método para poner gasolina
    public void ponerGasolina(Surtidor surtidor, int litros) {
        if (!surtidor.isFunciona()) {
            System.out.println("❌ El surtidor está averiado.");
            return;
        }

        if (!surtidor.getGasolina().equalsIgnoreCase(tipoGasolina)) {
            System.out.println("❌ Tipo de gasolina incompatible.");
            return;
        }

        if (surtidor.getCapacidadActual() < litros) {
            System.out.println("❌ No hay suficiente gasolina en el surtidor.");
            return;
        }

        surtidor.quitarGasolina(litros);
        litrosDeposito += litros;
        System.out.println("✅ Se han repostado " + litros + " litros correctamente.");
    }

    // Mostrar litros actuales en el depósito
    public void mostrarDeposito() {
        System.out.println("Litros en el depósito: " + litrosDeposito);
    }
}
