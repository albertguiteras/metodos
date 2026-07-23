import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("\nSelecciona una opción:");
        System.out.println("1. Convertir a mayúsculas");
        System.out.println("2. Convertir a minúsculas");
        System.out.println("3. Invertir frase");
        System.out.print("Opción: ");

        int opcion = sc.nextInt();

        String resultado = Metodos.tratarFrase(frase, opcion);

        System.out.println("\nResultado: " + resultado);

        sc.close();
    }
}
