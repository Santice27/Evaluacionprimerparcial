import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto:");
        String cadena = scanner.nextLine();
        cadena = cadena.toUpperCase();
        int cantidadVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                cantidadVocales++;
            }
        }
        System.out.println("La cantidad de vocales es: " + cantidadVocales);
        scanner.close();
    }
}

