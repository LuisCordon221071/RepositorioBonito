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

    @Override
    public double[] guardarFM(double[] lista_FM, int posicion, double estacion) {
        double[] nuevaLista= lista_FM;
        nuevaLista[posicion]=estacion;
        return nuevaLista;
    }

    @Override
    public int avanzarAM(int estacion_actual) {
        
       
            estacion_actual+=10;
            return estacion_actual;
        
       
    }

    @Override
    public double avanzarFM(double estacion_actual) {
        estacion_actual+=0.2;
            return estacion_actual;
        
    }



}
    



