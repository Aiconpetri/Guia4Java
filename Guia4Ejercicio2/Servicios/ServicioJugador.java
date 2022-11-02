package Servicios;

import Entedidades.Juego;
import Entedidades.Jugador;
public class ServicioJugador {

    ServicioRevolver sr = new ServicioRevolver();
    public void crearJugador(int t, Juego j) {
        if (t < 1 || t > 6) {
            System.out.println("Numero invalido, se establece el juego en 6 jugadores");
            for (int i = 0; i < 6; i++) {
                Jugador player = new Jugador();
                j.getJugadores().add(player);
                j.getJugadores().get(i).setId(i+1);
                j.getJugadores().get(i).setNombre("Jugador "+j.getJugadores().get(i).getId());
            }
        } else {
            System.out.println("Creando los "+t+" jugadores");
            for (int i = 0; i < t; i++) {
                Jugador player = new Jugador();
                j.getJugadores().add(player);
                j.getJugadores().get(i).setId(i+1);
                j.getJugadores().get(i).setNombre("Jugador "+j.getJugadores().get(i).getId());
            }
        }
    }

    public boolean disparo(Juego j, int i) {
        boolean moja = false;
        if (sr.mojar(j) == true) {
            moja = true;
            j.getJugadores().get(i).setMojado(false);
        } else {
            sr.siguienteChorro(j);
        }
        return moja;
    }
}
