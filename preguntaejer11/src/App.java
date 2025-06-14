import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Creamos el escáner para leer el número del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt(); // Guardamos el número ingresado

        // Verificamos si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        scanner.close(); // Cerramos el escáner
    }
}

