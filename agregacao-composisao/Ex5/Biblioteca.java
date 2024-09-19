/*
   05. Crie uma classe Livro com atributos como título e autor. 
      Em seguida, crie uma classe Biblioteca que compõe vários livros. 
      Cada livro deve ser parte integrante da biblioteca. 
      Se a biblioteca for destruída, os livros também devem ser.

*/

import java.util.ArrayList;

public class Biblioteca {
    
    // Atributos 
    private static ArrayList<Livro> livros = new ArrayList<Livro>();

    // main
    public static void main(String[] args) {
        
        livros.add(new Livro("O senhor do aneis", "J.R.R. Tolkien"));
        livros.add(new Livro("O silmarillion", "J.R.R Tolkien"));
        livros.add(new Livro("Cartas de um diabo ao seu aprendiz", "C. S. Lewis"));
        livros.add(new Livro("Ortodoxia", "G. K. Chesterton"));
        livros.add(new Livro("São Fransisco de Assis", "G. K. Chesterton"));

    }
}
