import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        if (numero < 2) {
            System.out.println("El número no es primo.");
        } else {
            boolean esPrimo = true; 
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println("El número es primo.");
            } else {
                System.out.println("El número no es primo.");
            }
        }
        scanner.close(); 
    }
}

