/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entedidades;

import java.util.ArrayList;



public class Juego {
    private ArrayList<Jugador> Jugadores=new ArrayList<>();
    private Revolver Arma;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> Jugadores, Revolver Arma) {
        this.Jugadores = Jugadores;
        this.Arma = Arma;
    }

    public void setJugadores(ArrayList<Jugador> Jugadores) {
        this.Jugadores = Jugadores;
    }

    public void setArma(Revolver Arma) {
        this.Arma = Arma;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public Revolver getArma() {
        return Arma;
    }

    @Override
    public String toString() {
        return "Juego{" + "Jugadores=" + Jugadores + ", Arma=" + Arma + '}';
    }
    
}
