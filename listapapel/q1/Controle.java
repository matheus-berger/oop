public class Controle {

    private int[] matriculas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private String[] nomes = {"Joao", "Maria", "Pedro", "Clara", "Jose", "Carla", "Fabio", "Mara", "Cesar", "Ana"};
    private int[] idades = {14, 18, 15, 16, 17, 14, 17, 13, 16, 17};
    private double[] alturas = {1.75, 1.54, 1.62, 1.60, 1.65, 1.62, 1.62, 1.74, 1.61, 1.68};

    public double calcularMediaIdade() {
        int soma = 0;
        for (int idade : idades) {
            soma += idade;
        }
        return (double) soma / idades.length;
    }

    public void exibirAlunosMaisJovens() {
        int menorIdade = Integer.MAX_VALUE;
        int segundoMenorIdade = Integer.MAX_VALUE;
        String aluno1 = "", aluno2 = "";

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < menorIdade) {
                segundoMenorIdade = menorIdade;
                aluno2 = aluno1;
                menorIdade = idades[i];
                aluno1 = nomes[i];
            } else if (idades[i] < segundoMenorIdade) {
                segundoMenorIdade = idades[i];
                aluno2 = nomes[i];
            }
        }

        System.out.println("Os dois alunos mais jovens são: " + aluno1 + " e " + aluno2);
    }

    public double calcularPercentualMaisDe16Anos() {
        int count = 0;
        for (int idade : idades) {
            if (idade > 16) {
                count++;
            }
        }
        return (double) count / idades.length * 100;
    }

    public int contarAlunosMenosDe16ComAlturaAcimaMedia() {
        double somaAlturas = 0;
        int countAltos = 0;

        for (double altura : alturas) {
            somaAlturas += altura;
        }

        double mediaAltura = somaAlturas / alturas.length;

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16 && alturas[i] > mediaAltura) {
                countAltos++;
            }
        }

        return countAltos;
    }
    public static void main(String[] args){

        Controle controle = new Controle();

        System.out.println("Média de idade dos alunos: " + controle.calcularMediaIdade());
        controle.exibirAlunosMaisJovens();
        System.out.println("Percentual de alunos com mais de 16 anos: " + controle.calcularPercentualMaisDe16Anos() + "%");
        System.out.println("Número de alunos com menos de 16 anos e altura acima da média: " + controle.contarAlunosMenosDe16ComAlturaAcimaMedia());
    }

}