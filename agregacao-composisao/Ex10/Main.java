/*
    10. Implemente uma classe Pedido com atributos como produto e quantidade. 
        Depois, crie uma classe Cliente que agregue uma lista de pedidos. 
        A existência de um pedido deve ser independente do cliente. 
        Implemente métodos para adicionar e listar os pedidos de um cliente.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Lista de Pedidos
        ArrayList<Pedido> listaDePedidos = new ArrayList<>();;
       

        // Pegando os dados do usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n############ LISTA DE PEDIDOS ##########");
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        Cliente cliente = new Cliente(nome, listaDePedidos);
        System.out.println("\n");

        int opc = 0;
        while (opc != 4) {
            System.out.printf("\n############ Lista de Pedidos de %s ############\n", cliente.getNome());
            System.out.printf("Bem vindo %s! Escolha uma opção: \n", cliente.getNome());
            System.out.println("[ 1 ] - Adicionar Produto");
            System.out.println("[ 2 ] - Remover Produto");
            System.out.println("[ 3 ] - Mostrar Lista");
            System.out.println("[ 4 ] - Finalizar");
            System.out.print("> ");
            opc = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha residual (corrigindo bug)

            if (opc == 1) {
                // Adicionar produto a lista
                String nome_produto;
                int quantidade_produto;
                System.out.println("\n -> Adicione um produto");
                System.out.print("produto: ");
                nome_produto = scanner.nextLine();
                System.out.print("quantidade: ");
                quantidade_produto = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha residual

                Pedido produto = new Pedido(nome_produto, quantidade_produto);

                cliente.adicionarPedido(produto);

            } else if (opc == 2) {
                // Remover um produto da lista
                String nome_produto;
                System.out.println("\n -> Remova um produto");
                System.out.printf("produto: ");
                nome_produto = scanner.nextLine();

                Pedido produto_removido = cliente.removerPedido(nome_produto);
                if (produto_removido != null) {
                    System.out.printf("Produto %s de quantidade %s removido!", produto_removido.getProduto(), produto_removido.getQuantidade());
                } else {
                    System.out.println("Produto não encontrado na lista ou não é possivel remove-lo!");
                }
                

            } else if (opc == 3) {
                System.out.println("\n -> Lista de Pedidos");
                cliente.mostrarLista();
            }
        } 
        System.out.println("\nPedido Finalizado!");
        

        scanner.close();
        
        

    }
}
