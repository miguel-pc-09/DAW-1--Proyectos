package model;

// Con extends la hacemos abstracta y coge todas las caracteristicas de trabajador
public class TrabajadorAsalariado extends Trabajador {
    // a los Get y Set si tenemos acceso de trabajador

    private int nomina;

    // y como estamos extendiendo necesitamos sobreescribir el constructor de la clase de arriba "trabajador"


    public TrabajadorAsalariado(String nombre, String apellido,
                                String correo, String dni,
                                int telefono, int nomina) {
        super(nombre, apellido, correo, dni, telefono);
        this.nomina = nomina;
    }

    // sobrescribimos y etemos el dato de la nomina
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("nomina = " + nomina);
    }

    @Override
    public void calcularSalario() {

    }

    public int getNomina() {
        return nomina;
    }

    public void setNomina(int nomina) {
        this.nomina = nomina;
    }
}
