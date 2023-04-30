public class Main {
    public static void main(String[] args) {
        // Criando uma nova biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal", "Rua 25 de Março");

        // Criando livros e adicionando à biblioteca
        Livros livro1 = new Livros("Anna Karenina", "Liev Tolstói");
        Livros livro2 = new Livros("A Insustentável Leveza do Ser ", "Milán Kundera");
        Livros livro3 = new Livros("Capitães de Areia", "Jorge Amado");
        biblioteca.adicionarLivros(livro1);
        biblioteca.adicionarLivros(livro2);
        biblioteca.adicionarLivros(livro3);
    }
}