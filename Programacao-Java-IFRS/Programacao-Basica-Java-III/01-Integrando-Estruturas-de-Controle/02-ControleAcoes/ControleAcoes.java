/*
    2. Faça um programa que receba o tipo de ação, ou seja, uma letra qualquer a ser
    comercializada na bolsa de valores, o preço de compra e o preço de venda de
    cada ação e que calcule e mostre:
        - a quantidade de ações com lucro superior a R$ 1.000,00;
        - a quantidade de ações com lucro inferior a R$ 200,00.
    Finalize com o tipo de ação ‘F’.
*/

public class ControleAcoes {
    
    public static void main(String[] args){
        char acao = 'X';
        double precoCompra = 0;
        double precoVenda = 0;
        double diferenca = 0;
        int lucroAlto = 0;
        int lucroBaixo = 0;

        System.out.println("\n====|PROGRAMA CONTROLE DE ACOES|====");
        
        do{
            System.out.print("\nDitige a cigla da acao em maiusculo: ");
            acao = System.console().readLine().charAt(0);
            
            if (acao != 'F') {
                System.out.print("Digite o preco de compra: ");
                precoCompra = Double.parseDouble(System.console().readLine());
                System.out.print("Digite o preco de venda: ");
                precoVenda = Double.parseDouble(System.console().readLine());

                diferenca = precoVenda - precoCompra;
                
                if (diferenca > 1000) lucroAlto++;

                if (diferenca < 200) lucroBaixo++;

            }

        } while (acao != 'F');
        
        System.out.println("\n====|RESULTADO|====\n");
        System.out.print("\nQuantidade de acoes com lucro a cima de 1000: " + lucroAlto);
        System.out.print("\nQuantidade de acoes com lucro a baixo de 200: " + lucroBaixo);
        System.out.println();
    
    }
    
}
