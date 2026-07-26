package ej1_Metodos;

/*MODIFICAR FRASE Métodos sobre frase enviada por cliente: Se pide en el main() una frase (String) y una opcion (int o byte) y se envian a tratarFrase()

Si la opción es 1, devolver la frase en mayúsculas
Si la opción es 2, devolver la frase en minúsculas
Si la opción es 3, devolver la frase al revés (puedes buscar un méto/do directo para esto)
    -Retornar el resultado e imprimirlo desde el méto/do main().*/

import java.util.Scanner;

public class MainEj1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("\nSelecciona una opción:");
        System.out.println("1. Convertir a mayúsculas");
        System.out.println("2. Convertir a minúsculas");
        System.out.println("3. Invertir frase");
        System.out.print("Opción: ");

        int opcion = sc.nextInt();

        String resultado = Metodo.tratarFrase(frase, opcion);

        System.out.println("\nResultado: " + resultado);

        sc.close();
    }
}
