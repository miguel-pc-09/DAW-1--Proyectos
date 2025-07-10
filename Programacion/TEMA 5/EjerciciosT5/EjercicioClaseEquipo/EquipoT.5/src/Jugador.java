public class Jugador {
    private String nombre;
    private String posicion;
    private boolean estrella;
    private int calidad;

    public Jugador() {}

    public Jugador(String nombre, String posicion, int calidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.calidad = calidad;
        if (calidad > 90) {
            this.estrella = true;
        } else {
            this.estrella = false;
        }
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre +
                " | Posición: " + posicion +
                " | Calidad: " + calidad +
                " | Estrella: " + (estrella ? "Sí" : "No"));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public void setEstrella(boolean estrella) {
        this.estrella = estrella;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }
}
