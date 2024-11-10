/*
 * Mayor de tres números: Dados tres números, determinar cuál
 *  es el mayor. Si son iguales, mostrar un mensaje.
 */

import java.util.Scanner;

public class Problema03_MayorTresNum {
    public static void main(String[] args) {
        double a, b, c;
        Scanner kbdScanner = new Scanner(System.in);

        System.out.println("Ingrese el Primer numero");
        a = kbdScanner.nextDouble();
        System.out.println("Ingrese el Segundo numero");
        b = kbdScanner.nextDouble();
        System.out.println("Ingrese el Tercer numero");
        c = kbdScanner.nextDouble();
        kbdScanner.close();

        if (a > b && a > c) {
            System.out.println(a + " Es el mayor numero");
        } else if (b > a && b > c) {
            System.out.println(b + " Es el mayor numero");
        } else {
            System.out.println(c + " Es el mayor numero");
        }
    }
}

/*
 * Salida de resultados
 * Ingrese el Primer numero
 * 2
 * Ingrese el Segundo numero
 * 1
 * Ingrese el Tercer numero
 * 3
 * 3.0 Es el mayor numero
 */