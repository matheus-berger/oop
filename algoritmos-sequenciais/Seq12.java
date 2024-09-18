/*
    12. Uma pessoa aplicou um valor em um determinado banco. 
        Fazer um algoritmo que leia o valor inicial aplicado;
        o percentual de juros pago pelo banco (fixo para todos os meses);
        e a quantidade de meses que a pessoa deixou este valor aplicado;
        após calcule e escreva o saldo final desta aplicação.
*/

import java.util.Scanner;

public class Seq12 {
    public static void main(String[] args) {

        // Craindo objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Declarando as variaveis
        double saldoInicial, saldoFinal, juros, aux = 0.0d;
        int meses = 0;

        // Armazenando os valores nas variaveis
        System.out.println("####################################");
        System.out.println("### CALCULADORA DE INVESTIMENTOS ###");
        System.out.println("####################################");

        System.out.print("Insira o valor inicial aplicado: ");
        saldoInicial = scanner.nextDouble();
        System.out.print("Insira o percentual de juros mensal: ");
        juros = scanner.nextDouble();
        System.out.print("Insira a quantidade de meses que o valor ficou aplicado: ");
        meses = scanner.nextInt();

        // Ralizando a esquação
        aux = saldoInicial * (1 + (juros / 100.0));
        saldoFinal = Math.pow(aux, meses);

        // Mostrando o resultado ao usuario:
        System.out.println("> Saldo Final: R$ " + (saldoFinal));

        // Fechando objeto Scanner
        scanner.close();
    }
}