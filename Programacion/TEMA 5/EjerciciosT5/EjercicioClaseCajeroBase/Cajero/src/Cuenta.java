import java.util.Random;

public class Cuenta {
    private String dni;
    private String pin;
    private double saldo;
    private int isbn;

    // Constructor vacio
    public Cuenta() {}

    public Cuenta(String dni, String pin, double saldo, int isbn) {
        this.dni = dni;
        this.pin = pin;
        this.saldo = saldo;
        this.isbn = isbn;
    }
    public Cuenta(String dni, String pin, double saldoInicial) {
        this.dni = dni;
        this.pin = pin;
        this.saldo = saldoInicial;
        this.isbn = new Random().nextInt(10000) + 1; // Aleatorio entre 1 y 10000
    }

    // Metodo verificacion
    public boolean validar(String dni, String pin){
        return this.dni.equals(dni) && this.pin.equals(pin);
    }
    // Metodo ingresa dinero si es positivo
    public boolean ingresar(double cantidad){
        if(cantidad <= 0){

            return false ;
        }
        this.saldo += cantidad;
        System.out.println("Saldo: "+ saldo);
        return true;
    }
    // Metodo sacar dinero
    public boolean sacar ( double cantidad){
        if(cantidad <= 0 || cantidad > saldo){
            return false;
        }
        this.saldo -= cantidad;
        return true;
    }
    // Metodo mostrar datos
    public String resumen(){
        return "ISBN: "+ isbn + "\nSaldo: "+ saldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
