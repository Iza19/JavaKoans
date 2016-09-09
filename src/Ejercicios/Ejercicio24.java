package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author iza19
 * @version 1.0
 *
 * Comprobar si un número mayor o igual que la unidad es primo.
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Integer num = 0, divisibles = 0;
        System.out.println("Introduzca un número entero positivo...");
        try {
            Scanner entrada = new Scanner(System.in);
            num = entrada.nextInt();
            if (num > 1) {
                for (int i = 2; i <= num; i++) {
                    if (num % i == 0) {
                        divisibles++;
                    }
                }
                if (divisibles > 1) {
                    System.out.println("No es primo");
                } else {
                    System.out.println("Es primo");
                }
            } else {
                System.out.println("No es un número válido!!");
            }
        } catch (InputMismatchException ex) {
            System.out.println("No!! Eso no!");
        }
    }
}
