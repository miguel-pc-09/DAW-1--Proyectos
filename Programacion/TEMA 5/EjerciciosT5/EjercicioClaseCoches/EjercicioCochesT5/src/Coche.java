/*Desarrollar una clase llamada Coche que:
- .*/
public class Coche {
    // - Tenga un atributo private de tipo Motor, un atributo de tipo String (marca), otro de tipo String (modelo) y
    // otro de tipo double con el precio acumulado con las averías, un atributo de tipo String (matricula)
    private Motor motor;
    private String marca;
    private String modelo;
    private double precioAverias;
    private String matricula;

    // Tenga un constructor con tres parámetros de tipo String que inicialice la marca, el modelo y la matricula.
    public Coche(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precioAverias = 0;
        this.motor = new Motor(150);
    }

    // Un método acumularAveria que incrementará el importe gastado en averías con un aleatorio de entre 100 y 500
    public void acumularAvenira(){
        double coste = Math.random()*401 + 100;
        precioAverias += coste;
        // Tambien podria acer
        /*Random r = new Random();
        * int coste = r.nextInt(401) + 100;*/
    }
    // Metodo para mostrar la informacion
    public void mostrarInformacion(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Matricula: "+ matricula);
        System.out.println("CV del motor: "+ motor.getCv());
        System.out.println("Litros de aceite: "+ motor.getLitrosAceite());
        System.out.printf("Importe de averías: %.2f €\n", precioAverias);
    }




    //  Tenga un getter para cada uno de los atributos.


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAverias() {
        return precioAverias;
    }

    public String getMatricula() {
        return matricula;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioAverias(double precioAverias) {
        this.precioAverias = precioAverias;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
