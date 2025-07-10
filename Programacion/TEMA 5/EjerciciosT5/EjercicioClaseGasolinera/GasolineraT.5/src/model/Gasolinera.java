package model;

import java.util.ArrayList;


public class Gasolinera {
    private String nombre;
    private ArrayList<Surtidor> surtidores;
    private int ganancias;

    public Gasolinera() {
    }

    // Constructor
    public Gasolinera(String nombre) {
        this.nombre = nombre;
        this.surtidores = new ArrayList<>();
        this.ganancias = 0;
    }

    public void agregarSurtidor(Surtidor surtidor) {
        surtidores.add(surtidor);
    }

    public int obtenerGanancias() {
        return ganancias;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Surtidor> getSurtidores() {
        return surtidores;
    }

    public void setSurtidores(ArrayList<Surtidor> surtidores) {
        this.surtidores = surtidores;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }
}
