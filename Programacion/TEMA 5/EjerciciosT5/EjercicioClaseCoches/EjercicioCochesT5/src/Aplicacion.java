/*Desarrollar una clase llamada Aplicacion que en su método main:

*/
public class Aplicacion {
    public static void main(String[] args) {
        // - Cree un garaje
        Garaje garaje = new Garaje();

        // - Cree 2 coches.
        Coche coche1 = new Coche("Toyota", "Corolla", "1234ABC");
        Coche coche2 = new Coche("honda", "Civic", "1234BCA");

        // Lista averias a tratar
        String[] averias = {"aceite", "motor", "frenos", "ruedas"};

        // - Los coches entrarán al menos 2 veces en el garaje.
        //- El garaje irá cogiendo los coches y devolviéndolos, acumulando un importe aleatorio (Math.random()) de la avería tratada.
        //- Si la avería del coche es “aceite” incrementar en 10 los litros de aceite, en el caso de no ser aceite se incrementa con un random de 0 a 100
        for (int i = 0; i < 2; i++) {
            // coche 1 entra
            String averiaC1 = averias[(int)(Math.random()* averias.length)];
            if(garaje.aceptarCoche(coche1, averiaC1)){
                // acumular averia
                coche1.acumularAvenira();
                if(averiaC1.equalsIgnoreCase("aceite")){
                    int litrosActuales = coche1.getMotor().getLitrosAceite();
                    coche1.getMotor().setLitrosAceite(litrosActuales + 10);
                }else {
                    int aleatorio =(int) (Math.random()* 101);
                    int litrosActuales = coche1.getMotor().getLitrosAceite();
                    coche1.getMotor().setLitrosAceite(litrosActuales + aleatorio);
                }
                garaje.devolverCoche();
            }
            // Coche 2 entra
            String averiaC2 = averias[(int)(Math.random()* averias.length)];
            if(garaje.aceptarCoche(coche2, averiaC2)){
                // acumular averia
                coche2.acumularAvenira();
                if(averiaC2.equalsIgnoreCase("aceite")){
                    int litrosActuales = coche2.getMotor().getLitrosAceite();
                    coche2.getMotor().setLitrosAceite(litrosActuales + 10);
                }else {
                    int aleatorio =(int) (Math.random()* 101);
                    int litrosActuales = coche2.getMotor().getLitrosAceite();
                    coche2.getMotor().setLitrosAceite(litrosActuales + aleatorio);
                }
                garaje.devolverCoche();
            }

        }

        // - Mostrar la información de los coches al final del main.
        System.out.println("Informacion de los coches.");
        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
        System.out.println("Coches atendidos: "+ garaje.getCochesAtendidos());


    }
}
