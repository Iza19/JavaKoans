package Ejercicios;

import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un programa que calcule independientemente la suma de los pares y
 * los impares de los numeros entre 1 y 1000, utilizando un switch.
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("Suma de pares: " + IntStream.rangeClosed(1, 1000).filter((n) -> n % 2 == 0).sum());
        System.out.println("Suma de impares: " + IntStream.rangeClosed(1, 1000).filter((n) -> n % 2 != 0).sum());
    }
}
