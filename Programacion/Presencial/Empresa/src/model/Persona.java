package model;

abstract public class Persona {

    private String nombre, apellido;

    private int telefono;

    public Persona(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    public Persona(){}

    public void mostrarDatos(){
        System.out.println("Nombre= "+nombre);
        System.out.println("Apellido= "+apellido);
        System.out.println("Telefono= "+telefono);
    }

    // Funcionalidad comun que tendra la clase Persona para las de abajo
    // metodos abstractos (); -> si ponemos {} CUERPO ya no tenemos metodo abstract
    //public abstract void calcularSueldo();



    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
