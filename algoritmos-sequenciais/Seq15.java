/*
    15. Fazer um algoritmo que leia n e escreva o número da sequência de fibonacci correspondente a fib(n).
*/

import java.util.Scanner;

public class Seq15 {
    public static void main(String[] args) {

        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo os três valores
        System.out.println("############################");
        System.out.println("### CALCULO DE FIBONACCI ###");
        System.out.println("############################");

        System.out.print("Escreva um número: ");
        float num = scanner.nextFloat();

        // Fazendo o Calculo de Fibonacci
        float numFib = fib(num);

        // Mostrando o resultado para o usuario
        System.out.printf("Fibonacci de fib(%.0f) = %.0f", num, numFib);

        // Fechando objeto Scanner
        scanner.close();
        
    }

    // Método para descobrir o numero de da sequencia de fibonacci
    public static float fib(float n) {

        double s = (1 + Math.sqrt(5)) / 2;
        float fibN = Math.round(Math.pow(s, n) / Math.sqrt(5)); 

        return fibN;
    }
}
