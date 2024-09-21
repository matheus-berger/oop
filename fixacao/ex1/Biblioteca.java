
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Biblioteca {
    
    // Atributos
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    // Método Construtor
    public Biblioteca(ArrayList<Livro> livros, ArrayList<Emprestimo> emprestimos) {
        this.livros = livros;
        this.emprestimos = emprestimos;
    }

    // Adicionar novo livro
    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    // Registrar emprestimo
    public void addEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    // Criar a função Listar livros  emprestados
    public void listarLivrosEmprestado() {
        
        // Percorrendo cada empretimo em emprestimos
        for (Emprestimo emprestimo : emprestimos) {
            
            // Acessando o livro do emprestimo
            Livro livro = emprestimo.getLivro();

            // Printando as informações do livro
            System.out.printf("> Titulo: %s | Autor %s | ISBN %s \n", livro.getTitulo(), livro.getAutor(), livro.getISBN());
        }
    }

    // Criar a função livros disponiveis
    public void listarLivrosDisponiveis() {
        for (Livro livro : livros) {
            boolean emprestimoEncontrado = false;
            for (Emprestimo emprestimo : emprestimos) {
                if (livro == emprestimo.getLivro()) {
                    emprestimoEncontrado = true;
                    break;
                }
            }
            if (emprestimoEncontrado == false) {
                System.out.printf("> Titulo: %s | Autor %s | ISBN %s \n", livro.getTitulo(), livro.getAutor(), livro.getISBN());
            }
        }
    }

    // Calcular multas
    public void calcularMultas() {

        // Pegando a data de hoje
        LocalDate dataDeHoje = LocalDate.now();

        // Analisando todos os emprestimos
        for (Emprestimo emprestimo : emprestimos) {

            // Vendo se a data de devolução esta prevista para o passado
            if (dataDeHoje.isAfter(emprestimo.getDataDevolução())) {
                
                // Se sim, salva os dados do livro, usuario e calcula a multa
                Livro livro = emprestimo.getLivro();
                Usuario usuario = emprestimo.getUsuario();
                double valorMulta = (ChronoUnit.DAYS.between(emprestimo.getDataDevolução(), dataDeHoje)) * 1.5;

                // Imprime o resultado
                System.out.printf("> Livro: %s | Usuario: %s | Data de Devolução: %s | Multa: R$ %s\n", livro.getTitulo(), usuario.getNome(), emprestimo.getDataDevolução(), valorMulta);
            }
        }
        
        
    }


}
