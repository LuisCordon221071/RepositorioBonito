/*
 *
 * Algoritmos y estructuras de datos [Sección 50]
 * Generadora de números
 * 
 * Luis Alberto Cordón Salguero, 221071
 * Catedrático: Moisés Alonso
 * Auxiliar: Joaquín Puente
 * 
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WardNum {
    public static void generarNumeros() {
        String Archivo = "numeros.txt";
        Random random = new Random();

        try {
            FileWriter escritor = new FileWriter(Archivo);
            for (int i = 10; i <= 3009; i++) {
                for (int j = 1; j <= i; j++) {
                    escritor.write(Integer.toString(random.nextInt(10000) + 1) + " "); 
                }
                escritor.write("\n"); 
            }

            escritor.close(); 
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}




