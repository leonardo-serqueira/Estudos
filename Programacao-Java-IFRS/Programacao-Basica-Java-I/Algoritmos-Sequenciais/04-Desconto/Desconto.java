/*
    4. Faça um programa que receba o preço de um produto, calcule e mostre
    o novo preço, sabendo-se que este sofreu um desconto de 10%. Por
    exemplo, se o produto custa R$ 100,00, o novo preço será 100 menos
    10% de cem, que é 100 x 10 / 100. Essa conta é igual a 10, ficando o
    novo preço R$ 90,00.
*/

public class Desconto {
    public static void main(String[] args) {
        double preco;

        System.out.println("\nPROGRAMA 10% DE DESCONTO\n");
        
        System.out.print("Informe o preço: ");
        preco = Double.parseDouble(System.console().readLine());
        
        preco = preco - ((preco * 10) / 100);

        System.out.printf("\nNovo preco do produto:%.2f\n", preco );

    }
}
