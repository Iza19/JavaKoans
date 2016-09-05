package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un pseudocódigo que cuente las veces que aparece una determinada
 * letra en una frase que introduciremos por teclado.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        String letra = "a";
        String frase = "";

        try {
            System.out.println("Escriba aquí...");
            Scanner entrada = new Scanner(System.in);
            frase = entrada.nextLine();
        } catch (InputMismatchException ex) {
            System.out.println("No!! Esa no!");
        }
        //TODO: Método que revise las letras que tiene la variable frase.
    }
}
