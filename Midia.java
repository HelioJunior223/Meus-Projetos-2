public class Midia {
    
    private String titulo;
    private boolean disponivel;

    public Midia(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    public boolean estaDisponivel() {
        return disponivel;
    } 
    

public String emprestar() {
        if (disponivel) {
            disponivel = false;
            return titulo + " emprestado com sucesso.";
        } else {
            return titulo + " não está disponível no momento.";
        }
    }

    public String devolver() {
        if (!disponivel) {
            disponivel = true;
            return titulo + " devolvido com sucesso.";
        } else {
            return titulo + " já está disponível.";
        }
    }
}