public class Baleia extends Mamifero {
    private String corPele, especie;

    public Baleia(String nome, String sexo, int idade, double peso, String corPele, String especie) {
        super(nome, sexo, idade, peso);
        this.corPele = corPele;
        this.especie = especie;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println(
            "Cor da pele: " + this.corPele
            + "\nEspécie: " + this.especie
        );
    }

    public void cantar() {
        System.out.println("🐋 uuh uuh");
    }
}
