package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Introducir tantas frases como queramos y contarlas.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Integer cont = 0;
        System.out.println("Introduzca palabras a lo loco");
        Scanner entrada = new Scanner(System.in);
        //TODO: Código que detenga el siguiente ciclo.
        while (entrada.hasNext()) {
            cont++;
        }
        System.out.println("contador = " + cont);
    }
}
