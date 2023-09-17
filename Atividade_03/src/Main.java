public class Main {
    public static void main(String[] args) {

        // Objeto Bem-te-vi
        BemTeVi bem_te_vi = new BemTeVi("Luna", "Ave");

        bem_te_vi.imprime();
        bem_te_vi.voar(15);
        bem_te_vi.falar();

        System.out.println("-------------------------------------");

        // Objeto Papagaio
        Papagaio papagaio = new Papagaio("Tunico", "Ave");

        papagaio.imprime();
        papagaio.voar(20);
        papagaio.setVocabulario("Quero comer!");
        papagaio.falar();

        System.out.println("-------------------------------------");

        // Objeto Vaca
        Vaca vaca = new Vaca("Mimosa", "Mamífero", true);

        vaca.imprime();
        vaca.correr();
        vaca.getVelocidade();
        vaca.ordenhar();
        vaca.falar();

        System.out.println("-------------------------------------");

        // Objeto Cachorro
        Cachorro cachorro = new Cachorro("Bilu", "Mamífero", true);

        cachorro.imprime();
        cachorro.falar();
        cachorro.correr();
        cachorro.correr();
        cachorro.getVelocidade();
    }
}