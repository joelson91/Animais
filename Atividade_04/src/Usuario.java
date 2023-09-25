public record Usuario(String nome, String sexo, String telefone, int idade) {

    public void exibeDados() {
        System.out.println("Nome: " + nome
                + "\nSexo: " + sexo
                + "\nTelefone: " + telefone
                + "\nIdade: " + idade);
    }
}
