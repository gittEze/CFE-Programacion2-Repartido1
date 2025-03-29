//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Simulador de compra");

        System.out.println("Ingrese el precio del primer producto");
        double num = leer.nextDouble();

        System.out.println("Ingrese el precio del segundo producto");
        double num2 = leer.nextDouble();

        System.out.println("Ingrese el precio del tercer producto");
        double num3 = leer.nextDouble();

        System.out.println("El total a pagar es: " + (((num+num2)+num3)*22/100));
    }
}