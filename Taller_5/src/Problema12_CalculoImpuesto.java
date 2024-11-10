import java.util.Scanner;

/*
 * Calculo de impuestos: Desarrollar una solución que permita leer los datos de
 * un automóvil (marca, origen y costo) imprima el impuesto por pagar y el
 * precio de venta
 * (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de
 * Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 */

public class Problema12_CalculoImpuesto {
    public static void main(String[] args) {
        double costo, impuesto, impPagar = 0;
        String origen, marca, imp = "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la marca del automóvil");
        marca = teclado.next();
        System.out.println("Ingrese el país de origen de su automóvil");
        origen = teclado.next();
        System.out.println("Ingrese el costo del automóvil");
        costo = teclado.nextDouble();
        teclado.close();

        if (origen.equals("Aleman")) {
            impuesto = 0.20;
            imp = "20%";
            impPagar = costo * impuesto;
            costo += impPagar;
        }
        if (origen.equals("Japon")) {
            impuesto = 0.30;
            imp = "30%";
            impPagar = costo * impuesto;
            costo += impPagar;
        }
        if (origen.equals("Italia")) {
            impuesto = 0.15;
            imp = "15%";
            impPagar = costo * impuesto;
            costo += impPagar;
        }
        if (origen.equals("USA")) { // => if(origen == "USA")
            impuesto = 0.08;
            imp = "8%";
            impPagar = costo * impuesto;
            costo += impPagar;
        }

        System.out.println(
                "Impuesto a apagar: " + impPagar + "$" + " por un " + marca + "\nCosto Total: " + costo + "$"
                        + "\nImpuesto:"
                        + imp);
    }
}

/*
 * Ingrese la marca del automóvil
 * BMW
 * Ingrese el país de origen de su automóvil
 * USA
 * Ingrese el costo del automóvil
 * 3000
 * Impuesto a apagar: 240.0$ por un BMW
 * Costo Total: 3240.0$
 * Impuesto:8%
 */
