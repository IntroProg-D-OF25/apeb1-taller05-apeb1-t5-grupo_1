import java.util.Scanner;

public class Problema05_Bisiesto {
    public static void main(String[] args) {
        int y;
        Scanner kbdScanner = new Scanner(System.in);

        System.out.println("Ingrese el año");
        y = kbdScanner.nextInt();
        kbdScanner.close();

        if (y % 4 == 0 && y % 100 != 0 || (y % 400 == 0)) {
            System.out.println("El " + y + "  es un año bisiesto");
        } else
            System.out.println("El " + y + "  NO es un año bisiesto");
    }
}
