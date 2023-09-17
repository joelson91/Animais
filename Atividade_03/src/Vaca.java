public class Vaca extends Mamifero {
    // Atributos da classe
    private boolean permiteOrdenha;

    // Construtor da classe
    public Vaca(String nome, String classe, boolean permiteOrdenha) {
        super(nome, classe);
        this.permiteOrdenha = permiteOrdenha;
    }

    // Métodos da classe
    public void ordenhar(){
        if (this.permiteOrdenha){
            System.out.println("Tirando leite...");
        } else {
            System.out.println("Não é possível ordenhar!");
        }
    }

    @Override
    public void falar() {
        System.out.println("Muuuuu!");
    }
}
