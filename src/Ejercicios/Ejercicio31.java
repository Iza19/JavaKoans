package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Introducir dos números por teclado y mediante un menú, calcule su suma, su resta, su multiplicación o su división.
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        Double n1 = 0d, n2 = 0d, r= 0d;
        Integer menu = 0;

        try {
            System.out.println("Introduzca un número...");
            Scanner entrada = new Scanner(System.in);
            n1 = entrada.nextDouble();

            System.out.println("Introduzca otro número...");
            entrada = new Scanner(System.in);
            n2 = entrada.nextDouble();

            System.out.println("Sumar -> 1 \n Restar -> 2 \n Multiplicar -> 3 \n Dividir -> 4");
            entrada = new Scanner(System.in);
            menu = entrada.nextInt();
            r = (menu == 1) ? n1 + n2 : (menu == 2) ? n1 - n2 : (menu == 3) ? n1 * n2 : (menu == 4) ? n1 / n2 : 0;

            System.out.println((r == 0) ? "No es un número válido" : r);
        } catch (InputMismatchException ex) {
            System.out.println("No!! Ese no!");
        }
    }
}
