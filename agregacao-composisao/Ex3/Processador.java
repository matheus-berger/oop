
public class Processador {
    
    // Atributos
    private String nome;
    private int nucleos;
    private String cache;

    // Método Construtor
    public Processador(String nome, int nucleos, String cache) {
        this.nome = nome;
        this.nucleos = nucleos;
        this.cache = cache;
    }

    // Getters
    public String getNome() {
        return nome;
    };

    public int getNucleos() {
        return nucleos;
    };

    public String getCache() {
        return cache;
    }

}