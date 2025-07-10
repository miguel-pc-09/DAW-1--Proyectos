import java.util.Scanner;

public class EntradaSeleccion {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // estructuraIF();

        estructuraSwitch();
    }

    private static void estructuraSwitch(){
        System.out.println("Indicame tu mes de nacimiento");

        int mes = scanner.nextInt();
        //enero, marzo, mayo, julio, agosto, octubre, diciembre -> 31
        // abril, junio, septiembre, noviembre ->30
        // febrero -> 28
        String nombre = "miguel";
        switch (nombre){
            case "miguel":
                break;
            case "Pedro":
                break;
        }
        switch (mes){
            case 1, 3, 5, 7, 8:
                System.out.println("Este mes tiene 31 días");
                break;
            case 2:
                System.out.println("Este mes tiene 28 días");
                break;
            case 4, 11, 6, 9:
                System.out.println("Este mes tiene 30 días");
                break;
            default:
                System.out.println("Mes no valido");
        }
        System.out.println("Saliendo del terminal");
    }

    public static void estructuraIF(){
        // seleccion dependiendo de un valor T o F
        // 0-4 ss
        // 5-6 ap
        // 7-8 nt
        // 9 sb
        // 10 mh
        System.out.println("Dime que nota quieres evaluar");
        double nota = scanner.nextDouble();
        // 4
        if (nota >= 0 && nota <= 10) {
            if(nota < 5){
                System.out.println("El examen esta SS");
            }else if (nota <= 6){
                System.out.println("El examen esta AP");
            }else if(nota <=8){
                System.out.println("El examen esta NT");
            } else if (nota < 10) {
                System.out.println("El examen esta SB");
            }else {
                System.out.println("El examen esta de 10");
            }
        }else{
            System.out.println("Nota no valida");
        }
    }
}
