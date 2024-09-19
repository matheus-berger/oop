
import java.util.ArrayList;
import java.util.Scanner;

public class MainBanco {

    static ArrayList<Cliente> usuarios = new ArrayList<Cliente>();
    static ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

    public static void main(String[] args) {

        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Menu
        while (true) {

            int opcMenu1 = 0;

            // Mostrar Menu
            System.out.println("\n:::::::::: AMF Bank ::::::::::");
            System.out.println("Bem vindo! Escolha uma opção:\n");
            System.out.println("[ 1 ] - Entrar Para o Banco");
            System.out.println("[ 2 ] - Entrar na Sua Conta");
            System.out.println("[ 3 ] - Sair");
            System.out.print("> ");
            opcMenu1 = scanner.nextInt();
            
            // Consumir o '/n' restante 
            scanner.nextLine();

            // Cadastro
            if (opcMenu1 == 1) {
                
                // Pegando os dados do usuario
                System.out.print("\n[ Cadastro ]\n");
                System.out.print("_____________________________\n");

                System.out.print("\n> Digite seu nome: ");
                String nomeCadastro = scanner.nextLine();

                System.out.print("> Digite seu CPF: ");
                String cpfCadastro = scanner.nextLine();

                System.out.print("> Digite seu Endereço: ");
                String enderecoCadastro = scanner.nextLine();

                // Fazendo o cadastro
                cadastro(nomeCadastro, cpfCadastro, enderecoCadastro);

            // Login
            } if (opcMenu1 == 2) {

                // Pegando os dados do usuario
                System.out.print("\n[ Entre na Sua Conta ]\n");
                System.out.print("_____________________________\n");
                System.out.println("Digite o numero da conta:");
                System.out.print(">");
                String numeroContaInserida = scanner.nextLine();

                String conta = entrar(numeroContaInserida);
                if (conta == true) {
                    while (true) {
                        
                        int opcMenu2;

                        System.out.println("[ 1 ] - Deposito");
                        System.out.println("[ 2 ] - Transferencia");
                        System.out.println("[ 3 ] - Extrato");
                        System.out.println("[ 4 ] - Voltar");
                        System.out.println("> ");
                        opcMenu2 = scanner.nextInt();

                        if (opcMenu2 == 4) {
                            break;
                        } if (opcMenu2 == 1) {
                            deposito();
                        } if (opcMenu2 == 2) {
                            trasnferencia();
                        } if (opcMenu2 == 3) {
                            extrato();
                        }

                    }
                } else {
                    System.out.println("Conta não encontrada!");
                }
            // Voltar
            } if (opcMenu1 == 3) {
                System.out.println("Até mais! :)\n");
                break;
            }
            
        };

        /*
        Cliente cliente1 = new Cliente("João", "12345678900", "Rua Abcd, nº 123");
        Cliente cliente2 = new Cliente("Maria", "09876543211", "Rua Abcd, nº 321");

        ContaBancaria conta1 = new ContaBancaria("0001", cliente1);
        ContaBancaria conta2 = new ContaBancaria("0002", cliente2);

        conta1.depositar(1000.00);
        conta1.transferir(200.00, conta2);

        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());
        */

        // Fechando objeto Scanner
        scanner.close();

        
    }

    // Método de Cadastro
    static void cadastro(String nome, String cpf, String endereco) {
        
        boolean encontrado = false;

        // Verificar se o CPF já está cadastrado
        for (Cliente i : usuarios) {
            if (i.getCpf().equals(cpf)) {  // Usando equals() para comparar strings
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.err.println("\nCPF já cadastrado!\n");
        } else {
            
            // Criando objeto cliente
            Cliente cliente = new Cliente(nome, cpf, endereco);
            usuarios.add(cliente);

            // Criando objeto conta
            String numero = "000" + usuarios.size();
            ContaBancaria conta = new ContaBancaria(numero, usuarios.get(usuarios.size()-1));
            contas.add(conta);
            
            // Mostrando resultado para o usuario
            System.out.printf("\nCadastro Realizado! Bem-vindo ao AMF Bank, %s!\n", nome);
            System.out.printf("O número da sua conta é %s!\n", numero);
        }
    }

    static Conta entrar(String conta) {
        
        for (ContaBancaria i : contas)
    }

    static void deposito(){
        System.out.println("Deposito Realizado");
    }

    static void trasnferencia(){
        System.out.println("Transferencia Realizada");
    }

    static void extrato(){
        System.out.printf("Saldo na Conta: \n");
    }
}
