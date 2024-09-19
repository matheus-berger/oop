public class Carro {
    
    private String nome;
    private Motor motor;

    public Carro(int potencia, String combustivel, String nome){
        
        this.motor = new Motor(potencia, combustivel);  // instanciando
        this.nome = nome;

    };

    // seria agregação se o motor fosse recebido como parametro no construtor, 
    // fazendo com que o motor existisse fora da classe, sem precisar criar a classe carro para o objeto motor existir
    // neste caso é o contrario, o objeto motor é criado dentro da classe carro, fazendo com que o moto só exista
    // se exisitir o carro
    // 1 classe por arquivo
}
