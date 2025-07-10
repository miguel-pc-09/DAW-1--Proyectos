package utils;

// Extendemos a Exception
public class TamanioException extends Exception {

    // Constructor pasa mensaje
    public TamanioException(String message) {
        super(message);
    }
    // Despues de crearlo vamos a BIBLIOTECA y donde el throw ponemos TamanioException


}
