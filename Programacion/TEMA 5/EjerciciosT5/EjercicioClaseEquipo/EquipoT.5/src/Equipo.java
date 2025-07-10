import java.util.ArrayList;
import java.util.Random;

public class Equipo {
    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa;
    private int goles;
    private ArrayList<Jugador> jugadores;

    Random random = new Random();
    // Vacio
    public Equipo() {}

    // Un constructor que pida por parámetros un nombre y que tenga la siguiente funcionalidad:
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.nivelAtaque = random.nextInt(101);
        this.nivelCentro = random.nextInt(101);
        this.nivelDefensa = random.nextInt(101);
        this.goles = 0;
        this.jugadores = new ArrayList<>();
    }

    // Un constructor que pida por parámetros un storing (nombre) y tres enteros (niveles de ataque medio y defensa) y que tenga la siguiente funcionalidad:
    public Equipo(String nombre, int ataque, int centro, int defensa) {
        this.nombre = nombre;
        this.nivelAtaque = ataque;
        this.nivelCentro = centro;
        this.nivelDefensa = defensa;
        this.goles = 0;
        this.jugadores = new ArrayList<>();
    }

    // Agregar jugador al equipo
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // Mostrar solo los delanteros
    public void listarDelanteros() {
        System.out.println("Delanteros del equipo " + nombre + ":");
        for (Jugador j : jugadores) {
            if (j.getPosicion().equalsIgnoreCase("delantero")) {
                j.mostrarDatos();
            }
        }
    }

    // Metodo atacar
    public boolean atacar (){
        double aleatorio1 = random.nextDouble();
        double aleatorio2 = random.nextDouble();

        double resultado = (nivelAtaque*aleatorio1)+((nivelCentro*aleatorio2)/2);

        if(resultado > 90){
            goles ++ ;
            return true;
        }
        return false;
    }



    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public int getNivelCentro() {
        return nivelCentro;
    }

    public void setNivelCentro(int nivelCentro) {
        this.nivelCentro = nivelCentro;
    }

    public int getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(int nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
}
