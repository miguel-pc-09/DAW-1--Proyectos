package model;

abstract public class Vehiculo {
    // Atributos
    private String marca;
    private String modelo;
    private int anio;

    //Constructor vacio
    public Vehiculo() {}

    //Constructor completo
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    // Metodo mostrar informacion
    public void mostrarInformacion(){
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("año = " + anio);
    }

    // Getter y Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
