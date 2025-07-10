package controller;

// ESTAMOS CREANDO UN TIPO DE DATO
public class Metodo {

    // modificador acceso : public -> todas las variables de tipo Metodo pueden ejecutar el metodo
    // modificador acceso : private -> solo se puede acceder al metodo desde la propia clase
    // modificador acceso : protected -> todas las variables de tipo Metodo pueden ejecutar el metodo, pero que sean
    // llamadas desde una clase del mismo paquete. Por ejemplo en la carpeta controller creamos otra clase ejemplo Ejemplo

    // Para que servia el static -> una variable o metodo que es estatico se dice que el metodo no pertenece a la variable del tipo correspondiente
    // en main necesitamos una variable de metodos para poder llamarlo, si lo pongo no me hace falta EJEMPLO 45 EN MAIN

    // Tipo de retorno
         // Void -> no te retorno nada, y solo ejecuto su contenido
         // double -> me devuelves un double ejemplo 5
         // TIPO -> retorna el tipo que se le indique, ademas de ejecutar su contenido. Si se le indica un retorno la
    // ultima linea del metodo es un RETURN de forma obligatoria
    // Aunque no veamos las funcionalidades podemos sobreescribirlas
    /*@Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }*/

    // Ahora aqui crearemos los metodos en publicos
    public void metodoSaludar(){
        System.out.println("Bienvenidos a la ejecucion de los metodos");
    }
    protected void metodoSaludar3(){
        System.out.println("Bienvenidos a la ejecucion de los metodos");
    }
    private void metodoSaludar2(){
        System.out.println("Bienvenidos a la ejecucion de los metodos");
    }
    // Con el STATIC
    public static void metodoSaludar4(){
        System.out.println("Bienvenidos a la ejecucion de los metodos");
    }
    // DATO IMPORTANTE SIEMPRE QUE VEAMOS UNA PALABRA DISTINTA DE VOID METEMOS RETURN

    public double realizarDivision(){
        return (double) 4/2; // ejemplo 52 en main
    }
    // Ejemplo ahora con if
    public double realizarDivision2(){
        if(true){
            return 6/2;
        }               // Aunque sea true siempre fuera tenemos que meter el return
        return 4/2; // ejemplo 52 en main
    }

    // Podemos llamar al mismo metodo iguales y identicos
    // Dos metodos se pueden llamar igual siempre y cuando su firma sea diferente
    // todo lo que yo ponga entre parentesis solo es una referencia
    // Se le da valor cuando se llama el metodo
    //---------- A TODO ESTO SE LE LLAMA SOBRECARGA DE METODOS------
    // CREAR metodos con firmas diferentes pero con el mismo nombre.
    public double realizarDivision(int operador1){
        return (double) 4/operador1; // dentro
    }
    // con dos parametros
    public double realizarDivision(int operador1, int operador2){
        return (double) operador1/operador2; // ejemplo 52 en main
    }

    // y aunque sobreescribas y pongas el orden distinto los int como son lo mismo daria error pero podemos ponerle a
    // uno un double por ejemplo porque ya no es entero y entero ahora seria double y entero
   /* public double realizarDivision(int operador2, int operador1){
        return (double) operador1/operador2; // ejemplo 52 en main
    }*/
    public double realizarDivision(double operador2, int operador1){
        return (double) operador1/operador2; // ejemplo 52 en main
    }
    // y podemos cambiar el orden y sigue funcionando
    public double realizarDivision(int operador2, double operador1){
        return (double) operador1/operador2; // ejemplo 52 en main
    }

    // Para solucionar el mensaje que no salga codigo
    // cambiamos el comportamiento del metodo
    @Override
    public String toString() {
        return "Clase metodo";
    }

    public void calcularMedia(int [] numeros){
        double media = 0;
        int sumatorio =0;
        for (int numero : numeros) {
            sumatorio += numero;
        }
        media = (double) sumatorio / numeros.length;
        System.out.println("La media calculada es: "+media);
    }
    // Imaginemos que vamos a un cajero y queremos sacar dinero. Para esto necesitamos el pin y la cantidad que queremos
    public void sacarDinero(int pin, int cantidad){ // por parametros le diremos que es lo que necesitamos
        int saldo = 100;
        if(pin == 1234){
            System.out.println("Pin correcto");
            if(cantidad>100){
                System.out.println("Saldo insuficiente");
            }else {
                System.out.println("Sacando dinero");
            }
        }else {
            System.out.println("Pin incorrecto");
        }
    }
}
