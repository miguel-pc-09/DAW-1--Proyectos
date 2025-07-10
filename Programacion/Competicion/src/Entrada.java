import model.Campeonato;
import model.Carrera;
import model.Coche;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" \uD83C\uDFCE\uFE0F Bienvenido al Gran Prix de Programación \uD83C\uDFC1 ");
        System.out.println(" ¿Cuál es tu nombre? ");
        String nombreJugador = teclado.nextLine();

        System.out.println("\nBien " + nombreJugador+ ",elije tu coche: ");

        // Garaje de todos los coches
        //Lista de Coches String marca, String modelo, String matricula, String piloto, int cv, int cc, int velocidad
        Coche[] paddock = {
                new Coche("Porche", "911 Turbo S","7894A", " \uD83D\uDE97  Jesus N. ",650,3890),
                new Coche("Ferrari", "296 GTB","1596A", "\uD83C\uDFCE Naiara ",830, 2992),
                new Coche("Mazda", "MX-5","7532C","\uD83D\uDE97 J.Gomez ",250,1200),
                new Coche("Lotus", "Elise","4862D","\uD83C\uDFCE M.Percucha ",540,1600),
                new Coche("Fiat", "500 Abarth","1756T","\uD83D\uDE95 V.Bullido ",95,1368),
                new Coche("Renault","Twingo","4832G","\uD83D\uDE93 Borja ",75,1200),
                new Coche("Fiat","Panda","6871N"," \uD83D\uDE97  J.J.Benitez ",85,875),
                new Coche("Suzuki","Ignis","1596H","\uD83D\uDE93 Ventura ",90, 1200),
                new Coche("Nissan","Micra","3574K","\uD83D\uDE97 Margarita ",90, 898),
                new Coche("Citroën","C1","1476R","\uD83D\uDE95 F.Alonso ",82,1200),
        };
        // Lista de coches
        for(int i = 0; i < paddock.length; i++){
            System.out.println((i + 1) + ". "+ paddock[i].getMarca()+ paddock[i].getModelo()+ paddock[i].getPiloto() +"Cc: "+ paddock[i].getCc()+" Cv: "+ paddock[i].getCv());
        }


        // Eleccion de coche por switch
        int eleccion ;
        Coche jugador = null;
        do{
            System.out.println("Elige un coche: ");
            eleccion = teclado.nextInt();
        }while (eleccion < 1 || eleccion > 10);


        switch (eleccion) {
            case 1:
                jugador = paddock[0];
                break;
            case 2:
                jugador = paddock[1];
                break;
            case 3:
                jugador = paddock[2];
                break;
            case 4:
                jugador = paddock[3];
                break;
            case 5:
                jugador = paddock[4];
                break;
            case 6:
                jugador = paddock[5];
                break;
            case 7:
                jugador = paddock[6];
                break;
            case 8:
                jugador = paddock[7];
                break;
            case 9:
                jugador = paddock[8];
                break;
            case 10:
                jugador = paddock[9];
                break;

        }


        System.out.println("\nBuena elección, competirás con el " +jugador.getMarca()+ jugador.getModelo());


        // Circuitos
        //Lista de Circuitos
        Carrera[] circuito =  {
                new Carrera("\uD83C\uDF8C Circuito de Catalunya", "España",307.2, 66 ),
                new Carrera("\uD83C\uDF8C Bahrein", "Sakhir", 308.2, 57),
                new Carrera("\uD83C\uDF8C Melbourne", "Australia", 306.1, 58),
                new Carrera("\uD83C\uDF8CMónaco", "Mónaco", 260.2, 78),
                new Carrera("\uD83C\uDF8C Silverstone", "Gran Bretaña", 306.1, 52),
                new Carrera("\uD83C\uDF8C Italia", "Monza", 306.7, 53),
                new Carrera("\uD83C\uDF8C GP Brasil" , "Brasil", 305.8, 71),
                new Carrera("\uD83C\uDF8C Albert Park", "Australia", 503.3, 58),
                new Carrera("\uD83C\uDF8C Autódromo Enzo e Dino Ferrari","Italia",490.9, 63),
                new Carrera("\uD83C\uDF8C Red Bull Ring","Australia", 431.8, 71),
        };

        boolean continuar = true;
        while (continuar) {
            Campeonato campeonato = new Campeonato(paddock, circuito);
            campeonato.iniciarCampeonato();

            System.out.println("\n¿Quieres volver a competir? (1: Sí, 2: No)");
            int respuesta = teclado.nextInt();
            if (respuesta == 2) {
                continuar = false;
            }
        }
        System.out.println("Gracias por jugar. ¡Hasta la próxima!");


    }
}

