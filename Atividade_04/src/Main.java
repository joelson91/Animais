import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Cadastro de livro
        Livro li01 = new Livro("O Ateneu", "Raul Pompeia", "Literatura Brasileira", "Érica", 1888, 2, 336);
        Livro li02 = new Livro("Dom Casmurro", "Machado de Assis", "Literatura Brasileira", "Souza", 1899, 2, 368);
        
        // Cadastro de usuário
        Usuario us01 = new Usuario("João", "Masculino", "(91)91482-6487", 18);
        Usuario us02 = new Usuario("Maria", "Feminino", "(91)96628-3907", 16);
        
        // Criação de uma lista de empréstimo
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        // Adicionando dados de empréstimo à lista
        emprestimos.add(new Emprestimo("12/03/2023", us01, li01));
        emprestimos.add(new Emprestimo("14/02/2023", us02, li02));

        // Exibindo dados de empréstimos contidos na lista
        for (Emprestimo emprestimo : emprestimos) {emprestimo.exibeDados();}
    }
}