package Ejercicios;

import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Calcular el factorial de un número, mediante subprogramas.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Integer numero = 6;
        System.out.println(IntStream.rangeClosed(1, numero).reduce(1, (a, b) -> a * b));
    }
}
