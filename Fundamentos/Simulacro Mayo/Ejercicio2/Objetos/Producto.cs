class Producto
{
    public string? nombre {get; set;}
    public double precio {get; set;}

    public int stock {get; set;}

    // Constructor vacio
    public Producto (){}

    public Producto (string nombre, double precio, int stock)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
}