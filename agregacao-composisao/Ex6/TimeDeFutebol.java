import java.util.ArrayList;
import java.util.List;

public class TimeDeFutebol {

    // Atributos
    private List<Jogador> jogadores;
    private final int MAX_JOGADORES = 28;

    // Método Construtor
    public TimeDeFutebol(List<Jogador> jogadores) {
        this.jogadores = new ArrayList<>();
        if (jogadores.size() <= MAX_JOGADORES) {
            this.jogadores.addAll(jogadores);
        } else {
            System.out.println("Não foi possível criar o time: o seu time tem mais de 28 jogadores!");
        }
    }

    // Método: Adicionar Jogador
    public void adicionarJogador(Jogador jogador) {
        // Adicionando jogador ao time
        if (jogadores.size() < MAX_JOGADORES) {
            jogadores.add(jogador);
        } else {
            System.out.println("Não foi possível adicionar o jogador: O seu time já possui a quantidade máxima de 28 jogadores!");
        }
    }

    // Método: Remover Jogador
    public Jogador removerJogador(String nome) {
        // Variável para armazenar o jogador removido
        Jogador jogador_removido = null;
        
        // Procurando jogador na lista
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equals(nome)) {
                jogador_removido = jogador;
                jogadores.remove(jogador);
                break; // Sai do loop, já que o jogador foi encontrado e removido
            }
        }
        
        return jogador_removido;
    }

    // Método: Listar Jogadores
    public void listar() {
        for (Jogador jogador : jogadores) {
            System.out.printf("Nome: %s - Posição: %s\n", jogador.getNome(), jogador.getPosisao());
        }
    }
}   
    
