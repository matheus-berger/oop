
import java.util.ArrayList;

public class Frota {
    
    // Atributos
    ArrayList<Viagem> viagens;
    ArrayList<Veiculo> veiculos;
    
    // Método Construtor
    public Frota(ArrayList<Viagem> viagens) {
        
        // Agregando multiplas viagens
        this.viagens = viagens;
        
        // Compondo varios veiculos
        veiculos = new ArrayList<Veiculo>();
        this.veiculos.add(new Veiculo("Scania R450", "30 toneladas", "ABC3F67"));
        this.veiculos.add(new Veiculo("Volvo FH16", "40 toneladas", "XYZ9J12"));
        this.veiculos.add(new Veiculo("Mercedes-Benz Actros 2651", "32 toneladas", "KLM2D45"));

    }

    // Método adicionar viagens
    public void registrarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    // Método adicionar veiculos
    public void addVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    // Metodo para listar viagens feitas por veiculo especifico
    public void listarViagensVeiculo(Veiculo veiculo) {
        for (Viagem viagem : viagens) {
            if (viagem.getVeiculo().equals(veiculo)) {
                System.out.printf("> Origem: %s | Destino: %s | Distância(Km): %s | Motorista: %s\n", viagem.getOrigem(), viagem.getDestino(), viagem.getDistanciaKM(), viagem.getMotorista().getNome());
            }
        }
    }

    // Método para calcular a quilometragem total da frota
    public double quilometragemTotalFrota() {
        double somaTotal = 0;
        for (Viagem viagem : viagens) {
            somaTotal += viagem.getDistanciaKM();
        }
        return somaTotal;
    }
}
