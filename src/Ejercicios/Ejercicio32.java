package Ejercicios;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un programa que nos permita introducir un número por teclado
 * y sobre él se realicen las siguientes operaciones:
 * comprobar si es primo, hallar su factorial o imprimir su tabla de multiplicar.
*/
public class Ejercicio32 {
    public static void main(String[] args) {
        Integer menu = 0;

        try {
            System.out.println("Introduzca un número...");
            Scanner entrada = new Scanner(System.in);
            final Integer numero = entrada.nextInt();

            System.out.println("¿Primo? -> 1 \n Factorial -> 2 \n Tabla -> 3");
            entrada = new Scanner(System.in);
            menu = entrada.nextInt();

            if (menu == 1) {
                Integer divisibles = 0;
                if (numero > 1) {
                    for (int i = 2; i <= numero; i++) {
                        if (numero % i == 0) {
                            divisibles++;
                        }
                    }
                } else {
                    System.out.println("No es un número válido!!");
                }
                System.out.println((divisibles > 1) ? "No es primo" : "Es primo");
            } else if (menu == 2) {
                System.out.println(IntStream.rangeClosed(1, numero).mapToObj(Objects::toString).map(BigInteger::new).
                        reduce(new BigInteger("1"), (a, b) -> a.multiply(b)));
            } else if (menu == 3) {
                IntStream.rangeClosed(0, 10).reduce(1, (a, b) -> {System.out.println(numero * b); return numero * b;});
            } else {
                System.out.println("No es una opción válida");
            }
        } catch (InputMismatchException ex) {
            System.out.println("No!! Ese no!");
        }
    }
}
