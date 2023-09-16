public abstract class Mamifero {
    private String nome, sexo;
    private int idade;
    private double peso;

    public Mamifero(String nome, String sexo, int idade, double peso) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void dados() {
        System.out.println(
                "Nome: " + this.getNome()
                + "\nSexo: " + this.getSexo()
                + "\nIdade: " + this.getIdade()
                + "\nPeso: " + this.getPeso()
        );
    }

    public void respirar() {
        System.out.println("Estou respirando");
    }

    public void comer() {
        System.out.println("Estou comendo");
    }
}
