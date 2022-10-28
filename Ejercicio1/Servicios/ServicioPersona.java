
package Servicios;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ServicioPersona {
    Scanner read=new Scanner(System.in).useDelimiter("\n");
    ServicioPerro sp=new ServicioPerro();
    List <Persona> personas= new ArrayList<>();
    public void cargarPerros(){
        sp.listaPerros();
    }
    public void formularioAdopcion (Persona p){
        System.out.println("Formulario de adopcion:");
        System.out.println("Ingrese su nombre");
        p.setNombre(read.next());
        System.out.println("Ingrese su apellido");
        p.setApellido(read.next());
        System.out.println("Ingrese su edad");
        p.setEdad(read.nextInt());
        System.out.println("Ingrese su numero de dni");
        p.setDni(read.nextInt());
        p.setMascota(sp.decidir());
        System.out.println("Finalizo adopcion");
        personas.add(p);
    }
   public void registroAdopcion(){
       System.out.println("Se muestran las personas que adoptaron y sus respectivos perros");
       for (int i = 0; i < personas.size(); i++) {
           System.out.println(personas.get(i));
       }
   }
}
