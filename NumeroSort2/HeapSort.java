public class HeapSort {

    //Heapify
    private void heapify(int[] arr, int n, int i) {
        int largo = i;
        int izq = 2 * i + 1;
        int der = 2 * i + 2;

        if (izq < n && arr[izq] > arr[largo]) {
            largo = izq;
        }

        if (der < n && arr[der] > arr[largo]) {
            largo = der;
        }

        if (largo != i) {
            int swap = arr[i];
            arr[i] = arr[largo];
            arr[largo] = swap;
            heapify(arr, n, largo);
        }
    }

    //Inverso
    private void reverseArray(int[] arr) {
        int izq = 0;
        int der = arr.length - 1;
        while (izq < der) {
            int temp = arr[izq];
            arr[izq] = arr[der];
            arr[der] = temp;
            izq++;
            der--;
        }
    }

    //Ascendente
    public void SortAscendente(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    //Descendente
    public void SortDescendente(int[] arr) {
        SortAscendente(arr);
        reverseArray(arr);
    }


}
