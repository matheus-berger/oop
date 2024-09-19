import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Criando lista de professores com professores
        ArrayList<Professor> professores = new ArrayList<Professor>(Arrays.asList(
            new Professor("Josefina", "Historia"),
            new Professor("João", "Matematica"),
            new Professor("Rodrigo", "Educação Fisica")
        ));

        // Craindo objeto Universidade
        Universidade universidade = new Universidade(professores);

        // Menu
        int opc = 0;
        while (opc != 3) {
            System.out.println("\n########## MENU DE PROFESSORES ##########");
            System.out.println("[ 1 ] - Adicionar Professores");
            System.out.println("[ 2 ] - Listar Professores");
            System.out.println("[ 3 ] - Sair");
            System.out.print("> ");
            opc = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha residual (corrigindo bug)

            if (opc == 1) {
                
                // Pegando os dados do usuario
                System.out.print("Digite o nome do professor: ");
                String nome = scanner.nextLine();

                System.out.print("Digite sua especialidade: ");
                String especialidade = scanner.nextLine();

                // Adicionando o professor a Universidade
                Professor professor = new Professor(nome, especialidade);
                universidade.setProfessor(professor);

                // Confirmando adição ao usuario:
                System.out.println("Professor cadastrado na universidade com sucesso!");

            } else if (opc == 2) {

                // Listando os professores
                System.out.println("--- Lista dos Professores ---");
                universidade.show();

            } else {
                
                if (opc != 3) {
                    System.out.println("Opção Invalida!");
                }

            }
        } 
        System.out.println("Programa finalizado. Até logo!\n");

        // Fechando objeto Scanner
        scanner.close();
        
    }
}
