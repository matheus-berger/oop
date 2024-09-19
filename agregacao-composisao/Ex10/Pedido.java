
public class Pedido {
    
    // Atributos
    private String produto;
    private int quantidade;

    // Método Construtor 
    public Pedido(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // Getters
    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
