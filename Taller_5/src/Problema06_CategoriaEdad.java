import java.util.Scanner;
/**
 * Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) en función de su edad.
 */
public class Problema06_CategoriaEdad {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();

        if (edad >= 1 && edad <= 14) {
            System.out.println("Niño");
        } else if (edad > 15 && edad < 18) {
            System.out.println("Adolecente");
        } else if (edad >= 18) {
            System.out.println("Adulto");
        }
    }
    }
/**
 * Ingrese su edad
 * 18
 * Adulto
 */
