/*
    04. **Encapsulamento com Lógica de Negócio**
            - Aplicar lógica de negócios dentro de métodos setters e getters.
            - Crie uma classe Produto com os atributos privados: nome, quantidadeEstoque e preco.
            - Crie métodos get e set para todos os atributos, mas a quantidade em estoque só pode ser atualizada por um método adicionarEstoque(int quantidade) e vender(int quantidade).
            - Adicione validações para impedir que a quantidade no estoque fique negativa e para garantir que o preço não seja zero ou negativo.

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Craindo array de contas;
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("oBoticario Arbo", 10, 205));
        produtos.add(new Produto("oBoticario Coffee Woman", 15, 299));
        produtos.add(new Produto("oBoticario Coffe Man Lucky", 5, 289));
        
        // Menu
        int opc = 0;
        while (opc != 5) {
            System.out.println("\n########## Doce Mel Cosméticos ##########");
            System.out.println("[ 1 ] - Ver Produtos");
            System.out.println("[ 2 ] - Editar");
            System.out.println("[ 3 ] - Adicionar");
            System.out.println("[ 4 ] - Vender");
            System.out.println("[ 5 ] - Sair");
            System.out.print("> ");
            opc = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha residual (corrigindo bug)


            if (opc == 1) { // Mostrar lista de produtos
                
                System.out.println("-> Ver Produtos");
                for (Produto i : produtos) {
                    System.out.printf("> %s - Estoque: %s - Preço: %s\n", i.getNome(), i.getQuantidadeEstoque(), i.getPreco());
                }
                
            } else if (opc == 2) { // Edição de produtos

                // Pegando os dados do usuario
                System.out.println("-> Editar produtos");
                System.out.println("Digite o nome do produto: ");
                System.out.println("Precione 0 para voltar.");
                System.out.print(">  ");
                String nomeProduto = scanner.nextLine();
                Produto produtoEditar = null;
                
                if (nomeProduto != "0") {
                    for (Produto i : produtos) {
                        if (i.getNome().equals(nomeProduto)) {
                            produtoEditar = i;
                            int opc2 = 0;
                            while (opc2 != 4) {
                                System.out.println("\n-> Menu de edição");
                                System.out.println("[ 1 ] - Editar nome");
                                System.out.println("[ 2 ] - Editar preco");
                                System.out.println("[ 3 ] - Excluir");
                                System.out.println("[ 4 ] - Voltar");
                                System.out.print("> ");
                                opc2 = scanner.nextInt();
                                scanner.nextLine();
    
                                if (opc2 == 1) {
                                    System.out.println("> Digite o novo nome: ");
                                    String novoNome = scanner.nextLine();
                                    i.setNome(novoNome);
                                    System.out.println("Nome atualizado!\n");
                                } else if (opc2 == 2) {
                                    System.out.println("> Digite o novo preço: ");
                                    double novoPreco = scanner.nextDouble();
                                    i.setPreco(novoPreco);
                                } else if (opc2 == 3) {
                                    produtos.remove(i);
                                    System.out.println("Produto deletado!");
                                    break;
                                } else {
                                    if (opc2 != 4) {
                                        System.out.println("Opção invalida!");
                                    }
                                }
                            }
                            break;
                        }
                    } 
                    if (produtoEditar == null) {
                        System.out.println("Produto não encontrado!");
                    }
                } else {
                    opc = 0;
                }
                
            } else if (opc == 3) { // Adicionar um produto

                // Pegando os dados do usuario
                System.out.println("-> Adicionar produto");
                System.out.print("Digite o nome do produto: ");
                String novoProdutoNome = scanner.nextLine();
                System.out.print("Digite a quantidade: ");
                int novoProdutoQuantidade = scanner.nextInt();
                System.out.print("Dogite o valor: R$ ");
                double novoProdutovalor = scanner.nextDouble();

                // Adicionando o novo produto a lista de produtos
                Produto novoProduto = new Produto(novoProdutoNome, novoProdutoQuantidade, novoProdutovalor);
                produtos.add(novoProduto);

            } else if (opc == 4) { // Vender Produto
                
                // Pegando os dados do usuario
                System.out.println("-> Venda:");
                System.out.print("Digite o nome do produto: ");
                String nomeProduto = scanner.nextLine();
                System.out.print("Digite a quantidade: ");
                int quantidadeProduto = scanner.nextInt();

                // Procurando produto na lista
                boolean encontrado = false;
                for (Produto i : produtos) {
                    if (i.getNome().equals(nomeProduto)) {
                        i.vender(quantidadeProduto);
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado == false) {
                    System.out.println("Produto não encontrado!");
                }
            } else {
                if (opc != 5) { 
                    System.out.println("Opção Invalida!");
                }
            }
        } 
        System.out.println("Até logo!\n");

        // Fechando objeto scanner
        scanner.close();
    }
}
