/*
    13a.    Fazer um algoritmo que leia três números, calcule e escreva o maior.
*/

import java.util.Scanner;

public class Seq13a {
    public static void main(String[] args) {

        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo os três numeros
        System.out.println("##################################");
        System.out.println("### DESCOBRINDO O MAIOR NÚMERO ###");
        System.out.println("##################################");

        System.out.print("Insira o número A: ");
        float numA = scanner.nextFloat();
        System.out.print("Insira o número B: ");
        float numB = scanner.nextFloat();
        System.out.print("Insira o número C: ");
        float numC = scanner.nextFloat();

        // Fazendo o calculo
        float maiorAB = ((numA + numB) + (Math.max(numA, numB) - Math.min(numA, numB))) / 2;
        float maiorABC = ((maiorAB + numC) + (Math.max(maiorAB, numC) - Math.min(maiorAB, numC))) / 2;

        // Mostrando o resultado ao usuario
        System.out.println("> Maior Número: " + maiorABC);

        // Fechando objeto Scanner
        scanner.close();
        
    }
}
