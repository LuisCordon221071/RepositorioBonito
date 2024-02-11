import java.util.ArrayList;
import java.util.Random;

public class GenerarNumeros {
    private ArrayList<Integer> numerosAzar;

    public GenerarNumeros() {
        this.numerosAzar = new ArrayList<>();
    }

    public void generarAzar(int cantidad) {
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int numeroAzar = random.nextInt(10001); 
            this.numerosAzar.add(numeroAzar);
        }
    }

    public ArrayList<Integer> getNumerosAzar() {
        return this.numerosAzar;
    }
}
