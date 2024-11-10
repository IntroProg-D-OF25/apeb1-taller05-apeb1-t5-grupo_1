/*
 * Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de
 * su rango (A para 90-100, B para 80-89, etc.).
 */

import java.util.Scanner;

public class Problema07_RangoNotas {
    public static void main(String[] args) {
        int notas;
        String letra;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la calificación (0-100):\n");
        notas = scanner.nextInt();
        scanner.close();

        // 77
        switch (notas / 10) { // Al estar usando enteros el valor que
            // devuelve la division es un entro (77 / 10 = 7)
            case 10:
            case 9:
                letra = "A";
                break; // con rango de 100 - 90
            case 8:
                letra = "B";
                break;
            case 7:
                letra = "C";
                break;
            case 6:
                letra = "D";
                break;
            default:
                if (notas >= 0 && notas < 60) {
                    letra = "F";
                } else {
                    letra = "Calificación inválida"; // Para valores fuera del rango 0-100
                }
                break;
        }

        System.out.println("La calificación de letra es: " + letra);
    }
}

/*
 * Salida de resultados
 * Ingresa la calificación (0-100):
 * 77
 * La calificación de letra es: C
 */