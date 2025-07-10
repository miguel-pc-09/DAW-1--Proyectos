package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Métodos como añadir, buscar, eliminar...
public class Garaje {
    private List<Coche> coches = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);

    // añadir coche
    public void añadirCoche(){
        System.out.println("Introduce la marca del coche:");
        String marca = teclado.nextLine();
        System.out.println("Introduce el modelo del coche:");
        String modelo = teclado.nextLine();
        System.out.println("Introduce la matrícula del coche:");
        String matricula = teclado.nextLine();
        System.out.println("Introduce el coste de la reparación del coche:");
        int costeReparacion = teclado.nextInt();
        teclado.nextLine();
        Coche nuevo = new Coche (marca, modelo, matricula, costeReparacion);
        coches.add(nuevo);
        System.out.println("Coche creado: "+marca+ " "+modelo+ " "+matricula+ " "+costeReparacion);

    }
    // listar coches
    public void listarCoches(){
        if(coches.isEmpty()){
            System.out.println("No tiene coches el garaje. ");
        }else {
            System.out.println("Estos son los coches.");
            for (Coche item : coches) {
                System.out.println(item);
                //item.toString();
            }
        }
    }
    //Buscar coche
    public Coche buscarCoche(String matricula){

        for (Coche c : coches) {
            if(c.getMatricula().equalsIgnoreCase(matricula)){
                return c;

            }
        }
        return null;
    }
    // Eliminar coche
    public void eliminarCoche(){
        System.out.println("Introduce la matrícula del coche a eliminar:");
        String matricula = teclado.nextLine();
        for (int i = 0; i < coches.size(); i++) {
            if(coches.get(i).getMatricula().equalsIgnoreCase(matricula)){
                coches.remove(i);
                System.out.println("Coche eliminado.");
                return;
            }
        }
        System.out.println("No se ha encontrado ningún coche con esa matrícula.");
    }
    // Eliminar los coches del garage
    public void vaciarGaraje(){
        coches.clear();
        System.out.println("Se han eliminado todos los coches del garaje.");
    }
    // Mostrar coste total de reparaciones
    public int calcularCosteTotal(){
        int total = 0;
        for (Coche item : coches) {
            total += item.getCosteReparacion();
        }
        return total;
    }
    // Comprobar si ya exuiste un coche con una matricula concreta
    public boolean existeCoche(String matricula){
        for (Coche item : coches) {
            if(item.getMatricula().equalsIgnoreCase(matricula)){
                System.out.println("Ya existe un coche con esa matrícula.");
                return true;
            }
        }
        System.out.println("No existe un coche con esa matrícula.");
        return false;
    }

}
