
public class Jogador {
    
    // Atributos
    private String nome;
    private String posisao;

    // Método contrutos
    public Jogador(String nome, String posisao) {
        this.nome = nome;
        this.posisao = posisao;
    };

    
    // Getters
    public String getNome() {
        return nome;
    }

    public String getPosisao() {
        return posisao;
    }

}
