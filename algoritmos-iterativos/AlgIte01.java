/*
    08. Fazer um algoritmo que leia um número inteiro N;
        Escreva a soma dos N primeiros números inteiros positivos. 
        Exemplo: caso seja lido 10 escreve 55. Veja que 1+2+3+4+5+6+7+8+9+10=55
*/

import java.util.Scanner;

public class AlgIte01 {
    public static void main(String[] args) {
        
        // Cria objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lê um número inteiro N
        System.out.print("Digite um número inteiro: ");
        int numInt = scanner.nextInt();

        // Soma e mostra a soma dos N primeiros numeros inteiros positivos
        long somaN = 0;
        for (int i = 1; i <= numInt; i++) {
            somaN = somaN + i;
        }

        System.out.println("> " + somaN);

        // Fecha objeto Scanner
        scanner.close();

    }

}
