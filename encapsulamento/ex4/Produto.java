
public class Produto {
    
    // Atributos
    private String nome;
    private int quantidadeEstoque;
    private double preco;

    // Método Construtor
    public Produto(String nome, int quantidadeEstoque, double preco) {
        if (quantidadeEstoque >= 0) { // Validando a quantidade para não ser negativa
            if (preco > 0) { // Validando o preoço para ser maior que zero
                this.nome = nome;
                this.quantidadeEstoque = quantidadeEstoque;
                this.preco = preco;
            } else {
                System.out.println("Não foi possivel cadastrar o produto, o preço deve ser maior que R$ 0,00");
            }
        } else {
            System.out.println("Não foi possivel cadastrar o produto, a quantidade não pode ser negativa.");
        }
        
    }

    // Getters e Setters nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    // Getters e Setters quantidadeEstoque
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }


    // Getters e Setters nome
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço deve ser maior que R$ 0,00!");
        }    
    }


    // Método para adicionar ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            int novaQuantidade = quantidadeEstoque + quantidade;
            quantidadeEstoque =+ novaQuantidade;
            System.out.printf("> %s de %s adicionados!", quantidade, nome);
        } else {
            System.out.println("Erro: A quantidade deve ser maior que 0 (zero)!");
        }
    }

    // Método vender
    public void vender(int quantidade) {
        if (quantidade > 0) {
            if (this.quantidadeEstoque >= quantidade) {
                int novaQuantidade = quantidadeEstoque - quantidade;
                quantidadeEstoque =+ novaQuantidade;
                System.out.printf("> %s de %s vendidos!", quantidade, nome);
            } else {
                System.out.println("Erro: Estoque insuficiente!");
            }
        } else {
            System.out.println("Erro: A quantidade deve ser maior que 0 (zero)!");
        }
    }
}
