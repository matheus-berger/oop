/*
    02. **Validação de Entrada de Dados:**
            -   Crie uma classe ContaBancaria com os atributos privados: titular, saldo, e numeroConta.
            -   Crie métodos get e set para todos os atributos.
            -   No método setSaldo(), implemente uma regra que impede que o saldo seja definido como um valor negativo.
            -   Adicione um método depositar(double valor) e outro sacar(double valor) que só permite saques se o saldo for suficiente.
*/

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Craindo array de contas;
        ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
        contas.add(new ContaBancaria("Rui da Silva", 123000.00, "47238"));
        contas.add(new ContaBancaria("Rogerio Manzini", 23000.00, "72340"));
        contas.add(new ContaBancaria("Alexandre de Moraes", 50690.00, "37683"));

        // Acessando uma conta
        ContaBancaria conta = null;
        while (conta == null) {
            System.out.println("\n########## BANCO ABC ##########");
            System.out.println("Digite o número da conta: ");
            System.out.print("> ");
            String numero = scanner.nextLine();
            for (ContaBancaria i : contas) {
                if (i.getNumeroConta().equals(numero)) {
                    conta = i;
                    break;
                }
            } 
            if (conta == null) {
                System.out.println("Conta não encontrada!");
            }
        }
        
        // Menu
        int opc = 0;
        while (opc != 4) {
            System.out.println("\n########## BANCO ABC ##########");
            System.out.printf("-> Bem vindo, %s! Escolha uma opção: \n", conta.getTitular());
            System.out.println("[ 1 ] - Ver Saldo");
            System.out.println("[ 2 ] - Sacar");
            System.out.println("[ 3 ] - Depositar");
            System.out.println("[ 4 ] - Sair");
            System.out.print("> ");
            opc = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha residual (corrigindo bug)


            if (opc == 1) { // Mostrar saldo da conta
                
                System.out.println("-> Ver saldo");
                System.out.printf("Seu saldo é de R$ %s\n", conta.getSaldo());

            } else if (opc == 2) { // Sacar dinheiro

                // Pegando os dados do usuario
                System.out.println("-> Saque");
                System.out.println("Digite o valor que deseja sacar.");
                System.out.print("> R$ ");
                double valor = scanner.nextDouble();

                // Chamando o método sacar() 
                conta.sacar(valor);
                

            } else if (opc == 3) { // Depositar dinheiro

                // Pegando os dados do usuario
                System.out.println("-> Deposito");
                System.out.println("Digite o valor que deseja depositar.");
                System.out.print("> R$ ");
                double valor = scanner.nextDouble();

                // Chamando o método depositar() 
                conta.depositar(valor);

            } else {
                
                if (opc != 4) { 
                    System.out.println("Opção Invalida!");
                }
            }
        } 
        System.out.println("Até logo!\n");
        conta = null;
        opc = 0;

        // Fechando objeto scanner
        scanner.close();
    }
}
