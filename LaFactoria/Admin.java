import java.io.*;
import java.util.Scanner;

public class Admin extends Usuario {

    private Scanner scanner;

    public Admin() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void printMenu() {
        System.out.println("Bienvenido");
        System.out.println("Seleccione su opción");
        System.out.println("1. Crear curso");
        System.out.println("2. Crear docente");
        System.out.println("3. Crear estudiante");
        System.out.println("4. Asignar docente a curso");
        System.out.println("5. Asignar estudiante a curso");
        System.out.println("6. Asignar pago a docente");
        System.out.println("7. Resumen de notas");
        System.out.println("8. Resumen de pagos");

        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcion) {
            case 1:
                crearCurso();
                break;
            case 2:
                crearUsuario("docentes.txt");
                break;
            case 3:
                crearUsuario("estudiantes.txt");
                break;
            case 4:
                asignarUsuarioACurso("docentes.txt");
                break;
            case 5:
                asignarUsuarioACurso("estudiantes.txt");
                break;
            case 6:
                asignarPagoADocente();
                break;
            case 7:
                resumenNotas();
                break;
            case 8:
                resumenPagos();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private void crearCurso() {
        System.out.println("Ingrese el nombre del nuevo curso:");
        String nombreCurso = scanner.nextLine();
        String nombreArchivo = nombreCurso + ".txt";

        try {
            File archivoCurso = new File(nombreArchivo);
            if (archivoCurso.createNewFile()) {
                System.out.println("El curso " + nombreCurso + " se ha creado exitosamente.");
            } else {
                System.out.println("El curso " + nombreCurso + " ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el curso " + nombreCurso);
            e.printStackTrace();
        }
    }

    private void crearUsuario(String archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            System.out.println("Ingrese el nombre del usuario:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la contraseña del usuario:");
            String contraseña = scanner.nextLine();
            bw.write(nombre + "," + contraseña);
            bw.newLine();
            System.out.println("Usuario creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void asignarUsuarioACurso(String archivo) {
        System.out.println("Ingrese el nombre del usuario:");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = scanner.nextLine();
        String nombreArchivoCurso = nombreCurso + ".txt";

        try {
            File archivoCurso = new File(nombreArchivoCurso);
            if (archivoCurso.exists()) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivoCurso, true))) {
                    bw.write(nombreUsuario);
                    bw.newLine();
                    System.out.println("Usuario asignado al curso exitosamente.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("El curso " + nombreCurso + " no existe.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	private void asignarPagoADocente() {
		System.out.println("Ingrese el nombre del docente:");
		String nombreDocente = scanner.nextLine();
		System.out.println("Ingrese el monto a pagar:");
		double monto = scanner.nextDouble();
		scanner.nextLine(); 
	
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("pagoss.txt", true))) {
			boolean encontrado = false;
			File archivoPagos = new File("pagoss.txt");
			if (archivoPagos.exists()) {
				BufferedReader br = new BufferedReader(new FileReader(archivoPagos));
				String linea;
				StringBuilder contenido = new StringBuilder();
				while ((linea = br.readLine()) != null) {
					String[] partes = linea.split(",");
					String nombre = partes[0].trim();
					double pago = Double.parseDouble(partes[1].trim());
					if (nombre.equals(nombreDocente)) {
						pago += monto;
						linea = nombre + "," + pago;
						encontrado = true;
					}
					contenido.append(linea).append("\n");
				}
				br.close();
	
				if (!encontrado) {
					bw.write(nombreDocente + "," + monto);
					bw.newLine();
				} else {
					FileWriter fw = new FileWriter(archivoPagos);
					fw.write(contenido.toString());
					fw.close();
				}
	
				if (encontrado) {
					System.out.println("Pago actualizado para el docente.");
				} else {
					System.out.println("Pago asignado al docente exitosamente.");
				}
			} else {
				bw.write(nombreDocente + "," + monto);
				bw.newLine();
				System.out.println("Pago asignado al docente exitosamente.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

    private void resumenNotas() {
		mostrarContenidoArchivo("notas.txt");
    }

    private void resumenPagos() {
		mostrarContenidoArchivo("pagos.txt");
    }

    private void mostrarContenidoArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo " + nombreArchivo + ":");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + nombreArchivo);
            e.printStackTrace();
        }

	}
}

