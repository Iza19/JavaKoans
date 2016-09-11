package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author iza19
 * @version 1.0
 *
 * Introducir un número por teclado. Que nos diga si es positivo o negativo.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Double num = 0d;
        System.out.println("Introduzca un número...");
        try {
            Scanner entrada = new Scanner(System.in);
            num = entrada.nextDouble();

            System.out.println((num == 0) ? "Es un 0" : (num < 0) ? "Es negativo" : "Es positivo");
        } catch (InputMismatchException ex) {
            System.out.println("No!! Ese no!");
        }
    }
}
