package Ejercicios;

import java.util.Vector;

/**
 * @author iza19
 * @version 1.0
 *
 * Usando el segundo ejemplo, hacer un programa que busque una nota en el vector.
 */
public class Ejercicio35 {
    public static void main(String[] args) {
        Vector<Double> calificaciones = new Vector<>(10);
        calificaciones.addElement(6.0);
        calificaciones.addElement(7.8);
        calificaciones.addElement(9.0);
        calificaciones.addElement(8.8);
        calificaciones.addElement(8.0);
        calificaciones.addElement(9.8);
        calificaciones.addElement(4.0);
        calificaciones.addElement(6.8);
        calificaciones.addElement(9.0);
        calificaciones.addElement(10.0);
        System.out.println(calificaciones.stream().mapToDouble(Double::doubleValue).findAny().getAsDouble());
    }
}
