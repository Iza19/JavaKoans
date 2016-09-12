package Ejercicios;

/**
 * @author iza19
 * @version 1.0
 *
 * Hacer un pseudocÓdigo que nos permita dar altas en el fichero DATOS.DAT de organizaciÓn directa,
 * controlando las altas duplicadas. Los campos son: DNI, NOMBRE, APELLIDOS Y PUNTERO para ambos archivos.
 * Algoritmo( dn ) =
 *  - Blanco: grabamos el registro en esa posició y ponemos el puntero a cero.
 *  - Cero: comprobamos cual es el valor del campo puntero. Si es cero,
 *      grabamos el registro en esa posici¢n (no hay sinonimos) y si es distinto de cero,
 *      comparamos el valor con el campo DNI, si son iguales, alta duplicada y dejamos de leer,
 *      y si no son iguales, introducimos el resto de la información.
 *  - Distinto de cero: hay un registro grabado en esa posición.
 *      Si es igual al dato introducido, alta duplicada, y si no son iguales, comprobamos el valor del puntero,
 *      si es cero grabamos el registro, y si no es cero,
 *      si es igual al campo DNI, alta duplicada y sino se graba la información en el archivo SINONIMOS.DAT.
 */
public class Ejercicio49 {
    public static void main(String[] args) {
    }
}
