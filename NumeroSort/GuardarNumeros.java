import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class GuardarNumeros {
    public static void guardarNumeros(Set<Integer> numeros, String Archivo) {
        try (FileWriter writer = new FileWriter(Archivo)) {
            for (int numero : numeros) {
                writer.write(numero + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los números");
        }
    }
}
