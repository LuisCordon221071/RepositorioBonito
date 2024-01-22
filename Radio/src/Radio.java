public class Radio implements IRadio {


    //Bob el constructor
    private boolean encendido;
    private int[] lista_AM;
    private double[] lista_FM;
    private double estacion;
   
    
    //Bob el constructor

    public Radio(){
        this.lista_AM= new int[12];
        this.lista_FM= new double[12];
        this.estacion= 0;
    }
    

    @Override
    public boolean cambioBinario(boolean valor) {
        return !valor;
    }


    @Override
    public int[] guardarAM(int[] lista_AM, int posicion, int estacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarAM'");
    }

    @Override
    public double[] guardarFM(double[] lista_FM, int posicion, double estacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarFM'");
    }

    @Override
    public int avanzarAM(int estacion_actual) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'avanzarAM'");
    }

    @Override
    public double avanzarFM(double estacion_actual) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'avanzarFM'");
    }



}



