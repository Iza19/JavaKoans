package Ejercicios;

import java.util.*;

/**
 * @author iza19
 * @version 1.0
 *
 * Introducir un número menor de 5000 y pasarlo a número romano.
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Integer numero = 0;
        Map<String, Integer> map;

        final Map<String, Integer> mapper = new LinkedHashMap<>(13);
        mapper.put("M", 1000);
        mapper.put("CM", 900);
        mapper.put("D", 500);
        mapper.put("CD", 400);
        mapper.put("C", 100);
        mapper.put("XC", 90);
        mapper.put("L", 50);
        mapper.put("XL", 40);
        mapper.put("X", 10);
        mapper.put("IX", 9);
        mapper.put("V", 5);
        mapper.put("IV", 4);
        mapper.put("I", 1);
        map = Collections.unmodifiableMap(mapper);

        try {
            System.out.println("Introduzca un número entero mayor a 0 y menor de 5000");
            Scanner entrada = new Scanner(System.in);
            numero = entrada.nextInt();
            if (numero > 0 && numero < 5000) {
                System.out.println(toRomanNumeral(map, numero));
            } else {
                System.out.println("No es un número válido...");
            }
        } catch (InputMismatchException ex) {
            System.out.println("No!! Eso no!");
        }
    }

    private static String toRomanNumeral(Map<String, Integer> map, Integer numero) {
        StringBuilder romano = new StringBuilder(10);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            while (numero >= entry.getValue()) {
                numero -= entry.getValue();
                romano.append(entry.getKey());
            }
        }
        return romano.toString();
    }
}
