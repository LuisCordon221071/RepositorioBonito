public class QuickSort {

    //Ascendente
    public void SortAscendente(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partAscendente(arr, low, high);

            SortAscendente(arr, low, pi - 1);
            SortAscendente(arr, pi + 1, high);
        }
    }

    private int partAscendente(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    //Descendente
    public void SortDescendente(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partDescendente(arr, low, high);

            SortDescendente(arr, low, pi - 1);
            SortDescendente(arr, pi + 1, high);
        }
    }

    private int partDescendente(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] > pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
