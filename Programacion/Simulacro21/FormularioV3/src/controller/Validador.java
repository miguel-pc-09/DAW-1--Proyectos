package controller;
import exceptions.*;

public class Validador {

    // Valida que el texto solo contenga letras o espacios
    public static void validarTexto(String texto) throws TipoDatoIncorrectoException {
        // Recorremos carácter por carácter
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                throw new TipoDatoIncorrectoException("Solo se permiten letras.");
            }
        }
    }

    // Valida formato del DNI
    public static void validarDNI(String dni) throws LongitudDNINoValidaException, UltimoDigitoNoLetraException, NumeracionContieneLetrasException {
        // El DNI debe tener exactamente 9 caracteres
        if (dni.length() != 9) {
            throw new LongitudDNINoValidaException("El DNI debe tener 9 caracteres.");
        }
        // El último carácter debe ser una letra
        if (!Character.isLetter(dni.charAt(8))) {
            throw new UltimoDigitoNoLetraException("El último caracter debe ser una letra.");
        }
        // Los primeros 8 caracteres deben ser dígitos
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                throw new NumeracionContieneLetrasException("Los primeros 8 caracteres deben ser números.");
            }
        }
    }

    // Valida que el email contenga '@' y '.'
    public static void validarEmail(String email) throws EmailIncorrectoException {
        // contains verifica si un String contiene otro String (como una subcadena)
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailIncorrectoException("El email debe contener '@' y '.'");
        }
    }

}
