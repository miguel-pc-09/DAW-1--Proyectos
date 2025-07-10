/*Desarrollar una clase Cuadrado
- Tenga un constructor vacío y un constructor con base y altura
- Tenga dos atributos int base y altura
- Tenga dos atributos de tipo double área y perímetro
- Tenga un método que calcule su área (A=b*a)
- Tenga un método que calcule su perímetro (2*a+2*b)*/
public class Cuadrado {

    // Atributos
    private int base;
    private int altura;
    private double area;
    private double perimetro;

    // Constructor vacio
    public Cuadrado() {}

    // Constructor base y altura
    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodo Area
    public double calcularArea(){
        area = base * altura;
        return area;
    }
    // Metodo perimetro
    public double calcularPerimetro(){
        perimetro = 2 * altura + 2 * base;
        return perimetro;
    }

    // Metodo mostrar Datos
    public void mostrarDatos(){
        System.out.println("base = " + base);
        System.out.println("altura = " + altura);
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
        System.out.println("Calculo area: "+ calcularArea());
        System.out.println("Calculo perimetro: "+ calcularPerimetro());
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
