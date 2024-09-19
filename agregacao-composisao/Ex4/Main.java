/*
    04. Implemente uma classe Funcionario com atributos como nome e cargo. 
        Crie uma classe Empresa que agregue uma lista de funcionários. 
        Implemente métodos na Empresa para contratar e demitir funcionários, e listar todos os funcionários. 
        A existência de um funcionário deve ser independente da empresa.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Criando lista de objetos Funcionarios
        ArrayList<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(
            new Funcionario("Abdner Souza", "CEO"),
            new Funcionario("Casio Joaquim", "CFO"),
            new Funcionario("Basilio Moreira", "CTO")
            ));

        // Criando objeto Empresa
        Empresa empresa = new Empresa(funcionarios);

        // Menu
        int opc = 0;
        while (opc != 4) {
            System.out.println("\n############   GERENCIAMENTO DE FUNCIONARIOS   ############\n");
            System.out.println("[ 1 ] - Contratar");
            System.out.println("[ 2 ] - Demitir");
            System.out.println("[ 3 ] - Listar");
            System.out.println("[ 4 ] - Sair");
            System.out.print("> ");
            opc = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha residual (corrigindo bug)
            
            if (opc == 1) {
                System.out.println("\n-> Contratação de Funcionario: ");

                // Pegando os dados do novo funcionario
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Cargo: ");
                String cargo = scanner.nextLine();

                // Criando objeto Funcionario
                Funcionario funcionario = new Funcionario(nome, cargo);

                // Cadastrando funcionario na empresa
                empresa.contratacao(funcionario);
                System.out.printf("Funcionario %s contratado como %s!\n", funcionario.getNome(), funcionario.getCargo());
            
            } else if (opc == 2) {
                System.out.println("\n-> Demição de Funcionario: ");

                // Pegando os dados do novo funcionario
                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                // Demitindo funcionario
                Funcionario funcionario_demitido = empresa.demicao(nome);
                
                // Verifica se o funcionário foi encontrado e demitido
                if (funcionario_demitido != null) {
                    System.out.printf("Funcionario %s de função %s, demitido!\n", funcionario_demitido.getNome(), funcionario_demitido.getCargo());
                } else {
                    System.out.println("Funcionario não encontrado ou não foi possível realizar a demissão.");
                }
            
            } else if (opc == 3) {
                System.out.println("\n-> Lista completa dos Funcionarios: ");

                // Chamando o método
                empresa.listar();

            }
        }
        // Mensagem de saída
        System.out.println("\nAté Mais!\n");
    }
}
