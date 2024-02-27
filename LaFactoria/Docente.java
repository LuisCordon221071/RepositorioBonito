import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Docente extends Usuario {
    private HashMap<String, HashMap<String, Double>> notas;
    private HashMap<String, Double> pagos;
    private Scanner scanner;

    public Docente() {
        this.notas = new HashMap<>();
        this.pagos = new HashMap<>();
        this.scanner = new Scanner(System.in);
        cargarNotasDesdeArchivo("notas.txt");
        cargarPagosDesdeArchivo("pagoss.txt");
    }

    @Override
    public void printMenu() {
        System.out.println("Bienvenido Profesor");
        System.out.println("Seleccione su opción");
        System.out.println("1. Ingresar notas");
        System.out.println("2. Cobrar pago");
        System.out.println("3. Historial de pagos");

        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcion) {
            case 1:
                ingresarNotas();
                break;
            case 2:
                cobrarPago();
                break;
            case 3:
                historialPagos();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private void cargarNotasDesdeArchivo(String archivo) {
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

    private void cargarPagosDesdeArchivo(String archivo) {
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

    private void ingresarNotas() {
        System.out.println("Ingrese el nombre del estudiante:");
        String estudiante = scanner.nextLine();
        if (!notas.containsKey(estudiante)) {
            System.out.println("No se encontró al estudiante " + estudiante);
            return;
        }
        System.out.println("Ingrese la clase:");
        String clase = scanner.nextLine();
        if (!notas.get(estudiante).containsKey(clase)) {
            System.out.println("No se encontró la clase " + clase + " para el estudiante " + estudiante);
            return;
        }
        System.out.println("Ingrese la nueva nota:");
        double nuevaNota = scanner.nextDouble();
        scanner.nextLine(); 
        notas.get(estudiante).put(clase, nuevaNota);
        guardarNotasEnArchivo("notas.txt");
        System.out.println("Nota actualizada correctamente.");
    }

    private void guardarNotasEnArchivo(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (String estudiante : notas.keySet()) {
                bw.write(estudiante + ",");
                HashMap<String, Double> notasEstudiante = notas.get(estudiante);
                for (String clase : notasEstudiante.keySet()) {
                    bw.write(clase + ":" + notasEstudiante.get(clase) + ",");
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cobrarPago() {
        System.out.println("Ingrese el nombre del estudiante:");
        String estudiante = scanner.nextLine();
        System.out.println("Ingrese el monto a cobrar:");
        double monto = scanner.nextDouble();
        scanner.nextLine(); 

        if (pagos.containsKey(estudiante)) {
            double pagoActual = pagos.get(estudiante);
            pagos.put(estudiante, pagoActual - monto);
        } else {
            pagos.put(estudiante, monto);
        }

        guardarPagosEnArchivo("pagoss.txt");
    }

    private void guardarPagosEnArchivo(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (String estudiante : pagos.keySet()) {
                bw.write(estudiante + "," + pagos.get(estudiante));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void historialPagos() {
        System.out.println("Historial de pagos:");
        for (String estudiante : pagos.keySet()) {
            System.out.println(estudiante + ": Q" + pagos.get(estudiante));
        }
    }
}

