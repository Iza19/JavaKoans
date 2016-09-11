package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author iza19
 * @version 1.0
 *
 * Introducir una frase por teclado. Imprimirla en el centro de la pantalla.
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        String frase = "";
        try {
            System.out.println("Introduzca una frase");
            Scanner entrada = new Scanner(System.in);
            frase = entrada.nextLine();
        } catch (InputMismatchException ex) {
            System.out.println("No!! Eso no!");
        }

        Integer margen = (80 - frase.length()) / 2;
        System.out.println(new String(new char[margen]).replace("\0", " ") + frase);
    }
}
