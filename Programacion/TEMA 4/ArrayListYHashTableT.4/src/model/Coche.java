package model;

// Solo los atributos y toString/getters atributos: marca (string) modelo (string), coste reparacion (int), matricula (string)

import java.io.StringBufferInputStream;

public class Coche {
    private String marca;
    private String modelo;
    private int costeReparacion;
    private String matricula;

    public Coche() {}


    public Coche(String marca, String modelo, String matricula,int costeReparacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.costeReparacion = costeReparacion;
    }


    @Override
    public String toString() {
        return "Coche: " +
                ", marca: '" + marca + '\'' +
                ", modelo: '" + modelo + '\'' +
                ", costeReparacion: " + costeReparacion +
                ", matricula: " + matricula;
    }

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

    public int getCosteReparacion() {
        return costeReparacion;
    }

    public void setCosteReparacion(int costeReparacion) {
        this.costeReparacion = costeReparacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

