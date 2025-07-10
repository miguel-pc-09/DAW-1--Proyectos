import java.util.Random;

public class Coche {
    private int caballos;
    private int velocidad;
    private String matricula;
    private String modelo;
    private double kilometrosRecorridos;

    public Coche() {}
    // Un constructor vacío que inicialice los cv a 0, la velocidad a 0, la matricula a 0000AAA, el modelo a "sin especificar" y los km a 0.0
    public Coche(int caballos, int velocidad, String matricula, String modelo, double kilometrosRecorridos) {
        this.caballos = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = modelo;
        this.kilometrosRecorridos = 0.0;
    }
    // Un constructor con los siguientes parámetros: modelo, matrícula y cv. Se iniciarán los atributos a los parámetros pasados y el resto lo hará a los valores por defecto
    public Coche(int caballos, String matricula, String modelo) {
        this.caballos = caballos;
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = 0;
        this.kilometrosRecorridos = 0.0;
    }
    // Metodo acelerar
    public void acelerar (int cantidad){
        this.velocidad += cantidad;
        // Si supera 180
        if(this.velocidad > 180){
            this.velocidad = 180;
            System.out.println("Velocidad maxima alcanzada 180km/h");
        }
        Random random = new Random();
        int aleatorio = random.nextInt(10)+1; // 1 a 10
        this.kilometrosRecorridos += this.velocidad * (this.caballos * aleatorio);
    }

    // Metodo frenar el coche
    public void frenar (int cantidad){
        this.velocidad -= cantidad;
        if(this.velocidad < 0){
            this.velocidad = 0;
            System.out.println("Coche parado.");
        }
    }
    // Metodo parar el coche
    public void parar (){
        this.velocidad = 0;
    }
    // Metodo resetear vel y km
    public void resetear(){
        this.velocidad = 0;
        this.kilometrosRecorridos = 0;
    }
    // metodo mostrar datos
    public void mostrarDatos(){
        System.out.println("Matrícula: " + matricula + " Modelo: " + modelo +
                " CV: " + caballos + " Velocidad: " + velocidad +
                " Kilómetros: " + kilometrosRecorridos);
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
}
