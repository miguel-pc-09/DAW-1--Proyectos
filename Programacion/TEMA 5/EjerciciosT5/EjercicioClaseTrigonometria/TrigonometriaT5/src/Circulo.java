/*Desarrollar una clase Círculo
- Tenga un constructor vacío y un constructor con radio
- Tenga tres atributo de tipo double radio, diámetro y área
- Tenga un método donde se calcule el área (A=Pi*r2)
- Tenga un método donde se calcule el diámetro (D = 2*r)*/
public class Circulo {
    //Atributos
    private double radio;
    private double diametro;
    private double area;

    //Constructor vacio
    public Circulo() {}
    // Constructor radio
    public Circulo(double radio) {
        this.radio = radio;

    }
    // Metodo mostrar datos
    public void mostrarDatos(){
        System.out.println("radio: " + radio);
        System.out.println("diametro: " + diametro);
        System.out.println("area: " + area);
        System.out.println("Calculo del area: "+ calcularArea());
        System.out.println("Calculo del diametro: "+ calcularDiametro());
    }

    // Metodo Area
    public double calcularArea(){
        area = Math.PI * radio * radio;
        return area;
    }
    //Metodo Diametro
    public double calcularDiametro(){
        diametro = 2 * radio;
        return diametro;
    }

    // Getter y Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
