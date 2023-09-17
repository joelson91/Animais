public abstract class Mamifero extends Animal {
    // Atributos da classe
    private int velocidade = 0;

    // Getters e Setters
    public void getVelocidade() {
        System.out.println("Velocidade: " + this.velocidade + "ms");
    }

    // Construtor da classe
    public Mamifero(String nome, String classe) {
        super(nome, classe);
    }

    // Métodos da classe
    public void correr(){
        if (this.velocidade >= 0){
            this.velocidade++;
        }
    }

}
