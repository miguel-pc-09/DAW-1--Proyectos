public class Entrada {

    public static void main(String[] args) {

        // Crear equipos
        Equipo equipoA = new Equipo("Real Madrid");
        Equipo equipoB = new Equipo("Barcelona", 85, 70, 75);

        // Agregar jugadores
        equipoA.agregarJugador(new Jugador("Vinicius", "delantero", 91));
        equipoA.agregarJugador(new Jugador("Modric", "centrocampista", 88));
        equipoB.agregarJugador(new Jugador("Lewandowski", "delantero", 89));
        equipoB.agregarJugador(new Jugador("Koundé", "defensa", 80));

        // Listar delanteros
        equipoA.listarDelanteros();
        equipoB.listarDelanteros();

        // Crear partido e iniciarlo
        Partido partido = new Partido(equipoA, equipoB);
        partido.iniciarPartido();
        partido.mostrarResultado();
    }
}
