package EstudianteClases;

import java.util.HashMap;

public class ConsultarNota {
    private HashMap<String, Double> notas;

    public ConsultarNota() {
        this.notas = new HashMap<>();
    }

    public double consultarNota(String clase) {
        return notas.getOrDefault(clase, -1.0);
    }
}

