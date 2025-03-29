//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer valor");
        int num = leer.nextInt();

        System.out.println("Ingrese el segundo valor");
        int num2 = leer.nextInt();

        System.out.println("El resultado es: " + num + num2);
    }
}