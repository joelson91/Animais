public abstract class Animal {
    // Atributos da classe
    private String nome;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }


    // Métodos da classe
    public void imprime(){

    }

    public void falar(){
        System.out.println("Som de animal");
    }
}
