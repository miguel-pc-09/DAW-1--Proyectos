package model;
// Esta clase podra tomar tres formas, Trabajador Asalariado y Persona -> Polimorfismo
// Nos saldra el error porque tiene un metodo abstracto y nos obliga a ponerlo
// La marcamos FINAL para que nadie pueda alterarla por debajo
public final class Asalariado extends Trabajador{

    // Atributo
    private double iva;

    private int nPagas;

    // Constructor vacio
    public Asalariado() {
    }

    //Constructor con TODO lo de arriba, añadiendo sus atributos
    public Asalariado(String nombre, String apellido, int telefono, int sueldoBruto, double iva, int nPagas) {
        super(nombre, apellido, telefono, sueldoBruto);
        this.iva = iva;
        this.nPagas = nPagas;
    }

    // MEtodo mostrar datos sobreescrito


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("iva = " + iva);
        System.out.println("nPagas = " + nPagas);
    }

    //Metodo propio de la clase Asalariado
    public void descansarAsalariado(){
        System.out.println("El asalariado esta descansando");
    }

    //Dentro del calcular sueldo diremos que hace aqui
    @Override
    public void calcularSueldo() {
        // Calculo neto de un asalariado que no tiene nada que ver de un autonomo
        double sueldoNeto = (getSueldoBruto() - getSueldoBruto()*iva)/nPagas;
        System.out.println("El sueldo neto es: "+sueldoNeto);
    }




}
