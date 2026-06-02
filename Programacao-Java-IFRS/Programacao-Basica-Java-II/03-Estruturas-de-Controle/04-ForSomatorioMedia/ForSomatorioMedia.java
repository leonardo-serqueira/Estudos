/*
    4. Faça um programa que calcule o somatório, a soma dos quadrados e a
    média entre os n primeiros números inteiros positivos.
*/

public class ForSomatorioMedia {
    
    public static void main(String[] args) {
        int numero, quadrado, soma;
        double media;

        System.out.println("\nPROGRAMA SOMATORIO E MEDIA");
        System.out.print("\nDigite o numero: ");
        numero = Integer.parseInt(System.console().readLine());

        soma = 0;
        quadrado = 0;

        if (numero >= 1) {
            for (int i = 1; i <= numero; i++) {
                soma = soma + i;
                quadrado = quadrado + (i * i);
            }

            media = (double) soma / numero;

            System.out.printf(
                "\nTotal soma simples: %d\n"+
                "\nTotal da media simples: %.2f\n"+
                "\nTotal Soma dos quadrados: %d\n",
                soma, media, quadrado
            );
        } else {
            System.out.print("\nNumero invalido!!!\n");
        }
    }
}