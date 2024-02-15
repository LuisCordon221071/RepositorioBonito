import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Sorteo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenerarNumeros generador = new GenerarNumeros();
        ShellSort shell = new ShellSort();
        ImpInv impinv = new ImpInv();

        generador.generarAzar(10);
        Set<Integer> numerosGenerados = generador.getNumerosAzar();
        GuardarNumeros.guardarNumeros(numerosGenerados, "numeros.txt");

        int[] arreglo = LeerTxt.leerArreglo("numeros.txt");

        if (arreglo != null) {
            System.out.println("Arreglo sin ordenar:");
            impinv.imprimirArreglo(arreglo);

            System.out.println("Elija el orden de la ordenación:");
            System.out.println("1. Ascendente");
            System.out.println("2. Descendente");
            int opcion = scanner.nextInt();

            shell.shellSort(arreglo, arreglo.length);

            if (opcion == 2) {
                impinv.invertirArreglo(arreglo);
            }

            System.out.println("Arreglo ordenado:");
            impinv.imprimirArreglo(arreglo);
        } else {
            System.out.println("No se pudo leer el arreglo desde el archivo.");
        }

        scanner.close();
    }

    
}
