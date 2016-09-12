package Ejercicios;

/**
 * @author iza19
 * @version 1.0
 *
 * Simular una carrera de dos caballos si cada uno tiene igual probabilidad de ganar.
 */
public class Ejercicio30 {
    public static void main(String[] args) {
        Double caballo1 = Math.random();
        System.out.println((caballo1 < 0.5) ? "Gana caballo 1" : "Gana caballo 2");
    }
}
