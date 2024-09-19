/*
    01. Crie uma classe Professor com atributos como nome, especialidade. 
        Em seguida, crie uma classe Universidade que agregue uma lista de professores. 
        A classe Universidade deve ter métodos para adicionar e listar os professores. 
        A existência de um professor deve ser independente da universidade.
*/

import java.util.ArrayList;

public class Universidade {
    
    // Atributos
    private ArrayList<Professor> professores;

    // Método construtor
    public Universidade(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    // Método para adicionar professor a lista
    public void setProfessor(Professor professor) {
        professores.add(professor);

    }

    // Método para listar os professores da lista
    public void show() {
        for (Professor i : professores)
        System.out.printf("> %s - Especialidade: %s\n", i.getNome(), i.getEspecialidade());
    }

}

