package Ejercicios;

/**
 * @author iza19
 * @version 1.0
 *
 * Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz.
 */
public class Ejercicio28 {
    public static void main(String[] args) {
        Double moneda = Math.random();
        System.out.println((moneda < 0.5) ? "cara" : "cruz");
    }
}