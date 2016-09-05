package Ejercicios;

import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Imprimir, contar y sumar los múltiplos de 2 que hay entre una serie de números,
 * tal que el segundo sea mayor o igual que el primero.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Integer inicio = 100;
        Integer fin = 200;

        if (fin >= inicio) {
            IntStream.rangeClosed(inicio, fin).filter((n) -> n % 2 == 0).forEach(System.out::println);
            System.out.println(IntStream.rangeClosed(inicio, fin).filter((n) -> n % 2 == 0).count());
            System.out.println(IntStream.rangeClosed(inicio, fin).filter((n) -> n % 2 == 0).sum());
        } else {
            System.out.println("El número final tiene que ser mayor...");
        }
    }
}
