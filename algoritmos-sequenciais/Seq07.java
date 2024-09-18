/*
    07. Fazer um algoritmo que leia três notas de um aluno, 
        calcule e escreva a sua média harmônica ponderada.
        Após desenvolver o algoritmo, verificar o que acontece caso um ou mais valores lidos forem negativos?
*/

import java.util.Scanner;

public class Seq07 {
    public static void main(String[] args) {
        
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo 3 notas
        System.out.println("##############################################");
        System.out.println("### CALCULANDO A MÉDIA HARMÔNICA PONDERADA ###");
        System.out.println("##############################################");

        System.out.print("Insira a 1º nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Insira a 2º nota: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Insira a 3º nota: ");
        float nota3 = scanner.nextFloat();

        // Calculando a média harmônica ponderada
        float mediaHP = 6 / ((1 / nota1) + (2 / nota2) + (3 / nota3));

        // Mostrando o resultado ao usuario
        System.out.print("> Média: " + mediaHP);

        // Fechado objeto Scanner
        scanner.close();

    }
}
