
import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDate;


public class Projeto {
    
    // Atributos
    private String nome;
    private LocalDate dataInicio;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Tarefa> tarefas;
    
    // Método Construtor
    public Projeto(String nome, LocalDate dataInicio, ArrayList<Funcionario> funcionarios) {

        this.nome = nome;
        this.dataInicio = dataInicio;

        // Agregando multiplos funcionarios
        this.funcionarios = funcionarios;
        
        // Compondo varias tarefas
        tarefas = new ArrayList<Tarefa>();
        tarefas.add(new Tarefa( 
            "Design da Interface do Usuário", 
            "Criar os layouts e protótipos das telas do software, definindo a aparência e a disposição dos elementos da interface com o usuário.", 
            Duration.ofDays(14), // 2 semanas
            "Em andamento"
        ));
        tarefas.add(new Tarefa(
            "Implementação do Backend", 
            "Desenvolver a lógica do servidor, bancos de dados e APIs necessárias para o funcionamento do software.", 
            Duration.ofDays(28), // 4 semanas
            "Novo"
        ));
        tarefas.add(new Tarefa(
            "Testes de Funcionalidade", 
            "Realizar testes para garantir que todas as funcionalidades do software estejam operando conforme esperado.", 
            Duration.ofDays(21), // 3 semanas
            "Concluído"
        ));
    }

    // Getters
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }
    
}
