package Ejercicios;

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
        Integer fin = 200;
        IntStream.rangeClosed(1, fin).forEach(System.out::println);
    }
}
