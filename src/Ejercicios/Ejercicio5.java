package Ejercicios;

import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un pseudocódigo que imprima los números impares hasta el 100 y que imprima cuantos impares hay.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        IntStream.rangeClosed(0, 100).filter(n -> n % 2 != 0).forEach(System.out::println);
        System.out.println("Cantidad: " + IntStream.rangeClosed(0, 100).filter(n -> n % 2 != 0).count());
    }
}
