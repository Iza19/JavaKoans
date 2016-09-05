package Ejercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un pseudocódigo que imprima el mayor y el menor de una serie
 * de cinco números que vamos introduciendo por teclado.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Introduzca cinco números...");
        try {
            for (int i = 0; i < 5; i++) {
                Scanner entrada = new Scanner(System.in);
                 Integer num = entrada.nextInt();
                numeros.add(num);
            }
        } catch (InputMismatchException ex) {
            System.out.println("No!! Ese no!");
        }

        System.out.println("Mayor: " + numeros.stream().max(Integer::compare).get());
        System.out.println("Menor: " + numeros.stream().min(Integer::compare).get());
    }
}
