package Ejercicios;

import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Imprimir y contar los números que son múltiplos de 2 o de 3 que hay entre 1 y 100.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Múltiplos de 2: ");
        IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("Múltiplos de 3: ");
        IntStream.rangeClosed(1, 100).filter(n -> n % 3 == 0).forEach(System.out::println);

        System.out.println("Cantidad de múltiplos de 2: " +
                IntStream.rangeClosed(0, 100).filter(n -> n % 2 == 0).count());
        System.out.println("Cantidad de múltiplos de 3: " +
                IntStream.rangeClosed(0, 100).filter(n -> n % 3 == 0).count());
    }
}
