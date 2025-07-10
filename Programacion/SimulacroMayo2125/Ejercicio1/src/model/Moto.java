package model;

public class Moto extends  Vehiculo{
    // Atributos
    private int cilindrada;

    //Constructor vacio
    public Moto() {}

    // Constructor solo cilindrada
    public Moto(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    // Constructor completo
    public Moto(String marca, String modelo,int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }
    // metodo mostrar informacion


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("cilindrada = " + cilindrada);
    }

    // Getter y Setter
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
