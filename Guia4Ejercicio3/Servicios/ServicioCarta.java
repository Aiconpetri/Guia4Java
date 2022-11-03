package Servicios;

import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;

public class ServicioCarta {

    public void crearBaraja(ArrayList b) {
        int cont = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                Carta c = new Carta();
                if (j == 8 || j == 9) {
                    c.setNumero(j + 3);
                } else {
                    c.setNumero(j+1);
                }
                switch (i) {
                    case 0:
                        c.setPinta("Espada");
                        break;
                    case 1:
                        c.setPinta("Basto");
                        break;
                    case 2:
                        c.setPinta("Copa");
                        break;
                    case 3:
                        c.setPinta("Oro");
                        break;
                }
                b.add(c);
                Collections.shuffle(b);
            }
        }
    }
}
