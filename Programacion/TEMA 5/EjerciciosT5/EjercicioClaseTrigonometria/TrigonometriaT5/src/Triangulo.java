/*Desarrollar una clase Triangulo que:
- Tenga un constructor vacío y un constructor con base y altura
- Tenga dos atributos tipo int, base y altura
- Tenga un método que calcule su área (A=(b*al)/2)*/
public class Triangulo {

    // Atributos int de base y altura
    private int base;
    private int altura;

    // Constructor vacio
    public Triangulo() {}

    // Constructor base y altura
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodo area
    public double calcularArea(){
        return (base * altura)/ 2.0;
    }
    // mostrar datos
    public void mostrarDatos(){
        System.out.println("base: " + base);
        System.out.println("altura: " + altura);
        System.out.println("Area: "+ calcularArea());
    }


    // Getter y Setter
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
