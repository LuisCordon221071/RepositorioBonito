public class Radio implements IRadio {


    //Bob el constructor
    private boolean encendido;
    private int[] lista_AM;
    private double[] lista_FM;
    private double estacion;
    private boolean Am;


    //Bob el constructor

    public Radio(){
        this.lista_AM= new int[12];
        this.lista_FM= new double[12];
        this.estacion= 0;
        this.Am= true;

    }


    public boolean cambioBinario(boolean valor) {

    @Override
    public int[] guardarAM(int[] lista_AM, int posicion, int estacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarFM'");
       int[] nuevaLista= lista_AM;
       nuevaLista[posicion]=estacion;
       return nuevaLista;
    }

    @Override
    public double[] guardarFM(double[] lista_FM, int posicion, double estacion) {

    @Override
    public int avanzarAM(int estacion_actual) {
        if (Am==false){
        return 0;
        }
        else{


            estacion_actual+=10;
            return estacion_actual;
        }


    }

    @Override
    public double avanzarFM(double estacion_actual) {
        if (Am==true){
            return 0;
            }
        else{

            estacion_actual+=0.2;
        estacion_actual+=0.2;
            return estacion_actual;

        }

    }

    }
    }
}


