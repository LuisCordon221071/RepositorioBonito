import java.util.Arrays;

public class RadixSort {

        //Contador
        private void countingSort(int[] arr, int exp) {
            int n = arr.length;
            int[] output = new int[n];
            int[] count = new int[10];
            Arrays.fill(count, 0);
    
            for (int value : arr) {
                count[(value / exp) % 10]++;
            }
    
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }
    
            for (int i = n - 1; i >= 0; i--) {
                output[count[(arr[i] / exp) % 10] - 1] = arr[i];
                count[(arr[i] / exp) % 10]--;
            }
    
            System.arraycopy(output, 0, arr, 0, n);
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
        if (arr.length == 0) {
            return;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

        //Descendente
        public void SortDescendente(int[] arr) {
            SortAscendente(arr);
            reverseArray(arr);
        }
}
