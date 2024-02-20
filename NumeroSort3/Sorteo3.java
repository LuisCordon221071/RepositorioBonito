import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Sorteo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "numeros_ordenados.txt"; // Nombre del archivo a leer
        MergeSort Sort = new MergeSort(); // Instacia de la clase ShellSort
        System.out.print("¿(A)scendente o (D)escendente? ");
        String orderChoice = scanner.nextLine().toUpperCase();
        scanner.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) { // Leer línea por línea del archivo
                String[] elements = line.trim().split("\\s+"); // Dividir la línea en elementos
                int[] arr = Arrays.stream(elements).mapToInt(Integer::parseInt).toArray(); // Convertir elementos a un arreglo de enteros
                Sort.SortDescendente(arr); // Ordenar ascendente usando ShellSort
                System.out.println(Arrays.toString(arr)); // Imprimir el arreglo ordenado
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MergeSort {

    // Merge Ascendente
    private void mergeAscendente(int[] arr, int izq, int med, int der) {
        int n1 = med - izq + 1;
        int n2 = der - med;

        int[] I = new int[n1];
        int[] D = new int[n2];

        System.arraycopy(arr, izq, I, 0, n1);
        System.arraycopy(arr, med + 1, D, 0, n2);

        int i = 0, j = 0;
        int k = izq;

        while (i < n1 && j < n2) {
            if (I[i] <= D[j]) {
                arr[k] = I[i];
                i++;
            } else {
                arr[k] = D[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = I[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = D[j];
            j++;
            k++;
        }
    }

    private void mergeSortAscendente(int[] arr, int izq, int der) {
        if (izq < der) {
            int med = (izq + der) / 2;

            mergeSortAscendente(arr, izq, med);
            mergeSortAscendente(arr, med + 1, der);

            mergeAscendente(arr, izq, med, der);
        }
    }

    // Merge Descendente
    private void mergeDescendente(int[] arr, int izq, int med, int der) {
        int n1 = med - izq + 1;
        int n2 = der - med;

        int[] I = new int[n1];
        int[] D = new int[n2];

        for (int i = 0; i < n1; ++i) {
            I[i] = arr[izq + i];
        }
        for (int j = 0; j < n2; ++j) {
            D[j] = arr[med + 1 + j];
        }

        int i = 0, j = 0;
        int k = izq;

        while (i < n1 && j < n2) {
            if (I[i] >= D[j]) {
                arr[k] = I[i];
                i++;
            } else {
                arr[k] = D[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = I[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = D[j];
            j++;
            k++;
        }
    }

    private void mergeSortDescendente(int[] arr, int izq, int der) {
        if (izq < der) {
            int med = (izq + der) / 2;

            mergeSortDescendente(arr, izq, med);
            mergeSortDescendente(arr, med + 1, der);

            mergeDescendente(arr, izq, med, der);
        }
    }


    // Ascendente
    public void SortAscendente(int[] arr) {
        mergeSortAscendente(arr, 0, arr.length - 1);
    }

    // Descendente
    public void SortDescendente(int[] arr) {
        mergeSortDescendente(arr, 0, arr.length - 1);
    }

}