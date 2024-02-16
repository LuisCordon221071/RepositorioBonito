import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sorteo {
    public static void main(String[] args) {
        WardNum.generarNumeros();
        List<int[]> arrays = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("numeros.txt"))) {
            String line;
            // Leer líneas
            while ((line = reader.readLine()) != null) {
                String[] elements = line.trim().split("\\s+");
                int[] arr = Arrays.stream(elements).mapToInt(Integer::parseInt).toArray();
                arrays.add(arr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿(A)scendente o (D)escendente?");
        String orderChoice = scanner.nextLine().toUpperCase();
        
        ShellSort shellSort = new ShellSort();
        
        // Ordenar los arreglos de manera ascendente/descendente
        for (int[] arr : arrays) {
            if (orderChoice.equals("A")) {
                shellSort.shellSortAscendente(arr, arr.length);
            } else if (orderChoice.equals("D")) {
                shellSort.shellSortDescendente(arr, arr.length);
            } else {
                System.out.println("Las opciones son A (Ascendente) o D (Descendente)" + "\n" + "Se ordenara de manera ascendente por defecto");
                shellSort.shellSortAscendente(arr, arr.length);
            }
        }
        
        // Imprimir los arreglos ya ordenados
        for (int i = 0; i < arrays.size(); i++) {
            System.out.println("Índice " + (i+1+".a") + ": " + Arrays.toString(arrays.get(i)));
        }

        // Guardar los arreglos ya ordenados
        try (PrintWriter writer = new PrintWriter(new FileWriter("numeros_ordenados.txt"))) {
            for (int[] arr : arrays) {
                writer.println(Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", ""));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Volver a ordenarlos
        List<int[]> sortedArrays = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("numeros_ordenados.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] elements = line.trim().split("\\s+");
                int[] arr = Arrays.stream(elements).mapToInt(Integer::parseInt).toArray();
                sortedArrays.add(arr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ordenar arreglos ascendente/descendente
        for (int[] arr : sortedArrays) {
            if (orderChoice.equals("A")) {
                shellSort.shellSortAscendente(arr, arr.length);
            } else if (orderChoice.equals("D")) {
                shellSort.shellSortDescendente(arr, arr.length);
            }
        }

        // Imprimir arreglos ya ordenados
        for (int i = 0; i < sortedArrays.size(); i++) {
            System.out.println("Índice " + (i+1+".b") + ": " + Arrays.toString(sortedArrays.get(i)));
        }
    
    }
}
