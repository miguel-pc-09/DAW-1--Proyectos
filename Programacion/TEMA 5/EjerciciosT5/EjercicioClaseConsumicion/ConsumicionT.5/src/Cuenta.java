import model.Articulo;

import java.util.ArrayList;

public class Cuenta {
    /*- Tendrá un atributo de tipo int "Identificador"
- Tendrá un atributo de tipo boolean "Estado"
- Tendrá un atributo de tipo "ArrayList" donde se guardarán Artículos*/
    private int identificador;
    private boolean estado;
    private ArrayList<Articulo> articulos;

    // constructor vacio
    public Cuenta() {}

    // Constructor  Crear un constructor que pida el identificador.
    public Cuenta(int identificador) {
        this.identificador = identificador;
        this.estado = true; // se crea como abierta
        this.articulos = new ArrayList<>();
    }

    // Agregar artículo a la cuenta
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }
    // Obtener número de artículos
    public int obtenerNumeroArticulos() {
        return articulos.size();
    }
    // Calcular coste total
    public double obtenerCosteTotal() {
        double total = 0;
        for (Articulo articulo : articulos) {
            total += articulo.getCoste();
        }
        return total;
    }




    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

}
/*Créese una clase de nombre “Cuenta” que permita realizar pedidos que tenga los siguientes métodos y atributos:






- Crear un método que retorne el coste total de la consumición.
- Crear un setter para el atributo estado*/
