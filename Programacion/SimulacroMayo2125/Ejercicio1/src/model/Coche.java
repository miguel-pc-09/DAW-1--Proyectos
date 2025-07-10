package model;

public class Coche extends Vehiculo{
    // Atributos
    private int numeroPuertas;

    // Constructor vacio
    public Coche() {}

    // Constructor solo puertas
    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    // Constructor completo
    public Coche(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    // Metodo sobreescrito


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("numeroPuertas = " + numeroPuertas);
    }

    // Getter y Setter

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
