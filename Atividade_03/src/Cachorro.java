public class Cachorro extends Mamifero {
    // Atributos da classe
    private boolean tipoLatido;

    // Construtor da classe
    public Cachorro(String nome, String classe, boolean tipoLatido) {
        super(nome, classe);
        this.tipoLatido = tipoLatido;
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
