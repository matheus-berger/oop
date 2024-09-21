import java.time.LocalDate;

public class Pedido {
    
    private CarrinhoDeCompras carrinhoDeCompras;
    private LocalDate data;
    private String status;

    public Pedido(Cliente cliente) {

        // Compondo um carrinho de compras
        carrinhoDeCompras = new CarrinhoDeCompras(cliente);

        data = LocalDate.now();
        status = "processando";

    }

    // Setters
    public void setStatus(String status) {
        this.status = status;
    }

    // Getters
    public CarrinhoDeCompras getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public LocalDate getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

}
