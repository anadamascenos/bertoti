import java.util.List;
import java.util.LinkedList;
public class Biblioteca {
        private String nome;
        private String endereco;

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getEndereco() {
                return endereco;
        }

        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }

        private List<Livros> livros = new LinkedList<Livros>();

        public void addLivro(Livros livro) {
                livros.add(livro);
        }


        public List<Livros> buscarLivroNome(String nome){
                List<Livros> encontrados = new LinkedList<Livros>();
                for(Livros livro:livros) {
                        if(livro.getTitulo().equals(nome)) encontrados.add(livro);
                }
                return encontrados;
        }

        public List<Livros> getLivros(){
                return livros;
        }

}
