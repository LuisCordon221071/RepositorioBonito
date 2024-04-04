public class Vista {
    public static void main(String[] args) {
        Traductor traductor = new Traductor("diccionario.txt");

        String oracion = "The woman asked me to do my homework about my town";
        String traduccion = traductor.traducir(oracion);
        System.out.println("Traducción de la oración: " + traduccion);
    }
    
}
