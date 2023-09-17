public abstract class Animal {
    // Atributos da classe
    private final String nome;
    protected String classe;

    // Construtor da classe
    public Animal (String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    // Métodos da classe
    public void imprime(){
        System.out.println("Nome: " + this.nome + "\nClasse: " + this.classe);
    }

    public void falar(){System.out.println("Som de animal");}
}
