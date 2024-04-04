import java.util.Comparator;

public class WordComparator implements Comparator<String> {
    @Override
    public int compare(String palabra1, String palabra2) {
        return palabra1.compareTo(palabra2);
    }
}





