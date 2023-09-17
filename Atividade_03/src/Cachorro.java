public class Cachorro extends Mamifero {
    // Atributos da classe
    private boolean tipoLatido;

    // Construtor da classe
    public Cachorro(String nome, String classe) {
        super(nome, classe);
    }

    // Métodos da classe
    public void setLateAlto(){

    }

    public void setLateBaixo(){

    }

    @Override
    public void falar(){
        System.out.println("Au, au!");
    }
}
