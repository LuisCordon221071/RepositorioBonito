import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        
        // Ordenar todos los arreglos según la opción elegida
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
        
        // Imprimir todos los arreglos ordenados
        for (int i = 0; i < arrays.size(); i++) {
            System.out.println("Índice " + (i+1) + ": " + Arrays.toString(arrays.get(i)));
        }
    }
}
