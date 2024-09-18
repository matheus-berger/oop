/*
    14. Fazer um algoritmo que leia três valores (a,b,c), 
        calcula e escreve a média aritmética ponderada destes valores, 
        considerando peso 4 para o maior dos três valores e 3 para os outros dois valores.
*/

import java.util.Scanner;

public class Seq14 {
    
    public static void main(String[] args) {
        
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo os três valores
        System.out.println("######################################");
        System.out.println("### MÉDIA ARITIMÉTICA DE 3 VALORES ###");
        System.out.println("######################################");

        float nums[] = {0, 0, 0};

        System.out.print("Insira o número A: ");
        nums[0] = scanner.nextFloat();
        System.out.print("Insira o número B: ");
        nums[1] = scanner.nextFloat();
        System.out.print("Insira o número C: ");
        nums[2] = scanner.nextFloat();

        // Descobrindo o maior valor
        float numM = maior(nums[0], nums[1], nums[2]);
        
        // Descobrindo o menor valor
        float v2 = menor(nums[0], nums[1], nums[2]);

        // Descobrindo o valor mediano
        float v1 = 0;

        for (float i : nums) {
            if (i < numM && i > v2){
                v1 = i;
            }
        }

        // Calculando a média aritimética
        double media = ((numM * 4) + (v1 * 3) + (v2 * 3)) / (4 + 3 + 3);

        // Mostrando o resultado para o usuario
        System.out.printf("> Média Aritimética: %.1f", media);

        // Fechando objeto Scanner
        scanner.close();

    }

    // Método para ver o maior valor entre três valores
    public static float maior(float numA, float numB, float numC) {
        
        float maiorAB = ((numA + numB) + (Math.max(numA, numB) - Math.min(numA, numB))) / 2;
        float maiorABC = ((maiorAB + numC) + (Math.max(maiorAB, numC) - Math.min(maiorAB, numC))) / 2;

        return maiorABC;
    }

    // Método para ver o menor valor entre os três valores
    public static float menor(float numA, float numB, float numC) {
        
        float menorAB = ((numA + numB) - (Math.max(numA, numB) - Math.min(numA, numB))) / 2;
        float menorABC = ((menorAB + numC) - (Math.max(menorAB, numC) - Math.min(menorAB, numC))) / 2;

        return menorABC;
    }

}
