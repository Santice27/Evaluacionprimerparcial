import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números de la serie de Fibonacci deseas generar?: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Por favor ingresa un número mayor a 0.");
        } else {
            int primero = 0;
            int segundo = 1;
            System.out.println("Serie de Fibonacci con " + n + " números:");
            for (int i = 1; i <= n; i++) {
                System.out.print(primero + " ");
                int siguiente = primero + segundo;
                primero = segundo;
                segundo = siguiente;
            }

            System.out.println();
        }

        scanner.close(); 
    }
}

