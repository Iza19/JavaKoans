package Ejercicios;

import java.util.Random;

/**
 * @author iza19
 * @version 1.0
 *
 * Simular cien tiradas de dos dados y contar las veces que entre los dos suman 10.
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        Integer c = 0;
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            c = (random.nextInt(7) + random.nextInt(7) == 10) ? c+1 : c;
        }
        System.out.println(c);
    }
}
