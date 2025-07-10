package model;

public class Surtidor {
    /*- Atributo int (capacidadTotal) que represente los litros máximos de gasolina que admite
      - Atributo int (capacidadActual) que represente los litros que tiene de gasolina cargados
      - Atributo string que represente el tipo de gasolina que tiene
      - Atributo boleado que represente si está o no funcionando el surtidor*/
    private int capacidadTotal;
    private int capacidadActual;
    private String gasolina;
    private boolean funciona;

    // vacio
    public Surtidor() {}

    // Constructor completo
    public Surtidor(int capacidadTotal, String gasolina) {
        this.capacidadTotal = capacidadTotal;
        this.gasolina = gasolina;
        this.capacidadActual = capacidadTotal;
        this.funciona = true;
    }

    // Constructor por defecto (solo tipo gasolina)
    public Surtidor(String gasolina) {
        this.capacidadTotal = 1000;
        this.capacidadActual = 1000;
        this.gasolina = gasolina;
        this.funciona = true;
    }

    // Método para arreglar el surtidor
    public void arreglar() {
        funciona = true;
    }

    // Método para rellenar el surtidor
    public void rellenar(int litros) {
        capacidadActual += litros;
        if (capacidadActual > capacidadTotal) {
            capacidadActual = capacidadTotal; // no puede superar el máximo
        }
    }

    // Método para quitar gasolina
    public void quitarGasolina(int litros) {
        capacidadActual -= litros;
        if (capacidadActual < 0) {
            capacidadActual = 0;
        }
    }

    // - Los getter y setter correpondientes
    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }

    public boolean isFunciona() {
        return funciona;
    }

    public void setFunciona(boolean funciona) {
        this.funciona = funciona;
    }
}
