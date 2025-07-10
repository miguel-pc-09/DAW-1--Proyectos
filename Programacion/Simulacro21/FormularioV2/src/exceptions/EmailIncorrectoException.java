package exceptions;

public class EmailIncorrectoException extends Exception{
    public EmailIncorrectoException(String mensaje) {
        super(mensaje);
    }
}
