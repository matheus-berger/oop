/*
    07. Crie uma classe Comodo com atributos como tipo (quarto, sala, banheiro) e tamanho. 
        Em seguida, crie uma classe Casa que tenha uma lista de cômodos. 
        Cada cômodo deve ser parte da casa e ser destruído quando a casa for destruída.
*/

public class Casa {
    public static void main(String[] args) {
        
        // Lista de Comodos
        Comodo comodoSuiteMaster = new Comodo("Suíte Master", 16);
        Comodo comodoSuite = new Comodo("Suíte", 12);
        Comodo comodoQuarto1 = new Comodo("Quarto", 12);
        Comodo comodoQuarto2 = new Comodo("Quarto", 16);
        Comodo comodoBanheiro1 = new Comodo("Banheiro", 5);
        Comodo comodoSalaDeEstar = new Comodo("Sala de Estar", 20);
        Comodo comodoSalaDeJantar = new Comodo("Sala de Jantar", 16);
        Comodo comodoCozinha = new Comodo("Cozinha", 15);
        Comodo comodoDespensa = new Comodo("Despensa", 4);
        Comodo comodoLavanderia = new Comodo("Lavanderia", 8);
        Comodo comodoAreaDeServiço = new Comodo("Area de Serviço", 6);
        Comodo comodoEscritorio = new Comodo("Escritorio", 10);
        Comodo comodoAreaDeEstudo = new Comodo("Escritorio", 15);
        Comodo comodoSalaDeJogos = new Comodo("Sala de Jogos/Brinquedoteca", 12);
        Comodo comodoBanheiro2 = new Comodo("Banheiro", 5);
        Comodo comodoQuarto3 = new Comodo("Quarto", 12);
        Comodo comodoBiblioteca = new Comodo("Escritorio", 7);
        Comodo comodoGaragem = new Comodo("Garagem", 35);
        Comodo Jardim = new Comodo("Jardim/Área Externa", 75);
        
    }
}
