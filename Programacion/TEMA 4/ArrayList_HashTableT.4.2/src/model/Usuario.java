package model;

public class Usuario {
    // Atributos
    private String nombre;
    private String apellido;
    private int telefono;
    private String dni;

    // Constructor vacio
    public Usuario() {}
    // Constructor completo
    public Usuario(String nombre, String apellido, int telefono, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Usuario: " +
                "\nnombre: '" + nombre + '\'' +
                ", apellido: '" + apellido + '\'' +
                ", telefono: " + telefono +
                ", dni: '" + dni + '\''
                ;
    }

    // Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
