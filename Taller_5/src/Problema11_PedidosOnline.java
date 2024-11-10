import java.util.Scanner;

public class Problema11_PedidosOnline {
    public static void main(String[] args) {
        double nproducto, cproducto;
        Scanner kbdScanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de producto requerido");
        nproducto = kbdScanner.nextDouble();
        System.out.println("Ingrese el costo unitario del producto requerido");
        kbdScanner.close();

        cproducto = kbdScanner.nextDouble();
        cproducto *= nproducto;
        if (nproducto > 50) {
            cproducto *= 0.85;
        }

        System.out.println("El costo total de envió es de:\n" + cproducto);
    }

}
