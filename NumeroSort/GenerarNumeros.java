import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class GenerarNumeros {
    private Set<Integer> numerosAzar;

    public GenerarNumeros() {
        this.numerosAzar = new HashSet<>();
    }

    public void generarAzar(int cantidad) {
        Random random = new Random();
        while (numerosAzar.size() < cantidad) {
            int numeroAzar = random.nextInt(10001); 
            this.numerosAzar.add(numeroAzar);
        }
    }

    public Set<Integer> getNumerosAzar() {
        return this.numerosAzar;
    }
}
