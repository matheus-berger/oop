
import java.util.ArrayList;

public class Cliente {

    // Atributos
    private String nome;
    private ArrayList<Pedido> lista_pedidos;

    // Método Construtor
    public Cliente(String nome, ArrayList<Pedido> pedidos) {
        this.nome = nome;
        lista_pedidos = pedidos;
    } 

    // Getters
    public String getNome() {
        return nome;
    }

    // Método: Adicionar pedido a lista:
    public void adicionarPedido(Pedido pedido) {
        lista_pedidos.add(pedido);
        System.out.println("> Pedido adicionado!");
    }

    // Médodo: Remover pedido da lista;
    public Pedido removerPedido(String nome_pedido) {
        
        Pedido pedido_removido = null;
        
        if (lista_pedidos.size() != 0) {
            for (Pedido i : lista_pedidos) {
                if (i.getProduto().equals(nome_pedido)) {
                    pedido_removido = new Pedido(i.getProduto(), i.getQuantidade());
                    lista_pedidos.remove(i);
                    break;
                }
            }
        }

        return pedido_removido;

    }

    // Método: Listar os Pedidos
    public void mostrarLista() {
        if (lista_pedidos.size() != 0) {
            for (Pedido i : lista_pedidos) {
                System.out.printf("pedido: %s - quantidade: %s", i.getProduto(), i.getQuantidade());
            }
        } else {
            System.out.println("A lista esta vazia. Adicione algum produto.\n");
        }
    }
}

    
