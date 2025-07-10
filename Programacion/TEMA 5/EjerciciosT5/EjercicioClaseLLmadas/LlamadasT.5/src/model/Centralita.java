package model;

import java.util.ArrayList;

public class Centralita {
    private ArrayList<LlamadaLocal> locales;
    private ArrayList<LlamadaNacional> nacionales;
    private double costeAcumulado;

    public Centralita() {
        locales = new ArrayList<>();
        nacionales = new ArrayList<>();
        costeAcumulado = 0;
    }

    public void agregarLocal(LlamadaLocal l) {
        locales.add(l);
        costeAcumulado += l.getCoste();
    }

    public void agregarNacional(LlamadaNacional n) {
        nacionales.add(n);
        costeAcumulado += n.getCoste();
    }

    public void listarLocales() {
        System.out.println("\n--- LLAMADAS LOCALES ---");
        for (LlamadaLocal l : locales) {
            l.mostrarDatos();
        }
    }

    public void listarNacionales() {
        System.out.println("\n--- LLAMADAS NACIONALES ---");
        for (LlamadaNacional n : nacionales) {
            n.mostrarDatos();
        }
    }

    public void mostrarCostes() {
        System.out.println("\nCoste acumulado total: " + costeAcumulado + " €");
    }
}
