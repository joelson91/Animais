public class Cao extends Mamifero {
    private String corPelo, raca;

    public Cao(String nome, String sexo, int idade, double peso, String corPelo, String raca) {
        super(nome, sexo, idade, peso);
        this.corPelo = corPelo;
        this.raca = raca;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println(
                "Cor do pelo: " + this.corPelo
                + "\nRaça: " + this.raca
        );
    }

    public void latir(){
        System.out.println("🐶 Au, au!");
    }
}
