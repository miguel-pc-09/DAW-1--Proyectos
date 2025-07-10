package model;

public final class Autonomo extends Trabajador{
    //Atributos
    private int cuotaSS;

    // Constructor vacio
    public Autonomo() {
    }

    //Constructor con todo


    public Autonomo(String nombre, String apellido, int telefono, int sueldoBruto, int cuotaSS) {
        super(nombre, apellido, telefono, sueldoBruto);
        this.cuotaSS = cuotaSS;
    }

    @Override
    public void calcularSueldo() {
        double sueldoNeto = (getSueldoBruto() - (cuotaSS*12))/12;
        System.out.println("Sueldo neto: "+sueldoNeto);

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cuota SS = " + cuotaSS);
    }

    public int getCuotaSS() {
        return cuotaSS;
    }

    public void setCuotaSS(int cuotaSS) {
        this.cuotaSS = cuotaSS;
    }
}
