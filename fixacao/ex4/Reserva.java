
import java.time.LocalDate;

public class Reserva {

    // Atributos
    private Quarto quarto;
    private Cliente cliente;
    private LocalDate dataCheckIn; 
    private LocalDate dataCheckOut;

    // Método Construtor
    public Reserva(Quarto quarto, Cliente cliente, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        this.quarto = quarto;
        this.cliente = cliente;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    // Getters
    public Quarto getQuarto() {
        return quarto;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
}
