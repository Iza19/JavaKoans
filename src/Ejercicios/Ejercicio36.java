package Ejercicios;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1 y 100, e imprimirla.
 */
public class Ejercicio36 {
    public static void main(String[] args) {
        IntStream row1 = new Random().ints(5, 1, 100);
        IntStream row2 = new Random().ints(5, 1, 100);
        IntStream row3 = new Random().ints(5, 1, 100);
        IntStream row4 = new Random().ints(5, 1, 100);
        row1.forEach((n) -> System.out.print(n + "   "));
        System.out.println();
        row2.forEach((n) -> System.out.print(n + "   "));
        System.out.println();
        row3.forEach((n) -> System.out.print(n + "   "));
        System.out.println();
        row4.forEach((n) -> System.out.print(n + "   "));
    }
}
