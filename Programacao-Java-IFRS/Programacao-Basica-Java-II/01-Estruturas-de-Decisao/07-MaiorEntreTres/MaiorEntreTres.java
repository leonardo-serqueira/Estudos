/*
    7. Desenvolva um programa que leia três valores numéricos inteiros,
    identifique e apresente o maior valor informado.
*/

public class MaiorEntreTres {
    public static void main(String[] args) {
        int n1, n2, n3;

        System.out.println("\nPROGRAMA QUAL É MAIOR");

        System.out.print("\nInforme o primeiro numero: ");
        n1 = Integer.parseInt(System.console().readLine());

        System.out.print("\nInforme o segundo numero: ");
        n2 = Integer.parseInt(System.console().readLine());

        System.out.print("\nInforme o terceiro numero: ");
        n3 = Integer.parseInt(System.console().readLine());
        
        if (n1 >= n2 && n1 >= n3) {
            System.out.println("\nO maior numero: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("\nO maior numero: " + n2);
        } else {
            System.out.println("\nO maior numero: " + n3);
        }
    }
}