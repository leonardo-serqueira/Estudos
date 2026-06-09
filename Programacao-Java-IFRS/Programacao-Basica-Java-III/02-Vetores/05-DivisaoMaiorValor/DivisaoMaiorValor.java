/*
5. Faça um programa que leia um vetor com 20 posições contendo
números inteiros. Logo após, divida todos os seus elementos pelo maior
valor do vetor e os armazene em outro vetor. Mostre, ao final, os valores
armazenados em todas as posições do vetor após os cálculos.
*/

public class DivisaoMaiorValor {
    
    public static void main(String[] args) {
        int numeros[] = new int[20];
        double divididos[] = new double[20];

        
        System.out.println("\n|-|-|-|-|-|PROGRAMA DIVISAO MAIOR VALOR|-|-|-|-|-|\n");
        System.out.print("Informe o 1º numero: ");
        numeros[0] = Integer.parseInt(System.console().readLine());
        
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            System.out.printf("Informe o %dº numero: ", i + 1);
            numeros[i] = Integer.parseInt(System.console().readLine());
            
            if (maior < numeros[i]){
                maior = numeros[i]; 
            }
        }

        System.out.println("\n|-|-|-|-|-|RESULTADO|-|-|-|-|-|");

        for (int i = 0; i < numeros.length; i++) {
            divididos[i] = (double) numeros[i] / maior;
            
            System.out.printf("\n%dª Divisao: %.2f", i + 1, divididos[i]);
        }

        System.out.println();
    }
}