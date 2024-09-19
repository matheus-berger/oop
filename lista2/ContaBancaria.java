public class ContaBancaria {
    
    // Caracteristicas
    private String numeroDaConta = "";
    private double saldo = 0.0;
    private Cliente cliente;


    // Construtor
    public ContaBancaria(String numeroDaConta, Cliente cliente) {
        this.numeroDaConta = numeroDaConta;
        this.cliente = cliente;
    }
    
    // Get e Set
    public double getSaldo(){
        return saldo;
    }

    // Métodos 
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente!");
        }
        else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void transferir(double valor, ContaBancaria conta) {
        if (this.saldo < valor) {
            System.out.println("Saldo Insuficiente!");
        } else {
            this.saldo -= valor;
            conta.depositar(valor);
            System.out.println("Trasferencia feita com sucesso!");
        }
    }

}
