import java.util.Objects;
import java.util.Scanner;

/**
 * Calculo de impuestos: Desarrollar una solución que permita leer los datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio de venta
 * (incluido el impuesto). Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 */
public class Problema12_CalculoImpuesto {
    public static void main(String[] args) {
        double costo, impuesto=0, impPagar=0,temp;
        String origen,marca;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la marca del automóvil");
        marca = teclado.next();
        System.out.println("Ingrese el país de origen de su automóvil");
        origen = teclado.next();
        System.out.println("Ingrese el costo del automóvil");
        costo = teclado.nextDouble();


        if (origen.equals("Aleman")){
            impuesto = 1.20;
            temp=costo;
            costo *= impuesto;
            impPagar = costo - temp;
        }        if (origen.equals("Japon")){
            impuesto = 1.30;
            temp=costo;
            costo *= impuesto;
            impPagar = costo - temp;
        }        if (origen.equals("Italia")){
            impuesto =  1.15;
            temp=costo;
            costo *= impuesto;
            impPagar = costo - temp;
        }        if (origen.equals("USA")){
            impuesto =  1.08;
            temp=costo;
            costo *= impuesto;
            impPagar = costo - temp;
        }
        float imp = (float) (impuesto-1)*100; // Comvertir de doble a float
        System.out.println("Ipuesto a apagar: "+ impPagar +"\nCosto Total: "+costo + "\nImpuesto:" + imp + "%");
    }
}

/**
 * Salida:
 * Ingrese la marca del automóvil
 * ww
 * Ingrese el país de origen de su automóvil
 * USA
 * Ingrese el costo del automóvil
 * 3000
 * Ipuesto a apagar: 240.0
 * Costo Total: 3240.0
 * Impuesto:8.0%
 */
