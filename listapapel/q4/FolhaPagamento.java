public class FolhaPagamento {
    
    private static Funcionario[] funcionarios;

    // Método Construtor
    public FolhaPagamento() {
        funcionarios = new Funcionario[]{
            new Funcionario(1, 160.0f, 25.0f),
            new Funcionario(2, 150.0f, 30.0f),
            new Funcionario(3, 140.0f, 20.0f),
            new Funcionario(4, 170.0f, 22.0f),
            new Funcionario(5, 160.0f, 28.0f),
            new Funcionario(6, 180.0f, 27.0f),
            new Funcionario(7, 150.0f, 26.0f),
            new Funcionario(8, 140.0f, 24.0f),
            new Funcionario(9, 160.0f, 23.0f),
            new Funcionario(10, 170.0f, 22.5f),
            new Funcionario(11, 150.0f, 30.0f),
            new Funcionario(12, 160.0f, 25.5f),
            new Funcionario(13, 180.0f, 29.0f),
            new Funcionario(14, 140.0f, 24.5f),
            new Funcionario(15, 150.0f, 26.5f),
            new Funcionario(16, 170.0f, 23.0f),
            new Funcionario(17, 160.0f, 28.5f),
            new Funcionario(18, 150.0f, 22.0f),
            new Funcionario(19, 160.0f, 25.0f),
            new Funcionario(20, 180.0f, 30.0f),
            new Funcionario(21, 140.0f, 27.0f),
            new Funcionario(22, 150.0f, 28.0f),
            new Funcionario(23, 170.0f, 26.0f),
            new Funcionario(24, 160.0f, 24.0f),
            new Funcionario(25, 150.0f, 25.5f),
            new Funcionario(26, 180.0f, 27.5f),
            new Funcionario(27, 140.0f, 23.5f),
            new Funcionario(28, 150.0f, 29.0f),
            new Funcionario(29, 170.0f, 28.5f),
            new Funcionario(30, 160.0f, 22.5f),
            new Funcionario(31, 150.0f, 24.5f),
            new Funcionario(32, 180.0f, 25.0f),
            new Funcionario(33, 140.0f, 30.0f),
            new Funcionario(34, 150.0f, 27.0f),
            new Funcionario(35, 170.0f, 28.0f),
            new Funcionario(36, 160.0f, 26.0f),
            new Funcionario(37, 150.0f, 22.0f),
            new Funcionario(38, 180.0f, 24.0f),
            new Funcionario(39, 140.0f, 26.5f),
            new Funcionario(40, 150.0f, 29.5f),
            new Funcionario(41, 170.0f, 23.5f),
            new Funcionario(42, 160.0f, 28.0f),
            new Funcionario(43, 150.0f, 24.0f),
            new Funcionario(44, 180.0f, 22.5f),
            new Funcionario(45, 140.0f, 30.5f),
            new Funcionario(46, 150.0f, 27.5f),
            new Funcionario(47, 170.0f, 29.0f),
            new Funcionario(48, 160.0f, 25.0f),
            new Funcionario(49, 150.0f, 28.5f),
            new Funcionario(50, 180.0f, 26.0f)
        };
    }    

    // Método que ordena a array em ordem decrescente
    public static void ordenar() {
        for (int i = 0; i < funcionarios.length; i++) {
            int indiceMaior = i;
            for (int j = i; j < funcionarios.length; j++) {
                if (funcionarios[j].getSalario() > funcionarios[indiceMaior].getSalario()) {
                    indiceMaior = j;
                }
            }
            if (indiceMaior != i) {
                Funcionario aux = funcionarios[i];
                funcionarios[i] = funcionarios[indiceMaior];
                funcionarios[indiceMaior] = aux;
            }
        }
    }

    // Método que exibe as informações do vetor funcionarios
    public static void exibir() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibir();
        }
    }


    // Função main que executa o sistema
    public static void main(String[] args) {

        // Inicializa a classe FolhaPagamento
        new FolhaPagamento();

        // Exibir
        System.out.println("::::::::::::: Lista de Funcionarios ::::::::::::::");
        exibir();

        // Ordenar 
        ordenar();

        // Exibir
        System.out.println("::::::::::::: Lista de Funcionarios (ordenada) ::::::::::::::");
        exibir();
        
    }
}
