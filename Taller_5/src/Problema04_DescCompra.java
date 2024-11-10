import java.util.Scanner;

/**
 * Descuento en Compras: Calcular el precio final de un producto con un
 * descuento del 10%
 * si el precio original es mayor de $100; de lo contrario, no hay descuento.
 */

public class Problema04_DescCompra {
    public static void main(String[] args) {
        double precioOriginal;
        Scanner tcl = new Scanner(System.in);

        System.out.println("ingresar precio original");
        precioOriginal = tcl.nextDouble();
        tcl.close();

        if (precioOriginal > 100) {
            precioOriginal *= 0.9;
        }
        System.out.println("El precio con descuento es: " + precioOriginal);

    }
}

/*
 * ingresar precio original
 * 120
 * El precio con descuento es: 108.0
 */