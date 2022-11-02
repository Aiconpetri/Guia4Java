
package Servicios;

import Entedidades.Juego;
import Entedidades.Revolver;
import java.util.concurrent.ThreadLocalRandom;

public class ServicioRevolver {
    public void llenarRevolver(Juego j){
       Revolver pistola = new Revolver(); 
       pistola.setpActual(ThreadLocalRandom.current().nextInt(1, 6 + 1));
       pistola.setpBala(ThreadLocalRandom.current().nextInt(1, 6 + 1));
       j.setArma(pistola);
    }
    public void recargarRevolver(Juego j){
        System.out.println("Se recarga el revolver para la siguiente ronda");
         j.getArma().setpActual(ThreadLocalRandom.current().nextInt(1, 6 + 1));
       j.getArma().setpBala(ThreadLocalRandom.current().nextInt(1, 6 + 1));
}
    public boolean mojar(Juego j){
        boolean muere=(j.getArma().getpActual()==j.getArma().getpBala());
        return muere;
    }
    public void siguienteChorro(Juego j){
        if(j.getArma().getpActual()==6){
            j.getArma().setpActual(1);
        }else{
            j.getArma().setpActual(j.getArma().getpActual()+1);
        }
    }
    public void mostrar(Juego j){
        System.out.println(j.getArma());
    }
}
