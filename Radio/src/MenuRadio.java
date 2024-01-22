import java.util.Scanner;
public class MenuRadio{

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

     
     System.out.println("Prenda la sonora");
    while (encendido==true) {
       
        
        
        

        if (Am==true) {
        System.out.println("La radio se encuentra en Am");
        System.out.println("1) cambiar a FM");
        System.out.println("2) Avanzar emisora");
        System.out.println("3) Guardar emisora en la lista");
        System.out.println("4) Seleccionar emisora");
        System.out.println("5) Apagar la radio");
        System.out.println("6) Mostrar estación actual");
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
             System.out.println("¿En qué posición quieres guardar la estación actual (1-12)?\n");
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
                encendido=false;
                break;
            case 6:
            System.out.println("La estación actual es: "+estacion_actualAM+"\n");
                break;
        }
        } else {
            System.out.println("La radio se encuentra en Fm");
            System.out.println("1) cambiar AM");
            System.out.println("2) Cambiar emisora");
            System.out.println("3) Guardar emisora");
        }
     } if (encendido==false){
        System.out.println("La radio se ha apagado");}
        
    }
}


    
