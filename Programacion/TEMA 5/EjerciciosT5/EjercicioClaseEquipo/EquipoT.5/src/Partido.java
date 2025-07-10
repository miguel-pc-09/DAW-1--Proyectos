public class Partido {
    private Equipo equipoA;
    private Equipo equipoB;
    private boolean enJuego;
    private int parte;

    // Constructor
    public Partido(Equipo equipoA, Equipo equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.enJuego = false;
        this.parte = 1;
    }

    // Método para iniciar el partido
    public void iniciarPartido() {
        enJuego = true;

        for (int i = 1; i <= 2; i++) {
            System.out.println("\n--- Parte " + parte + " ---");

            for (int j = 1; j <= 3; j++) {
                System.out.println("Turno " + j + ":");

                // Equipo A ataca
                boolean golA = equipoA.atacar();
                if (golA && equipoA.getNivelAtaque() > equipoB.getNivelDefensa()) {
                    System.out.println(equipoA.getNombre() + " ha marcado un gol!");
                } else {
                    System.out.println(equipoA.getNombre() + " ha fallado");
                }

                // Equipo B ataca
                boolean golB = equipoB.atacar();
                if (golB && equipoB.getNivelAtaque() > equipoA.getNivelDefensa()) {
                    System.out.println(equipoB.getNombre() + " ha marcado un gol!");
                } else {
                    System.out.println(equipoB.getNombre() + " ha fallado");
                }

                // Resultado parcial
                System.out.println("Resultado parcial: " + equipoA.getNombre() + " " + equipoA.getGoles() +
                        " - " + equipoB.getNombre() + " " + equipoB.getGoles());
            }

            parte++;
        }

        enJuego = false;
    }

    // Mostrar resultado final
    public void mostrarResultado() {
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println(equipoA.getNombre() + " " + equipoA.getGoles() +
                " - " + equipoB.getNombre() + " " + equipoB.getGoles());
    }
}
