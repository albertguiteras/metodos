package ej1_Metodos;

public class Metodo {

    public static String tratarFrase(String frase, int opcion) {

        switch (opcion) {
            case 1:
                return frase.toUpperCase();
            case 2:
                return frase.toLowerCase();
            case 3:
                return new StringBuilder(frase).reverse().toString();
            default:
                return "Opción no válida";
        }
    }
}