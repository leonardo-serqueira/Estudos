/*
    1. Faça um programa que preencha três vetores com dez posições cada
    um: o primeiro vetor, com os nomes de dez produtos; o segundo vetor,
    com os códigos dos dez produtos; e o terceiro vetor, com os preços dos
    produtos. Mostre um relatório apenas com o nome, o código, o preço e o
    novo preço dos produtos que sofrerão aumento. Sabe-se que os
    produtos que sofrerão aumento são aqueles que possuem código par ou
    preço superior a R$ 1.000,00. Sabe-se ainda que, para os produtos que
    satisfizerem às duas condições anteriores, código e preço, o aumento
    será de 20%; para aqueles que satisfizerem apenas à condição do
    código, o aumento será de 15%; e para aqueles que satisfizerem apenas
    à condição de preço, o aumento será de 10%.

*/

public class ProdutosAumento{
    
    public static void main(String[] args){
        String[] nomeProduto = new String[10];
        int[] codigoProduto = new int[10];
        double[] precoProduto = new double[10];
        
        System.out.println("\n<><><>PROGRAMA<>PRODUTOS<>AUMENTO<><><>");

        for (int i = 0; i < nomeProduto.length; i++){
            
            System.out.printf("\nNome do %dº Produto: ", i+1);
            nomeProduto[i] = System.console().readLine();
            System.out.printf("Codigo do %dº Produto: ", i+1);
            codigoProduto[i] = Integer.parseInt(System.console().readLine());
            System.out.printf("Preco do %dº Produto: ", i+1);
            precoProduto[i] = Double.parseDouble(System.console().readLine());
        
        }

        for (int i = 0; i < nomeProduto.length; i++) {

            if (precoProduto[i] > 1000 && codigoProduto[i] % 2 == 0) {
                
                System.out.printf("\n<><><>%dº Produto<><><>\n", i+1);
                System.out.printf("\nNome do produto       : %s", nomeProduto[i]);
                System.out.printf("\nCodigo do produto     : %d", codigoProduto[i]);
                System.out.printf("\nPreco do produto      : %.2f", precoProduto[i]);
                
                precoProduto[i] += precoProduto[i] * 0.20;

                System.out.printf("\npreco do produto(+20%%): %.2f\n", precoProduto[i]);

            } else if (codigoProduto[i] % 2 == 0) {
                
                System.out.printf("\n<><><>%dº Produto<><><>\n", i+1);
                System.out.printf("\nNome do produto       : %s", nomeProduto[i]);
                System.out.printf("\nCodigo do produto     : %d", codigoProduto[i]);
                System.out.printf("\nPreco do produto      : %.2f", precoProduto[i]);
                
                precoProduto[i] += precoProduto[i] * 0.15;

                System.out.printf("\npreco do produto(+15%%): %.2f\n", precoProduto[i]);


            } else if (precoProduto[i] > 1000) {

                System.out.printf("\n<><><>%dº Produto<><><>\n", i+1);
                System.out.printf("\nNome do produto       : %s", nomeProduto[i]);
                System.out.printf("\nCodigo do produto     : %d", codigoProduto[i]);
                System.out.printf("\nPreco do produto      : %.2f", precoProduto[i]);
                
                precoProduto[i] += precoProduto[i] * 0.10;

                System.out.printf("\npreco do produto(+10%%): %.2f\n", precoProduto[i]);

            }
            
        }

    }

}