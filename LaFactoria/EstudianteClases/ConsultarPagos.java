package EstudianteClases;

import java.util.HashMap;

public class ConsultarPagos {
    private HashMap<String, Double> pagos;

    public ConsultarPagos() {
        this.pagos = new HashMap<>();
    }

    public double consultarPago(String estudiante) {
        return pagos.getOrDefault(estudiante, 0.0);
    }
}

