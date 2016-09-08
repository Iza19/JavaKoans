package Ejercicios;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un pseudocódigo que imprima los números del 0 al 100, controlando las filas y las columnas.
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            String tab = new String(new char[i]).replace("\0", "   ");
            System.out.println(tab + i);
        }
    }
}
