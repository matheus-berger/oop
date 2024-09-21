
public class Viagem {
    
    // Atributos
    private Veiculo veiculo;
    private Motorista motorista;
    private String origem;
    private String destino;
    private double distanciaKM;

    // Método Construtor
    public Viagem(Veiculo veiculo, Motorista motorista, String origem, String destino, double distanciaKM) {
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.origem = origem;
        this.destino = destino;
        this.distanciaKM = distanciaKM;
    }


    // Getters
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }

}
