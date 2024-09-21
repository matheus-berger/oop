
public class Cliente {
    
    // Atributos
    private String nome;
    private String documento;
    private String contato;

    // Método Construtor
    public Cliente(String nome, String documento, String contato) {
        this.nome = nome;
        this.documento = documento;
        this.contato = contato;
    }

    // Getters
    public String getNome() {
        return nome;
    }

}
