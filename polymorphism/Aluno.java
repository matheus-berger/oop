
public class Aluno extends Pessoa{

    protected string RA;

    // Sobscrever: sobscrevendo a função exibir da função mãe (as duas funções devem ter a mesma escrita)
    public void exibir(){
        super.exibir();
        System.out.println(RA);
    }

}