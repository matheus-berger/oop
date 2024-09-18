/*
    06. Fazer um algoritmo que leia três notas de um aluno, 
        calcule e escreva a sua média aritmética conforme equação.
*/

import java.util.Scanner;

public class Seq06 {
    public static void main(String[] args) {
        
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Lendo as 3 notas
        System.out.println("####################################");
        System.out.println("### CALCULANDO MÉDIA ARITIMETICA ###");
        System.out.println("####################################");

        System.out.print("Insira a 1º nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Insira a 2º nota: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Insira a 3º nota: ");
        float nota3 = scanner.nextFloat();

        // Calculando o média aritimetica
        float mediaA = (nota1 + nota2 + nota3) / 3; 

        // Mostrando a média para o usuario
        System.out.print("> Média: " + mediaA);

        // Fechando o objeto Scanner
        scanner.close();

    }
}
