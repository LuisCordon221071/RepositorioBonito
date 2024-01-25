/* Algoritmos y estructuras de datos [Sección 50]
 * Interfaz para la radio (Propuesta)
 * 
 * 
 * 
 * Estudiantes:
 * Allen Estuardo Ramírez De Paz, 22326
 * Luis Alberto Cordón Salguero, 221071
 * Catedrático: Moisés Alonso
 * Auxiliar: Joaquín Puente
 * 
 */

 public interface IRadio {

    boolean cambioBinario(boolean valor);

    int[] guardarAM(int[] lista_AM, int posicion, int estacion);

    double[] guardarFM(double[] lista_FM, int posicion, double estacion);

    int avanzarAM(int estacion_actual);

    double avanzarFM(double estacion_actual);


 
}