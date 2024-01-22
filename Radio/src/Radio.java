public class Radio implements IRadio {

    private boolean encendido;

    //Bob el constructor

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

}



