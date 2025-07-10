package model;

public class Articulo {
    private String nombre;
    private double coste;

    // Constructor
    public Articulo(String nombre, double coste) {
        this.nombre = nombre;
        this.coste = coste;
    }

    // Método para modificar el precio
    public void setCoste(double nuevoCoste) {
        this.coste = nuevoCoste;
    }

    // Getter para obtener el coste del artículo
    public double getCoste() {
        return coste;
    }

    // Getter para obtener el nombre del artículo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
