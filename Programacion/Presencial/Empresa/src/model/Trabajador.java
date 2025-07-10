package model;
// Autotmaticamente heredo todos los metodos y atributos de la clase Persona. Salvo 1 el abstracto. OVERRIDE
// El metodo calcular sueldo lo traemos ya que no todas las personas lo necesitan y se quita el OVERRIDE y marcamos la clase abstract
public abstract class Trabajador  extends Persona {

    // el trabajador tendra un atributo int sueldo. Otros tendran mas cosas
    private int sueldoBruto;

    // Constructor coincide con el super, se basa en el de Persona
    public Trabajador(String nombre, String apellido, int telefono, int sueldoBruto) {
        // super -> referencia al padre (PERSONA)
        super(nombre, apellido, telefono);
        this.sueldoBruto = sueldoBruto;
    }
    // Constructor vacio
    public Trabajador(){}


    public abstract void calcularSueldo();

    // Metodo mostrar datos tenemos que traerlo por lo que sera OVERRIDE
    // aparte de hacer lo de la clase padre diremos que aqui tambien metera sueldoBruto
    @Override
    public void mostrarDatos() {
        //** El SUPER DE UN METODO LO PODEMOS PONER DONDE QUERAMOS. PERO EL DEL CONSTRUCTOR NO
        super.mostrarDatos();
        System.out.println("sueldoBruto = " + sueldoBruto);
    }

    // metodos get and set del atributo
    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
}
