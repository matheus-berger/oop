/*
    01. **Criar uma Classe com Atributos Privados**
        Criar uma classe Carro com atributos privados e métodos públicos de acesso:
            - Crie uma classe Carro com os atributos privados: marca, modelo, ano e preco.
            - Crie métodos get e set para cada atributo.
            - No método setPreco(), adicione uma validação para que o preço não possa ser negativo.
        Dica: Use a palavra-chave private para os atributos e public para os métodos.
*/

public class Main {
    public static void main(String[] args) {
    
        // Criando objetos Carros
        Carro carro1 = new Carro("Jeep", "Compass Sport T270", 2000, 182990.00);
        Carro carro2 = new Carro("Toyama", "Yaris Hatch XL", 2025, 99490.00);
        Carro carro3 = new Carro("Chevrolet", "Tracker 116cv", 2025, 1.00);

        // Testando os Setters
        carro1.setAno(2025);
        carro2.setMarca("Toyota");
        carro3.setModelo("Tracker AT Turbo 116v");
        carro3.setPreco(-119900.00);
        carro3.setPreco(119900.00);

        // Testando os Getters
        System.out.printf("> Carro 1: %s %s %s - R$ %s\n", carro1.getMarca(), carro1.getModelo(), carro1.getAno(), carro1.getPreco());
        System.out.printf("> Carro 2: %s %s %s - R$ %s\n", carro2.getMarca(), carro2.getModelo(), carro2.getAno(), carro2.getPreco());
        System.out.printf("> Carro 3: %s %s %s - R$ %s\n", carro3.getMarca(), carro3.getModelo(), carro3.getAno(), carro3.getPreco());

    }
}
