/*
    3. Faça um programa que calcule a soma de dez números quaisquer
    fornecidos pelo usuário
*/

public class ForSomaDezNumeros {
    public static void main(String[] Args) {
        double valor;
        double total = 0;

        System.out.println("\nPROGRAMA SOMA 10 NUMEROS\n");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº numero: ", i);
            valor = Double.parseDouble(System.console().readLine());
            total = total + valor;
        }

        System.out.println("\nTotal da soma:" + total);
    
    }
}