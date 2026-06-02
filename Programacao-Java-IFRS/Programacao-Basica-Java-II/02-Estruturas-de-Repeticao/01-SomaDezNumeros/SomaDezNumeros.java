/*
    1. Faça um programa que calcule a soma de dez números quaisquer
    fornecidos pelo usuário
*/

public class SomaDezNumeros{
    public static void main(String[] args) {
        double valor, total;
        int contador;
    
        System.out.println("\nPROGRAMA SOMA 10 NUMEROS");

        total = 0;
        contador = 1;

        while (contador <= 10) {
            System.out.printf("\nDigite o %dº numero: ", contador);
            valor = Double.parseDouble(System.console().readLine());
            total = total + valor;
            contador = contador + 1;
        }

        System.out.println("\nTotal da soma:" + total);

    }
}