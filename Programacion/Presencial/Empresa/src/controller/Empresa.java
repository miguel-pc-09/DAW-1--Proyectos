package controller;

import model.Persona;
import model.Trabajador;

import java.util.ArrayList;
import java.util.List;
//** REQUISITO DE UNA CLASE LLAMARSE IGUAL QUE EL FICHERO

// Este sera mi controlador. Y Marcamos que es un Generico <V> la letra que queramos
public class Empresa<V> {
    // Atributos de una empresa. List y dentro Persona para que entre todo como Trabajador, asalariado,autonomo
    // Aqui no inicializamos si no en el constructor
    // Persona es Generico pero puede ser Integer->numeros, solo List-> objetos, La E que sale es de generico
    private List<V> listaPersonas;

    // Atributo para el DEPARTAMENTO
    private Departamento departamento;

    // Constructor vacio
    public Empresa() {
        // Podemos usar ArraList es el hijo de List o List padre de ArrayList.
        // Si ponemos List nos sacara todos los metodos de una interfaz
        listaPersonas = new ArrayList<>();

    }

    // METODO CONTRUIR DEPARTAMENTO
    public void construirDepartamento(){
        // ponemos This delante de new -> tu eres la empresa constrúyete el departamento
        this.departamento = this.new Departamento();
        //departamento.nombre
    }

    // Metodo contratar persona. Para contratar una persona necesitamos una Persona XD
    public void contratarPersona(V persona){
        listaPersonas.add(persona);
    }

    // Metodo mostrar sueldos
    public void mostrarSueldos(){
        // No podemos poner Trabajador porque dentro de las personas puede que no tenga un Trabajador y sea  un Directivo
        for (V p : listaPersonas) {
            // Imaginemos que queremos ver el del directivo. Tenemos que preguntar para esto con un if -> instanceOF
            if(p instanceof Trabajador){
                ((Trabajador) p).calcularSueldo();
            }
            // Esto funcionara mientras sean trabajadores
           //( (Trabajador)p).calcularSueldo();
        }
    }

    // CREACION DE UNA CLASE DENTRO DE LA CLASE EMPRESA, se hace por dependencia es decir solo existe si existe la de arriba
    // Clase Anidada -> El padre no puede cojer del hijo, pero el hijo si puede coger del padre
    // 2.1 -> 1º solucion Definir como estatica, si la definimos como estatica nos quitara muchos problemas, pero es muy peligroso el static
    // 2.1 -> 2º Movemos ENTRADA AL PAQUETE CONTROLLER y en ENTRADA PONEMOS -**- Empresa.Departamento departamento = empresa.new Departamento();-**-
    // 2.1 -> Creamos un atributo departamento dentro de la empresa -> private Departamento departamento;
    //2.1 -> Y un metodo public void construirDepartamento(){this.departamento = new Departamento}
     class Departamento{

            private String nombre;

        public Departamento(){
            // Aqui ahora podemos coger cosas del padre

        }

        public String getNombre() {
            return nombre;
        }
    }

}
