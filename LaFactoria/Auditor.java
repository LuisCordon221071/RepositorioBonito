import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Auditor extends Usuario {

    private Scanner scanner;

    public Auditor() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void printMenu() {
        System.out.println("Bienvenido");
        System.out.println("Seleccione su opcion");
        System.out.println("1. Revisar notas");
        System.out.println("2. Revisar cuotas");
        System.out.println("3. Revisar pagos");

        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcion) {
            case 1:
                revisarNotas();
                break;
            case 2:
                revisarCuotas("cuotas.txt");
                break;
            case 3:
                revisarPagos("pagos.txt");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    public void revisarNotas() {
        System.out.println("Ingrese el nombre del curso:");
        String curso = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(curso + ".txt"))) {
            String linea;
            System.out.println("Notas del curso " + curso + ":");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer las notas del curso " + curso);
            e.printStackTrace();
        }
    }

    public void revisarCuotas(String estudiante) {
        try (BufferedReader br = new BufferedReader(new FileReader("cuotas.txt"))) {
            String linea;
            boolean encontrado = false;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombre = partes[0].trim();
                double cuota = Double.parseDouble(partes[1].trim());
                if (nombre.equals(estudiante)) {
                    System.out.println("Cuota del estudiante " + estudiante + ": " + cuota);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontró información de cuotas para el estudiante " + estudiante);
            }
        } catch (IOException e) {
            System.out.println("Error al leer las cuotas de los estudiantes");
            e.printStackTrace();
        }
    }

    public void revisarPagos(String docente) {
        try (BufferedReader br = new BufferedReader(new FileReader("pagos.txt"))) {
            String linea;
            boolean encontrado = false;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombre = partes[0].trim();
                double pago = Double.parseDouble(partes[1].trim());
                if (nombre.equals(docente)) {
                    System.out.println("Pago del docente " + docente + ": " + pago);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontró información de pagos para el docente " + docente);
            }
        } catch (IOException e) {
            System.out.println("Error al leer los pagos de los docentes");
            e.printStackTrace();
        }
    }
}



