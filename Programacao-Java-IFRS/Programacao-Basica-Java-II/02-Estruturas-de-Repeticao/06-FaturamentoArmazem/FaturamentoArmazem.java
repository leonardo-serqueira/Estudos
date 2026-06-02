/*
    6. Para cada uma das mercadorias com que um armazém trabalha
    dispõese dos seguintes dados:
    − o nome da mercadoria;
    − o seu preço unitário;
    − a quantidade total vendida no mês.
    Elabore um programa para calcular o faturamento total mensal do armazém. O
    faturamento total do armazém será calculado somando-se o total faturado por
    cada mercadoria, que é igual a quantidade vendida da mercadoria vezes o seu
    preço unitário. O número de mercadorias comercializadas pelo armazém deve
    ser informado pelo usuário.
*/

public class FaturamentoArmazem {
    public static void main(String[] args) {
        String nome = "x";
        
        int quantiaMercadoria;
        int quantiaVenda = 0;
        int contador = 0;

        double preco = 0;
        double subTotal = 0;
        double faturamento = 0;

        System.out.println("\nPROGRAMA FATURAMENTO ARMAZEM");

        System.out.print("\nDigite a quantidade de mercadorias para serem registradas: ");
        quantiaMercadoria = Integer.parseInt(System.console().readLine());

        if (quantiaMercadoria > 0) {
            while(quantiaMercadoria > contador) {
            contador = contador + 1;
            System.out.printf("\n%dª Mercadoria", contador);
            System.out.print("\nNome: ");
            nome = System.console().readLine();
            System.out.print("Preco: ");
            preco = Double.parseDouble(System.console().readLine());
            System.out.print("Quantidade vendia: ");
            quantiaVenda = Integer.parseInt(System.console().readLine());
            subTotal = (double) quantiaVenda * preco;
            faturamento = faturamento + subTotal;
            }
            System.out.printf("\nTotal Faturado: %.2f", faturamento);
        }
    }
}