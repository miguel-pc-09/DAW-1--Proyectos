package model;

import java.util.Arrays;
import java.util.Comparator;

public class Campeonato {
    private Coche[] coches; // Lista de los coches que participan
    private Carrera[] circuitos;  // Lista de los circuitos

    // Constructor con las listas coches y circuitos
    public Campeonato(Coche[] coches, Carrera[] circuitos) {
        this.coches = coches;
        this.circuitos = circuitos;
    }

    // Metodo para iniciar el campeonato
    public void iniciarCampeonato() {
        System.out.println("\n\uD83C\uDFC1 Comienza el Gran Prix de Programación! \uD83C\uDFC1");

        for (Carrera carrera : circuitos) {
            carrera.mostrarCircuito();
            carrera.realizarCarrera(coches);
        }

        // para ordenar coches por puntuacion
        Arrays.sort(coches, Comparator.comparingInt(Coche::getPuntos).reversed());

        // Array medallero tambien para el final
        String [] medallas = {"\uD83E\uDD47", "\uD83E\uDD48", "\uD83E\uDD49"};


        // Para mostrar la clasificacion general
        System.out.println("\n\uD83C\uDFC1 Final del torneo - Clasificación general: \uD83C\uDFC1");
        for (int i = 0; i < coches.length; i++) {
            String medalla = (i < 3) ? medallas[i] + " " : "";
            System.out.println(medalla + (i + 1) + "º " + coches[i].getPiloto() + " - " + coches[i].getPuntos() + " puntos");
        }
    }


}
