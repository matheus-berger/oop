/*
    11. Fazer um algoritmo que leia as coordenadas de dois pontos no plano cartesiano. 
        Calcule e escreva a distância entre eles.
*/

import java.util.Scanner;

public class Seq11 {
    public static void main(String[] args) {
        
        // Craindo o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo os dois pontos do plano cartesiano
        System.out.println("##########################################");
        System.out.println("### MEDINDO A DISTANCIA DE DOIS PONTOS ###");
        System.out.println("##########################################");

        int[] cordenadasX = {0 , 0};
        int[] cordenadasY = {0 , 0};

        System.out.println("De as cordenadas de x:");
        System.out.print("> x1: ");
        cordenadasX[0] = scanner.nextInt();
        System.out.print("> x2: ");
        cordenadasX[1] = scanner.nextInt();

        System.out.println("De as cordenadas de y:");
        System.out.print("> y1: ");
        cordenadasY[0] = scanner.nextInt();
        System.out.print("> y2: ");
        cordenadasY[1] = scanner.nextInt();

        // Calculando a distancia entre eles
        double distancia = Math.sqrt(Math.pow((cordenadasX[1] - cordenadasX[0]), 2) + Math.pow((cordenadasY[1] - cordenadasY[0]), 2));

        // Mostrando o resultado para o usuario
        System.out.println("RESULTADO = " + distancia);
        
        // Fechando o objeto Scanner
        scanner.close();

    }
}
