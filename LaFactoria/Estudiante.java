import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Estudiante extends Usuario {
    private HashMap<String, HashMap<String, Double>> notas;
    private HashMap<String, Double> pagos;
    private Scanner scanner;

    public Estudiante() {
        this.notas = new HashMap<>();
        this.pagos = new HashMap<>();
        this.scanner = new Scanner(System.in);
        cargarNotas("notas.txt");
        cargarPagos("pagos.txt");
    }

    private void cargarNotas(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String estudiante = partes[0].trim();
                HashMap<String, Double> notasEstudiante = new HashMap<>();
                for (int i = 1; i < partes.length; i++) {
                    String[] nota = partes[i].split(":");
                    notasEstudiante.put(nota[0].trim(), Double.parseDouble(nota[1].trim()));
                }
                notas.put(estudiante, notasEstudiante);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarPagos(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String estudiante = partes[0].trim();
                double pago = Double.parseDouble(partes[1].trim());
                pagos.put(estudiante, pago);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printMenu() {
        System.out.println("Bienvenido Alumno");
        System.out.println("Seleccione su opción");
        System.out.println("1. Consultar nota");
        System.out.println("2. Realizar pago");
        System.out.println("3. Consultar pagos");

        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcion) {
            case 1:
                consultarNota();
                break;
            case 2:
                realizarPago();
                break;
            case 3:
                consultarPagos();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private void consultarNota() {
        System.out.println("Ingrese el nombre del estudiante:");
        String estudiante = scanner.nextLine();
        if (notas.containsKey(estudiante)) {
            HashMap<String, Double> notasEstudiante = notas.get(estudiante);
            for (String clase : notasEstudiante.keySet()) {
                System.out.println("Nota en " + clase + ": " + notasEstudiante.get(clase));
            }
        } else {
            System.out.println("No se encontraron notas para el estudiante " + estudiante);
        }
    }

    private void realizarPago() {
        System.out.println("Ingrese el nombre del estudiante:");
        String estudiante = scanner.nextLine();
        if (pagos.containsKey(estudiante)) {
            System.out.println("Ingrese el monto a pagar:");
            double monto = scanner.nextDouble();
            double pagoActual = pagos.get(estudiante);
            pagos.put(estudiante, pagoActual - monto); 
            System.out.println("Pago realizado con éxito.");
        } else {
            System.out.println("No se encontró información de pago para el estudiante " + estudiante);
        }
    }

    private void consultarPagos() {
        System.out.println("Ingrese el nombre del estudiante:");
        String estudiante = scanner.nextLine();
        if (pagos.containsKey(estudiante)) {
            System.out.println("Pago de " + estudiante + ": Q" + pagos.get(estudiante));
        } else {
            System.out.println("No se encontró información de pago para el estudiante " + estudiante);
        }
    }
}



