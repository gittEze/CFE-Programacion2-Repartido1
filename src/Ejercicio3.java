//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Calculadora de edad");

        System.out.println("Ingrese el año actual");
        int num = leer.nextInt();

        System.out.println("Ingrese su año de nacimiento");
        int num2 = leer.nextInt();

        System.out.println("Su edad es de: " + (num - num2));
    }
}