public class Vaca extends Mamifero {
    // Atributos da classe
    private boolean permiteOrdenha;

    // Construtor da classe
    public Vaca(String nome, String classe) {
        super(nome, classe);
    }

    // Métodos da classe
    public void ordenhar(){

    }

    @Override
    public void falar() {
        System.out.println("Muuuuu!");
    }
}
