package controller;

import model.Libro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OperacionesFicheros {

    // Metodo crear fichero
    public void crearFichero(){
        File fichero = new File("src/resources/libros.txt");
        // existe fichero
        System.out.println(fichero.exists());
        // crear fichero
        if(!fichero.exists()){
            try{
                fichero.createNewFile();
                System.out.println("Fichero creado");
            }catch(IOException e){
                System.out.println("Error en la creacion del fichero.");
            }
        }
    }

    // metodo crear directorio igual a fichero
    public void crearDirectorio() {
        File fichero = new File("src/resources/procesos/escritura");

        if (!fichero.exists()) {
            fichero.mkdirs(); // crea la carpeta
        }

    }

    // Metodo sacar informacion
    public void obtenerInformacion(String path){
        File file = new File(path);
        String nombre = file.getName();
        boolean fichero = file.isFile();
        String ruta = file.getAbsolutePath();
        boolean permisoLectura = file.canWrite();
        File parent = file.getParentFile();
        System.out.println("Nombre : " + nombre);
        System.out.println("Es fichero : " + fichero);
        System.out.println("Ruta : " + ruta);
        System.out.println("Lectura : " + permisoLectura);
        System.out.println("Parent : " + parent.getAbsolutePath());
    }

    // Metodo listar ficheros
    public void listarFicheros(String path) {
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            System.out.println("Sacando los elementos que tiene dentro");
            // sacar la lista de nombres (string)
            // String[] ficheros = file.list();
            File[] ficheros = file.listFiles();
            for (File fichero : ficheros) {
                // obtenerInformacion(fichero.getAbsolutePath()); -> Informacion de cada uno de ellos para cada categoria
                System.out.println(fichero.getName()); //  -> Da nombres de los elementos dentro de la ruta
                if (fichero.isDirectory() && !fichero.isHidden()) {
                    listarFicheros(fichero.getAbsolutePath());
                }
            }
        } else {
            System.out.println("No puedo procesar la peticion");
        }
    }

    // Metodo modo escritura
    public void realizarEscritura(String path){
        //1º crea el 1º file asociado
        File file = new File(path);
        // 2ºcrea el modo escritura
        FileWriter fileWriter = null;

        //3º  inicializa
        try{
            fileWriter = new FileWriter(file, true); // si pongo (file, true)** modo apend no lo pisa
            // 5 escribo lo que quiera dentro del fichero
            fileWriter.write("Hola mundo"); // No sale nada, debemos guardar. que es el paso 4 cerrado

        }catch(IOException e){
            System.out.println("Error al crear el fileWriter");

        }finally{
            // 4º cerramos el flujo
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error al cerrar el flujo");

            }

        }

    }

    // Metodo para exportar los libros
    public void exportarLibrosTexto(ArrayList<Libro> libros, String path) {
        try (FileWriter writer = new FileWriter(path)) {
            for (Libro libro : libros) {
                writer.write(libro.toString() + "\n");
            }
            System.out.println("Libros exportados a texto correctamente.");
        } catch (IOException e) {
            System.out.println("Error al exportar libros: " + e.getMessage());
        }
    }
}

