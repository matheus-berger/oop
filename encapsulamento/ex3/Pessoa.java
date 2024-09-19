
public class Pessoa {
    
    // Atributos
    private String nome;
    private int idade;
    private String cpf;

    // Método Construtor
    public Pessoa(String nome, int idade, String cpf) {
        if (idade > 0) {
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
        } else {
            System.out.println("Não foi possivel cadastrar a pessoa, a idade deve ser maior que zero. Tente novamente.");
        }
        
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Não foi possivel mudar a idade, a idade inserida deve ser maior que zero.");
        }
    }

    public void mostrarDados() {
        System.out.printf("> Nome: %s - Idade: %s - CPF: %s \n", nome, idade, cpf);
    }
}
