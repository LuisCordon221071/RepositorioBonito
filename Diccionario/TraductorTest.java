import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TraductorTest {

    @Test
    public void traducirDesdeInglesAEspanol() {
        Traductor traductor = new Traductor("diccionario.txt");
        String frase = "The woman asked me to do my homework about my town";
        String traduccionEsperada = "The mujer asked me to do my tarea about my pueblo";
        String traduccionObtenida = traductor.traducir3(frase);
        assertEquals(traduccionEsperada, traduccionObtenida);
    }

    @Test
    public void traducirDesdeInglesAFrances() {
        Traductor traductor = new Traductor("diccionario.txt");
        String frase = "The woman asked me to do my homework about my town";
        String traduccionEsperada = "The femme asked me to do my devoirs about my ville";
        String traduccionObtenida = traductor.traducir2(frase);
        assertEquals(traduccionEsperada, traduccionObtenida);
    }

    @Test
    public void traducirDesdeEspanolAIngles() {
        Traductor traductor = new Traductor("diccionario.txt");
        String frase = "La mujer me pidió que hiciera la tarea en mi pueblo";
        String traduccionEsperada = "La woman me pidió que hiciera la homework en mi town";
        String traduccionObtenida = traductor.traducir2(frase);
        assertEquals(traduccionEsperada, traduccionObtenida);
    }

    @Test
    public void traducirDesdeEspanolAFrances() {
        Traductor traductor = new Traductor("diccionario.txt");
        String frase = "La mujer me pidió que hiciera la tarea en mi pueblo";
        String traduccionEsperada = "La femme me pidió que hiciera la devoirs en mi ville";
        String traduccionObtenida = traductor.traducir3(frase);
        assertEquals(traduccionEsperada, traduccionObtenida);
    }

    @Test
    public void traducirDesdeFrancesAIngles() {
        Traductor traductor = new Traductor("diccionario.txt");
        String frase = "La femme me demanda de faire mes devoirs à propos de ma ville";
        String traduccionEsperada = "La woman me demanda de faire mes homework à propos de ma town";
        String traduccionObtenida = traductor.traducir3(frase);
        assertEquals(traduccionEsperada, traduccionObtenida);
    }

    @Test
    public void traducirDesdeFrancesAEspanol() {
        Traductor traductor = new Traductor("diccionario.txt");
        String frase = "La femme me demanda de faire mes devoirs à propos de ma ville";
        String traduccionEsperada = "La mujer me demanda de faire mes tarea à propos de ma pueblo";
        String traduccionObtenida = traductor.traducir2(frase);
        assertEquals(traduccionEsperada, traduccionObtenida);
    }
}

