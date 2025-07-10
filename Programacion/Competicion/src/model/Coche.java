package model;

import java.util.Random;


public class Coche {

    // Atributos-> marca, modelo, cv, cc, matrícula, velocidad, km recorridos.
    private String marca, modelo, matricula, piloto;
    private int cv, cc, velocidad;
    private double kmRecorridos;
    private int distancia;
    private int puntos;

    //Coche vacio
    public Coche(){}

    // Constructor coche
    public Coche(String marca, String modelo, String matricula, String piloto, int cv, int cc){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.piloto = piloto;
        this.velocidad = 0;
        this.kmRecorridos = 0;
        this.puntos = 0;
    }

    // Metodo para acelerar
    public void acelerar(){
        int incremento;
        if(cv < 100){
            incremento = (int)(Math.random()* 70)+15; // coches con menos de 100 cv
        } else if (cv < 300) {
            incremento = (int)(Math.random()* 50)+10; // coches entre 100 y 300 cv
        }else{
            incremento = (int)(Math.random()* 10)+5; // coches con mas de 300 cv
        }
        // Aqui aseguro que minimo de 10
        if (incremento < 10){
            incremento = 10;
        }
        // velocidad y distancia recorrida
        velocidad += incremento;
        kmRecorridos += incremento * 0.5; // Para aumentar la distancia recorrida el 50% de la aceleracion
    }

    // Método para sumar puntos
    public void sumarPuntos(int puntosGanados){
        this.puntos += puntosGanados;
    }

    // Metodos Get para obtener datos del coche
    public int getPuntos(){
        return puntos;
    }

    public String getPiloto() {
        return piloto;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }
    // para que se pongan a 0 km en cada carrera
    public void resetearDistancia() {
        this.kmRecorridos = 0;
    }

    public String getModelo() {
        return modelo;
    }
    public String getMarca(){
        return marca;
    }

    public int getCv() {
        return cv;
    }

    public int getCc() {
        return cc;
    }

    // Datos
    public void mostrarDatos(){
        System.out.println("🚗 " + marca + " " + modelo + " (" + matricula + ")");
        System.out.println("Piloto: "+piloto);
        System.out.println("Matricula = " + this.matricula);
        System.out.println("CV = " + cv);
        System.out.println("CC = " + cc);
    }

}