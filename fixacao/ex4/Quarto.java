
public class Quarto {

    // Atributos
    private int numero;
    private String tipo; 
    private boolean disponibilidade;

    // Método Construtor
    public Quarto(int numero, String tipo, boolean disponibilidade) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponibilidade = disponibilidade;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    // Setters
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

}
