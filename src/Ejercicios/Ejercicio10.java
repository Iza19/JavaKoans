package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author iza19
 * @version 1.0
 *
 * Introducir un número por teclado. Que nos diga si es par o impar.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Integer num = 0;
        System.out.println("Introduzca un número entero...");
        try {
            Scanner entrada = new Scanner(System.in);
            num = entrada.nextInt();
            if (num % 2 == 0) {
                System.out.println("Es par!");
            } else {
                System.out.println("Es impar!!");
            }
        } catch (InputMismatchException ex) {
            System.out.println("No!! Ese no!");
        }
    }
}
