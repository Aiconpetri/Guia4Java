package Entidades;

public class Carta {

    private int numero;
    private String pinta;

    public Carta() {
    }

    public Carta(int numero, String pinta) {
        this.numero = numero;
        this.pinta = pinta;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPinta(String pinta) {
        this.pinta = pinta;
    }

    public int getNumero() {
        return numero;
    }

    public String getPinta() {
        return pinta;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", pinta=" + pinta + '}';
    }

}
