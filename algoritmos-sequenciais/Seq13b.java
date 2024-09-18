/*
    13b.    Fazer um algorito para determinar o menor de quatro números.
*/

import java.util.Scanner;

public class Seq13b {
    public static void main(String[] args) {
        
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo os 4 valores
        System.out.println("##################################");
        System.out.println("### DESCOBRINDO O MENOR NÚMERO ###");
        System.out.println("##################################");

        System.out.print("Insira o número A: ");
        float numA = scanner.nextFloat();
        System.out.print("Insira o número B: ");
        float numB = scanner.nextFloat();
        System.out.print("Insira o número C: ");
        float numC = scanner.nextFloat();
        System.out.print("Insira o número D: ");
        float numD = scanner.nextFloat();

        // Descobrindo o maior valor entre os 4
        float menorAB = ((numA + numB) - (Math.max(numA, numB) - Math.min(numA, numB))) / 2;
        float menorCD = ((numC + numD) - (Math.max(numC, numD) - Math.min(numC, numD))) / 2;
        float menorABCD = ((menorAB + menorCD) - (Math.max(menorAB, menorCD) - Math.min(menorAB, menorCD))) / 2;

        // Mostrando o maior para o usuario
        System.out.println("> Menor Número: " + menorABCD);

        // Fechando objeto Scanner
        scanner.close();

    }
}
