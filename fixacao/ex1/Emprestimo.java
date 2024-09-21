import java.time.LocalDate;

public class Emprestimo {
    
    // Atributos
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    // Método Construtor
    public Emprestimo(Livro livro, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // Getters
    public Livro getLivro() {
        return this.livro;
    }

    public LocalDate getDataDevolução() {
        return dataDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }


}
