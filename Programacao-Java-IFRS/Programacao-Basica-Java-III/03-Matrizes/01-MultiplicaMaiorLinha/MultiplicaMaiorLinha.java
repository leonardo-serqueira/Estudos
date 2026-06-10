/*
1. Elabore um programa que preencha uma matriz 6 x 4, calcule e
armazene o maior elemento de cada linha e multiplique cada linha por
seu respectivo maior elemento. Mostre a matriz resultante.
*/

public class MultiplicaMaiorLinha {

    public static void main(String[] args) {
        int matriz[][] = new int[6][4];
        int maiorLinha[] = new int[6];
        int resultado = 0;

        System.out.println("\n_-_-_-_PROGRAMA MULTIPLICA PELO MAIOR LINHA_-_-_-_\n");

        for (int l = 0; l < matriz.length; l++) {
            for (int  c = 0; c < matriz[0].length; c++) {
                System.out.printf("Digite o valor da posicao [%d][%d]: ", l + 1, c+1);
                matriz[l][c] = Integer.parseInt(System.console().readLine());
                
                if (c == 0) {
                    maiorLinha[l] = matriz[l][c];
                } else {
                    maiorLinha[l] = Math.max(maiorLinha[l], matriz[l][c]);
                }
            }
        };

        System.out.println("\n_-_MULTIPLICACOES_-_\n");

        for (int l = 0; l < matriz.length; l++) {
            for (int  c = 0; c < matriz[0].length; c++) {
                resultado = matriz[l][c] * maiorLinha[l];
                System.out.printf("%7d", resultado);
            }
            System.out.println();
        };
    }
}