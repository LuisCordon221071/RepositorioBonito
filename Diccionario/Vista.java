import java.util.Scanner;

public class Vista {
    public static void main(String[] args) {
        Traductor traductor = new Traductor("diccionario.txt");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            String frase;
            String traduccion;
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la frase a traducir:");
                    frase = scanner.nextLine();
                    traduccion = traductor.traducir3(frase);
                    System.out.println("Traducción al español: " + traduccion);
                    break;
                case 2:
                    System.out.println("Ingrese la frase a traducir:");
                    frase = scanner.nextLine();
                    traduccion = traductor.traducir2(frase);
                    System.out.println("Traducción al francés: " + traduccion);
                    break;
                case 3:
                    System.out.println("Ingrese la frase a traducir:");
                    frase = scanner.nextLine();
                    traduccion = traductor.traducir2(frase);
                    System.out.println("Traducción al inglés: " + traduccion);
                    break;
                case 4:
                    System.out.println("Ingrese la frase a traducir:");
                    frase = scanner.nextLine();
                    traduccion = traductor.traducir3(frase);
                    System.out.println("Traducción al francés: " + traduccion);
                    break;
                case 5:
                    System.out.println("Ingrese la frase a traducir:");
                    frase = scanner.nextLine();
                    traduccion = traductor.traducir3(frase);
                    System.out.println("Traducción al inglés: " + traduccion);
                    break;
                case 6:
                    System.out.println("Ingrese la frase a traducir:");
                    frase = scanner.nextLine();
                    traduccion = traductor.traducir2(frase);
                    System.out.println("Traducción al español: " + traduccion);
                    break;
                case 7:
                    System.out.println("Que tenga un feliz día :D");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n----- Traductor -----");
        System.out.println("1. Traducir de inglés a español");
        System.out.println("2. Traducir de inglés a francés");
        System.out.println("3. Traducir de español a inglés");
        System.out.println("4. Traducir de español a francés");
        System.out.println("5. Traducir de francés a inglés");
        System.out.println("6. Traducir de francés a español");
        System.out.println("7. Salir del prsograma");
        System.out.println("Seleccione una opción:");
    }
}










