/*
 01. Fazer um algoritmo que leia as dimensões dos lados de um retângulo, 
 calcule e escreva a sua área.
*/

import java.util.Scanner;

public class Seq01 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a base do retangulo
        System.out.print("Digite a base do retangulo:\n> ");
        float baseRetangulo = scanner.nextFloat();

        // Solicita ao usuário que digite a altura do retangulo
        System.out.print("Digite a altura do retangulo:\n> ");
        float alturaRetangulo = scanner.nextFloat();

        // Calculando a area do ratangulo (A=b⋅h)
        float areaRetangulo = baseRetangulo * alturaRetangulo;

        // Escreve a area do retangulo para o usuario
        System.out.println("Area do Retangulo: " + areaRetangulo);

        // Fecha o objeto scanner
        scanner.close();
    }    
}
