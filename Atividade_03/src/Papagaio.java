public class Papagaio extends Ave {
    // Atributos da classe
    private String vocabulario;

    // Construtor da classe
    public Papagaio(String nome, String classe) {
        super(nome, classe);
    }

    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }

    // Métodos da classe
    @Override
    public void falar() {
        System.out.println("Loro, Loro!");
    }
}
