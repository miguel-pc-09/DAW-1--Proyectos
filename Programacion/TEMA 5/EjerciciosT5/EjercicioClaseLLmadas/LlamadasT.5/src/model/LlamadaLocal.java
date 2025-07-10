package model;

public class LlamadaLocal {
    private long numeroOrigen;
    private long numeroDestino;
    private double coste;
    private double duracion;

    public LlamadaLocal() {
    }

    // Constructor
    public LlamadaLocal(long numeroOrigen, long numeroDestino, double duracion) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
        this.coste = 0.50 + (0.15 * duracion);
    }

    // Mostrar datos
    public void mostrarDatos() {
        System.out.println("Llamada LOCAL:");
        System.out.println("Origen: " + numeroOrigen + " - Destino: " + numeroDestino);
        System.out.println("Duración: " + duracion + " seg - Coste: " + coste + " €");
    }

    // Getter
    public double getCoste() {
        return coste;
    }

    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
