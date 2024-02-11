import java.util.ArrayList;
import java.util.Set;

public class Sorteo {
    public static void main(String[] args) {
        GenerarNumeros generador = new GenerarNumeros();
        generador.generarAzar(10);

        Set<Integer> numerosGenerados = generador.getNumerosAzar();

        GuardarNumeros.guardarNumeros(numerosGenerados, "numeros.txt");
    }
}
