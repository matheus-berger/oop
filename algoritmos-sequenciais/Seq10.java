/*
    10. Fazer um algoritmo que converta uma temperatura qualquer de graus fahrenheit para celsius.
*/

import java.util.Scanner;

public class Seq10 {
    public static void main(String[] args) {

        // Craindo o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo a temperatura em graus fahrenheit
        System.out.println("########################################");
        System.out.println("### CONVERTENDO TEMPERATURA °F -> °C ###");
        System.out.println("########################################");

        System.out.print("Insira a temperatura em °F: ");
        float temperaturaF = scanner.nextFloat();

        // Convertendo temperatura
        float temperaturaC = ((temperaturaF - 32) * 5) / 9;

        // Mostrando o Resultado para o usuario
        System.out.print("Temperatura em ºC = " + temperaturaC);

        // Fechando o objeto Scanner
        scanner.close();
        
    }
}
