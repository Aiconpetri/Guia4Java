package Entidades;

import java.util.ArrayList;

public class Baraja {

    private ArrayList<Carta> baraja = new ArrayList<>();
    private ArrayList<Carta> descarte = new ArrayList<>();

    ;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> baraja, ArrayList<Carta> descarte) {
        this.baraja = baraja;
        this.descarte = descarte;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public void setDescarte(ArrayList<Carta> descarte) {
        this.descarte = descarte;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public ArrayList<Carta> getDescarte() {
        return descarte;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + ", descarte=" + descarte + '}';
    }

}
