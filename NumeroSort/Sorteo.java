import java.util.ArrayList;

public class Sorteo {
    public static void main(String[] args) {
        GenerarNumeros generador = new GenerarNumeros();
        generador.generarAzar(10);

        ArrayList<Integer> numerosGenerados = generador.getNumerosAzar();
        
        GuardarNumeros.guardarNumeros(numerosGenerados, "numeros.txt");
    }
}
