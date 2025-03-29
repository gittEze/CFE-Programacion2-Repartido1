//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Area de un rectangulo");

        System.out.println("Ingrese el largo del rectangulo");
        int num = leer.nextInt();

        System.out.println("Ingrese el ancho del rectangulo");
        int num2 = leer.nextInt();

        System.out.println("El area del rectangulo es: " + (num*num2));
    }
}