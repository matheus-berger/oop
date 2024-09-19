/*
    01. Crie uma classe Professor com atributos como nome, especialidade. 
        Em seguida, crie uma classe Universidade que agregue uma lista de professores. 
        A classe Universidade deve ter métodos para adicionar e listar os professores. 
        A existência de um professor deve ser independente da universidade.
*/

public class Professor {
    
    // Atributos
    private String nome;
    private String especialidade;

    // Método construtor
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    };

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

}
