public class Radio implements IRadio {

    private boolean encendido;
    private int[] lista_AM;
    private double[] lista_FM;
    //Bob el constructor

    public Radio(){
        this.lista_AM= new int[12];
        this.lista_FM= new double[12];
    }
    
    @Override
    public boolean cambioBinario(boolean valor) {
        return !valor;
    }

    public void encender() {
        if (!encendido) {
            encendido = cambioBinario(encendido);
            System.out.println("La radio se ha encendido.");
        } else {
            System.out.println("La radio ya está encendida.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = cambioBinario(encendido);
            System.out.println("La radio se ha apagado.");
        } else {
            System.out.println("La radio ya está apagada.");
        }
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



