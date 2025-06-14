import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio, fin;
        System.out.print("Ingresa el número inicial del rango (positivo): ");
        inicio = scanner.nextInt();
        System.out.print("Ingresa el número final del rango (positivo): ");
        fin = scanner.nextInt();
        if (inicio < 0 || fin < 0) {
            System.out.println("Error: los números deben ser positivos.");
        } else if (fin < inicio) {
            System.out.println("Error: el número final debe ser mayor o igual al inicial.");
        } else {
            System.out.println("Números pares entre " + inicio + " y " + fin + ":");
            for (int i = inicio; i <= fin; i++) {
                if (i % 2 == 0) { 
                    System.out.println(i);
                }
            }
            System.out.println("Se han impreso todos los números pares en el rango.");
        }
        scanner.close(); 
    }
}

