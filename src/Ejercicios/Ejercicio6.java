package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un pseudocódigo que imprima los números naturales que hay desde la unidad
 * hasta un número que introducimos por teclado.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Integer fin = 0;
        System.out.println("Introduzca un número entero...");
        try {
            Scanner entrada = new Scanner(System.in);
            fin = entrada.nextInt();
            IntStream.rangeClosed(1, fin).forEach(System.out::println);
        } catch (InputMismatchException ex) {
            System.out.println("No!! Ese no!");
        }
    }
}
