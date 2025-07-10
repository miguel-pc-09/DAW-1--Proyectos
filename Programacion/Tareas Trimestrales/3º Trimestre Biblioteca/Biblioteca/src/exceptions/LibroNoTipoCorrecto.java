package exceptions;

public class LibroNoTipoCorrecto extends ClassCastException {
    public LibroNoTipoCorrecto(String message) {
        super(message);
    }
}
