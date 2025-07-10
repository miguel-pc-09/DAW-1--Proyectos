class Tienda 
{
   public List<Producto> productos ;

   // constuctro para crear lista vacia 
   public Tienda()
   {
    productos = new List<Producto>();
   }

   // Metodo agregar producto
   public void AgregarProducto(Producto p)
   {
    productos.Add(p);
    
   }

   // metodo buscar por nombre
   public Producto BuscarProducto (string nombre)
   {
    foreach (Producto p in productos)
    {
        if(p.nombre == nombre)
        {
            return p;
        }
    }
    return null;
   }

   // Listar productos
   public void ListarProductos()
   {
    foreach (Producto p in productos)
    {
        Console.WriteLine("Producto: "+p.nombre+ ", Precio: "+ p.precio + ", stock: "+p.stock);
    }
   }

   public double CalcularValor()
   {
    double total = 0;
    foreach (Producto p in productos)
    {
        total += p.precio * p.stock;
    }
    return total;
   }


   
}