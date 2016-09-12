package Ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iza19
 * @version 1.0
 *
 * Crear un array unidimensional de 20 elementos con nombres de personas.
 * Visualizar los elementos de la lista debiendo ir cada uno en una fila distinta.
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        List<String> personas = new ArrayList<>();
        personas.add("Luis");
        personas.add("Óscar");
        personas.add("Jorge");
        personas.add("Antonio");
        personas.add("Armando");
        personas.add("Arturo");
        personas.add("Cristian");
        personas.add("Karina");
        personas.add("Manuel");
        personas.add("Omar");
        personas.add("Alejandro");
        personas.add("Sorely");
        personas.add("Estafanía");
        personas.add("Marco");
        personas.add("Enrique");
        personas.add("Edgar");
        personas.add("Hiram");
        personas.add("Raúl");
        personas.add("Isaac");
        personas.add("César");

        personas.forEach(System.out::println);
    }
}
