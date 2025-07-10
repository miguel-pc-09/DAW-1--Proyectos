import exceptions.*;

public class Validador {

    public static void validarTexto(String texto) throws TipoDatoIncorrectoException{
        if(!texto.chars().allMatch(c -> Character.isLetter(c) || c == ' ')){
            throw new TipoDatoIncorrectoException("Solo se permiten letras. ");
        }
    }
    public static void validarDNI(String dni) throws LongitudDNINoValidaException, UltimoDigitoNoLetraException, NumeracionContieneLetrasException {
        if (dni.length() != 9) {
            throw new LongitudDNINoValidaException("El DNI debe tener 9 caracteres.");
        }
        if (!Character.isLetter(dni.charAt(8))) {
            throw new UltimoDigitoNoLetraException("El último carácter debe ser una letra.");
        }
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                throw new NumeracionContieneLetrasException("Los primeros 8 caracteres deben ser dígitos.");
            }
        }
    }

    public static void validarEmail(String email) throws EmailIncorrectoException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailIncorrectoException("El email debe contener '@' y '.'");
        }
    }
}
