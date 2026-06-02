/*
    2. Faça um programa que calcule o somatório, a soma dos quadrados e a
    média entre os n primeiros números inteiros positivos.
*/

public class SomatorioMedia{
    public static void main(String[] args) {
        int contador, numero, quadrado, soma;
        double media;

        System.out.println("\nPROGRAMA SOMATORIO E MEDIA");

        System.out.print("\nDigite o numero: ");
        numero = Integer.parseInt(System.console().readLine());

        soma = 0;
        quadrado = 0;
        contador = 0;

        while (contador < numero) {
            contador = contador + 1;
            soma = soma + contador;
            quadrado = quadrado + (contador * contador);
        }

        media = (double) soma / numero;

        System.out.printf(
            "\nTotal soma simples: %d\n"+
            "\nTotal da media simples: %.2f\n"+
            "\nTotal Soma dos quadrados: %d\n",
            soma, media, quadrado
        );

    }
}