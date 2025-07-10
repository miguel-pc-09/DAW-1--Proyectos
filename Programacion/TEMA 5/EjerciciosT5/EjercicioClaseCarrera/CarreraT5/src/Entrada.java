import java.util.Random;

public class Entrada {

    public static void main(String[] args) {
        Coche cocheA = new Coche();

        Coche cocheB = new Coche(320, "12345XYZ", "toyota");

        System.out.println("Datos de los coches");
        cocheA.mostrarDatos();
        System.out.println("------");
        cocheB.mostrarDatos();

        // modificar datos cocheA
        cocheA.setModelo("Ford");
        cocheA.setMatricula("5678ABC");
        cocheA.setCaballos(450);

        // Generar velocidades aleatroias
        Random random = new Random();
        int velA = random.nextInt(21)+10;
        int velB = random.nextInt(21)+ 10;

        cocheA.acelerar(velA);
        cocheB.acelerar(velB);

        System.out.println("Despues de acelerar");
        cocheA.mostrarDatos();
        cocheB.mostrarDatos();

        // Determinar ganador
        if (cocheA.getKilometrosRecorridos() > cocheB.getKilometrosRecorridos()) {
            System.out.println("\nEl ganador es " + cocheA.getModelo() + " " + cocheA.getMatricula() +
                    " con " + cocheA.getKilometrosRecorridos() + " km recorridos.");
        } else if (cocheB.getKilometrosRecorridos() > cocheA.getKilometrosRecorridos()) {
            System.out.println("\nEl ganador es " + cocheB.getModelo() + " " + cocheB.getMatricula() +
                    " con " + cocheB.getKilometrosRecorridos() + " km recorridos.");
        } else {
            System.out.println("\nEmpate, ambos coches han recorrido la misma distancia.");
        }
    }
}
