
package Main;

import Entedidades.Juego;
import Servicios.ServicioJuego;


public class RuletaRusa {

    public static void main(String[] args) {
        Juego Ruleta= new Juego();
        ServicioJuego sj= new ServicioJuego();
        sj.llenarJuego(Ruleta);
        int cont=0;
        do{
            if(sj.ronda(Ruleta, cont)==true){
            }else{
              cont++;  
            }
            if(cont>=Ruleta.getJugadores().size()){
              cont=0;  
            }
        }while(Ruleta.getJugadores().size()!=1);
        System.out.println("Felicitaciones el "+Ruleta.getJugadores().get(0).getNombre()+" ha ganado el juego");
    }   
}
     