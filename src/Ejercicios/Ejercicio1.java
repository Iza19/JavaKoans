package Ejercicios;

import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un pseudocódigo que imprima los números del 1 al 100.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(System.out::println);
    }
}
