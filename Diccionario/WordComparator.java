import java.util.Comparator;

public class WordComparator implements Comparator<String> {
    private String idiomaDestino;

    public WordComparator(String idiomaDestino) {
        this.idiomaDestino = idiomaDestino;
    }

    @Override
    public int compare(String palabra1, String palabra2) {
        switch (idiomaDestino) {
            case "ingles":
                return palabra1.compareTo(palabra2);
            case "espanol":
                return palabra1.compareTo(palabra2);
            case "frances":
                //
                break;
            default:
                throw new IllegalArgumentException("Idioma de destino no válido: " + idiomaDestino);
        }
        return 0;
    }
}









