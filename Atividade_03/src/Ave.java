public abstract class Ave extends Animal {

    // Construtor da classe
    public Ave(String nome, String classe) {
        super(nome, classe);
    }

    // Métodos da classe
    @Override
    public void falar() {
        System.out.println("Som de Ave");
    }

    public void voar(int altura){
        System.out.println("Voando a " + altura + "m de altura");
    }
}
