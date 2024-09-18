/*
    03. Fazer um algoritmo que leia as dimensões dos lados de um triângulo (a,b,c), 
    calculando e escrevendo a área do mesmo.
    
*/

import java.util.Scanner;

public class Seq03 {
    public static void main(String[] args) {

        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Lendo as dimensões a, b e c
        System.out.println("#########################################");
        System.out.println("### CALCULANDO A ÁREA DE UM TRIÂNGULO ###");
        System.out.println("#########################################");

        System.out.print("Insira a dimensão a: ");
        float dimA = scanner.nextFloat();
        System.out.print("Insira a dimensão b: ");
        float dimB = scanner.nextFloat();
        System.out.print("Insira a dimensão c: ");
        float dimC = scanner.nextFloat();

        // Calculando o semi perimetro
        float semiPerimetro = (dimA + dimB + dimC) / 2;

        // Calculando a area
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - dimA) * (semiPerimetro - dimB) * (semiPerimetro - dimC));

        // Mostrando a area para o usuario
        System.out.println("> " + area);

        // Fechando o objeto Scanner
        scanner.close();
    }
}
