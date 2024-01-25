/*
 * Algoritmos y estructuras de datos [Sección 50]
 * Interfaz para la radio (Propuesta)
 *
 * Estudiantes:
 * Allen Estuardo Ramírez De Paz, 22326
 * Luis Alberto Cordón Salguero, 221071
 * Catedrático: Moisés Alonso
 * Auxiliar: Joaquín Puente
 * 
 */
import java.util.Scanner;
public class MenuRadio{


/** 
 * @param args
 */
public static void main(String[] args) {
    Scanner miScanner = new Scanner(System.in);
    Radio miRadio=new Radio();
     boolean encendido=true;
     int[] lista_AM= new int[12];
     double[] lista_FM= new double[12];
     int estacion_actualAM =530 ;
     double estacion_actualFM=87.9;
     boolean Am=true;
     int opcion=0;
     int posicion=0;

    System.out.println();

     System.out.println("Prenda la sonora");
    while (encendido==true) {


        if (Am==true) {
        System.out.println("La radio se encuentra en AM");
        System.out.println("1) cambiar a FM");
        System.out.println("2) Avanzar emisora");
        System.out.println("3) Guardar emisora en la lista");
        System.out.println("4) Seleccionar emisora");
        System.out.println("5) Mostrar estación actual");
        System.out.println("6) Apagar la radio");
        opcion = miScanner.nextInt();
        switch (opcion) {
            case 1:
                Am = miRadio.cambioBinario(Am);
                System.out.println("Se ha cambiado a FM\n");
                break;
            case 2:
                if (estacion_actualAM!=1610){
                    estacion_actualAM= miRadio.avanzarAM(estacion_actualAM);
                } 
                else {
                    estacion_actualAM=530;
                }
                System.out.println("La estación es "+estacion_actualAM+"\n");
                break;
            case 3:
             System.out.println("¿En qué posición quieres guardar la estación actual (0-11)?\n");
             posicion=miScanner.nextInt();
                lista_AM= miRadio.guardarAM(lista_AM, posicion, estacion_actualAM);
                System.out.println("Se ha guardado la estación "+lista_AM[posicion]+" en la posición "+ posicion+"\n");
                break;
            case 4:
                System.out.println("¿Qué posición de la lista quiere usar?");
                posicion=miScanner.nextInt();
                estacion_actualAM= lista_AM[posicion];
                System.out.println("Ahora está en la estación: "+estacion_actualAM);
                break;
            case 5:
                System.out.println("La estación actual es: "+estacion_actualAM+"\n");
                break;
            case 6:
                encendido=false;
                break;
        }
    }
         else {
            System.out.println("La radio se encuentra en Fm");
            System.out.println("1) cambiar AM");
            System.out.println("2) Avanzar emisora");
            System.out.println("3) Guardar emisora");
            System.out.println("4) Seleccionar emisora");
            System.out.println("5) Mostrar estación actual");
            System.out.println("6) Apagar la radio");
            opcion = miScanner.nextInt();
            switch (opcion){
                case 1:
                    Am = miRadio.cambioBinario(Am);
                    System.out.println("Se ha cambiado a AM\n");
                    break;
                case 2:
                    if (estacion_actualFM<=107.7){
                        estacion_actualFM= miRadio.avanzarFM(estacion_actualFM);
                    } 
                    else {
                        estacion_actualFM=87.9;
                    }
                    System.out.println("La estación es "+estacion_actualFM+"\n");
                    break;
                case 3:
                    System.out.println("¿En qué posición quieres guardar la estación actual (0-11)?\n");
                    posicion=miScanner.nextInt();
                        lista_FM= miRadio.guardarFM(lista_FM, posicion, estacion_actualFM);
                        System.out.println("Se ha guardado la estación "+lista_FM[posicion]+" en la posición "+ posicion+"\n");
                    break;
                case 4:
                    System.out.println("¿Qué posición de la lista quiere usar?");
                    posicion=miScanner.nextInt();
                    estacion_actualFM= lista_FM[posicion];
                    System.out.println("Ahora está en la estación: "+estacion_actualFM);
                    break;
                case 5: 
                    System.out.println("La estación actual es: "+estacion_actualFM+"\n");
                    break;
                case 6:
                    encendido=false;
                    break;
            }
        }
     } if (encendido==false){
        System.out.println("La radio se ha apagado");}

    }
}