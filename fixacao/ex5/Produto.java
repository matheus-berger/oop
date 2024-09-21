

public class Produto {
    
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Setters
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Getters
    public double getPreco() {
        return preco;
    }

}
