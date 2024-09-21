import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    
    // Atributos
    ArrayList<Quarto> quartos;
    ArrayList<Reserva> reservas;

    // Método Construtor
    public Hotel(ArrayList<Reserva> reservas) {

        // Agragando multiplas reservas 
        this.reservas = reservas;

        // Compondo varios quartos:
        quartos = new ArrayList<Quarto>();
        quartos.add(new Quarto(101, "Solteiro", true));
        quartos.add(new Quarto(102, "Casal", true));
        quartos.add(new Quarto(103, "Solteiro", true));
        quartos.add(new Quarto(104, "Solteiro", true));
        quartos.add(new Quarto(105, "Casal", true));
        quartos.add(new Quarto(106, "Família", true));
        quartos.add(new Quarto(107, "Casal", true));
        quartos.add(new Quarto(108, "Solteiro", true));
        quartos.add(new Quarto(109, "Luxo", true));
        quartos.add(new Quarto(110, "Casal", true));
        quartos.add(new Quarto(111, "Solteiro", true));
        quartos.add(new Quarto(112, "Família", true));
        quartos.add(new Quarto(113, "Casal", true));
        quartos.add(new Quarto(114, "Solteiro", true));
        quartos.add(new Quarto(115, "Luxo", true));
        quartos.add(new Quarto(116, "Família", true));
        quartos.add(new Quarto(117, "Casal", true));
        quartos.add(new Quarto(118, "Solteiro", true));
        quartos.add(new Quarto(119, "Luxo", true));
        quartos.add(new Quarto(120, "Família", true));

    }

    // Método para reservar quartos
    public void reservarQuarto(Reserva reserva) {
        reservas.add(reserva);
    }

    // Método para listar quartos disponíveis por tipo
    public void listarQuartosDisponiveis(String tipo) {
        for (Quarto quarto : quartos) {
            if (quarto.getTipo() == tipo) {
                if (quarto.getDisponibilidade() == true) {
                    System.out.println("> Numero: " + quarto.getNumero());
                }
            }
        }
    } 
    
    // Método para cancelar reservas
    public void CancelarReserva(Reserva reserva) {
        for (Reserva i : reservas) {
            if (i == reserva) {
                Quarto quarto = reserva.getQuarto();
                quarto.setDisponibilidade(true);
                reservas.remove(i);
                break;
            }
        }
    }
    
    // Método para e gerar um relatório das reservas futuras.
    public void gerarRelatorios() {
        for (Reserva reserva : reservas) {
            if (reserva.getDataCheckIn().isAfter(LocalDate.now())) {
                System.out.printf("> Cliente %s | Quarto %s | CheckIn %s\n", reserva.getCliente().getNome(), reserva.getQuarto().getNumero(), reserva.getDataCheckIn());
            }
        }
    }
}
