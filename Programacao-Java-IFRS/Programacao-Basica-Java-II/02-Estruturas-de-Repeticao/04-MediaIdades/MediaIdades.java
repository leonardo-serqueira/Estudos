/*
    4. Faça um programa que receba várias idades, calcule e mostre a média
    das idades digitadas. Finalize digitando idade igual a zero.
*/



public class MediaIdades {
    public static void main(String[] args) {
        int idade, soma, contador;
        double media;

        System.out.println("\nPROGRAMA MEDIA DE IDADE");

        idade = 1;
        media = 0;
        soma = 0;
        contador = 0;

        while (idade != 0){
            System.out.print("\nDigite uma idade: ");
            idade = Integer.parseInt(System.console().readLine());

            if (idade != 0) {
                soma = soma + idade;
                contador = contador + 1;
            }
        }

        media = (double) soma / contador;
        System.out.printf("\nMedia das idades: %.2f\n", media);
    }    
}