package Ejercicios;

import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un pseudocódigo que imprima los números pares entre 0 y 100.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 100).filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
