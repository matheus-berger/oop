
public class Main1 {

    static int[] matricula = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static String[] nome = {"Joao", "Maria", "Pedro", "Clara", "Jose", "Carla", "Fabio", "Mara", "Cesar", "Ana"};
    static int[] idade = {14, 18, 15, 16, 17, 14, 17, 13, 16, 17};
    static double[] altura = {1.75, 1.54, 1.62, 1.60, 1.65, 1.62, 1.62, 1.74, 1.61, 1.68};

    public static void main(String[] args) {
        
        // Média de idade dos alunos
        media();

        // Nome dos dois alunos mais jovens
        maisJovens();

        // Percentual de Alunos com mais de 16 ano têm altura superios à média das alturas
        percentual16();

        // Quantos alunos com menos de 16 anos têm altura superior à média das alturas.
        menor16MaiorMédiaAltura();

    }

    static void media(){

        int soma = 0;

        for (int i = 0; i < 10; i++) {
            soma = soma + idade[i];
        }

        double media = (soma / 10);

        System.out.println("> Média de Idade dos Alunos: " + media);

    }

    static void maisJovens(){

        int indiceAluno1 = 0;
        int indiceAluno2 = 0;

        for (int i = 0; i < 10; i++){
            
            if (i > 0) {
                if (idade[i] > idade[indiceAluno1]){
                    indiceAluno2 = indiceAluno1;
                    indiceAluno1 = i;
                } else {
                    if (idade[i] > idade[indiceAluno2]){
                        indiceAluno2 = i;
                    }
                }
            } 
        }
      
        System.out.println("Os dois alunos com maior idade são: " + nome[indiceAluno1] + " e " + nome[indiceAluno2]);

    }

    static void percentual16() {

        int somaMaior16 = 0;

        for (int i = 0; i < 10; i++) {

            if (idade[i] > 16) {

                somaMaior16 += 1;

            }

        }

        double media = (somaMaior16 / 10);

        System.out.println("> O percentual de alunos com mais de 16 alunos: " + media);

    }

    static void mediaAltura() {

        int somaAltura = 0;

        for (int i = 0; i < 10; i++) {

            somaAltura += idade[i]; 

        }

        media 


    }

}
