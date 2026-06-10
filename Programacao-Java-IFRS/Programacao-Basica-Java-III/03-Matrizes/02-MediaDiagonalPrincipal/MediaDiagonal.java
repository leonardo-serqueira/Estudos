/*
2. Faça um programa que preencha e mostre a média dos elementos da
diagonal principal de uma matriz 10 x 10.
*/

public class MediaDiagonal {
    
    public static void main(String[] args) {
        final int LINHAS = 10;
        final int COLUNAS = 10;
        int matriz[][] = new int[LINHAS][COLUNAS];
        double media = 0;

        System.out.println("\n=====PROGRAMA MEDIA DIAGONAL=====");

        for (int l = 0; l < LINHAS; l++) {
            for( int c = 0; c < COLUNAS; c++) {
                System.out.printf("\nDigite a o valor da posicao [%d][%d]: ",l + 1, c + 1);
                matriz[l][c] = Integer.parseInt(System.console().readLine());
            }
        }


        for( int i = 0; i < LINHAS; i++) {
            media += matriz[i][i];
            System.out.printf("\n[%d]", matriz[i][i]);
        }

        media /= matriz.length;
        System.out.printf("\nMedia = %.2f\n", media);
    }
}