/*
    02. Fazer um algoritmo que leia as dimensões da base e da altura de um triângulo, 
    calcule e escreva a sua área.
    Área = (base * altura) / 2
*/

import java.util.Scanner;

public class Seq02 {
    public static void main(String[] args) {

        // Cria o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lê a base do triângulo
        System.out.print("Digite a base do triângulo: \n>");
        float baseTriangulo = scanner.nextFloat();

        // Lê a altura do triângulo
        System.out.print("Digite a altura do triângulo: \n>");
        float alturaTriangulo = scanner.nextFloat();

        // Calcula a área do triângulo
        float areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

        // Mostra a área do triângulo para o usuario
        System.err.println("A área do Triângulo é = " + areaTriangulo);

        // Fecha o objeto Scanner
        scanner.close();

    }
}
