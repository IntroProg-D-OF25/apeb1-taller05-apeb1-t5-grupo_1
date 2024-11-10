import java.util.Scanner;

/*
 * Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona
 * y clasificarla
 * en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 */

public class Problema08_CalculadoraIMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso, altura, IMC;

        System.out.println("Ingrese peso");
        peso = teclado.nextDouble();
        System.out.println("ingrese altura");
        altura = teclado.nextDouble();
        teclado.close();

        IMC = peso / (altura * altura);
        if (IMC < 18.5) {
            System.out.println("Su peso es bajo");
        } else if (IMC >= 18.5 && IMC < 24.9) {
            System.out.println(" Su peso es normal");
        } else if (IMC >= 25 && IMC < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }
}

/*
 * Ingrese peso
 * 70
 * ingrese altura
 * 1.74
 * Su peso es normal
 */