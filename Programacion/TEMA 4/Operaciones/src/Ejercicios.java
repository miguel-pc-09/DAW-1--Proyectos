public class Ejercicios {

    public static void main(String[] args) {
        // Sorteo de la champions
        String [] bombo1 = {"Barcelona", "Real Madrid", "Atletico de Madrid", "PSG"};
        String [] bombo2 = {"Manchester City", "Bayern de Munich", "Inter de Milan", "Milan"};

        // Como sacar todos los emparejamientos, no se pueden repetir equipos
        // El aleatorio Math.random()*4 -> multiplico por uno mas del que quiero llegar aqui es de P 0 a P 3
        //Math.random()* bombo1.length

        for (int i = 0; i < bombo1.length; i++) {
            int aleatorio1;
            do{
                aleatorio1 = (int)(Math.random()* bombo1.length);// intenta sacar aleatorios
            }while(bombo1[aleatorio1]==null); // mientras lo de la posiccion aleatorio sea null
            String equipo1 = bombo1[aleatorio1];
            bombo1[aleatorio1] = null;// despues le decimos que es null una vez encontrado

            int aleatorio2;
            do{
             aleatorio2 = (int)(Math.random()* bombo2.length);

            }while(bombo2[aleatorio2]==null);
            String equipo2 = bombo2[aleatorio2];
            bombo2[aleatorio2] = null;


            System.out.printf("El emparejamiento es: %s vs %s\n",equipo1,equipo2);
        }
    }
}
