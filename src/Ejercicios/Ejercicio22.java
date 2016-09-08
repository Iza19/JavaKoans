package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Introducir una frase por teclado. Imprimirla cinco veces en filas consecutivas,
 * pero cada impresión ir desplazada cuatro columnas hacia la derecha.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        String frase = "";

        try {
            System.out.println("Introduzca una frase");
            Scanner entrada = new Scanner(System.in);
            frase = entrada.nextLine();
        } catch (InputMismatchException ex) {
            System.out.println("No!! Eso no!");
        }

        for (int i = 0; i < 5; i++) {
            String tab = new String(new char[i]).replace("\0", "\t");
            System.out.println(tab + frase);
        }
    }
}
