package Ejercicios;

import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Imprimir diez veces la serie de números del 1 al 10.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).forEach((n) -> IntStream.rangeClosed(1, 10).forEach(System.out::println));
    }
}
