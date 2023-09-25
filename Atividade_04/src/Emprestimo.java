public record Emprestimo(String dataDoEmprestimo, Usuario usuarioEmprestimo, Livro livroEmprestimo) {

    public void exibeDados() {
        System.out.println("\n====== DADOS DO EMPRÉSTIMO ======");
        System.out.println("Data do empréstimo: " + dataDoEmprestimo);

        System.out.println("------ DADOS DO USUÁRIO ------");
        usuarioEmprestimo.exibeDados();

        System.out.println("------ DADOS DO LIVRO ------");
        livroEmprestimo.exibeDados();
        System.out.println("=================================");
    }

}
