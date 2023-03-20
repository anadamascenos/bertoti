import Livro;
public class GerenciamentoBiblioteca {
        private Livro livros;

        public void buscarLivro(String titulo) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equals(titulo)) {
                    System.out.println("Livro encontrado: " + livro.getTitulo() + ", autor: " + livro.getAutor());
                    return;
                }
            }
            System.out.println("Livro não encontrado");
        }

        public void adicionarLivro(Livro livro) {
            // código para adicionar livro à lista de livros
        }

        public void removerLivro(Livro livro) {
            // código para remover livro da lista de livros
        }
    }

    public class Livro {
        private String titulo;
        private String autor;
        private boolean disponivel;

        public Livro(String titulo, String autor, boolean disponivel) {
            this.titulo = titulo;
            this.autor = autor;
            this.disponivel = disponivel;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public boolean isDisponivel() {
            return disponivel;
        }

        public void setDisponivel(boolean disponivel) {
            this.disponivel = disponivel;
        }

        public void verificarDisponibilidade() {
            if (disponivel) {
                System.out.println("O livro " + titulo + " está disponível");
            } else {
                System.out.println("O livro " + titulo + " não está disponível no momento");
            }
        }
    }

