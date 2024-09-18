/*
    16. Fazer um algoritmo que leia dois horários (hora,minuto,segundo); 
        Calcule e escreva quantos segundos transcorreram entre estes dois horários; 
        Considerar que os dois horários estejam no mesmo dia no formato de 24 horas.
*/

import java.util.Scanner;

public class Seq16 {
    public static void main(String[] args) {
        
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo os dois horarios
        System.out.println("############################");
        System.out.println("### CALCULO DE SEGUNDOS ###");
        System.out.println("############################");

        System.out.print("Escreva o primeiro horario (hh:mm:ss): ");
        String time1 = scanner.nextLine();
        System.out.print("Escreva o segundo horario (hh:mm:ss): ");
        String time2 = scanner.nextLine();

        // Tirando os numeros das strings para int
        int hh1 = Integer.parseInt(time1.substring(0, 2));
        int mm1 = Integer.parseInt(time1.substring(3, 5));
        int ss1 = Integer.parseInt(time1.substring(6, 8));

        int hh2 = Integer.parseInt(time2.substring(0, 2));
        int mm2 = Integer.parseInt(time2.substring(3, 5));
        int ss2 = Integer.parseInt(time2.substring(6, 8));

        System.out.println("Horário 1: " + hh1 + ":" + mm1 + ":" + ss1);
        System.out.println("Horário 2: " + hh2 + ":" + mm2 + ":" + ss2);

        // Convertendo horarios para segundos e somando os segundos
        int time1Segs = (hh1 * 3600) + (mm1 * 60) + ss1;
        int time2Segs = (hh2 * 3600) + (mm2 * 60) + ss2;

        // Subtraia os dois totais de segundos
        int intervaloSgs = 0;

        if (time1Segs > time2Segs)  {
            intervaloSgs = time1Segs - time2Segs;
        } else {
            intervaloSgs = time2Segs - time1Segs;
        }

        // Mostrando o resultado para o usuario
        System.out.println("> Total de segundos entre os dois horarios: " + intervaloSgs + "s");

        // Fechando objeto Scanner
        scanner.close();

    }
}
