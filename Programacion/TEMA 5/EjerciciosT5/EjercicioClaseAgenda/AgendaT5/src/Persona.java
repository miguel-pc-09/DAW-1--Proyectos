public class Persona {
    private String Nombre;
    private int telefono;
    private String dni;

    // constructor vacio
    public Persona() {}
    // Constructor completo
    public Persona(String nombre, int telefono, String dni) {
        Nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
    }
    // mostrar datos
    public void mostrarDatos(){
        System.out.println("Nombre = " + Nombre);
        System.out.println("telefono = " + telefono);
        System.out.println("dni = " + dni);
    }

    @Override
    public String toString() {
        return "Persona->" + "Nombre: " + Nombre  + ", telefono:" + telefono + ", dni:'" + dni + '\'' ;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
