package exceptions;

public class CatalogoNoExisteException extends NullPointerException {
    public CatalogoNoExisteException(String message) {
        super(message);
    }
}
