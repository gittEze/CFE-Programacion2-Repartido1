//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Información del usuario");

        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();

        leer.nextLine();
        System.out.println("Ingrse la ciudad donde vive");
        String ciudad = leer.nextLine();

        System.out.println("Hola " + nombre + ", tenes " + edad + " y vivis en " + ciudad);
    }
}