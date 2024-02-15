import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerTxt {
        public static int[] leerArreglo(String Archivo) {
        List<Integer> numeros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(Archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] elementos = linea.trim().split("\\s+");
                for (String elemento : elementos) {
                    numeros.add(Integer.parseInt(elemento));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return numeros.stream().mapToInt(Integer::intValue).toArray();
    }
}
