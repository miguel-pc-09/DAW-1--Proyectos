/*Desarrollar una clase llamada Garaje que:
* - El garaje solo podrá atender a un coche en cada momento. Controlar esta premisa.
* - Tenga un método aceptarCoche que recibe un parámetro de tipo Coche y la avería asociada. El garaje solo podrá
     atender a un coche en cada momento. Si ya está atendiendo uno, que devuelva un false.
* - Tenga un método devolverCoche que dejara al garaje en estado de aceptar un nuevo coche.*/
public class Garaje {
    // - Tendrá tres atributos, un coche, un String con la avería asociada y el número de coches que ha ido atendiendo.
    private Coche cocheActual;
    private String averiaAsociada;
    private int cochesAtendidos;

    // Método para aceptar un coche si el garaje está libre
    public boolean aceptarCoche(Coche coche, String averia) {
        if (cocheActual != null) {
            return false; // Ya hay un coche siendo atendido
        }

        this.cocheActual = coche;
        this.averiaAsociada = averia;
        this.cochesAtendidos++;

        return true;
    }

    // Método para liberar el garaje y aceptar otro coche
    public void devolverCoche() {
        this.cocheActual = null;
        this.averiaAsociada = null;
    }


    public Coche getCocheActual() {
        return cocheActual;
    }

    public void setCocheActual(Coche cocheActual) {
        this.cocheActual = cocheActual;
    }

    public String getAveriaAsociada() {
        return averiaAsociada;
    }

    public void setAveriaAsociada(String averiaAsociada) {
        this.averiaAsociada = averiaAsociada;
    }

    public int getCochesAtendidos() {
        return cochesAtendidos;
    }

    public void setCochesAtendidos(int cochesAtendidos) {
        this.cochesAtendidos = cochesAtendidos;
    }
}
