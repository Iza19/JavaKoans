package Ejercicios;

import java.math.BigInteger;
import java.util.Objects;
import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Calcular el factorial de un número, mediante subprogramas.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Integer numero = 50;
        System.out.println(IntStream.rangeClosed(1, numero).mapToObj(Objects::toString).map(BigInteger::new).
                reduce(new BigInteger("1"), (a, b) -> a.multiply(b)));
    }
}
