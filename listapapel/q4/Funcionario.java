/*
    [?] - Como declarar valores a quantidadeHorasExtras
*/

// Criação da Classe
public class Funcionario {
    
    // Atributos
    private int codigo;
    private float quantidadeHoras;
    private float valorHora;
    private float valorSalario;
    private float quantidadeHorasExtras = 0;

    // Método Construtor
    public Funcionario(int codigo, float quantidadeHoras, float valorHora) {
        this.codigo = codigo;
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
        calcularSalario();
    }

    // Método que calcula o valor das horas extras
    public float calcularHoraExtra() {
       // Calculo do valor de hora extra (50% de acréscimo)
       float valorHoraExtra = (float) (valorHora * 1.5);
       // Calculo das horas extras
       float totalValorHorasExtras = (float) (valorHoraExtra * quantidadeHorasExtras);
       // Retornando resultado ao usuario
       return totalValorHorasExtras;
    }

    // Método que calcula o valor do salário
    public void calcularSalario() {
        this.valorSalario = (float) (valorHora * quantidadeHoras) + calcularHoraExtra();
    }

    // Método que exibe as informações do funcionario
    public void exibir() {
        System.out.println("> Funcionario codigo " + codigo + ":");
        System.out.printf("- Salario: R$ %.2f \n", valorSalario);
        System.out.printf("- Horas Trabalhadas: %.1f hs \n", quantidadeHoras);
        System.out.println();
    }

    // Get e Setters
    public float getSalario() {
        return valorSalario;
    }
}
