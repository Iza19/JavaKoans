package Ejercicios;

import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un pseudocódigo que imprima los números del 1 al 100.
 * Que calcule la suma de todos los números pares por un lado,
 * y por otro, la de todos los impares.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach(System.out::println);
        System.out.println(IntStream.rangeClosed(1, 100).filter((n) -> n % 2 == 0).sum());
        System.out.println(IntStream.rangeClosed(1, 100).filter((n) -> n % 2 != 0).sum());
    }
}
