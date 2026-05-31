/*
    5. Desenvolva um programa que leia quatro valores numéricos inteiros e
    mostre os valores que são divisíveis por 2 e 3.
*/

public class DivisiveisDoisTres {
    public static void main(String[] args) {
        int num1, num2, num3, num4;

        System.out.println("\nPROGRAMA DIVISIVEIS DE DOIS E TRES");

        System.out.print("\nInforme o primeiro numero: ");
        num1 = Integer.parseInt(System.console().readLine());

        System.out.print("\nInforme o segundo numero: ");
        num2 = Integer.parseInt(System.console().readLine());
        
        System.out.print("\nInforme o terceiro numero: ");
        num3 = Integer.parseInt(System.console().readLine());

        System.out.print("\nInforme o quarto numero: ");
        num4 = Integer.parseInt(System.console().readLine());

        if (num1 % 2 == 0 && num1 % 3 == 0) {
            System.out.println("\n2 e 3 dividem " + num1);
        }

        if (num2 % 2 == 0 && num2 % 3 == 0) {
            System.out.println("\n2 e 3 dividem " + num2);
        }
        
        if (num3 % 2 == 0 && num3 % 3 == 0) {
            System.out.println("\n2 e 3 dividem " + num3);
        }

        if (num4 % 2 == 0 && num4 % 3 == 0) {
            System.out.println("\n2 e 3 dividem " + num4);
        }    
    }
}