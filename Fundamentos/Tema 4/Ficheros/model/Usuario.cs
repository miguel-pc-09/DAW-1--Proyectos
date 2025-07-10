// Paso 15 ejemplo para la tarea
class Usuario
{
    public string nombre { get; set; }
    public string apellido { get; set; }
    public string correo { get; set; }
    public int telefono { get; set; }

    public Usuario (string nombre, string apellido, string correo, int telefono)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    // 16º Creacion de metodo de exportar dato
    public String ExportarDato()
    {
        return   nombre + ", " + apellido + "," + correo + "," + telefono;
    }

    // Paso 17 iremos a Operaciones a crear un metodo para exportar los datos

}