/*
    12. O custo ao consumidor de um carro novo é a soma do preço de fábrica
    com o percentual de lucro do distribuidor e dos impostos aplicados ao
    preço de fábrica. Faça um programa que receba o preço de fábrica de
    um veículo, o percentual de lucro do distribuidor e o percentual de
    impostos, calcule e mostre:
    a. o valor correspondente ao lucro do distribuidor;
    b. o valor correspondente aos impostos;
    c. o preço final do produto.
*/

public class ValorCarro {

    public static void main(String[] args) {
        double preco, lucro, imposto, vlucro, vimposto, total;
        
        System.out.println("\nPROGRAMA VALOR DO CARRO");

        System.out.print("\nDigite o valor do carro: ");
        preco = Double.parseDouble(System.console().readLine());

        System.out.print("\nDigite a porcentagem de lucro: ");
        lucro = Double.parseDouble(System.console().readLine());

        System.out.print("\nDigite a porcentagem de impostos: ");
        imposto = Double.parseDouble(System.console().readLine());

        vlucro   = (preco * lucro) / 100;
        vimposto = (preco * imposto) / 100;
        total    = preco + vlucro + vimposto;

        System.out.printf(
            "\nValor do Lucro  (%%%.2f)  : %.2f"+
            "\nValor do Imposto(%%%.2f): %.2f"+
            "\n\nValor Total: %.2f\n",
            lucro, vlucro,
            imposto, vimposto,
            total
        );   
    }
}