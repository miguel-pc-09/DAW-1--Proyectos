import java.util.Scanner;

/*2. Crear una clase llamada entrada que tenga un método main el cual:
   1º - Mediante un scanner pida nombre, apellido, dni edad peso y altura de una persona
   2º - Cree la persona asociada a los datos leídos por teclado (p1)
   3º - Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)
   4º - Crear una persona sin datos asociados
   5º - Mostrar los datos de todas las personas
   6º - Modificar la edad de todas las personas a 20*/
public class Entrada {
    public static void main(String[] args) {
        // Primera parte
        Scanner teclado = new Scanner(System.in);

        System.out.println("cual es su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Cual es tu apellido.");
        String apellido = teclado.nextLine();
        System.out.println("Cual es tu dni. ");
        String dni = teclado.nextLine();
        System.out.println("Edad. ");
        int edad = teclado.nextInt();
        System.out.println("peso. ");
        double peso = teclado.nextDouble();
        System.out.println("Altura. ");
        int altura = teclado.nextInt();

        // 2º Parte
        Persona persona1 = new Persona(nombre, apellido,dni, edad, peso,altura);

        // 3º Parte
        Persona persona2 = new Persona("miguel", "perucha");

        // 4º parte
        Persona persona3 = new Persona();

        // 5º parte mostrar datos
        System.out.println("mostrando datos");
        System.out.println("1º persona " );
        persona1.mostrarDatos();
        System.out.println();
        System.out.println("2º persona ");
        persona2.mostrarDatos();
        System.out.println();
        System.out.println("3º persona ");
        persona3.mostrarDatos();

        // 6º parte

        persona1.setEdad(20);
        persona2.setEdad(20);
        persona3.setEdad(20);

        System.out.println("Cambios de edad, fueron efectivos");
        persona1.mostrarDatos();
        System.out.println();
        persona2.mostrarDatos();
        System.out.println();
        persona3.mostrarDatos();
        System.out.println();

        teclado.close();
        /*4. En la clase entrada creada en el ejercicio 2 crear los siguiente
    - La persona que tiene todos los datos (p1) muestra por pantalla su IMC
    - Según el IMC mostrado por pantalla, también se tendrá que mostrar por consola el estado físico de la persona.
    Para ello hay que tener en cuenta lo siguiente*/
        System.out.println("Calculo IMC");
        double imc = persona1.calcularImc();
        if(imc < 18.5){
            System.out.println("Peso inferior a lo normal");
        } else if (imc < 25.0) {
            System.out.println("normal");
        } else if (imc < 30.0) {
            System.out.println("Peso superior a lo normal");
        }else {
            System.out.println("Obesidad");
        }


    }
}

