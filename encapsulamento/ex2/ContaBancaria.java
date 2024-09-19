
public class ContaBancaria {
    
    // Atributos privados
    private String titular;
    private double saldo;
    private String numeroConta;

    // Métodos Construtor
    public ContaBancaria(String titular, double saldo, String numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    // Getters e Setters titular
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    // Getters e Setters saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Atenção, o valor inserido não deve ser negativo!");
        }
    }


    // Getters e Setters numeroConta
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }


    // Método Depositar
    public void depositar(double valor) {
        if (valor > 0) {
            double sumValor = getSaldo() + valor;
            setSaldo(sumValor);
        } else {
            System.out.println("O valor deve ser maior que R$ 0.00");
        }
        
    }
    

    // Método sacar
    public void sacar(double valor) {
        if (valor > 0) {
            if (getSaldo() >= valor) {
                double newValor = getSaldo() - valor;
                setSaldo(newValor);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("O valor deve ser maior que R$ 0.00");
        }
    }
}
