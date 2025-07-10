import java.util.InputMismatchException;
import java.util.Scanner;
import exceptions.DivisionPorCeroException;
public class Entrada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
            System.out.println("Divisiones");
            System.out.println("Introduce el dividendo");
            int dividendo = teclado.nextInt();
            System.out.println("Introduce el divisor");
            int divisor = teclado.nextInt();

            if(divisor == 0){
                throw new DivisionPorCeroException("No se puede dividir entre cero");
            }

            int resultado = dividendo / divisor;
            System.out.println("Resultado: "+ resultado);


        }catch (InputMismatchException e){
            System.out.println("Debes introducir numeros enteros validos.");
        }catch (DivisionPorCeroException e){
            System.out.println("Error: "+e.getMessage());
        }finally {
            System.out.println("Fin del programa.");
            teclado.close();
        }
    }
}
