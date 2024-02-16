import java.util.Arrays;

public class ShellSort {
    public void shellSortAscendente(int[] arr, int n) {
        for(int intervalo = n / 2; intervalo > 0; intervalo = intervalo / 2) {
            for(int i = intervalo; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= intervalo && arr[j - intervalo] > temp; j = j - intervalo) {
                    arr[j] = arr[j - intervalo];
                }
                arr[j] = temp;
            }
        }
    }
    
    public void shellSortDescendente(int[] arr, int n) {
        shellSortAscendente(arr, n);
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}

/*import java.util.Arrays;
import java.util.Scanner;
public class ShellSort {
    public void shellSort(int[] arr, int n){
        for(int intervalo=n/2; intervalo>0; intervalo = intervalo/2){
            for(int i=intervalo;i<n;i++){
                int temp = arr[i];
                int j;
                for (j=i;j>=intervalo && arr[j-intervalo]>temp;j = j - intervalo){
                    arr[j] = arr[j-intervalo];
                }
                arr[j]=temp;
            }
        }
    }
    
}*/
