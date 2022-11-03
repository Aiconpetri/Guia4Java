package Servicios;

import Entidades.Baraja;
import java.util.Collections;
import java.util.Scanner;

public class ServicioBaraja {

    ServicioCarta sc = new ServicioCarta();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Baraja b = new Baraja();

    public void crearBaraja() {
        sc.crearBaraja(b.getBaraja());
    }

    public void barajar() {
        System.out.println("Se barajan las cartas");
        Collections.shuffle(b.getBaraja());
    }

    public void siguienteCarta() {
        if (b.getBaraja().size() < 1) {
            System.out.println("Ya se entregaron todas las cartas");
        } else {
            System.out.println("Se le entrega una carta y se muestra");
            System.out.println(b.getBaraja().get(0));
            b.getDescarte().add(b.getBaraja().get(0));
            b.getBaraja().remove(0);
        }
    }

    public void cartasDisponibles() {
        if (b.getBaraja().size() < 1) {
            System.out.println("Ya no se pueden repartir cartas");
        } else {
            System.out.println("Todavia se pueden repartir " + b.getBaraja().size() + " cartas");
        }
    }

    public void darCartas() {
        System.out.println("¿Cuantas cartas desea recibir?");
        int num = read.nextInt();
        if (num > b.getBaraja().size()) {
            if (b.getBaraja().size() < 1) {
                System.out.println("Ya no se pueden entregar cartas");
            } else {
                System.out.println("No se pueden entregar tantas cartas");
            }
        } else {
            System.out.println("Se entregan y muestran las " + num + " cartas");
            for (int i = 0; i < num; i++) {
                System.out.println(b.getBaraja().get(0));
                b.getDescarte().add(b.getBaraja().get(0));
                b.getBaraja().remove(0);

            }
        }
    }

    public void cartasMonton() {
        if (b.getDescarte().size() < 1) {
            System.out.println("No se han entregado cartas aun");
        } else {
            System.out.println("Se muestran las cartas entregadas");
            for (int i = 0; i < b.getDescarte().size(); i++) {
                System.out.println(b.getDescarte().get(i));
            }
        }
    }

    public void mostrarBaraja() {
        if (b.getBaraja().size() < 1) {
            System.out.println("Se han entregado todas las cartas");
        } else {
            System.out.println("Se muestran las cartas por entregar");
            for (int i = 0; i < b.getBaraja().size(); i++) {
                System.out.println(b.getBaraja().get(i));
            }
        }
    }
}
