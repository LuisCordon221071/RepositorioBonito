public class Traductor {
    private BinarySearchTree<String, Word> diccionario;

    public Traductor(String archivoDiccionario) {
        diccionario = new BinarySearchTree<>(new WordComparator("espanol"));
        cargarDiccionario(archivoDiccionario);
    }

    private void cargarDiccionario(String archivo) {
        LectorDiccionario.cargarDiccionario(diccionario, archivo);
    }

    public String traducir1(String frase) {
        return traducir(frase, "ingles");
    }

    public String traducir2(String frase) {
        return traducir(frase, "frances");
    }

    public String traducir3(String frase) {
        return traducir(frase, "espanol");
    }

    private String traducir(String frase, String idiomaDestino) {
        StringBuilder traduccion = new StringBuilder();
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            Word traduccionPalabra = diccionario.find(palabra);
            if (traduccionPalabra != null) {
                switch (idiomaDestino) {
                    case "ingles":
                        traduccion.append(traduccionPalabra.getIngles()).append(" ");
                        break;
                    case "frances":
                        traduccion.append(traduccionPalabra.getFrances()).append(" ");
                        break;
                    case "espanol":
                        traduccion.append(traduccionPalabra.getEspanol()).append(" ");
                        break;
                }
            } else {
                traduccion.append(palabra).append(" ");
            }
        }
        return traduccion.toString().trim(); 
    }
}





