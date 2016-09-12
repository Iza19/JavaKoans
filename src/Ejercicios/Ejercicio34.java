package Ejercicios;

import java.util.Vector;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un programa que lea las calificaciones de un alumno en 10 asignaturas,
 * las almacene en un vector y calcule e imprima su media.
 */
public class Ejercicio34 {
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
        System.out.println((calificaciones.stream().mapToDouble(Double::doubleValue).sum()) / 10);
    }
}
