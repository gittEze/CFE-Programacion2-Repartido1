//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Suma de dos numeros");

        System.out.println("Ingrese el primer numero");
        int num = leer.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();

        System.out.println("La suma de : " + num + " y " + num2 + " es: " + (num + num2));
    }
}