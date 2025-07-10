using System;

public class MyClass
{
    public static void Main(string[] args)
    {
        Console.WriteLine("Bienvenido al programa de listas");

        Funcionalidad funcionalidad = new Funcionalidad();
        // ya tengo un objeto donde tengo el atributo listaPalabras

        funcionalidad.AgregarElemento("Hola");
        funcionalidad.AgregarElemento(new string[]{"Adios ","Que", "tal", "estas"});

    // count -> 5
    // capacity -> 8
     funcionalidad.ModificarElemento("Nuevo", 4);
     // count -> 5
    // capacity -> 8

    // Con el metodo removeAt
    // "hola", "Adios ","Que", "tal","Nuevo", "estas"
    funcionalidad.BorrarElemento(1);
    // "hola",       ,"Que", "tal","Nuevo", "estas"
    //  el resto se mueven a la izquierda

    // Con el metodo remove
   // funcionalidad.BorrarElemento("Hola");
     //"hola", "Que", "tal","Nuevo", "estas"
     //        "Que", "tal","Nuevo", "estas"
     funcionalidad.BorrarElemento("asfsfd"); // como no existe no borrara nada
     // Como el metodo devuelve un bool podria hacer lo siguiente 
     if(funcionalidad.BorrarElemento("Hola"))
     {
        Console.WriteLine("Elemento borrado correctamente");
     }
     else 
     {
        Console.WriteLine("Fallo al borrar, no se encuentra en la lista");
     }
     funcionalidad.ObtenerElemento(0);

    

       /* funcionalidad.AgregarElemento("Adios");
        funcionalidad.AgregarElemento("que");
        funcionalidad.AgregarElemento("tal");
        funcionalidad.AgregarElemento("Buenas");
        funcionalidad.AgregarElemento("tardes");*/

    }
}
