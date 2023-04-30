import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class TesteTest {

    @Test
    public void testAddLivro() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal", "Rua 123");
        Livros livro = new Livros("Livro 1", "Autor 1");
        biblioteca.addLivro(livro);
        List<Livros> livros = biblioteca.getLivros();
        assertTrue(livros.contains(livro));
    }

    @Test
    public void testBuscarLivroNome() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal", "Rua 123");
        Livros livro1 = new Livros("Livro 1", "Autor 1");
        Livros livro2 = new Livros("Livro 2", "Autor 2");
        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);
        List<Livros> livrosEncontrados = biblioteca.buscarLivroNome("Livro 1");
        assertEquals(1, livrosEncontrados.size());
        assertEquals(livro1, livrosEncontrados.get(0));
    }


//public class TesteTest {

    @Test
    public void testConstrutor() {
        Livros livro = new Livros("Livro 1", "Autor 1");
        assertEquals("Livro 1", livro.getTitulo());
        assertEquals("Autor 1", livro.getAutor());
    }
}
