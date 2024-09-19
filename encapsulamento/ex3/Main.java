/*
    03. **Encapsulamento e Modificação Controlada**
            - Controlar o acesso e a modificação de atributos internos.
            - Crie uma classe Pessoa com os atributos privados: nome, idade, e cpf.
            - O CPF deve ser definido uma vez e não pode ser alterado posteriormente.
            - O nome e a idade podem ser modificados através dos métodos setNome() e setIdade(), mas a idade deve sempre ser maior que zero.
            - Adicione um método mostrarDados() que exibe os dados da pessoa.

*/


public class Main {
    
    public static void main(String[] args) {
    
        // Criando os objetos pessoa
        Pessoa pessoa1 = new Pessoa("Aex Nogueira", 27, "123.456.789-10");
        Pessoa pessoa2 = new Pessoa("Beatriz da", 37, "102.201.012-12");
        Pessoa pessoa3 = new Pessoa("Cassio Aves", 47, "101.111.001-11");

        // Testando so métodos
        pessoa1.setNome("Alex Nogueira");
        pessoa2.setNome("Beatriz da Silva");
        pessoa3.setNome("Cassio Alvez");

        pessoa1.setIdade(0);
        pessoa1.setIdade(-10);
        pessoa1.setIdade(37);
        
        pessoa2.setIdade(27);

        pessoa1.mostrarDados();
        pessoa2.mostrarDados();
        pessoa3.mostrarDados();
    }
}
