public class MergeSort {

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
