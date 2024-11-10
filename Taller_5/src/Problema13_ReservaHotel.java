
/*
 * Sistema de reservas hoteleras: En una hostería de la ciudad de Loja se
 * hace un descuento del 10% si el cliente se hospeda más de 5 días, del
 * 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15
 * días. Elaborar un solución que pida como datos de entrada el número
 * de días y el precio diario de la habitación y luego calcule e imprima
 * el subtotal por pagar, el descuento y el total por pagar.
 */
import java.util.Scanner;

public class Problema13_ReservaHotel {
    public static void main(String[] args) {
        float ndias, cdias, subtotal;
        String descuento;
        Scanner kbdScanner = new Scanner(System.in);

        System.out.println("Ingres el numero de días que se hospedara");
        ndias = kbdScanner.nextFloat();
        System.out.println("Ingres el costo diario de la habitación");
        cdias = kbdScanner.nextFloat();
        kbdScanner.close();

        cdias *= ndias;
        subtotal = cdias;
        descuento = "0%";
        if (ndias > 5 && ndias < 10) {
            cdias *= 0.90;
            descuento = "10%";
        }
        if (ndias > 10 && ndias < 15) {
            cdias *= 0.85;
            descuento = "15%";
        }
        if (ndias > 15) {
            cdias *= 0.80;
            descuento = "20%";
        }

        System.out.println("El subtotal es:           " + subtotal + "$\nEl descuento es del:        " + descuento
                + "\nY el total a pagar es de: " + cdias + "$");
    }
}


/*
 * Salida de resultados
 * Ingres el numero de días que se hospedara
 * 12
 * Ingres el costo diario de la habitación
 * 6
 * El subtotal es:           72.0$
 * El descuento es del:        15%
 * Y el total a pagar es de: 61.2$
 */