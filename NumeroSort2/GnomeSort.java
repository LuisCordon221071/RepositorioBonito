public class GnomeSort {
    //Sort Ascendente
    public void SortAscendente(int[] arr, int n) {
        int index = 0;
        while (index < n) {
            if (index == 0) {
                index++;
            }
            if (arr[index] >= arr[index - 1]) {
                index++;
            } else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }

    //Sort Descendente
    public void SortDescendente(int[] arr, int n) {
        int index = 0;
        while (index < n) {
            if (index == 0) {
                index++;
            }
            if (arr[index] <= arr[index - 1]) {
                index++;
            } else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }
}