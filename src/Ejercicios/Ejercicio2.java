package Ejercicios;

import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un pseudocódigo que imprima los números del 100 al 0, en orden decreciente.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        IntStream.rangeClosed(-100, 0).forEach((n) -> System.out.println(n * -1));
    }
}
