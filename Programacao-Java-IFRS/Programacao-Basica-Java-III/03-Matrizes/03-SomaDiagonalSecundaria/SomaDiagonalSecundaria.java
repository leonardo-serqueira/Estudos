/*
3. Crie um programa que preencha uma matriz 5 x 5 de números reais,
calcule e mostre a soma dos elementos da diagonal secundária.
*/

public class SomaDiagonalSecundaria {
        
    public static void main(String[] args) {
        final int LINHAS = 5;
        final int COLUNAS = 5;
        double matriz[][] = new double[LINHAS][COLUNAS];
        double soma = 0;

        System.out.println("\n=====PROGRAMA MEDIA DIAGONAL=====");

        for (int l = 0; l < LINHAS; l++) {
            for( int c = 0; c < COLUNAS; c++) {
                System.out.printf("\nDigite a o valor da posicao [%d][%d]: ",l + 1, c + 1);
                matriz[l][c] = Double.parseDouble(System.console().readLine());
            }
        }

        for( int l = 0, c = COLUNAS -1; l < LINHAS; l++, c--) {
            soma += matriz[l][c];
            System.out.printf("\n[%.2f]", matriz[l][c]);
        }

        System.out.printf("\nSoma = %.2f\n", soma);
    }
}