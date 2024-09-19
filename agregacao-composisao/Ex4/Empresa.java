import java.util.ArrayList;

public class Empresa {
    
    // Atributos 
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    // Método Construtor
    public Empresa(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }


    // Método: para contratar funcionario
    public void contratacao(Funcionario funcionario) {

        // Adicionando funcionario a lista de funcionarios
        funcionarios.add(funcionario);
    }


    // Método: para demitir funcionario
    public Funcionario demicao(String nome) {
        
        // Variavel para armazenar os dados do funcionario demitido
        Funcionario funcionario_demitido = null;
        
        // Procurando funcionario na lista
        for (Funcionario i : funcionarios) {
            if (i.getNome().equals(nome)) {
                funcionario_demitido = i;
                funcionarios.remove(i); // Removendo funcionario da lista
                break;
            }
        }

        return funcionario_demitido;
    }


    // Método: para listar os funcionarios
    public void listar() {
        for (Funcionario i : funcionarios) {
            System.out.printf("Nome: %s - Cargo: %s\n", i.getNome(), i.getCargo());
        }
    }
}
