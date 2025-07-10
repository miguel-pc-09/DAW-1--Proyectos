using System.Reflection;

 class vehiculos {
    private string matricula ;
    private int cv;
    private string marca;

   // constructor vacio
    public void vehiculo (){}
    
    // constructor general
    public void vehiculo (string matricula, int cv, string marca){
        this.matricula = matricula;
        this.cv = cv;
        this.marca = marca;
    }

    public void mostrarDatos(){

    }

    public void setMatricula(string matricuka){
        this.matricula = matricula;
    }
    public string getMatricula(){
        return this.matricula;
    }

    public void setCv(int cv){
        this.cv = cv;
    }
    public int getCv(){
        return this.cv;
    }

    public void setMarca(string marca){
        this.marca = marca;
    }

    public string getMarca(){
        return this.marca;
    }  




}