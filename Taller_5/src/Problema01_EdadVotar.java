/*
* Edad para Votar: Determinar si una persona es elegible para
* votar en función de su edad (mayor o igual a 18 años).
*/

import java.util.Scanner;

public class Problema01_EdadVotar {
    public static void main(String[] args) {
        int edad;
        Scanner tclScanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        edad = tclScanner.nextInt();
        tclScanner.close();

        if (edad >= 18) {
            System.out.println("Vota");
        } else {
            System.out.println("No vota");
        }
    }
}

/*
 * Ingrese su edad:
 * 19
 * Vota
 */