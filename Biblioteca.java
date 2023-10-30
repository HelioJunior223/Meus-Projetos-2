import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;

    public static ArrayList<Biblioteca> bibliotecas = new ArrayList<>();

    public Biblioteca(String nome) {
        this.setLivros(new ArrayList<>());

        bibliotecas.add(this);
    }
    
    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public String toString() {
        return "Nome: " + this.nome;
    }

    public void adicionarLivro(Livro livro) {
        this.getLivros().add(livro);
    }

    public void listarLivros() {
        for (int i = 0; i < this.getLivros().size(); i++) {
            System.out.println(i + " - " + this.getLivros().get(i).toString());
        }
    }

    public static void listarBibliotecas() {
        for (int i = 0; i < bibliotecas.size(); i++) {
            Biblioteca biblioteca = bibliotecas.get(i);
            System.out.println(i + " - " + biblioteca.toString());
            biblioteca.listarLivros();
        }
    }
}
