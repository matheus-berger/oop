/*
    Fazer um algoritmo que leia o valor de dois lados de um triângulo 
    e o ângulo entre estes lados em graus (a,b,α), 
    calcule e escreva a área deste triângulo.
    Área = a.b.sen(α) / 2
    Lembre-se de converter o ângulo de graus para radianos (Π radianos correspondem a 180°).
*/

import java.util.Scanner;

public class seq04 {
    public static void main(String[] args) {

        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo o valor dos dois lados do triangulo e o angulo entre os dois lados
        System.out.println("###################################################");
        System.out.println("### CALCULANDO A ÁREA DE UM TRIÂNGULO COM GRAUS ###");
        System.out.println("###################################################");

        System.out.print("Insira o valor do lado a: ");
        float ladoA = scanner.nextFloat();
        System.out.print("Insira o valor do lado b: ");
        float ladoB = scanner.nextFloat();
        System.out.print("Insira o ângulo entre os dois lados: ");
        float anguloGrau = scanner.nextFloat();

        // Convertendo o ângulo de graus para radianos
        double anguloRad = (anguloGrau * Math.PI) / 180;

        // Calculando a área
        double area = (ladoA * ladoB * Math.sin(anguloRad)) / 2;

        // Mostrando o resultado para o usuario
        System.out.println("> " + area);

        // Fechando o objeto Scanner
        scanner.close();
        
    }
}
