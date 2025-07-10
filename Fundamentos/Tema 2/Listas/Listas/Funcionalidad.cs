public class Funcionalidad
{
    // variables -> caracteristicas de la clase y se declaran como privadas public private protected
    private List<string> listaPalabras;

    // constructor
    public Funcionalidad()
    {
        listaPalabras = new List<string>();
    }

    // agregar elementos
    public void AgregarElemento(string palabra)
    {
        // agregar un elemento a la lista ()
        listaPalabras.Add(palabra);
        InformacionLista();
        
    }
    // Sobrecargando metodos
    public void AgregarElemento(string[] lista)
    {
        // agregar muchos  elemento a la lista ()
        listaPalabras.AddRange(lista);
        InformacionLista();

    }

    //  lo inserta y mueve el resto 
    public void ModificarElemento(string elemento, int posicion)
    {
        listaPalabras.Insert(posicion, elemento);
        Console.WriteLine("modificacion Lista. ");
        InformacionLista();
    }

    // Borrar el elemento 
    public void BorrarElemento(int posicion)
    {
        // segun su posicion
        listaPalabras.RemoveAt(posicion);
        
    }
    public bool BorrarElemento(string valor)
    {
        // Para que salga la inforcion antes del return...
        bool borrado = listaPalabras.Remove(valor);
        Console.WriteLine("Obtener informacion despues de borrado");
        InformacionLista();
        // Segun su valor
        return borrado;
    }

    // Obtener elementos pide una posicion 
    public void ObtenerElemento(int posicion)
    {
        string elemento = listaPalabras.ElementAt(posicion);
        if(elemento != null)
        {
            Console.WriteLine($"elemento encontrado {elemento}");
        }
    }
    // Sacar Todos
    public void ObtenerTodos()
    {
        for (int i = 0; i < listaPalabras.Count; i++)
        {
            Console.WriteLine($"El elemento de la posicion {i} es {listaPalabras.ElementAt(i)}");
        }
    }
    private void InformacionLista()
    {
        // Count -> cuantos elementos tiene la lista
        Console.WriteLine($"Elemento agregado correctamente. El nuevo tamañao de la coleccion es de: {listaPalabras.Count}");
        // Capacity -> 
        Console.WriteLine($"La capacidad de la lista es de {listaPalabras.Capacity}");
        
    }
}