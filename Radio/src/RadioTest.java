

import static org.junit.Assert.assertEquals;
import org.junit.Assert;

import org.junit.Test;

public class RadioTest {
    Radio miRadio= new Radio();
    int estacion_actual= 530;
    double Fm=87.9;
    boolean Encendido= true;
    int [] listaAm= new int[12];
    double [] listaFm= new double[12];

    @Test
    public void testAvanzarAM() {
        Assert.assertEquals(540,miRadio.avanzarAM(estacion_actual) );
    }

    @Test
    public void testAvanzarFM() {
        Assert.assertEquals(88.1, miRadio.avanzarFM(Fm),0.01);
    }

    @Test
    public void testCambioBinario() {
        Assert.assertEquals(false, miRadio.cambioBinario(Encendido));
    }

    @Test
    public void testGuardarAM() {
        int [] listaAmPrueba= new int[12];
        listaAmPrueba[1]=530;
        listaAm[1]=530;
        Assert.assertEquals(listaAmPrueba[1], listaAm[1]);
    }

    @Test
    public void testGuardarFM() {
        double [] listaFmPrueba= new double[12];
        listaFmPrueba[1]=87.9;
        listaFm[1]=87.9;
        Assert.assertEquals(listaFmPrueba[1], listaFm[1],0.01);
    }
}
