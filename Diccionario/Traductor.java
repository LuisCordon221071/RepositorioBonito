public class Traductor {
    private BinarySearchTree<String, Word> diccionario;

    public Traductor(String archivoDiccionario) {
        diccionario = new BinarySearchTree<>(new WordComparator());
        cargarDiccionario(archivoDiccionario);
    }

    private void cargarDiccionario(String archivo) {
        LectorDiccionario.cargarDiccionario(diccionario, archivo);
    }

    public String traducir(String frase) {
        StringBuilder traduccion = new StringBuilder();
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            Word traduccionPalabra = diccionario.find(palabra);
            if (traduccionPalabra != null) {
                traduccion.append(traduccionPalabra.getEspanol()).append(" ");
            } else {
                traduccion.append(palabra).append(" ");
            }
        }
        return traduccion.toString().trim();
    }
}