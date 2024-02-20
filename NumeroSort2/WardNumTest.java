import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class WardNumTest {
    @Test
    public void testGenerarNumeros() {
        File archivo = new File("numeros.txt");
        assertTrue(archivo.exists());
        assertTrue(archivo.length() > 0);
    }
}
