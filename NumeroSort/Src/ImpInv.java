public class ImpInv {
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void invertirArreglo(int[] arreglo) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio < fin) {
            int temp = arreglo[inicio];
            arreglo[inicio] = arreglo[fin];
            arreglo[fin] = temp;

            inicio++;
            fin--;
        }
    }
}
