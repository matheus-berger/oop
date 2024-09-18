/*
    05. Fazer um algoritmo que leia o valor da aresta(a) de um cubo, 
        calcule e escreva o seu volume e a área da
        superfície.
*/

import java.util.Scanner;

public class seq05 {
    public static void main(String[] args) {
        
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo o valor da aresta
        System.out.println("###############################################");
        System.out.println("### CALCULANDO A ÁREA E O VOLUME DE UM CUBO ###");
        System.out.println("###############################################");

        System.out.print("Insira o valor da aresta do cubo: ");
        float aresta = scanner.nextFloat();

        // Calculando o volume
        double volume = Math.pow(aresta , 3);

        // Calculando a área da superfície
        double areaS = 6 * Math.pow(aresta , 2);

        // Mostrando os resultados para o usuario
        System.out.println("> Volume: " + volume);
        System.out.println("> Área: " + areaS);

        // Fechando o objeto Scanner
        scanner.close();

    }
}
