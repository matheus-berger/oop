
public class Computador {
    
    // Atributos
    private String nome;
    private Processador processador;
    private Memoria memoria;
    private PlacaMae placamae;

    // Método Construtor
    public Computador(String nome, String nome_processador, int nucleos_processador, String cache_processador, String nome_memoria, String tamanho_memoria, String nome_placa_mae) {
        this.nome = nome;
        this.processador = new Processador(nome_processador, nucleos_processador, cache_processador);
        this.memoria = new Memoria(nome_memoria, tamanho_memoria);
        this.placamae = new PlacaMae(nome_placa_mae);
    }

    // Getters
    public String getNome() {
        return nome;
    };

    public Processador getProcessador() {
        return processador;
    };

    public Memoria getMemoria() {
        return memoria;
    };

    public PlacaMae getPlacaMae() {
        return placamae;
    };

}
