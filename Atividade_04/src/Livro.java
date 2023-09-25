public class Livro {
    private final String titulo, autores, area, editora;
    private final int ano, edicao, numero_Folhas;

    public Livro(String titulo, String autores, String area, String editora, int ano, int edicao, int numero_Folhas) {
        this.titulo = titulo;
        this.autores = autores;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.edicao = edicao;
        this.numero_Folhas = numero_Folhas;
    }

    public void exibeDados() {
        System.out.println("Título: " + titulo
        + "\nAutores: " + autores
        + "\nÁrea: " + area
        + "\nEditora: " + editora
        + "\nAno: " + ano
        + "\nEdição: " + edicao
        + "\nNúmero de folhas: " + numero_Folhas);
    }
}
