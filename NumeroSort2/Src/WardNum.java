import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WardNum {
    public static void generarNumeros() {
        String Archivo = "numeros.txt";
        Random random = new Random();

        try {
            FileWriter escritor = new FileWriter(Archivo);
            for (int i = 1; i <= 3000; i++) {
                for (int j = 1; j <= i; j++) {
                    escritor.write(Integer.toString(random.nextInt(3000) + 1) + " "); 
                }
                escritor.write("\n"); 
            }

            escritor.close(); 
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}




