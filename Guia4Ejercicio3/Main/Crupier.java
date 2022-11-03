package Main;

import Servicios.ServicioBaraja;
import java.util.Scanner;

public class Crupier {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ServicioBaraja sb = new ServicioBaraja();
        sb.crearBaraja();
        int des;
        do {
            System.out.println("¿Que desea realizar?");
            System.out.println("1-Barajar");
            System.out.println("2-Recibir una carta");
            System.out.println("3-Mostrar cantidad de cartas por entregar");
            System.out.println("4-Recibir varias cartas");
            System.out.println("5-Mostrar cartas entregadas");
            System.out.println("6-Mostrar cartas por entregar");
            System.out.println("7-Salir");
            des = read.nextInt();
            switch (des) {
                case 1:
                    sb.barajar();
                    break;
                case 2:
                    sb.siguienteCarta();
                    break;
                case 3:
                    sb.cartasDisponibles();
                    break;
                case 4:
                    sb.darCartas();
                    break;
                case 5:
                    sb.cartasMonton();
                    break;
                case 6:
                    sb.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Ha finalizado");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        } while (des != 7);
    }
}
