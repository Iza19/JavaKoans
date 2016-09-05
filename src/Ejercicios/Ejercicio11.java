package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Imprimir y contar los múltiplos de 3 desde la unidad hasta un número que introducimos por teclado.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Integer fin = 0;
        System.out.println("Introduzca un número entero...");
        try {
            Scanner entrada = new Scanner(System.in);
            fin = entrada.nextInt();
            IntStream.rangeClosed(1, fin).filter(n -> n % 3 == 0).forEach(System.out::println);
            System.out.println("Cantidad: " + IntStream.rangeClosed(0, fin).filter(n -> n % 3 == 0).count());
        } catch (InputMismatchException ex) {
            System.out.println("No!! Ese no!");
        }
    }
}
