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
        Integer num = 0;
        System.out.println("Introduzca un número entero positivo...");
        try {
            Scanner entrada = new Scanner(System.in);
            num = entrada.nextInt();
            if (num % num == 0) {
                if (num > 7) {

                }
                System.out.println("Es primo!");
            } else {
                System.out.println("No es primo!!");
            }
        } catch (InputMismatchException ex) {
            System.out.println("No!! Ese no!");
        }
    }
}
