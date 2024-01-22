import static org.junit.Assert.*;
import org.junit.Test;

public class RadioTest {

    IRadio miRadio = new Radio();

    @Test
    public void testEncender() {
        assertFalse(miRadio.cambioBinario(true)); // Verifica que el cambio binario funcione correctamente antes de encender
        miRadio.encender();
        assertTrue(miRadio.cambioBinario(true)); // Verifica que la radio esté encendida
    }

    @Test
    public void testApagar() {
        assertTrue(miRadio.cambioBinario(false)); // Verifica que el cambio binario funcione correctamente antes de apagar
        miRadio.apagar();
        assertFalse(miRadio.cambioBinario(false)); // Verifica que la radio esté apagada
    }

}

