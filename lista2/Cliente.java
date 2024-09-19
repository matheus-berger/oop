public class Cliente {
    
    // Criando as caracteristicas
    private String nome = "";
    private String cpf = "";
    private String endereco = "";

    // Construtor
    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

}
