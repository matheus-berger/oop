/*
    03. Implemente uma classe Computador que tenha componentes como Processador, Memória e PlacaMãe. 
        Cada componente deve ser uma classe separada, e o Computador deve compor essas classes. 
        Quando o objeto Computador for destruído, os componentes também devem ser destruídos.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Pegando o nome do computador
        System.out.println("\n ############ POLO INDUSTRIAL DE MANAUS - (Fabrica de Eletronicos CCE LTDA.) ############");
        System.out.println("> Montador de Computadores:\n");
        System.out.print("Digite o nome do computador: ");
        String nome = scanner.nextLine();
        
        // Pegando informações do processador
        System.out.println("- Processador:");
        System.out.print("nome: ");
        String nome_processador = scanner.nextLine();
        System.out.print("nucleos: ");
        int nucleos_processador = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha residual (corrigindo bug) 
        System.out.print("cache: ");
        String cache_processador = scanner.nextLine();
         

        // Pegando informações da Memória
        System.out.println("- Memória:");
        System.out.print("nome: ");
        String nome_memoria = scanner.nextLine();
        System.out.print("tamanho: ");
        String tamanho_memoria = scanner.nextLine();
        
        // Pegando informações da Placa Mãe
        System.out.println("- Placa Mãe:");
        System.out.print("nome: ");
        String nome_placa_mae = scanner.nextLine();

        // Criando computador
        Computador computador = new Computador(nome, nome_processador, nucleos_processador, cache_processador, nome_memoria, tamanho_memoria, nome_placa_mae);

        System.out.println("\nCOMPUTADOR MONTADO!\n");

        // Mostrando o computador criando para o usuario
        System.out.printf("Nome: %s\n", computador.getNome());
        System.out.printf("Processador: %s, %s Núcleos, %s Memoria Cache\n", computador.getProcessador().getNome(), computador.getProcessador().getNucleos(), computador.getProcessador().getCache());
        System.out.printf("Memoria: %s %s GB\n", computador.getMemoria().getNome(), computador.getMemoria().getTamanho());
        System.out.printf("Placa Mãe: %s\n", computador.getPlacaMae().getNome());
        System.err.println();

        // Fechando objeto Scanner
        scanner.close();

    }
}
