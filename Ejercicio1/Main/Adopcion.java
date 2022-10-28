package Main;

import Entidades.Persona;
import Servicios.ServicioPersona;

public class Adopcion {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        ServicioPersona sp=new ServicioPersona();
        sp.cargarPerros();
        System.out.println("Rellene el formulario de adopcion");
        sp.formularioAdopcion(p1);
        Persona p2= new Persona();
        System.out.println("Rellene el formulario de adopcion");
        sp.formularioAdopcion(p2);
        sp.registroAdopcion();
    }
}
