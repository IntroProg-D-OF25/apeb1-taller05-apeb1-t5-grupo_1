import java.util.Scanner;

public class Problema03_MayorTresNum {
    public static void main(String[] args) {
        double a, b, c;
        Scanner kbdScanner = new Scanner(System.in);

        System.out.println("Ingrese el Primer numero");
        a = kbdScanner.nextDouble();
        System.out.println("Ingrese el Segundo numero");
        b = kbdScanner.nextDouble();
        System.out.println("Ingrese el Tercer numero");
        c = kbdScanner.nextDouble();
        kbdScanner.close();

        if (a > b && a > c) {
            System.out.println(a + " Es el mayor numero");
        } else if (b > a && b > c) {
            System.out.println(b + " Es el mayor numero");
        } else {
            System.out.println(c + " Es el mayor numero");
        }
    }
}
