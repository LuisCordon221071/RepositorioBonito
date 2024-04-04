import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorDiccionario {
    public static void cargarDiccionario(BinarySearchTree<String, Word> diccionario, String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    Word palabra = new Word(partes[0], partes[1], partes[2]);
                    diccionario.insert(partes[0], palabra);
                } else {
                    System.out.println("Formato incorrecto en línea: " + linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}