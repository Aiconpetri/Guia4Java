
package Servicios;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioPerro {
    Scanner read=new Scanner(System.in).useDelimiter("\n");
    List <Perro> perros=new ArrayList<>();
    public void listaPerros(){
        Perro p1=new Perro("Thiano","Caniche",2,"Pequeño");
        Perro p2=new Perro("Frida","Labrador",1,"Grande"); 
        perros.add(p1);
        perros.add(p2);
    }
    public int mostrarPerros(){
        System.out.println("Mostrando lista de perros");
        for (int i = 0; i < perros.size(); i++) {
            System.out.println((i+1)+"-"+perros.get(i));
        }
        System.out.println("¿Que perro desea adoptar?");
        int des=read.nextInt();
        while(des<0 || des>perros.size()){
            System.out.println("Ingrese una opcion valida");
            des=read.nextInt();
        }
        return des;
    }
    public Perro decidir(){
        Perro p;
       int adopt=mostrarPerros();
        System.out.println("Ha decidido adoptar a "+perros.get(adopt-1).getNombre());
        p=perros.get(adopt-1);
        perros.remove(adopt-1);
        return p;
    }
}
