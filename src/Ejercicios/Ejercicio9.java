package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

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
            if (num == 0) {
                System.out.println("Es un 0!");
            } else if (num > 0){
                System.out.println("Es positivo!");
            } else {
                System.out.println("Es negativo!!");
            }
        } catch (InputMismatchException ex) {
            System.out.println("No!! Ese no!");
        }
    }
}
