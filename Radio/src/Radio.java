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
 * 
 */
public class Radio implements IRadio {


    //Bob el constructor
    
    
    //Bob el constructor

    public Radio(){
        
    }
    

    
    /** 
     * @param valor
     * @return boolean
     */
    @Override
    public boolean cambioBinario(boolean valor) {
        return !valor;
    }


    
    /** 
     * Este método sirve para guardar
     * @param lista_AM
     * @param posicion
     * @param estacion
     * @return int[]
     */
    @Override
    public int[] guardarAM(int[] lista_AM, int posicion, int estacion) {
       int[] nuevaLista= lista_AM;
       nuevaLista[posicion]=estacion;
       return nuevaLista;
    }

    
    /** 
     * Este método guarda la lista
     * @param lista_FM
     * @param posicion
     * @param estacion
     * @return double[]
     */
    @Override
    public double[] guardarFM(double[] lista_FM, int posicion, double estacion) {
        double[] nuevaLista= lista_FM;
        nuevaLista[posicion]=estacion;
        return nuevaLista;
    }

    
    /** 
     * Este método avanza la posición actualAM
     * @param estacion_actual
     * @return int
     */
    @Override
    public int avanzarAM(int estacion_actual) {
        
       
            estacion_actual+=10;
            return estacion_actual;
        
       
    }

    
    /** 
     * Este método avanza la posición actualFM
     * @param estacion_actual
     * @return double
     */
    @Override
    public double avanzarFM(double estacion_actual) {
        estacion_actual+=0.2;
            return estacion_actual;
        
    }



}
    



