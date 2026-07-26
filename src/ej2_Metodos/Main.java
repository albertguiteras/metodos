package ej2_Metodos;

/*LAB métodos java - nivel inicial (pero muy trabajoso):

VACACIONES!
Se pide un nombre y un destino. Se imprime la frase "[María] veranea en [Thailandia]" (méto/do procesarFrase()). Pero... ... hacer esto de cuatro maneras (cuatro métodos):
1- Llamar al méto/do sin parámetros y sin return: Dentro del méto/do hacer el input de usuario y la impresión de la frase
2- Llamar al méto/do sin parámetros y con return: Dentro del méto/do hacer el input de usuario y se retorna la frase, que se imprime en el main()
3- Llamar al méto/do con parámetros y sin return: Se hace el Scanner en el main() y se pasan nombre y destino al méto/do, quien los recibe e imprime la frase.
4- Llamar al méto/do con parámetros y con return: Se hace el Scanner en el main() y se pasan nombre y destino al méto/do, quien los recibe y retorna la frase completa en el main(), donde se imprime.

IMPORTANTE tema SCANNER:
1- Caso especial: la clase Scanner (abrir/cerrar flujo de entrada) puede dar conflictos si se define más de una vez o si se cierra desde un méto/do.
Para evitarlo, incluir Scanner como static en la clase Main() para que no sea obligatorio pasarlo en los casos de 'méto/do sin pasar parámetros': public class Main {
2- no cerrar el scanner dentro de ningún méto/do, solo en el main() al final si se quiere cerrar*/

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("CASO 1: Sin parámetros y sin return ===");
        procesarFrase();
        System.out.println();

        System.out.println("CASO 2: Sin parámetros y con return ===");
        String resultadoCaso2 = procesarFraseConReturn();
        System.out.println(resultadoCaso2);
        System.out.println();

        System.out.println("CASO 3: Con parámetros y sin return ===");
        System.out.print("Introduce tu nombre: ");
        String nombre3 = sc.nextLine();
        System.out.print("Introduce tu destino: ");
        String destino3 = sc.nextLine();

        procesarFrase(nombre3, destino3);
        System.out.println();

        System.out.println("CASO 4: Con parámetros y con return ===");
        System.out.print("Introduce tu nombre: ");
        String nombre4 = sc.nextLine();
        System.out.print("Introduce tu destino: ");
        String destino4 = sc.nextLine();

        String resultadoCaso4 = procesarFrase(nombre4, destino4, true);
        System.out.println(resultadoCaso4);
        System.out.println();

        sc.close();
    }

    public static void procesarFrase() {
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu destino: ");
        String destino = sc.nextLine();

        System.out.println(nombre + " veranea en " + destino);
    }

    public static String procesarFraseConReturn() {
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu destino: ");
        String destino = sc.nextLine();

        return nombre + " veranea en " + destino;
    }

    public static void procesarFrase(String nombre, String destino) {
        System.out.println(nombre + " veranea en " + destino);
    }

    public static String procesarFrase(String nombre, String destino, boolean conReturn) {
        return nombre + " veranea en " + destino;

    }
}
