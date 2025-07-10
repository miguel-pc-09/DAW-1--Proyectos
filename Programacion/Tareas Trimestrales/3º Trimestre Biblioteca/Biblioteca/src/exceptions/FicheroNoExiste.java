package exceptions;

public class FicheroNoExiste extends NullPointerException {
    public FicheroNoExiste(String message) {
        super(message);
    }
}
