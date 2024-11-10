/*
 * Ordenamiento de Tres Números: Dados tres números, ordenarlos en
 * orden ascendente.
 */

import java.util.Scanner;

public class Problema09_OrdenNumeros {
    public static void main(String[] args) {
        int a, b, c, temp;
        Scanner kbdScanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor");
        a = kbdScanner.nextInt();
        System.out.println("Ingrese el segundo valor");
        b = kbdScanner.nextInt();
        System.out.println("Ingrese el tercer valor");
        c = kbdScanner.nextInt();
        kbdScanner.close();

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Los números en orden ascendente son: " + a + ", " + b + ", " + c);
    }
}

/*
 * Salida de resultados
 * Ingrese el primer valor
 * 6
 * Ingrese el segundo valor
 * 9
 * Ingrese el tercer valor
 * 3
 * Los números en orden ascendente son: 3 6 9
 */