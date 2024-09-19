/*
    08. Crie uma classe Periferico com atributos como nome e tipo (mouse, teclado, monitor). 
        Depois, crie uma classe Computador que contenha uma lista de periféricos como parte integrante do computador. 
        Ao destruir o objeto Computador, os periféricos também devem ser destruídos.
*/

public class Computador {
    public static void main(String[] args) {
        
        // Perifericos
        Perifericos mouse1 = new Perifericos("Logitech M110", "Mouse com Fio");
        Perifericos mouse2 = new Perifericos("Logitech M280", "Mouse sem Fio");
        Perifericos teclado1 = new Perifericos("Logitech K835 TKL", "Teclado Mecanico com Fio");
        Perifericos teclado2 = new Perifericos("Logitech MX MECHANICAL", "Teclado Mecanico sem Fio");
        Perifericos monitor = new Perifericos("Samsung ViewFinity S9 27\"", "Monitor");
        Perifericos fone = new Perifericos("Sony WH-1000XM5", "Fone sem fio");
        Perifericos microfone = new Perifericos("JBL Quantum Stream Talk", "microfone");
        Perifericos som = new Perifericos("JBL Charge 5", "som");

    }
}
