import java.time.Duration;

public class Tarefa {
    
    // Atributos
    private String nome;
    private String descricao;
    private Duration duracaoEstimada;
    private String estado;

    // Método construtor
    public Tarefa(String nome, String descricao, Duration duracaoEstimada, String estado) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoEstimada = duracaoEstimada;
        this.estado = estado;
    }

}
