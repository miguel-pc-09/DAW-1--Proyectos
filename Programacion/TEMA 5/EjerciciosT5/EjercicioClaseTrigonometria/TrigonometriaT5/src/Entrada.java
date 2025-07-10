import java.sql.SQLOutput;
import java.util.Scanner;

/*Desarrollar una clase entrada donde:
- Se cree una figura de cada tipo, pasando los datos necesarios para el cálculo de la base y perímetro
- Calcula cada uno de los datos mostrando el mensaje "La base del rectángulo es: XXX"
DESPUES POR ULTIMO LA PARTE DE MODIFICACION.*/
public class Entrada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
            // Menu principal
            System.out.println("---MENÚ DE FIGURAS GEOMETRICAS.---");
            System.out.println("1. Trabajar con Triangulos.");
            System.out.println("2. Trabajar con Circulos.");
            System.out.println("3. Trabajar con Cuadrados.");
            System.out.println("4. Salir del programa");
            System.out.println("Seleciona una opcion.");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer
            switch (opcion){
                // Triangulo
                case 1:
                    System.out.println("Introduce la base: ");
                    int baseTri = teclado.nextInt();
                    System.out.println("Introduce la altura: ");
                    int alturaTri = teclado.nextInt();
                    teclado.nextLine(); // limpio buffer
                    // Creacion del triangulo
                    Triangulo tri = new Triangulo(baseTri,alturaTri);
                    // Operaciones
                    System.out.println("¿Que operaciones quieres hacer?");
                    System.out.println("1. Calcular el Area.");
                    System.out.println("2. Mostrar datos. ");
                    int opTri = teclado.nextInt();
                    teclado.nextLine();

                    if(opTri == 1){
                        System.out.println("El area del triangulo es: "+ tri.calcularArea());
                    } else if (opTri == 2) {
                        tri.mostrarDatos();
                    }else{
                        System.out.println("Opcion no valida");
                    }
                    System.out.println("Pulsa enter para continuar");
                    teclado.nextLine();
                    break;
                // Circulo
                case 2:
                    System.out.println("Introduce el radio: ");
                    double radio = teclado.nextDouble();
                    teclado.nextLine();
                    // Creamos el circulo
                    Circulo cir = new Circulo(radio);
                    //  Operaciones
                    System.out.println("¿Que operaciones quieres hacer?");
                    System.out.println("1. Calcular Area.");
                    System.out.println("2. Calcular Diametro");
                    System.out.println("3. Mostrar Datos. ");
                    int opCir = teclado.nextInt();
                    teclado.nextLine(); // limpiamos

                    if(opCir == 1){
                        System.out.println("El area del circulo es: "+ cir.calcularArea());
                    } else if (opCir == 2) {
                        System.out.println("El diametro del circulo es: "+cir.calcularDiametro());
                    } else if (opCir == 3) {
                        cir.mostrarDatos();
                    }else{
                        System.out.println("Opcion no valida.");
                    }
                    System.out.println("Pulsa enter para continuar");
                    teclado.nextLine();
                    break;
                // Cuadrado
                case 3:
                    System.out.print("Introduce base: ");
                    int baseCua = teclado.nextInt();
                    System.out.print("Introduce altura: ");
                    int alturaCua = teclado.nextInt();
                    teclado.nextLine();
                    // Creacion del circulo
                    Cuadrado q = new Cuadrado(baseCua, alturaCua);
                    // Operaciones
                    System.out.println("¿Qué operación quieres hacer?");
                    System.out.println("1. Calcular área");
                    System.out.println("2. Calcular perímetro");
                    System.out.println("3. Mostrar datos");
                    int opCua = teclado.nextInt();
                    teclado.nextLine(); // Limpiamos buffer

                    if (opCua == 1) {
                        System.out.println("Área del cuadrado: " + q.calcularArea());
                    } else if (opCua == 2) {
                        System.out.println("Perímetro del cuadrado: " + q.calcularPerimetro());
                    } else if (opCua == 3) {
                        q.mostrarDatos();
                    } else {
                        System.out.println("Opción no válida.");
                    }

                    System.out.println("Pulsa Enter para continuar...");
                    teclado.nextLine();
                    break;
                case 4:
                    System.out.println("Saliendo del programa......");
                    break;
                default:
                    System.out.println("Opcion no valida...");
                    break;
            }
        }while(opcion !=4);
        teclado.nextLine(); // limpiamos por si acaso
        // Creacion de triangulo, circulo  y cuadrado
        /*Triangulo t = new Triangulo(10,5);
        System.out.println("El area del triangulo es : "+ t.calcularArea());
        System.out.println("Los datos del triangulo son: ");
        t.mostrarDatos();
        System.out.println("----------------------");

        Circulo c = new Circulo(7.0);
        System.out.println("El area del circulo es: "+ c.calcularArea());
        System.out.println("El diametro del circulo es: "+ c.calcularDiametro());
        System.out.println("Los datos del circulo son: ");
        c.mostrarDatos();
        System.out.println("----------------------");

        Cuadrado cu = new Cuadrado(4, 2);
        System.out.println("El area del cuadrado es: " + cu.calcularArea());
        System.out.println("El perimetro del cuadrado es: "+ cu.calcularPerimetro());
        System.out.println("Los datos del cuadrado es: ");
        cu.mostrarDatos();*/
    }
}
/***Modificación**
 se mostrará un menú por el cual se podrán seleccionar opciones a ejecutar (operaciones con triangulo, con circulo y con cuadrado) una vez seleccionada la figura a trabajar se pedirá los datos necesarios (base, altura o radio) y la operación a realizar (calcular area, diámetro y/o perímetro)- El menú será el siguiente:

 - 1 Trabajar con triángulos
 - Introduce base
 - Introduce altura
 - Que operación quieres hacer
 - Calcular área
 - Mostrar datos
 - Pulsa enter para continuar (teclado.next())
 - 2 Trabajar con círculos
 - Introduce radio
 - Que operación quieres hacer
 - Calcular área
 - Calcular diámetro
 - Mostrar datos
 - Pulsa enter para continuar (teclado.next())
 - 3 Trabajar con cuadrados
 - Introduce base
 - Introduce altura
 - Que operación quieres hacer
 - Calcular área
 - Calcular perímetro
 - Mostrar datos
 - Pulsa enter para continuar (teclado.next())*/
