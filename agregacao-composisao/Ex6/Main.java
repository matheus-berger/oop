/*
    06. Implemente uma classe Jogador com atributos como nome e posição. 
        Em seguida, crie uma classe TimeDeFutebol que agregue uma lista de jogadores. 
        A existência de um jogador não depende do time. 
        Implemente métodos para adicionar e remover jogadores do time.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Criando ArrayList de objetos jogadores
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Cristiano Ronaldo", "Atacante"));
        jogadores.add(new Jogador("Lionel Messi", "Atacante"));
        jogadores.add(new Jogador("Neymar Jr", "Atacante"));
        jogadores.add(new Jogador("Kylian Mbappé", "Atacante"));
        jogadores.add(new Jogador("Kevin De Bruyne", "Meio-campista"));
        jogadores.add(new Jogador("Virgil van Dijk", "Zagueiro"));
        jogadores.add(new Jogador("Mohamed Salah", "Atacante"));
        jogadores.add(new Jogador("Sergio Ramos", "Zagueiro"));
        jogadores.add(new Jogador("Luka Modric", "Meio-campista"));
        jogadores.add(new Jogador("Robert Lewandowski", "Atacante"));
        jogadores.add(new Jogador("Manuel Neuer", "Goleiro"));
        
        // Criando o time
        TimeDeFutebol time = new TimeDeFutebol(jogadores);
        
        // Menu
        int opc = 0;
        while (opc != 4) {
            System.out.println("\n############   GERENCIAMENTO DE JOGADORES   ############\n");
            System.out.println("[ 1 ] - Contratar");
            System.out.println("[ 2 ] - Demitir");
            System.out.println("[ 3 ] - Listar");
            System.out.println("[ 4 ] - Sair");
            System.out.print("> ");
            opc = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha residual (corrigindo bug)
            
            if (opc == 1) {
                System.out.println("\n-> Contratação de Jogador: ");

                // Pegando os dados do novo funcionario
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Posisão: ");
                String posisao = scanner.nextLine();

                // Criando objeto Funcionario
                Jogador jogador = new Jogador(nome, posisao);

                // Cadastrando funcionario na empresa
                time.adicionarJogador(jogador);
                System.out.printf("Jogador %s contratado como %s!\n", jogador.getNome(), jogador.getPosisao());
            
            } else if (opc == 2) {
                System.out.println("\n-> Demição de Jogador: ");

                // Pegando os dados do novo funcionario
                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                // Demitindo funcionario
                Jogador jogador_demitido = time.removerJogador(nome);
                
                // Verifica se o funcionário foi encontrado e demitido
                if (jogador_demitido != null) {
                    System.out.printf("Jogador %s de função %s, demitido!\n", jogador_demitido.getNome(), jogador_demitido.getPosisao());
                } else {
                    System.out.println("Jogador não encontrado ou não foi possível realizar a demissão.");
                }
            
            } else if (opc == 3) {
                System.out.println("\n-> Lista completa dos Funcionarios: ");

                // Chamando o método
                time.listar();

            }
        }
        // Mensagem de saída
        System.out.println("\nAté Mais!\n");

        // Fechando objeto Scanner
        scanner.close();

    }
}
