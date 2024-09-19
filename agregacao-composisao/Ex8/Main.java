/*
    08. Crie uma classe Estudante com atributos como nome e matrícula. 
        Em seguida, crie uma classe Escola que agregue uma lista de estudantes. 
        A escola deve ter métodos para matricular e listar os estudantes. 
        A existência de um estudante não deve depender da escola.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Criando lista de estudantes
        ArrayList<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Luiz Inacio Lula da Silva", "0131"));
        estudantes.add(new Estudante("Dilma Vana Rouseff", "0132"));
        estudantes.add(new Estudante("Jair Messias Bolsonaro", "1722"));

        // Criando objeto Escola
        Escola EEEFAntonioMeneghetti = new Escola(estudantes);
        
        // Menu
        int opc = 0;
        while (opc != 4) {
            System.out.println("\n############   GERENCIAMENTO DE ALUNOS   ############\n");
            System.out.println("[ 1 ] - Matricular");
            System.out.println("[ 2 ] - Desmatricular");
            System.out.println("[ 3 ] - Listar");
            System.out.println("[ 4 ] - Sair");
            System.out.print("> ");
            opc = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha residual (corrigindo bug)
            
            if (opc == 1) {
                System.out.println("\n-> Matricula: ");

                // Pegando os dados do novo estudante
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                String matricula = ("00" + (EEEFAntonioMeneghetti.qtdAlunos() + 1));


                // Criando objeto Estudante
                Estudante estudante = new Estudante(nome, matricula);

                // Cadastrando estudante no sistema
                EEEFAntonioMeneghetti.matricula(estudante);
                System.out.printf("Estudante %s de cod. de matrícula %s matriculado!\n", estudante.getNome(), estudante.getMatricula());
            
            } else if (opc == 2) {
                System.out.println("\n-> Desmatricula: ");

                // Pegando os dados do novo funcionario
                System.out.print("Codigo de Matricula: ");
                String codigo_matricula = scanner.nextLine();

                // Demitindo funcionario
                Estudante estudante_desmatriculado = EEEFAntonioMeneghetti.desmatricula(codigo_matricula);
                
                // Verifica se o funcionário foi encontrado e demitido
                if (estudante_desmatriculado != null) {
                    System.out.printf("Estudante %s de cod. de matricula %s, desmatriculado.\n", estudante_desmatriculado.getNome(), estudante_desmatriculado.getMatricula());
                } else {
                    System.out.println("Estudante não encontrado ou não foi possível realizar a desmatricula.");
                }
            
            } else if (opc == 3) {
                System.out.println("\n-> Lista completa de Estudantes: ");

                // Chamando o método
                EEEFAntonioMeneghetti.listar();

            }
        }
        // Mensagem de saída
        System.out.println("\nAté Mais!\n");


        // Fechando objeto Scanner
        scanner.close();

    }

}
