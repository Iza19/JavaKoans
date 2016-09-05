package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un pseudocódigo que simule el funcionamiento de un reloj digital y que permita ponerlo en hora.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Integer horas = 0;
        Integer minutos = 0;

        try {
            System.out.println("Introduzca horas...");
            Scanner entrada = new Scanner(System.in);
            horas = entrada.nextInt();

            System.out.println("Introduzca minutos...");
            entrada = new Scanner(System.in);
            minutos = entrada.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("No es cierto...");
        }

        if (horas > 24) { horas = 0; }
        if (minutos > 60) { minutos = 0; }

        //TODO: Código que imprima el tiempo cada segundo...
    }
}
