
public class Livro {
    
    // Atributos
    private String titulo;
    private String autor;
    private String ISBN;

    public Livro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    // Getter titulo
    public String getTitulo() {
        return this.titulo;
    }


    // Getter autor
    public String getAutor() {
        return this.autor;
    }


    // Getter ISBN
    public String getISBN() {
        return ISBN;
    }

}
