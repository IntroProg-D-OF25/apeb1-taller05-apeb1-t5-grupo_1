
/*
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. 
 * Si es bisiesto, mostrar un mensaje especial
 */

import java.util.Scanner;

public class Problema05_Bisiesto {
    public static void main(String[] args) {
        int y;
        Scanner kbdScanner = new Scanner(System.in);

        System.out.println("Ingrese el año");
        y = kbdScanner.nextInt();
        kbdScanner.close();

        if (y % 4 == 0 && y % 100 != 0 || (y % 400 == 0)) {
            System.out.println("El " + y + " es un año bisiesto");
        } else
            System.out.println("El " + y + " NO es un año bisiesto");
    }
}

/*
 * Salida de resultados
 * Ingrese el año
 * 2024
 * El 2024 es un año bisiesto
 */