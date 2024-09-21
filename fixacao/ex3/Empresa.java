
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Empresa {
    
    // Atributos
    private ArrayList<Projeto> projetos;

    // Método Construtor
    public Empresa(ArrayList<Projeto> projetos){
        this.projetos = projetos;
    }

    // Método para criar novos projetos
    public void criarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    // Método para alocar funcionarios para projetos
    public void alocarFuncionarioProjeto(Funcionario funcionario, Projeto projeto) {
        for (Projeto i : projetos) {
            if (i == projeto) {
                i.getFuncionarios().add(funcionario);
            }
        }
    }

    // Método para adicionar tarefas a projetos
    public void addTarefa(Projeto projeto, Tarefa tarefa) {
        for (Projeto i : projetos) {
            if (i == projeto) {
                i.getTarefas().add(tarefa);
            }
        }
    }

    // Método para gerar relatorios sobre o progresso sobre cada projeto e a alocação de funcionarios
    public void gerarRelatorio() {
        for (Projeto projeto : projetos) {
            System.out.printf("> Projeto: %s | Duração: %s dias | Numero de Funcionarios: %s\n", projeto.getNome(), ChronoUnit.DAYS.between(projeto.getDataInicio(), LocalDate.now()), projeto.getFuncionarios().size());
        }
    }

}
