class Program
{
    public static void Main(string[] args)
    {
        Tienda tienda = new Tienda();  

        // Agregamos productos
        tienda.AgregarProducto(new Producto("Ordenador", 1200.40 , 3));
        tienda.AgregarProducto(new Producto("Jueguete", 200 , 4));
        tienda.AgregarProducto(new Producto("Fruta", 12.35 , 10));
        
        // Mostramos productos (Nombre y precio)
        Console.WriteLine("Lista de Productos: ");
        tienda.ListarProductos();

        // Calcular valor 
        double total = tienda.CalcularValor();
        Console.WriteLine("Valor total del inventario: "+ total);
        
    }
}