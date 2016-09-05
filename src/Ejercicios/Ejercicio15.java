package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Introducir dos números por teclado.
 * Imprimir los números naturales que hay entre ambos números empezando por el más pequeño,
 * contar cuantos hay y cuantos de ellos son pares.
 * Calcular la suma de los impares.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Integer inicio = 0;
        Integer fin = 0;

        try {
            System.out.println("Introduzca el número de inicio");
            Scanner entrada = new Scanner(System.in);
            inicio = entrada.nextInt();

            System.out.println("Introduzca el número final");
            entrada = new Scanner(System.in);
            fin = entrada.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("No!! Ese no!");
        }

        IntStream.rangeClosed(inicio, fin).forEach(System.out::println);
        System.out.println("Números naturales: " + IntStream.rangeClosed(inicio, fin).count());
        System.out.println("Números pares: " + IntStream.rangeClosed(inicio, fin).filter((n) -> n % 2 == 0).count());
        System.out.println("Suma de impares: " + IntStream.rangeClosed(inicio, fin).filter((n) -> n % 2 != 0).sum());
    }
}
