// Objeto
public class Livro {
    // O objeto se caracteriza por ter atributos e caracteristicas de algo.

    private String nome;
    private String autor;
    private int anoLancamento;

    public Livro(String nome, String autor, int anoLancamento) {
        this.nome = nome;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", autor=" + autor + ", anoLancamento=" + anoLancamento + "]";
    }

}
