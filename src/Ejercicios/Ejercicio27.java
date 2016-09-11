package Ejercicios;

import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Realizar la tabla de multiplicar de un numero entre 0 y 10.
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        Integer numero = 9;
        IntStream.rangeClosed(0, 10).reduce(1, (a, b) -> {System.out.println(numero * b); return numero * b;});
    }
}
