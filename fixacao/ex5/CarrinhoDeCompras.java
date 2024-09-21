import java.util.ArrayList;

public class CarrinhoDeCompras {
    
    private ArrayList<Produto> produtos;
    private Cliente cliente;

    public CarrinhoDeCompras(Cliente cliente) {
        
        // Agregando um cliente
        this.cliente = cliente;

        // Compondo varios produtos
        produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Samsung Galaxy Book 2", 1999, 35));
        produtos.add(new Produto("Samsung Galaxy S23 FE", 2500, 45));
        produtos.add(new Produto("Samsung Galaxy Tab S9 FE", 2500, 10));
        produtos.add(new Produto("Samsung Galaxy Buds FE", 450, 15));
    }

    // Getters
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

}
