/*
1. Faça um programa que leia dois valores numéricos inteiros e apresente
o resultado da diferença do maior valor pelo menor valor. Se os valores
forem iguais, o programa deve mostrar zero.
*/

public class DiferencaMaiorMenor {
    public static void main(String[] args) {
        int num1, num2, diferenca;

        System.out.println("\nPROGRAMA DIFERENCA ENTRE MAIOR E MENOR");

        System.out.print("\nInforme o primeiro numero: ");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.print("\nInforme o segundo numero: ");
        num2 = Integer.parseInt(System.console().readLine());
        
        if (num1 > num2) {
            diferenca = num1 - num2;
            System.out.printf("\nDiferenca entre %d e %d = %d", num1, num2, diferenca);
        } else if (num2 > num1) {
            diferenca = num2 - num1;
            System.out.printf("\nDiferenca entre %d e %d = %d", num2, num1, diferenca);
        } else {
            diferenca = 0;
            System.out.printf("\nOs numeros sao iguais. Diferenca = %d\n", diferenca);
        }

    }
}
