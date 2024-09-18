/*
    09. Fazer um algoritmo que leia uma temperatura em graus celsius.
        Escreva as temperaturas correspondentes em:
            - graus Fahrenheit
            - Kelvin
            - Rankine
*/

import java.util.Scanner;

public class Seq09 {
    public static void main(String[] args) {
        
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo a temperatura em graus
        System.out.println("###############################");
        System.out.println("### CONVERTENDO TEMPERATURA ###");
        System.out.println("###############################");

        System.out.print("Insira a temperatura em °C: ");
        float temperaturaC = scanner.nextFloat();

        // Convertendo a temperatura
        double temperaturaF = ((180 * temperaturaC) / 100) + 32;
        double temperaturaK = temperaturaC + 273.15;
        double temperaturaRa = temperaturaF + 459.67;

        // Mostrando para o resultado para o usuario
        System.out.println("> Fahrenheit (°F): " + temperaturaF);
        System.out.println("> Kelvin (°K): " + temperaturaK);
        System.out.println("> Rankine (°Ra): " + temperaturaRa);

        // Fechando objeto Scanner
        scanner.close();
    }
}
