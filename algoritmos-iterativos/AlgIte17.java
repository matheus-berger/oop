/* */

public class AlgIte17 {
    
    public static void main(String[] args) {
        
        int qtd = 50;

        int contador = 0;
        long v1 = 0;
        long v2 = 1;
        System.out.println(v1);
        System.out.println(v2);
        
        while (contador < qtd)
        {
            long aux = v2;
            v2 = v1 + v2;
            v1 = aux;
            System.out.println(v2);
            contador++;
        }
    }
}
