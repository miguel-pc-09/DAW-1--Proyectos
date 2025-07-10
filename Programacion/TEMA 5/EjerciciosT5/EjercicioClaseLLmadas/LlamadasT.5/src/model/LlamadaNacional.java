package model;

public class LlamadaNacional {
    private long numeroOrigen;
    private long numeroDestino;
    private double coste;
    private int destino; // 1=A, 2=B, 3=C, otro=otro
    private double duracion;

    // Constructor
    public LlamadaNacional(long numeroOrigen, long numeroDestino, double duracion, char destinoLetra) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;

        if (destinoLetra == 'A') {
            destino = 1;
            coste = 0.40 * duracion;
        } else if (destinoLetra == 'B') {
            destino = 2;
            coste = 0.50 * duracion;
        } else if (destinoLetra == 'C') {
            destino = 3;
            coste = 0.60 * duracion;
        } else {
            destino = 0;
            coste = 0.70 * duracion;
        }
    }
    public void mostrarDatos() {
        System.out.println("Llamada NACIONAL:");
        System.out.println("Origen: " + numeroOrigen + " - Destino: " + numeroDestino);
        System.out.println("Duración: " + duracion + " seg - Coste: " + coste + " € - Zona: " + destino);
    }

    public double getCoste() {
        return coste;
    }
}


