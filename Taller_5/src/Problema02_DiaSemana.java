import java.util.Scanner;

/**
 * Día de la Semana: Mostrar el nombre del día de la semana en función del
 * número ingresado (1 para lunes, 2 para martes, etc.).
 */
public class Problema02_DiaSemana {
    public static void main(String[] args) {
int a;
Scanner tcl = new Scanner(System.in);

        System.out.println("Ingresa el numero del dia");
        a = tcl.nextInt();
        tcl.close();

        switch (a){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error: numero \n" + "El numero ingresado es menor a 1 o mayor que 7");
        }
 }}

/**
 * Ingresa el numero del dia
 * 8
 * Error: numero
 * El numero ingresado es menor a 1 o mayor que 7
 */