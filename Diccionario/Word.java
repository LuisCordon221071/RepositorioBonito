public class Word {
    private String ingles;
    private String espanol;
    private String frances;

    public Word(String ingles, String espanol, String frances) {
        this.ingles = ingles;
        this.espanol = espanol;
        this.frances = frances;
    }

    
    public String getIngles() {
        return ingles;
    }

    public String getEspanol() {
        return espanol;
    }

    public String getFrances() {
        return frances;
    }

    @Override
    public String toString() {
        return "Palabra{" +
                "ingles='" + ingles + '\'' +
                ", espanol='" + espanol + '\'' +
                ", frances='" + frances + '\'' +
                '}';
    }
}

