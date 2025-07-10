import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
    // Atributos
    private String nombre;
    private String cif;
    private List<Cuenta> cuentas;

    // Constructor vacio
    public Banco() {}

    // Constructor con nombre y cif
    public Banco(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }
    // Crear cuenta
    public boolean crearCuenta(String dni, String pin, double saldoInicial){
        if(saldoInicial < 0){
            return false;
        }
        cuentas.add(new Cuenta(dni,pin,saldoInicial));
        return true;
    }
    // Cancelar una cuenta
    public boolean cancelarCuenta(String dni, String pin){
        Iterator<Cuenta> it = cuentas.iterator();
        while (it.hasNext()) {
            Cuenta c = it.next();
            if (c.validar(dni, pin)) {
                it.remove();
                return true;
            }
        }
        return false;
    }
    // Ingresar dinero a una cuenta válida
    public boolean ingresar(String dni, String pin, double cantidad) {
        for (Cuenta c : cuentas) {
            if (c.validar(dni, pin)) {
                return c.ingresar(cantidad);
            }
        }
        return false;
    }
    // Sacar dinero de una cuenta válida
    public boolean sacar(String dni, String pin, double cantidad) {
        for (Cuenta c : cuentas) {
            if (c.validar(dni, pin)) {
                return c.sacar(cantidad);
            }
        }
        return false;
    }
    // Buscar todas las cuentas asociadas a un DNI
    public List<Cuenta> buscarCuentasPorDni(String dni) {
        List<Cuenta> resultado = new ArrayList<>();
        for (Cuenta c : cuentas) {
            if (c.getDni().equalsIgnoreCase(dni)) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
