
package Entedidades;

public class Revolver {
    private int pActual;
    private int pBala;

    public Revolver() {
    }

    public Revolver(int pActual, int pBala) {
        this.pActual = pActual;
        this.pBala = pBala;
    }

    public void setpActual(int pActual) {
        this.pActual = pActual;
    }

    public void setpBala(int pBala) {
        this.pBala = pBala;
    }

    public int getpActual() {
        return pActual;
    }

    public int getpBala() {
        return pBala;
    }

    @Override
    public String toString() {
        return "Revolver{" + "pActual=" + pActual + ", pBala=" + pBala + '}';
    }
  
}
