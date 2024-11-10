/*
* Facturación eléctrica: Desarrollar una solución que permita calcular y
* mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el valor
* de costo por
* kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
* tiene edad mayor a 65 años, se debe descontar el 10% por pertenecer a la
* tercera edad.
*/

import java.util.Scanner;

public class Problema10_FacturaElectrica {
    public static void main(String[] args) {
        double ValorPlanilla, CostoPorKwh, KwhConsumidos;
        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar el costo del Kilovatio por hora");
        CostoPorKwh = teclado.nextDouble();
        System.out.println("Ingresar los Kilovatios consumidos en el mes");
        KwhConsumidos = teclado.nextDouble();
        System.out.println("Ingresar su edad");
        edad = teclado.nextInt();
        teclado.close();

        ValorPlanilla = (CostoPorKwh * KwhConsumidos);
        if (edad > 65) {
            ValorPlanilla *= 0.9;
        }

        System.out.println("El valor a cancelar de la planilla de luz es: " + ValorPlanilla);
    }
}

/*
 * Ingresar el costo del Kilovatio por hora
 * 0.12
 * Ingresar los Kilovatios consumidos en el mes
 * 300
 * Ingresar su edad
 * 69
 * El valor a cancelar de la planilla de luz es: 32.4
 */