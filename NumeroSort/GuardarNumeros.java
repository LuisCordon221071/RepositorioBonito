/*mport java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*public class GuardarNumeros {
    public static void guardarNumeros(Set<Integer> numeros, String archivo) {
        try (FileWriter writer = new FileWriter(archivo)) {
            Random random = new Random();
            for (int numero : numeros) {
                List<Integer> numerosAleatorios = new ArrayList<>(Collections.nCopies(numero, 0));
                for (int i = 0; i < numero; i++) {
                    numerosAleatorios.set(i, random.nextInt(100));
                }
                writer.write(numerosAleatorios.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los números");
        }
    }
 }*/

 import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.Collections;
 import java.util.List;
 
 public class GuardarNumeros {
     public void escribirNumerosEnArchivo(List<Integer> numeros) {
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("numeros.txt"))) {
             Collections.shuffle(numeros);
             int linea = 1;
             for (Integer numero : numeros) {
                 writer.write(String.valueOf(numero));
                 writer.newLine();
                 if (linea % 10 == 0) { // Cambiar el número aquí si deseas una escalera diferente
                     writer.newLine();
                     linea = 0;
                 }
                 linea++;
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }

