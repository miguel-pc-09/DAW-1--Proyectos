package model;

import java.util.Arrays;
import java.util.Comparator;

public class Carrera {

    // Atributos de los circuitos
    private String nombre, pais;
    private int  vueltas;
    private double km;

    //constructor vacio
    public Carrera(){}

    //Constructor completo
    public Carrera(String nombre, String pais, double km, int vueltas){
        this.nombre = nombre;
        this.km = km;
        this.vueltas = vueltas;
        this.pais = pais;
    }

    //Mostrar Circuitos
    public void mostrarCircuito(){
        System.out.println("\n\uD83C\uDFC1 Carrera: " + nombre + " - " + pais);
        System.out.println("Kilómetros: " + km + " km, Vueltas: " + vueltas);
    }

    // Metodo, para ejecutar la carrera y ordenar los coches
    public void realizarCarrera(Coche[] participantes) {
        System.out.println("\n\uD83C\uDFC1 Iniciando carrera en " + nombre + "...");

        // Reinicia  la distancia de cada coche
        for (Coche coche : participantes) {
            coche.resetearDistancia();
            for (int i = 0; i < vueltas; i++) {
                coche.acelerar();
            }
        }

        // Ordena los coches segun distancia
        Arrays.sort(participantes, Comparator.comparingDouble(Coche::getKmRecorridos).reversed());

        // Medallero
        String [] medalla = {"\uD83E\uDD47", "\uD83E\uDD48", "\uD83E\uDD49"};

        //Muestra los tres primeros de cada carrera
        System.out.println("\n\uD83C\uDFC6 Resultados de la carrera:");
        for (int i = 0; i < 3; i++) {
            int puntos;


            switch (i) {
                case 0:
                    puntos =20;

                    break;
                case 1:
                    puntos = 15;

                    break;
                case 2:
                    puntos = 10;

                    break;
                default:
                    puntos = 0;

            };
            participantes[i].sumarPuntos(puntos);
            System.out.println(medalla[i]+ " " +(i + 1) + "º " + participantes[i].getPiloto() + " - " + puntos + " puntos");
        }
    }

    public String getNombre() {
        return nombre;
    }

}