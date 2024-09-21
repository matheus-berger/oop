import java.util.ArrayList;

public class LojaVirtual {
    
    private ArrayList<Pedido> pedidos;
    private ArrayList<Produto> produtos;

    public LojaVirtual(ArrayList<Pedido> pedidos) {
        
        // Agredando multiplos pedidos
        this.pedidos = pedidos;

        // Compondo multiplos produtos
        produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Samsung Galaxy Book 2", 1999, 35));
        produtos.add(new Produto("Samsung Galaxy S23 FE", 2500, 45));
        produtos.add(new Produto("Samsung Galaxy Tab S9 FE", 2500, 10));
        produtos.add(new Produto("Samsung Galaxy Buds FE", 450, 15));

    }

    // Método para processar pedidos 
    public void processarPedidos(Pedido pedido, String status) {
        for (Pedido i : pedidos) {
            if (i == pedido) {
                i.setStatus(status);
                break;
            }
        }
    }
    
    // Método para atualizar o estoque
    public void atualizarEstoque(Produto produto, int novoEstoque) {
        for (Produto i : produtos) {
            if (i == produto) {
                i.setEstoque(novoEstoque);
            }
        }
    }
    
    // Método para calcular o valor total do carrinho
    public double calcularValorCarrinho(CarrinhoDeCompras carrinhoDeCompras) {
        
        double valorTotal = 0;

        for (Pedido pedido : pedidos) {
            if (pedido.getCarrinhoDeCompras() == carrinhoDeCompras) {
                CarrinhoDeCompras carrinho = pedido.getCarrinhoDeCompras();
                ArrayList<Produto> produtos = carrinho.getProdutos();
                for (Produto produto : produtos) {
                    valorTotal += produto.getPreco();
                }
            }
        }

        return valorTotal;

    }
    
    // Método para gerar relatórios de vendas
    public void relatoriosVendas() {
        System.out.println("Total de Vendas: " + pedidos.size());
        int numeroPedido = 0;
        for (Pedido pedido : pedidos) {
            numeroPedido += 1;
            System.out.printf("> Pedido nº %s | Feito em: %s | Status: %s | Total: R$ %s\n", numeroPedido, pedido.getData(), pedido.getStatus(), calcularValorCarrinho(pedido.getCarrinhoDeCompras()));
        }
    }
}
