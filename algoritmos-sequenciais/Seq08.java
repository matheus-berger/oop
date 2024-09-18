/*
    08. Fazer um algoritmo que leia as duas primeiras notas de um aluno
        calcule qual o valor mínimo da terceira nota para que este aluno seja aprovado 
        considerando média harmônica 6.
*/

import java.util.Scanner;

public class Seq08 {
    public static void main(String[] args) {
     
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Recebendo as duas primeiras notas
        System.out.println("#####################################################################");
        System.out.println("### DESCOBRINDO O VALOR MÍNIMO DA TERCEIRA NOTA PARA SER APROVADO ###");
        System.out.println("#####################################################################");

        System.out.print("Insira a 1º nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Insira a 2º nota: ");
        float nota2 = scanner.nextFloat();

        // Calculando o valor mínimo da terceira nota
        double minNota3 = 1 / (0.5 - ((1 / nota1) + (1 / nota2)));

        // Mostrando o resultado para o usuario
        System.out.println("> Nota Mínima: " + minNota3);

        // Fechando objeto Scanner
        scanner.close();
        
    }
}
