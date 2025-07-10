/*Desarrollar una clase llamada Motor que...*/
public class Motor {

    //Atributos - Tenga dos atributos private de tipo int (litros de aceite) y de tipo int (CV).
    private int litrosAceite;
    private int cv;

    // - Tenga un constructor con un parámetro de tipo int para los CV. Los litros de aceite por defecto serán 0.
    public Motor(int cv) {
        this.cv = cv;
        this.litrosAceite = 0;
    }


    // - Tenga un getter para cada uno de los atributos.
    public int getLitrosAceite() {
        return litrosAceite;
    }

    public int getCv() {
        return cv;
    }


    // - Tenga un setter para los litros
    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
}
