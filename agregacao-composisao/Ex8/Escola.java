
import java.util.ArrayList;

public class Escola {
    
    // Atributo
    private ArrayList<Estudante> estudantes;

    // Método Construtor
    public Escola(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    // Método: Para descobrir a quantidade de estudantes matriculados
    public int qtdAlunos(){
        return estudantes.size();
    }

    // Método: Matricular Aluno
    public void matricula(Estudante estudante) {
        estudantes.add(estudante);
    }

    // Método: Desmatricular Aluno
    public Estudante desmatricula(String matricula) {
        Estudante estudante_desmatriculado = null;  
        for (Estudante i : estudantes) {
            if (i.getMatricula().equals(matricula)) {
                estudante_desmatriculado = new Estudante(i.getNome(), i.getMatricula());
                estudantes.remove(i);
                break;
            }
        }
        return estudante_desmatriculado;
    }

    // Método: Listar alunos
    public void listar() {
        for (Estudante i : estudantes) {
            System.out.printf("Estudante: %s - Matricula: %s\n", i.getNome(), i.getMatricula());
        }
    }
}
