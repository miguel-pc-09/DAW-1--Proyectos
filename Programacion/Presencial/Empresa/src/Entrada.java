import controller.Empresa;
import model.Asalariado;
import model.Autonomo;
import model.Persona;

public class Entrada {

    public static void main(String[] args) {

        Persona asalariado1 = new Asalariado("Miguel1", "Perucha", 1234, 1300000, 0.21, 12);
        Persona asalariado2 = new Asalariado("Miguel2", "Perucha", 1234, 2300000, 0.31, 12);
        Persona asalariado3 = new Asalariado("Miguel3", "Perucha", 1234, 3300000, 0.41, 12);
        Persona autonomo1 = new Autonomo("Tomas1","Perez", 2344,150678, 112);
        Persona autonomo2= new Autonomo("Tomas2","Perez", 2344,250678, 212);
        Persona autonomo3 = new Autonomo("Tomas3","Perez", 2344,350678, 312);

        // Creamos una empresa
        Empresa<Persona> empresa = new Empresa();

        // Creacion del departamento. Sale error -> 2.1 en empresa
        Departamento departamento = new Departamento();

        //empresa. -> mostrara Personas es decir todo pero si ponemos Autonomos
        Empresa<Autonomo> empresa1 = new Empresa();
        Empresa<Asalariado> empresa2 = new Empresa();


        // Solo quiero contratar autonomos



        /*/ Contrataremos personas. Estan creadas pero no dentro
        empresa.contratarPersona(asalariado1);
        empresa.contratarPersona(asalariado2);
        empresa.contratarPersona(asalariado3);
        empresa.contratarPersona(autonomo1);
        empresa.contratarPersona(autonomo2);
        empresa.contratarPersona(autonomo3);
        // Ahora que estan contratados le pedimos sus sueldos
        empresa.mostrarSueldos();*/









        // asalariado.-> Gracias a Polimorfismo podremos hacer cosas como Descansar
        // Persona asalariado = new Asalariado("Miguel", "Perucha", 1234, 300000, 0.21, 12);
        // ((Asalariado)asalariado). -> Aqui si podemos elegir descansar, porque te trato como Persona pero asalariado
        //asalariado.mostrarDatos();
        //asalariado.calcularSueldo();

        //autonomo.mostrarDatos();
        //((Autonomo)autonomo).calcularSueldo();

    }
}
