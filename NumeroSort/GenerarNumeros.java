import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerarNumeros {
        public static List<Integer> generarNumerosAleatorios(int cantidad) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            numeros.add(i);
        }
        return numeros;
    }
}
