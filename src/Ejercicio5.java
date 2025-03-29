//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Grados celsius a fahrenheit");

        System.out.println("Ingrese los grados celsius");
        int num = leer.nextInt();

        System.out.println(num + " en grados fahrenheit es: " + ((num * 9/5) + 32));
    }
}