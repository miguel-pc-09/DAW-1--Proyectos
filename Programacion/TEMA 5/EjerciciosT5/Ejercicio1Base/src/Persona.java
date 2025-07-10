public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double peso;
    private int altura;
    // Ejercicio 5
    private String genero;

    // Constructor vacio


    // Constructor completo
    public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura,String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.genero = genero;
    }
    // Constructor sin genero
    public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.genero = "genero";
    }
    // Constructor sin peso ni altura
    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = 0;
        this.altura = 0;
        this.genero = "genero";
    }
    // Constructor con nombre y apellidos
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "1111111x";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
        this.genero ="asdasf";
    }
    // Con datos por defecto
    public Persona() {
        this.nombre = "datos por defecto";
        this.apellido = "datos por defecto";
        this.dni = "111111111X";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
        this.genero = "datos por defecto";
    }

    // Metodo mostrar datos
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Genero: "+ genero);
    }
    //3º Ejercicio Metodo incremento edad
    // Este método no devuelve nada (void)
    // Recibe como parámetro un número entero (incremento)
    public void incrementoEdad(int incremento){
        // Accede al atributo 'edad' del objeto actual (this)
        // Le suma el valor recibido como parámetro

        this.edad = incremento;
        // Es lo mismo que: this.edad = this.edad + incremento;
    }

    //3º Ejercicio Metodo IMC IMC = peso / (altura * altura)

    public double calcularImc(){
       double alturaMetros  = altura / 100.0;
       if(alturaMetros == 0){
           System.out.println("no puede ser");
           return 0;
       }
       return peso / (alturaMetros * alturaMetros);
    }
    // Ejercicio 5 Segun genero un resultado u otro
    public void mostrarImc(){
        double imc = calcularImc();
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Estado fisico. ");
        if(genero.equalsIgnoreCase("mujer")){
            if (imc < 20) {
                System.out.println("Bajo peso");
            } else if (imc < 25) {
                System.out.println("Normopeso");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            } else if (imc <= 40) {
                System.out.println("Obesidad");
            } else {
                System.out.println("Obesidad mórbida");
            }
        }else if (genero.equalsIgnoreCase("hombre")) {
            if (imc < 20) {
                System.out.println("Bajo peso");
            } else if (imc < 27) {
                System.out.println("Normopeso");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            } else if (imc <= 40) {
                System.out.println("Obesidad");
            } else {
                System.out.println("Obesidad mórbida");
            }
        } else {
            System.out.println("Género no reconocido. No se puede calcular el estado.");
        }
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
/*1. Crea una clase llamada persona con los siguientes elementos
    - Propiedades: nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
    - Métodos:
        - mostrarDatos: sacará por pantalla los datos de la persona formateados
        - Métodos getters y setters asociados
        - Constructores:
            - un constructor que permita crear una persona con todos los datos
            - un constructor que permita crear una persona sin peso ni altura
            - un constructor que permita crear una persona con nombre y apellidos, el resto de datos los pondrá a 0, excepto el dni que lo pondrá a 111111111X
            - un constructor que permita crear una persona sin datos de entrada. Los inicializará todos a "datos por defecto", 1111111111X y 0 respectivamente*/
/*3. En la clase creada en el ejercicio 1 crear los siguientes métodos con la funcionalidad que se indica:
    - Un método que recibe por parámetros un número e incrementa la edad de la persona en el parámetro pasado por argumentos
    - Un método que calcule y devuelva el IMC. Para calcular el imc se aplica la siguiente formula IMC = peso / (altura * altura)*/
