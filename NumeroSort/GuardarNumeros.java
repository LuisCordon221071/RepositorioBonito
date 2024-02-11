import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GuardarNumeros {
    public static void guardarNumeros(ArrayList<Integer> numeros, String Archivo) {
        try (FileWriter writer = new FileWriter(Archivo)) {
            for (int numero : numeros) {
                writer.write(numero + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los números");
        }
    }
}
