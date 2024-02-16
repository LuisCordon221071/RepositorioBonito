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
        
        //ShellSort b = new ShellSort();
        //GnomeSort b = new GnomeSort();
        //QuickSort c = new QuickSort();
        //HeapSort a = new HeapSort();
        RadixSort a = new RadixSort();
        //SelectionSort a = new SelectionSort();
        //MergeSort a = new MergeSort();
        
        // Ordenar los arreglos de manera ascendente/descendente
        for (int[] arr : arrays) {
            if (orderChoice.equals("A")) {
                a.SortAscendente(arr);
                //b.SortAscendente(arr, arr.length);
                //c.SortAscendente(arr, 0, arr.length-1);
            } else if (orderChoice.equals("D")) {
                a.SortDescendente(arr);
                //b.SortDescendente(arr, arr.length);
                //c.SortDescendente(arr, 0, arr.length-1);
            } else {
                System.out.println("Las opciones son A (Ascendente) o D (Descendente)" + "\n" + "Se ordenara de manera ascendente por defecto");
                a.SortAscendente(arr);
                //b.SortAscendente(arr, arr.length);
                //c.SortAscendente(arr, 0, arr.length-1);
            }
        }
        
        // Imprimir los arreglos ya ordenados
        for (int i = 0; i < arrays.size(); i++) {
            System.out.println("Indice " + (i+1+".a") + ": " + Arrays.toString(arrays.get(i)));
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
                a.SortAscendente(arr);
                //b.SortAscendente(arr, arr.length);
                //c.SortAscendente(arr, 0, arr.length-1);
            } else if (orderChoice.equals("D")) {
                a.SortDescendente(arr);
                //b.SortDescendente(arr, arr.length);
                //c.SortDescendente(arr, 0, arr.length-1);
            }
        }

        // Imprimir arreglos ya ordenados
        for (int i = 0; i < sortedArrays.size(); i++) {
            System.out.println("Indice " + (i+1+".b") + ": " + Arrays.toString(sortedArrays.get(i)));
        }
    
    }
}
