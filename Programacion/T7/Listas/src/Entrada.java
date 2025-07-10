import controller.Empresa;
import controller.EmpresaHash;
import model.Trabajador;
import model.TrabajadorAsalariado;

public class Entrada {



    public static void main(String[] args) {

        //Empresa empresa = new Empresa("UE");
        EmpresaHash empresa = new EmpresaHash();
        empresa.agregarTrabajador(new TrabajadorAsalariado("Miguel", "Perucha", "correo@gmail.com", "123456A", 12344, 2345));
        empresa.agregarTrabajador(new Trabajador("MiguelB", "PeruchaB", "correo@gmail.com", "123456B", 12344));
        empresa.agregarTrabajador(new Trabajador("Miguel", "Perucha", "correo@gmail.com", "123456D", 12344));
        //empresa.obtenerTrabajador("123456A");
        empresa.eliminarTrabajador("123456B");
        empresa.agregarTrabajador(new Trabajador("Miguel", "Perucha", "correo@gmail.com", "123456A", 12344));
        empresa.listarTrabajadores();
        /*empresa.mostrarTrabajadores();
        // trabajadores : 0 []
        empresa.contratarTrabajador(new Trabajador("Miguel", "Perucha", "correo@gmail.com", "123456A", 12344));
        empresa.contratarTrabajador(new Trabajador("Borja", "Martin", "correo@gmail.com", "123456B", 12345));
        empresa.contratarTrabajador(new Trabajador("Jona", "Gomez", "correo@gmail.com", "123456C", 12346));
        empresa.contratarTrabajador(new Trabajador("Jose", "Ventura", "correo@gmail.com", "123456D", 12347));
        // Trabajadores : 4 [1,2,3,4]
        empresa.mostrarTrabajadores();


        //empresa.despedirTrabajador();
        //empresa.obtenerTrabajador(); // para llamar a uno solo
        //empresa.despedirTrabajador("123456A");
        //empresa.despedirTrabajadorNombre("Jona");
        //empresa.mostrarTrabajadores(); // para llamar y ver todos
        empresa.obtenerTrabajador("123456B");
        empresa.despedirTodos();
        empresa.mostrarTrabajadores();*/

    }
}
