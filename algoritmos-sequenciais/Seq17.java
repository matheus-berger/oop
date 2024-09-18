/*
    17. Fazer um algoritmo que a partir de um horário (hora,minuto,segundo)
        e uma quantidade de segundos transcorridos; 
        Calcule e escreva o segundo horário;
        Considerar que o horário calculado esteja no mesmo dia no formato de 24 horas.
*/

import java.util.Scanner;

public class Seq17 {
    public static void main(String[] args) {
        
        // Criando objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Recebe o horario
        System.out.println("###########################");
        System.out.println("### CONVERTENDO HORARIO ###");
        System.out.println("###########################");

        System.out.print("Escreva um horario (hh:mm:ss): ");
        String time = scanner.nextLine();

        // Recebe os segundos
        System.out.print("Adicione alguns segundos: ");
        int segs = scanner.nextInt();

        // Convertendo os horarios de String em Int
        int hh = Integer.parseInt(time.substring(0, 2));
        int mm = Integer.parseInt(time.substring(3, 5));
        int ss = Integer.parseInt(time.substring(6, 8));

        // Adiciona os segundos ao horario
        for (int i = 0; i < segs; i++) {
            if (ss < 59) {
                ss++;
            } else {
                ss = 00;
                if (mm < 59) {
                    mm++;
                } else {
                    mm = 00;
                    if (hh < 23) {
                        hh++;
                    } else {
                        hh = 00;
                    }
                }
            }
        }

        // Mostra o novo horario ao usuario
        System.out.print("O horario será: " + hh + ":" + mm + ":" + ss);

        // Fechando objeto Scanner
        scanner.close();

    }
}
