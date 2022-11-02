package Servicios;

import Entedidades.Juego;
import java.util.Scanner;

public class ServicioJuego {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ServicioJugador sj = new ServicioJugador();
    ServicioRevolver sr = new ServicioRevolver();

    public void llenarJuego(Juego j) {
        System.out.println("¿Cuantos jugadores desea?(2-6)");
        int cantidad = read.nextInt();
        sj.crearJugador(cantidad, j);
        System.out.println("Se carga por primera vez el revolver");
        sr.llenarRevolver(j);
    }

    public boolean ronda(Juego j, int i) {
        boolean band = false;
        System.out.println(j.getJugadores().get(i).getNombre()+" apriete enter para disparar");
        String suspenso=read.next();
        System.out.println("El " + j.getJugadores().get(i).getNombre() + " se apunta con el revolver y aprieta el gatillo");
        if (sj.disparo(j, i) == true) {
            if (j.getJugadores().size() != 2) {
                System.out.println("El " + j.getJugadores().get(i).getNombre() + " ha muerto, pasamos a la siguiente ronda");
                band = true;
            } else {
                System.out.println("El "+ j.getJugadores().get(i).getNombre() + " ha muerto, fin del juego. ");
                band = false;
            }
            j.getJugadores().remove(i);
            if (j.getJugadores().size() != 1) {
                sr.recargarRevolver(j);
            }
        } else {
            System.out.println("No ha sucedido nada, pasamos al siguiente jugador");
        }
        return band;
    }
}
